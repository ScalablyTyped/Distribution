package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[SubheaderTypographyComponent /* <: ElementType[Any] */] extends StObject {
  
  var component: js.UndefOr[SubheaderTypographyComponent] = js.undefined
}
object `1` {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType[Any] */](): `1`[SubheaderTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[SubheaderTypographyComponent]]
  }
  
  extension [Self <: `1`[?], SubheaderTypographyComponent /* <: ElementType[Any] */](x: Self & `1`[SubheaderTypographyComponent]) {
    
    inline def setComponent(value: SubheaderTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
