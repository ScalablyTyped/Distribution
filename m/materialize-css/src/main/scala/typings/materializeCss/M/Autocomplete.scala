package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autocomplete
  extends Component[AutocompleteOptions]
     with Openable {
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double
  /**
    * Number of matching autocomplete options.
    */
  var count: Double
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
    destroy: () => Unit,
    el: Element,
    isOpen: Boolean,
    open: () => Unit,
    options: AutocompleteOptions,
    selectOption: Element => Unit,
    updateData: AutocompleteData => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), count = count.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1(selectOption), updateData = js.Any.fromFunction1(updateData))
    __obj.asInstanceOf[Autocomplete]
  }
}

