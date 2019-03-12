package typings
package atMaterialTextfieldLib.iconAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTextFieldIconAdapter extends js.Object {
  /**
    * Deregisters an event listener on the icon element for a given event.
    */
  def deregisterInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Gets the value of an attribute on the icon element.
    */
  def getAttr(attr: java.lang.String): java.lang.String
  /**
    * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
    */
  def notifyIconAction(): scala.Unit
  /**
    * Registers an event listener on the icon element for a given event.
    */
  def registerInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Removes an attribute from the icon element.
    */
  def removeAttr(attr: java.lang.String): scala.Unit
  /**
    * Sets an attribute on the icon element.
    */
  def setAttr(attr: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCTextFieldIconAdapter {
  @scala.inline
  def apply(
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    getAttr: java.lang.String => java.lang.String,
    notifyIconAction: () => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    removeAttr: java.lang.String => scala.Unit,
    setAttr: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCTextFieldIconAdapter = {
    val __obj = js.Dynamic.literal(deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), notifyIconAction = js.Any.fromFunction0(notifyIconAction), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeAttr = js.Any.fromFunction1(removeAttr), setAttr = js.Any.fromFunction2(setAttr))
  
    __obj.asInstanceOf[MDCTextFieldIconAdapter]
  }
}

