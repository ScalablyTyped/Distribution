package typings.materializeCss.M

import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<FormSelectOptions> * / any */ trait FormSelect extends js.Object {
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
    dropdown: Dropdown,
    dropdownOptions: HTMLUListElement,
    getSelectedValues: () => js.Array[String],
    input: HTMLInputElement,
    isMultiple: Boolean,
    wrapper: Element
  ): FormSelect = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], getSelectedValues = js.Any.fromFunction0(getSelectedValues), input = input.asInstanceOf[js.Any], isMultiple = isMultiple.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelect]
  }
}

