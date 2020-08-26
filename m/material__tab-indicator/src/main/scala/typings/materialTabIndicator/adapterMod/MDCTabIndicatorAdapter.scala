package typings.materialTabIndicator.adapterMod

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabIndicatorAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    * @param className The className to add
    */
  def addClass(className: String): Unit = js.native
  /**
    * Returns the client rect of the content element.
    */
  def computeContentClientRect(): ClientRect = js.native
  /**
    * Removes the given className from the root element.
    * @param className The className to remove
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets a style property of the content element to the passed value
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setContentStyleProperty(propName: String, value: String): Unit = js.native
}

object MDCTabIndicatorAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    computeContentClientRect: () => ClientRect,
    removeClass: String => Unit,
    setContentStyleProperty: (String, String) => Unit
  ): MDCTabIndicatorAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), computeContentClientRect = js.Any.fromFunction0(computeContentClientRect), removeClass = js.Any.fromFunction1(removeClass), setContentStyleProperty = js.Any.fromFunction2(setContentStyleProperty))
    __obj.asInstanceOf[MDCTabIndicatorAdapter]
  }
  @scala.inline
  implicit class MDCTabIndicatorAdapterOps[Self <: MDCTabIndicatorAdapter] (val x: Self) extends AnyVal {
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def setComputeContentClientRect(value: () => ClientRect): Self = this.set("computeContentClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetContentStyleProperty(value: (String, String) => Unit): Self = this.set("setContentStyleProperty", js.Any.fromFunction2(value))
  }
  
}

