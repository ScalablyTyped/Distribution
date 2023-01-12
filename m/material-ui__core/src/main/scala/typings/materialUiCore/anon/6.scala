package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[SecondaryTypographyComponent /* <: ElementType[Any] */] extends StObject {
  
  var component: js.UndefOr[SecondaryTypographyComponent] = js.undefined
}
object `6` {
  
  inline def apply[SecondaryTypographyComponent /* <: ElementType[Any] */](): `6`[SecondaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[SecondaryTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`[?], SecondaryTypographyComponent /* <: ElementType[Any] */] (val x: Self & `6`[SecondaryTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: SecondaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
