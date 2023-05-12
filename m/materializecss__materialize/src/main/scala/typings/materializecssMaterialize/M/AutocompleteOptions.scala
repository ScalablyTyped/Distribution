package typings.materializecssMaterialize.M

import typings.materializecssMaterialize.anon.PartialDropdownOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteOptions extends StObject {
  
  /**
    * If true will render the key from each item directly as HTML.
    * User input MUST be properly sanitized first.
    * @default false
    */
  var allowUnsafeHTML: Boolean
  
  /**
    * Data object defining autocomplete options with
    * optional icon strings.
    */
  var data: AutocompleteData
  
  /**
    * Pass options object to select dropdown initialization.
    * @default {}
    */
  var dropdownOptions: PartialDropdownOptions
  
  /**
    * Limit of results the autocomplete shows.
    * @default infinity
    */
  var limit: Double
  
  /**
    * Minimum number of characters before autocomplete starts.
    * @default 1
    */
  var minLength: Double
  
  /**
    * Callback for when autocompleted.
    */
  def onAutocomplete(text: String): Unit
  
  /**
    * Sort function that defines the order of the list
    * of autocomplete options.
    */
  def sortFunction(a: String, b: String, inputText: String): Double
}
object AutocompleteOptions {
  
  inline def apply(
    allowUnsafeHTML: Boolean,
    data: AutocompleteData,
    dropdownOptions: PartialDropdownOptions,
    limit: Double,
    minLength: Double,
    onAutocomplete: String => Unit,
    sortFunction: (String, String, String) => Double
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal(allowUnsafeHTML = allowUnsafeHTML.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], onAutocomplete = js.Any.fromFunction1(onAutocomplete), sortFunction = js.Any.fromFunction3(sortFunction))
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowUnsafeHTML(value: Boolean): Self = StObject.set(x, "allowUnsafeHTML", value.asInstanceOf[js.Any])
    
    inline def setData(value: AutocompleteData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDropdownOptions(value: PartialDropdownOptions): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setOnAutocomplete(value: String => Unit): Self = StObject.set(x, "onAutocomplete", js.Any.fromFunction1(value))
    
    inline def setSortFunction(value: (String, String, String) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction3(value))
  }
}
