package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<DropdownOptions> * / any */ @js.native
trait Dropdown extends js.Object {
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
  @scala.inline
  implicit class DropdownOps[Self <: Dropdown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDropdownEl(value: Element): Self = this.set("dropdownEl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedIndex(value: Double): Self = this.set("focusedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrollable(value: Boolean): Self = this.set("isScrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setRecalculateDimensions(value: () => Unit): Self = this.set("recalculateDimensions", js.Any.fromFunction0(value))
  }
  
}

