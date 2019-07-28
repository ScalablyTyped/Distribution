package typings.atMaterialChips.chipDashSetFoundationMod

import typings.atMaterialChips.chipDashSetAdapterMod.MDCChipSetAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

