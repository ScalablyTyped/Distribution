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
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    getAttr: js.Function1[java.lang.String, java.lang.String],
    getTabIndex: js.Function0[scala.Double],
    notifyChange: js.Function1[IconToggleEvent, scala.Unit],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    rmAttr: js.Function1[java.lang.String, scala.Unit],
    setAttr: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setTabIndex: js.Function1[scala.Double, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit]
  ): MDCIconToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterInteractionHandler = deregisterInteractionHandler, getAttr = getAttr, getTabIndex = getTabIndex, notifyChange = notifyChange, registerInteractionHandler = registerInteractionHandler, removeClass = removeClass, rmAttr = rmAttr, setAttr = setAttr, setTabIndex = setTabIndex, setText = setText)
  
    __obj.asInstanceOf[MDCIconToggleAdapter]
  }
}

