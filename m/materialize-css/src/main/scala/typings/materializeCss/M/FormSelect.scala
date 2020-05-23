package typings.materializeCss.M

import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSelect extends Component[FormSelectOptions] {
  /**
    * Instance of the dropdown plugin for this select
    */
  var dropdown: Dropdown
  /**
    * Dropdown UL element
    */
  var dropdownOptions: HTMLUListElement
  /**
    * Text input that shows current selected option
    */
  var input: HTMLInputElement
  /**
    * If this is a multiple select
    */
  var isMultiple: Boolean
  /**
    * The select wrapper element
    */
  var wrapper: Element
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[String]
}

object FormSelect {
  @scala.inline
  def apply(
    destroy: () => Unit,
    dropdown: Dropdown,
    dropdownOptions: HTMLUListElement,
    el: Element,
    getSelectedValues: () => js.Array[String],
    input: HTMLInputElement,
    isMultiple: Boolean,
    options: FormSelectOptions,
    wrapper: Element
  ): FormSelect = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), dropdown = dropdown.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], getSelectedValues = js.Any.fromFunction0(getSelectedValues), input = input.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelect]
  }
}

