package typings.atMaterialTabs.tabAdapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def getOffsetLeft(): Double
  def getOffsetWidth(): Double
  def notifySelected(): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
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
}

