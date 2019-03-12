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
    addClass: java.lang.String => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    getOffsetLeft: () => scala.Double,
    getOffsetWidth: () => scala.Double,
    notifySelected: () => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeClass: java.lang.String => scala.Unit
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getOffsetLeft = js.Any.fromFunction0(getOffsetLeft), getOffsetWidth = js.Any.fromFunction0(getOffsetWidth), notifySelected = js.Any.fromFunction0(notifySelected), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
  
    __obj.asInstanceOf[MDCTabAdapter]
  }
}

