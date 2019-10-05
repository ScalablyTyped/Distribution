package typings.atMaterialChips

import typings.atMaterialChips.chipMod.MDCChip
import typings.std.Element
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set/adapter", JSImport.Namespace)
@js.native
object chipDashSetAdapterMod extends js.Object {
  @js.native
  trait MDCChipSetAdapter extends js.Object {
    /**
      * Appends and returns a new chip element with the given text, leading icon, and trailing icon.
      */
    def appendChip(text: String): Element = js.native
    def appendChip(text: String, leadingIcon: Null, trailingIcon: Element): Element = js.native
    def appendChip(text: String, leadingIcon: Element): Element = js.native
    def appendChip(text: String, leadingIcon: Element, trailingIcon: Element): Element = js.native
    /**
      * Deregisters an event handler on the root element for a given event.
      */
    def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
    /**
      * Returns true if the root element contains the given class name.
      */
    def hasClass(className: String): Boolean = js.native
    /**
      * Registers an event handler on the root element for a given event.
      */
    def registerInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
    /**
      * Removes the chip object from the chip set.
      */
    def removeChip(chip: MDCChip): Unit = js.native
  }
  
}

