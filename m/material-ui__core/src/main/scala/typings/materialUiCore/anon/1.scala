package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TitleTypographyComponent /* <: ElementType[Any] */] extends StObject {
  
  var component: js.UndefOr[TitleTypographyComponent] = js.undefined
}
object `1` {
  
  inline def apply[TitleTypographyComponent /* <: ElementType[Any] */](): `1`[TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[TitleTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?], TitleTypographyComponent /* <: ElementType[Any] */] (val x: Self & `1`[TitleTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: TitleTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
