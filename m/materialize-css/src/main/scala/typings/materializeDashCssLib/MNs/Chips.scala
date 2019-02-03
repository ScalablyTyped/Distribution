package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Chips")
@js.native
class Chips () extends Component[ChipsOptions] {
  /**
    * Autocomplete instance, if any
    */
  var autocomplete: Autocomplete = js.native
  /**
    * Array of the current chips data
    */
  var chipsData: js.Array[ChipData] = js.native
  /**
    * If the chips has autocomplete enabled
    */
  var hasAutocomplete: scala.Boolean = js.native
  /**
    * Add chip to input
    * @param data Chip data object
    */
  def addChip(chip: ChipData): scala.Unit = js.native
  /**
    * Delete nth chip
    * @param n  Index of chip
    */
  def deleteChip(): scala.Unit = js.native
  def deleteChip(n: scala.Double): scala.Unit = js.native
  /**
    * Select nth chip
    * @param n Index of chip
    */
  def selectChip(n: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("M.Chips")
@js.native
object Chips extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Chips = js.native
  /**
    * Init Chipses
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Chips] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.ChipsOptions]
  ): js.Array[materializeDashCssLib.MNs.Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Chips = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.ChipsOptions]): materializeDashCssLib.MNs.Chips = js.native
}

