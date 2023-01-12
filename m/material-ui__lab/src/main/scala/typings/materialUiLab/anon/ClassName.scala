package typings.materialUiLab.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var endAdornment: ReactNode
  
  var ref: Ref[Any]
  
  var startAdornment: ReactNode
}
object ClassName {
  
  inline def apply(className: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setEndAdornment(value: ReactNode): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
    
    inline def setEndAdornmentUndefined: Self = StObject.set(x, "endAdornment", js.undefined)
    
    inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setStartAdornment(value: ReactNode): Self = StObject.set(x, "startAdornment", value.asInstanceOf[js.Any])
    
    inline def setStartAdornmentUndefined: Self = StObject.set(x, "startAdornment", js.undefined)
  }
}
