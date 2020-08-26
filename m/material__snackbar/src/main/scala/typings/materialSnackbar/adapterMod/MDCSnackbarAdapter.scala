package typings.materialSnackbar.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSnackbarAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def announce(): Unit = js.native
  def notifyClosed(reason: String): Unit = js.native
  def notifyClosing(reason: String): Unit = js.native
  def notifyOpened(): Unit = js.native
  def notifyOpening(): Unit = js.native
  def removeClass(className: String): Unit = js.native
}

object MDCSnackbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    announce: () => Unit,
    notifyClosed: String => Unit,
    notifyClosing: String => Unit,
    notifyOpened: () => Unit,
    notifyOpening: () => Unit,
    removeClass: String => Unit
  ): MDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), announce = js.Any.fromFunction0(announce), notifyClosed = js.Any.fromFunction1(notifyClosed), notifyClosing = js.Any.fromFunction1(notifyClosing), notifyOpened = js.Any.fromFunction0(notifyOpened), notifyOpening = js.Any.fromFunction0(notifyOpening), removeClass = js.Any.fromFunction1(removeClass))
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
  @scala.inline
  implicit class MDCSnackbarAdapterOps[Self <: MDCSnackbarAdapter] (val x: Self) extends AnyVal {
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
    def setAnnounce(value: () => Unit): Self = this.set("announce", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyClosed(value: String => Unit): Self = this.set("notifyClosed", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyClosing(value: String => Unit): Self = this.set("notifyClosing", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyOpened(value: () => Unit): Self = this.set("notifyOpened", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyOpening(value: () => Unit): Self = this.set("notifyOpening", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
  }
  
}

