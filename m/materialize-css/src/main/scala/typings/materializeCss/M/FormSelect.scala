package typings.materializeCss.M

import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<FormSelectOptions> * / any */ @js.native
trait FormSelect extends StObject {
  
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
  implicit class FormSelectMutableBuilder[Self <: FormSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropdown(value: Dropdown): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownOptions(value: HTMLUListElement): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelectedValues(value: () => js.Array[String]): Self = StObject.set(x, "getSelectedValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiple(value: Boolean): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: Element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
