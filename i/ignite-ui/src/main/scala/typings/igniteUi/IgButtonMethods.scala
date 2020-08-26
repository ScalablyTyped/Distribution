package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgButtonMethods extends js.Object {
  def destroy(): Unit = js.native
  def setTitle(title: js.Object): Unit = js.native
  def widget(): Unit = js.native
}

object IgButtonMethods {
  @scala.inline
  def apply(destroy: () => Unit, setTitle: js.Object => Unit, widget: () => Unit): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setTitle = js.Any.fromFunction1(setTitle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgButtonMethods]
  }
  @scala.inline
  implicit class IgButtonMethodsOps[Self <: IgButtonMethods] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTitle(value: js.Object => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setWidget(value: () => Unit): Self = this.set("widget", js.Any.fromFunction0(value))
  }
  
}

