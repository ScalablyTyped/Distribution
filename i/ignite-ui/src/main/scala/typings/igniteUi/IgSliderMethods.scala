package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSliderMethods extends js.Object {
  def clearBookmarks(): Unit = js.native
  def destroy(): Unit = js.native
  def value(newValue: js.Object): Unit = js.native
  def widget(): Unit = js.native
}

object IgSliderMethods {
  @scala.inline
  def apply(clearBookmarks: () => Unit, destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgSliderMethods = {
    val __obj = js.Dynamic.literal(clearBookmarks = js.Any.fromFunction0(clearBookmarks), destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgSliderMethods]
  }
  @scala.inline
  implicit class IgSliderMethodsOps[Self <: IgSliderMethods] (val x: Self) extends AnyVal {
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
    def setClearBookmarks(value: () => Unit): Self = this.set("clearBookmarks", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: js.Object => Unit): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def setWidget(value: () => Unit): Self = this.set("widget", js.Any.fromFunction0(value))
  }
  
}

