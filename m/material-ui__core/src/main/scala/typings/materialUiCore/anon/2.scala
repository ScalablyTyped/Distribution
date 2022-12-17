package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[DefaultComponent /* <: ElementType[Any] */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[DefaultComponent] = js.undefined
}
object `2` {
  
  inline def apply[DefaultComponent /* <: ElementType[Any] */](): `2`[DefaultComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[DefaultComponent]]
  }
  
  extension [Self <: `2`[?], DefaultComponent /* <: ElementType[Any] */](x: Self & `2`[DefaultComponent]) {
    
    inline def setComponent(value: DefaultComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
