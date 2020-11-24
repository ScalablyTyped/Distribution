package typings.materializeCss.M

import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<FormSelectOptions> * / any */ @js.native
trait FormSelect extends js.Object {
  
  /**
    * Instance of the dropdown plugin for this select
    */
  var dropdown: Dropdown = js.native
  
  /**
    * Dropdown UL element
    */
  var dropdownOptions: HTMLUListElement = js.native
  
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[String] = js.native
  
  /**
    * Text input that shows current selected option
    */
  var input: HTMLInputElement = js.native
  
  /**
    * If this is a multiple select
    */
  var isMultiple: Boolean = js.native
  
  /**
    * The select wrapper element
    */
  var wrapper: Element = js.native
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
  
  @scala.inline
  implicit class FormSelectOps[Self <: FormSelect] (val x: Self) extends AnyVal {
    
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
    def setDropdown(value: Dropdown): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownOptions(value: HTMLUListElement): Self = this.set("dropdownOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelectedValues(value: () => js.Array[String]): Self = this.set("getSelectedValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInput(value: HTMLInputElement): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiple(value: Boolean): Self = this.set("isMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: Element): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
}
