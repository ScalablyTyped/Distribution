package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[DefaultComponent /* <: ElementType[Any] */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: js.UndefOr[DefaultComponent] = js.undefined
}
object Component {
  
  inline def apply[DefaultComponent /* <: ElementType[Any] */](): Component[DefaultComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component[DefaultComponent]]
  }
  
  extension [Self <: Component[?], DefaultComponent /* <: ElementType[Any] */](x: Self & Component[DefaultComponent]) {
    
    inline def setComponent(value: DefaultComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
