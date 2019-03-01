package typings
package atMaterialChipsLib.chipAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCChipAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def addClassToLeadingIcon(className: java.lang.String): scala.Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Deregisters an event listener on the trailing icon element for a given event.
    */
  def deregisterTrailingIconInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Returns true if target has className, false otherwise.
    */
  def eventTargetHasClass(target: stdLib.EventTarget, className: java.lang.String): scala.Boolean
  /**
    * Returns the computed property value of the given style property on the root element.
    */
  def getComputedStyleValue(propertyName: java.lang.String): java.lang.String
  def hasClass(className: java.lang.String): scala.Boolean
  /**
    * Emits a custom "MDCChip:interaction" event denoting the chip has been
    * interacted with (typically on click or keydown).
    */
  def notifyInteraction(): scala.Unit
  /**
    * Emits a custom event "MDCChip:removal" denoting the chip will be removed.
    */
  def notifyRemoval(): scala.Unit
  /**
    * Emits a custom "MDCChip:trailingIconInteraction" event denoting the trailing icon has been
    * interacted with (typically on click or keydown).
    */
  def notifyTrailingIconInteraction(): scala.Unit
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Registers an event listener on the trailing icon element for a given event.
    */
  def registerTrailingIconInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeClassFromLeadingIcon(className: java.lang.String): scala.Unit
  /**
    * Sets the property value of the given style property on the root element.
    */
  def setStyleProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCChipAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    addClassToLeadingIcon: js.Function1[java.lang.String, scala.Unit],
    deregisterEventHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterTrailingIconInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    eventTargetHasClass: js.Function2[stdLib.EventTarget, java.lang.String, scala.Boolean],
    getComputedStyleValue: js.Function1[java.lang.String, java.lang.String],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    notifyInteraction: js.Function0[scala.Unit],
    notifyRemoval: js.Function0[scala.Unit],
    notifyTrailingIconInteraction: js.Function0[scala.Unit],
    registerEventHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerTrailingIconInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    removeClassFromLeadingIcon: js.Function1[java.lang.String, scala.Unit],
    setStyleProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCChipAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("addClassToLeadingIcon")(addClassToLeadingIcon)
    __obj.updateDynamic("deregisterEventHandler")(deregisterEventHandler)
    __obj.updateDynamic("deregisterTrailingIconInteractionHandler")(deregisterTrailingIconInteractionHandler)
    __obj.updateDynamic("eventTargetHasClass")(eventTargetHasClass)
    __obj.updateDynamic("getComputedStyleValue")(getComputedStyleValue)
    __obj.updateDynamic("hasClass")(hasClass)
    __obj.updateDynamic("notifyInteraction")(notifyInteraction)
    __obj.updateDynamic("notifyRemoval")(notifyRemoval)
    __obj.updateDynamic("notifyTrailingIconInteraction")(notifyTrailingIconInteraction)
    __obj.updateDynamic("registerEventHandler")(registerEventHandler)
    __obj.updateDynamic("registerTrailingIconInteractionHandler")(registerTrailingIconInteractionHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("removeClassFromLeadingIcon")(removeClassFromLeadingIcon)
    __obj.updateDynamic("setStyleProperty")(setStyleProperty)
    __obj.asInstanceOf[MDCChipAdapter]
  }
}

