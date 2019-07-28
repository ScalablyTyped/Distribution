package typings.atMaterialChips.chipDashSetMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialChips.chipDashSetAdapterMod.MDCChipSetAdapter
import typings.atMaterialChips.chipMod.MDCChip
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set", "MDCChipSet")
@js.native
class MDCChipSet ()
  extends default[MDCChipSetAdapter, typings.atMaterialChips.chipDashSetFoundationMod.default] {
  /**
    * Creates a new chip in the chip set with the given text, leading icon, and trailing icon.
    */
  def addChip(text: String): Unit = js.native
  def addChip(text: String, leadingIcon: Null, trailingIcon: Element): Unit = js.native
  def addChip(text: String, leadingIcon: Element): Unit = js.native
  def addChip(text: String, leadingIcon: Element, trailingIcon: Element): Unit = js.native
  def initialize(): Unit = js.native
  def initialize(chipFactory: js.Function1[/* el */ Element, MDCChip]): Unit = js.native
}

/* static members */
@JSImport("@material/chips/chip-set", "MDCChipSet")
@js.native
object MDCChipSet extends js.Object {
  def attachTo(root: js.Any): MDCChipSet = js.native
}

