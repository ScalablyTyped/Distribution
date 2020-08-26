package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseComponent extends js.Object {
  var elements: js.Array[_] = js.native
  var hidden: Boolean = js.native
  def destroy(): Boolean = js.native
  def hide(): Unit = js.native
  def isHidden(): Boolean = js.native
  def reset(): Unit = js.native
  def show(): Unit = js.native
}

object BaseComponent {
  @scala.inline
  def apply(
    destroy: () => Boolean,
    elements: js.Array[_],
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    show: () => Unit
  ): BaseComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[BaseComponent]
  }
  @scala.inline
  implicit class BaseComponentOps[Self <: BaseComponent] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Boolean): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setElementsVarargs(value: js.Any*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[_]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsHidden(value: () => Boolean): Self = this.set("isHidden", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

