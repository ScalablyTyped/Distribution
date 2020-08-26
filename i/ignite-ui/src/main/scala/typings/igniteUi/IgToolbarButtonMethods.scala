package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarButtonMethods extends js.Object {
  /**
    * Activate toolbar button
    *
    * @param event
    */
  def activate(event: js.Object): Unit = js.native
  /**
    * Deactivate toolbar button
    *
    * @param event
    */
  def deactivate(event: js.Object): Unit = js.native
  /**
    * Destroy the widget.
    */
  def destroy(): Unit = js.native
  /**
    * Toggle toolbar button
    */
  def toggle(): Unit = js.native
  /**
    * Returns the element that represents this widget.
    */
  def widget(): js.Object = js.native
}

object IgToolbarButtonMethods {
  @scala.inline
  def apply(
    activate: js.Object => Unit,
    deactivate: js.Object => Unit,
    destroy: () => Unit,
    toggle: () => Unit,
    widget: () => js.Object
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), destroy = js.Any.fromFunction0(destroy), toggle = js.Any.fromFunction0(toggle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
  @scala.inline
  implicit class IgToolbarButtonMethodsOps[Self <: IgToolbarButtonMethods] (val x: Self) extends AnyVal {
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
    def setActivate(value: js.Object => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    @scala.inline
    def setDeactivate(value: js.Object => Unit): Self = this.set("deactivate", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    @scala.inline
    def setWidget(value: () => js.Object): Self = this.set("widget", js.Any.fromFunction0(value))
  }
  
}

