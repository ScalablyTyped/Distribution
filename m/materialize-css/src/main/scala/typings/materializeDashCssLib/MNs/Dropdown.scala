package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Dropdown")
@js.native
class Dropdown () extends Component[DropdownOptions] {
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: stdLib.Element = js.native
  /**
    * The index of the item focused
    */
  var focusedIndex: scala.Double = js.native
  /**
    * ID of the dropdown element
    */
  var id: java.lang.String = js.native
  /**
    * If the dropdown is open
    */
  var isOpen: scala.Boolean = js.native
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: scala.Boolean = js.native
  /**
    * Close dropdown
    */
  def close(): scala.Unit = js.native
  /**
    * Open dropdown
    */
  def open(): scala.Unit = js.native
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): scala.Unit = js.native
}

@JSGlobal("M.Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Dropdown] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.DropdownOptions]
  ): js.Array[materializeDashCssLib.MNs.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Dropdown = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.DropdownOptions]): materializeDashCssLib.MNs.Dropdown = js.native
}

