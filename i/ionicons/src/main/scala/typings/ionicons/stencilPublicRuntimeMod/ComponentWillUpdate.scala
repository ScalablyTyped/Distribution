package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentWillUpdate extends js.Object {
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  def componentWillUpdate(): js.Promise[Unit] | Unit = js.native
}

object ComponentWillUpdate {
  @scala.inline
  def apply(componentWillUpdate: () => js.Promise[Unit] | Unit): ComponentWillUpdate = {
    val __obj = js.Dynamic.literal(componentWillUpdate = js.Any.fromFunction0(componentWillUpdate))
    __obj.asInstanceOf[ComponentWillUpdate]
  }
  @scala.inline
  implicit class ComponentWillUpdateOps[Self <: ComponentWillUpdate] (val x: Self) extends AnyVal {
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
    def setComponentWillUpdate(value: () => js.Promise[Unit] | Unit): Self = this.set("componentWillUpdate", js.Any.fromFunction0(value))
  }
  
}

