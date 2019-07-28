package typings.atMaterialTextfield.iconAdapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTextFieldIconAdapter extends js.Object {
  /**
    * Deregisters an event listener on the icon element for a given event.
    */
  def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Gets the value of an attribute on the icon element.
    */
  def getAttr(attr: String): String
  /**
    * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
    */
  def notifyIconAction(): Unit
  /**
    * Registers an event listener on the icon element for a given event.
    */
  def registerInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes an attribute from the icon element.
    */
  def removeAttr(attr: String): Unit
  /**
    * Sets an attribute on the icon element.
    */
  def setAttr(attr: String, value: String): Unit
}

object MDCTextFieldIconAdapter {
  @scala.inline
  def apply(
    deregisterInteractionHandler: (String, EventListener) => Unit,
    getAttr: String => String,
    notifyIconAction: () => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    removeAttr: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCTextFieldIconAdapter = {
    val __obj = js.Dynamic.literal(deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), notifyIconAction = js.Any.fromFunction0(notifyIconAction), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeAttr = js.Any.fromFunction1(removeAttr), setAttr = js.Any.fromFunction2(setAttr))
  
    __obj.asInstanceOf[MDCTextFieldIconAdapter]
  }
}

