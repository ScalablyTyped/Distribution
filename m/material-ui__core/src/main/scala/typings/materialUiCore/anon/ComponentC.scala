package typings.materialUiCore.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentC[C /* <: ElementType[Any] */] extends StObject {
  
  /**
    * The component used for the root node.
    * Either a string to use a HTML element or a component.
    */
  var component: C
}
object ComponentC {
  
  inline def apply[C /* <: ElementType[Any] */](component: C): ComponentC[C] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentC[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentC[?], C /* <: ElementType[Any] */] (val x: Self & ComponentC[C]) extends AnyVal {
    
    inline def setComponent(value: C): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
