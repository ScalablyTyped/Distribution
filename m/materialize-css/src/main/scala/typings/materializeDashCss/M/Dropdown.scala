package typings.materializeDashCss.M

import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Dropdown")
@js.native
class Dropdown () extends Component[DropdownOptions] {
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: Element = js.native
  /**
    * The index of the item focused
    */
  var focusedIndex: Double = js.native
  /**
    * ID of the dropdown element
    */
  var id: String = js.native
  /**
    * If the dropdown is open
    */
  var isOpen: Boolean = js.native
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: Boolean = js.native
  /**
    * Close dropdown
    */
  def close(): Unit = js.native
  /**
    * Open dropdown
    */
  def open(): Unit = js.native
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): Unit = js.native
}

/* static members */
@JSGlobal("M.Dropdown")
@js.native
object Dropdown extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Dropdown = js.native
  /**
    * Init Dropdowns
    */
  def init(els: MElements): js.Array[Dropdown] = js.native
  def init(els: MElements, options: Partial[DropdownOptions]): js.Array[Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: Element): Dropdown = js.native
  def init(els: Element, options: Partial[DropdownOptions]): Dropdown = js.native
}

