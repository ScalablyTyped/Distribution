package typings.materialIconToggle.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCIconToggleAdapter extends js.Object {
  def addClass(className: String): Unit = js.native
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def getAttr(name: String): String = js.native
  def getTabIndex(): Double = js.native
  def notifyChange(evtData: IconToggleEvent): Unit = js.native
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def rmAttr(name: String): Unit = js.native
  def setAttr(name: String, value: String): Unit = js.native
  def setTabIndex(tabIndex: Double): Unit = js.native
  def setText(text: String): Unit = js.native
}

object MDCIconToggleAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getAttr: String => String,
    getTabIndex: () => Double,
    notifyChange: IconToggleEvent => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    rmAttr: String => Unit,
    setAttr: (String, String) => Unit,
    setTabIndex: Double => Unit,
    setText: String => Unit
  ): MDCIconToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), getTabIndex = js.Any.fromFunction0(getTabIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), rmAttr = js.Any.fromFunction1(rmAttr), setAttr = js.Any.fromFunction2(setAttr), setTabIndex = js.Any.fromFunction1(setTabIndex), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[MDCIconToggleAdapter]
  }
  @scala.inline
  implicit class MDCIconToggleAdapterOps[Self <: MDCIconToggleAdapter] (val x: Self) extends AnyVal {
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
    def setGetAttr(value: String => String): Self = this.set("getAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTabIndex(value: () => Double): Self = this.set("getTabIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyChange(value: IconToggleEvent => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterInteractionHandler(value: (String, EventListener) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setRmAttr(value: String => Unit): Self = this.set("rmAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttr(value: (String, String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTabIndex(value: Double => Unit): Self = this.set("setTabIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}

