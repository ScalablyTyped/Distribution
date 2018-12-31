package typings
package atMaterialChipsLib.chipDashSetAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipSetAdapter extends js.Object {
  /**
    * Appends and returns a new chip element with the given text, leading icon, and trailing icon.
    */
  def appendChip(text: java.lang.String): stdLib.Element = js.native
  def appendChip(text: java.lang.String, leadingIcon: scala.Null, trailingIcon: stdLib.Element): stdLib.Element = js.native
  def appendChip(text: java.lang.String, leadingIcon: stdLib.Element): stdLib.Element = js.native
  def appendChip(text: java.lang.String, leadingIcon: stdLib.Element, trailingIcon: stdLib.Element): stdLib.Element = js.native
  /**
    * Deregisters an event handler on the root element for a given event.
    */
  def deregisterInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Returns true if the root element contains the given class name.
    */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
    * Registers an event handler on the root element for a given event.
    */
  def registerInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  /**
    * Removes the chip object from the chip set.
    */
  def removeChip(chip: atMaterialChipsLib.chipMod.MDCChip): scala.Unit = js.native
}

