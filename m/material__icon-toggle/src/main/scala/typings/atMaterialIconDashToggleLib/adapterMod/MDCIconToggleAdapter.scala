package typings
package atMaterialIconDashToggleLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCIconToggleAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def getAttr(name: java.lang.String): java.lang.String
  def getTabIndex(): scala.Double
  def notifyChange(evtData: IconToggleEvent): scala.Unit
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def rmAttr(name: java.lang.String): scala.Unit
  def setAttr(name: java.lang.String, value: java.lang.String): scala.Unit
  def setTabIndex(tabIndex: scala.Double): scala.Unit
  def setText(text: java.lang.String): scala.Unit
}

object MDCIconToggleAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    getAttr: java.lang.String => java.lang.String,
    getTabIndex: () => scala.Double,
    notifyChange: IconToggleEvent => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    rmAttr: java.lang.String => scala.Unit,
    setAttr: (java.lang.String, java.lang.String) => scala.Unit,
    setTabIndex: scala.Double => scala.Unit,
    setText: java.lang.String => scala.Unit
  ): MDCIconToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), getTabIndex = js.Any.fromFunction0(getTabIndex), notifyChange = js.Any.fromFunction1(notifyChange), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass), rmAttr = js.Any.fromFunction1(rmAttr), setAttr = js.Any.fromFunction2(setAttr), setTabIndex = js.Any.fromFunction1(setTabIndex), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[MDCIconToggleAdapter]
  }
}

