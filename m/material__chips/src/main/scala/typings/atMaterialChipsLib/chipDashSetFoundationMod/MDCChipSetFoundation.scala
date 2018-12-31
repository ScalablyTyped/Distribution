package typings
package atMaterialChipsLib.chipDashSetFoundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipSetFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialChipsLib.chipDashSetAdapterMod.MDCChipSetAdapter] {
  /**
    * Returns a new chip element with the given text, leading icon, and trailing icon,
    * added to the root chip set element.
    */
  def addChip(text: java.lang.String): stdLib.Element = js.native
  def addChip(text: java.lang.String, leadingIcon: scala.Null, trailingIcon: stdLib.Element): stdLib.Element = js.native
  def addChip(text: java.lang.String, leadingIcon: stdLib.Element): stdLib.Element = js.native
  def addChip(text: java.lang.String, leadingIcon: stdLib.Element, trailingIcon: stdLib.Element): stdLib.Element = js.native
  /**
    * Deselects the given chip.
    */
  def deselect(chipFoundation: default): scala.Unit = js.native
  /**
    * Selects the given chip. Deselects all other chips if the chip set is of the choice variant.
    */
  def select(chipFoundation: default): scala.Unit = js.native
}

