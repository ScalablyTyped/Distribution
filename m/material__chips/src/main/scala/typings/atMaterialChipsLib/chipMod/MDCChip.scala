package typings
package atMaterialChipsLib.chipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip", "MDCChip")
@js.native
class MDCChip ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialChipsLib.chipAdapterMod.MDCChipAdapter, 
      atMaterialChipsLib.chipFoundationMod.default
    ] {
  val foundation: atMaterialChipsLib.chipFoundationMod.default = js.native
  val ripple: atMaterialRippleLib.atMaterialRippleMod.MDCRipple = js.native
  /**
    * Returns true if the chip is selected.
    */
  def isSelected(): scala.Boolean = js.native
  /**
    * Destroys the chip and removes the root element from the DOM.
    */
  def remove(): scala.Unit = js.native
}

@JSImport("@material/chips/chip", "MDCChip")
@js.native
object MDCChip extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialChipsLib.chipMod.MDCChip = js.native
}

