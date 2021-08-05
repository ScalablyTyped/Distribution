package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
trait StandardPropsnevernever extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.undefined
  
  var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object StandardPropsnevernever {
  
  inline def apply(): StandardPropsnevernever = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropsnevernever]
  }
  
  extension [Self <: StandardPropsnevernever](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: Partial[ClassNameMap[scala.Nothing]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
