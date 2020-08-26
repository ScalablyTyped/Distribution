package typings.kikBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hide extends js.Object {
  def hide(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def show(): Unit = js.native
}

object Hide {
  @scala.inline
  def apply(hide: () => Unit, isEnabled: () => Boolean, show: () => Unit): Hide = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isEnabled = js.Any.fromFunction0(isEnabled), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Hide]
  }
  @scala.inline
  implicit class HideOps[Self <: Hide] (val x: Self) extends AnyVal {
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

