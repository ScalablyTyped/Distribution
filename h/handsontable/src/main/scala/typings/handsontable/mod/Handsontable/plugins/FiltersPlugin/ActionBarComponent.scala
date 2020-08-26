package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBarComponent extends BaseComponent {
  def accept(): Unit = js.native
  def cancel(): Unit = js.native
  def getMenuItemDescriptor(): js.Object = js.native
}

object ActionBarComponent {
  @scala.inline
  def apply(
    accept: () => Unit,
    cancel: () => Unit,
    destroy: () => Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    show: () => Unit
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[ActionBarComponent]
  }
  @scala.inline
  implicit class ActionBarComponentOps[Self <: ActionBarComponent] (val x: Self) extends AnyVal {
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
    def setAccept(value: () => Unit): Self = this.set("accept", js.Any.fromFunction0(value))
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMenuItemDescriptor(value: () => js.Object): Self = this.set("getMenuItemDescriptor", js.Any.fromFunction0(value))
  }
  
}

