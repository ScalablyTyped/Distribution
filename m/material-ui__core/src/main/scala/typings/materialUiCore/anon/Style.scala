package typings.materialUiCore.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style[C] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[typings.react.mod.Ref[Any]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object Style {
  
  inline def apply[C](): Style[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style[C]]
  }
  
  extension [Self <: Style[?], C](x: Self & Style[C]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
