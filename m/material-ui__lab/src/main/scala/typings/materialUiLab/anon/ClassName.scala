package typings.materialUiLab.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var endAdornment: ReactNode
  
  var ref: Ref[js.Any]
  
  var startAdornment: ReactNode
}
object ClassName {
  
  @scala.inline
  def apply(className: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornment(value: ReactNode): Self = StObject.set(x, "endAdornment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornmentUndefined: Self = StObject.set(x, "endAdornment", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setStartAdornment(value: ReactNode): Self = StObject.set(x, "startAdornment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAdornmentUndefined: Self = StObject.set(x, "startAdornment", js.undefined)
  }
}
