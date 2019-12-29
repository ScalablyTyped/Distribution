package typings.atMaterialChips

import typings.atMaterialChips.chipDashSetAdapterMod.MDCChipSetAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set/foundation", JSImport.Namespace)
@js.native
object chipDashSetFoundationMod extends js.Object {
  @js.native
  trait MDCChipSetFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCChipSetAdapter] {
    /**
      * Returns a new chip element with the given text, leading icon, and trailing icon,
      * added to the root chip set element.
      */
    def addChip(text: String): Element = js.native
    def addChip(text: String, leadingIcon: Null, trailingIcon: Element): Element = js.native
    def addChip(text: String, leadingIcon: Element): Element = js.native
    def addChip(text: String, leadingIcon: Element, trailingIcon: Element): Element = js.native
    /**
      * Deselects the given chip.
      */
    def deselect(chipFoundation: default): Unit = js.native
    /**
      * Selects the given chip. Deselects all other chips if the chip set is of the choice variant.
      */
    def select(chipFoundation: default): Unit = js.native
  }
  
  @js.native
  class default () extends MDCChipSetFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialChips.chipDashSetConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipSetAdapter = js.native
    val strings: typings.atMaterialChips.chipDashSetConstantsMod.strings = js.native
  }
  
}

