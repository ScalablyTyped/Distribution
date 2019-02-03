package typings
package atMaterialChipsLib.chipDashSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip-set", "MDCChipSet")
@js.native
class MDCChipSet ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialChipsLib.chipDashSetAdapterMod.MDCChipSetAdapter, 
      atMaterialChipsLib.chipDashSetFoundationMod.default
    ] {
  /**
    * Creates a new chip in the chip set with the given text, leading icon, and trailing icon.
    */
  def addChip(text: java.lang.String): scala.Unit = js.native
  def addChip(text: java.lang.String, leadingIcon: scala.Null, trailingIcon: stdLib.Element): scala.Unit = js.native
  def addChip(text: java.lang.String, leadingIcon: stdLib.Element): scala.Unit = js.native
  def addChip(text: java.lang.String, leadingIcon: stdLib.Element, trailingIcon: stdLib.Element): scala.Unit = js.native
  def initialize(): scala.Unit = js.native
  def initialize(chipFactory: js.Function1[/* el */ stdLib.Element, atMaterialChipsLib.chipMod.MDCChip]): scala.Unit = js.native
}

/* static members */
@JSImport("@material/chips/chip-set", "MDCChipSet")
@js.native
object MDCChipSet extends js.Object {
  def attachTo(root: js.Any): atMaterialChipsLib.chipDashSetMod.MDCChipSet = js.native
}

