package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dropdown extends Component[DropdownOptions] {
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: Element
  /**
    * The index of the item focused
    */
  var focusedIndex: Double
  /**
    * ID of the dropdown element
    */
  var id: String
  /**
    * If the dropdown is open
    */
  var isOpen: Boolean
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: Boolean
  /**
    * Close dropdown
    */
  def close(): Unit
  /**
    * Open dropdown
    */
  def open(): Unit
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): Unit
}

object Dropdown {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    dropdownEl: Element,
    el: Element,
    focusedIndex: Double,
    id: String,
    isOpen: Boolean,
    isScrollable: Boolean,
    open: () => Unit,
    options: DropdownOptions,
    recalculateDimensions: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), dropdownEl = dropdownEl.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], recalculateDimensions = js.Any.fromFunction0(recalculateDimensions))
    __obj.asInstanceOf[Dropdown]
  }
}

