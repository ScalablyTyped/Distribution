package typings
package atMaterialTabsLib.tabAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def getOffsetLeft(): scala.Double
  def getOffsetWidth(): scala.Double
  def notifySelected(): scala.Unit
  def registerInteractionHandler(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    getOffsetLeft: js.Function0[scala.Double],
    getOffsetWidth: js.Function0[scala.Double],
    notifySelected: js.Function0[scala.Unit],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit]
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("deregisterInteractionHandler")(deregisterInteractionHandler)
    __obj.updateDynamic("getOffsetLeft")(getOffsetLeft)
    __obj.updateDynamic("getOffsetWidth")(getOffsetWidth)
    __obj.updateDynamic("notifySelected")(notifySelected)
    __obj.updateDynamic("registerInteractionHandler")(registerInteractionHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.asInstanceOf[MDCTabAdapter]
  }
}

