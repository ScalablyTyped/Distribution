package typings.atMaterialChips.chipMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialChips.chipAdapterMod.MDCChipAdapter
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip", "MDCChip")
@js.native
class MDCChip ()
  extends default[MDCChipAdapter, typings.atMaterialChips.chipFoundationMod.default] {
  val foundation: typings.atMaterialChips.chipFoundationMod.default = js.native
  val ripple: MDCRipple = js.native
  /**
    * Returns true if the chip is selected.
    */
  def isSelected(): Boolean = js.native
  /**
    * Destroys the chip and removes the root element from the DOM.
    */
  def remove(): Unit = js.native
}

/* static members */
@JSImport("@material/chips/chip", "MDCChip")
@js.native
object MDCChip extends js.Object {
  def attachTo(root: Element): MDCChip = js.native
}

