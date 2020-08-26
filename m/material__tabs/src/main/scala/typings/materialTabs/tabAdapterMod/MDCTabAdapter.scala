package typings.materialTabs.tabAdapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def getOffsetLeft(): Double = js.native
  def getOffsetWidth(): Double = js.native
  def notifySelected(): Unit = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getOffsetLeft: () => Double,
    getOffsetWidth: () => Double,
    notifySelected: () => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getOffsetLeft = js.Any.fromFunction0(getOffsetLeft), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), notifySelected = js.Any.fromFunction0(notifySelected), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
    __obj.asInstanceOf[MDCTabAdapter]
  }
  @scala.inline
  implicit class MDCTabAdapterOps[Self <: MDCTabAdapter] (val x: Self) extends AnyVal {
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
    def setDeregisterInteractionHandler(value: (String, EventListener) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setGetOffsetLeft(value: () => Double): Self = this.set("getOffsetLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifySelected(value: () => Unit): Self = this.set("notifySelected", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
  }
  
}

