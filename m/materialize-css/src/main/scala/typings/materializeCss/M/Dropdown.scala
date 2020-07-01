package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<DropdownOptions> * / any */ trait Dropdown extends js.Object {
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
    dropdownEl: Element,
    focusedIndex: Double,
    id: String,
    isOpen: Boolean,
    isScrollable: Boolean,
    open: () => Unit,
    recalculateDimensions: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dropdownEl = dropdownEl.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), recalculateDimensions = js.Any.fromFunction0(recalculateDimensions))
    __obj.asInstanceOf[Dropdown]
  }
}

