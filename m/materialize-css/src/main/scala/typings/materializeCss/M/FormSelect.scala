package typings.materializeCss.M

import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSelect
  extends StObject
     with Component[FormSelectOptions] {
  
  /**
    * Instance of the dropdown plugin for this select
    */
  var dropdown: Dropdown
  
  /**
    * Dropdown UL element
    */
  var dropdownOptions: HTMLUListElement
  
  /**
    * Get selected values in an array
    */
  def getSelectedValues(): js.Array[String]
  
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
}
object FormSelect {
  
  inline def apply(
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
  
  extension [Self <: FormSelect](x: Self) {
    
    inline def setDropdown(value: Dropdown): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownOptions(value: HTMLUListElement): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
    
    inline def setGetSelectedValues(value: () => js.Array[String]): Self = StObject.set(x, "getSelectedValues", js.Any.fromFunction0(value))
    
    inline def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setIsMultiple(value: Boolean): Self = StObject.set(x, "isMultiple", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: Element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
