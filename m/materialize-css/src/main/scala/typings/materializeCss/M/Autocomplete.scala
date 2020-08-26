package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<AutocompleteOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ @js.native
trait Autocomplete extends js.Object {
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double = js.native
  /**
    * Number of matching autocomplete options.
    */
  var count: Double = js.native
  /**
    * If the autocomplete is open.
    */
  var isOpen: Boolean = js.native
  /**
    * Hide autocomplete.
    */
  def close(): Unit = js.native
  /**
    * Show autocomplete.
    */
  def open(): Unit = js.native
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit = js.native
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit = js.native
}

object Autocomplete {
  @scala.inline
  def apply(
    activeIndex: Double,
    close: () => Unit,
    count: Double,
    isOpen: Boolean,
    open: () => Unit,
    selectOption: Element => Unit,
    updateData: AutocompleteData => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), count = count.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), selectOption = js.Any.fromFunction1(selectOption), updateData = js.Any.fromFunction1(updateData))
    __obj.asInstanceOf[Autocomplete]
  }
  @scala.inline
  implicit class AutocompleteOps[Self <: Autocomplete] (val x: Self) extends AnyVal {
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectOption(value: Element => Unit): Self = this.set("selectOption", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateData(value: AutocompleteData => Unit): Self = this.set("updateData", js.Any.fromFunction1(value))
  }
  
}

