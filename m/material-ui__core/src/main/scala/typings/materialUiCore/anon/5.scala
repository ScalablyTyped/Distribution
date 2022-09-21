package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[PrimaryTypographyComponent /* <: ElementType[Any] */] extends StObject {
  
  var component: js.UndefOr[PrimaryTypographyComponent] = js.undefined
}
object `5` {
  
  inline def apply[PrimaryTypographyComponent /* <: ElementType[Any] */](): `5`[PrimaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[PrimaryTypographyComponent]]
  }
  
  extension [Self <: `5`[?], PrimaryTypographyComponent /* <: ElementType[Any] */](x: Self & `5`[PrimaryTypographyComponent]) {
    
    inline def setComponent(value: PrimaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
