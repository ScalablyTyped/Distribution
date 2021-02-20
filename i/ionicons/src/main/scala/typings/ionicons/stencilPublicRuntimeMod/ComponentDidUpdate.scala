package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidUpdate extends StObject {
  
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  def componentDidUpdate(): Unit = js.native
}
object ComponentDidUpdate {
  
  @scala.inline
  def apply(componentDidUpdate: () => Unit): ComponentDidUpdate = {
    val __obj = js.Dynamic.literal(componentDidUpdate = js.Any.fromFunction0(componentDidUpdate))
    __obj.asInstanceOf[ComponentDidUpdate]
  }
  
  @scala.inline
  implicit class ComponentDidUpdateMutableBuilder[Self <: ComponentDidUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentDidUpdate(value: () => Unit): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction0(value))
  }
}
