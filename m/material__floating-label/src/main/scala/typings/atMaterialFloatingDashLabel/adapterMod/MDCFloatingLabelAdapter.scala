package typings.atMaterialFloatingDashLabel.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFloatingLabelAdapter extends js.Object {
  /**
    * Adds a class to the label element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Returns the width of the label element.
    */
  def getWidth(): Double
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes a class from the label element.
    */
  def removeClass(className: String): Unit
}

object MDCFloatingLabelAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getWidth: () => Double,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeClass: String => Unit
  ): MDCFloatingLabelAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getWidth = js.Any.fromFunction0(getWidth), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeClass = js.Any.fromFunction1(removeClass))
  
    __obj.asInstanceOf[MDCFloatingLabelAdapter]
  }
}

