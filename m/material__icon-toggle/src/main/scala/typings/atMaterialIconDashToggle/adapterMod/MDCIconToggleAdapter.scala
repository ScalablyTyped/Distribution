package typings.atMaterialIconDashToggle.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCIconToggleAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def getAttr(name: String): String
  def getTabIndex(): Double
  def notifyChange(evtData: IconToggleEvent): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def rmAttr(name: String): Unit
  def setAttr(name: String, value: String): Unit
  def setTabIndex(tabIndex: Double): Unit
  def setText(text: String): Unit
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
}

