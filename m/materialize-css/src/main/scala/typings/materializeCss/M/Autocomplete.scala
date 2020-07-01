package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<AutocompleteOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Autocomplete extends js.Object {
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double
  /**
    * Number of matching autocomplete options.
    */
  var count: Double
  /**
    * If the autocomplete is open.
    */
  var isOpen: Boolean
  /**
    * Hide autocomplete.
    */
  def close(): Unit
  /**
    * Show autocomplete.
    */
  def open(): Unit
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit
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
}

