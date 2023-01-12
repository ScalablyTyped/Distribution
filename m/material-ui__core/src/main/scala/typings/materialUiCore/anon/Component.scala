package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[SubheaderTypographyComponent /* <: ElementType[Any] */] extends StObject {
  
  var component: js.UndefOr[SubheaderTypographyComponent] = js.undefined
}
object Component {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType[Any] */](): Component[SubheaderTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component[SubheaderTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component[?], SubheaderTypographyComponent /* <: ElementType[Any] */] (val x: Self & Component[SubheaderTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: SubheaderTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
