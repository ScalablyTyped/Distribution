package typings.materialRadio.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCRadioAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def setNativeControlDisabled(disabled: Boolean): Unit = js.native
}

object MDCRadioAdapter {
  @scala.inline
  def apply(addClass: String => Unit, removeClass: String => Unit, setNativeControlDisabled: Boolean => Unit): MDCRadioAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), removeClass = js.Any.fromFunction1(removeClass), setNativeControlDisabled = js.Any.fromFunction1(setNativeControlDisabled))
    __obj.asInstanceOf[MDCRadioAdapter]
  }
  @scala.inline
  implicit class MDCRadioAdapterOps[Self <: MDCRadioAdapter] (val x: Self) extends AnyVal {
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
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNativeControlDisabled(value: Boolean => Unit): Self = this.set("setNativeControlDisabled", js.Any.fromFunction1(value))
  }
  
}

