package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidUpdate extends js.Object {
  
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
  implicit class ComponentDidUpdateOps[Self <: ComponentDidUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentDidUpdate(value: () => Unit): Self = this.set("componentDidUpdate", js.Any.fromFunction0(value))
  }
}
