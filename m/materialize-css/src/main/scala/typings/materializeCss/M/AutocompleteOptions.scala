package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteOptions extends js.Object {
  
  /**
    * Data object defining autocomplete options with optional icon strings.
    */
  var data: AutocompleteData = js.native
  
  /**
    * Limit of results the autocomplete shows.
    * @default infinity
    */
  var limit: Double = js.native
  
  /**
    * Minimum number of characters before autocomplete starts.
    * @default 1
    */
  var minLength: Double = js.native
  
  /**
    * Callback for when autocompleted.
    */
  def onAutocomplete(text: String): Unit = js.native
  
  /**
    * Sort function that defines the order of the list of autocomplete options.
    */
  def sortFunction(a: String, b: String, inputText: String): Double = js.native
}
object AutocompleteOptions {
  
  @scala.inline
  def apply(
    data: AutocompleteData,
    limit: Double,
    minLength: Double,
    onAutocomplete: String => Unit,
    sortFunction: (String, String, String) => Double
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], onAutocomplete = js.Any.fromFunction1(onAutocomplete), sortFunction = js.Any.fromFunction3(sortFunction))
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit class AutocompleteOptionsOps[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
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
    def setData(value: AutocompleteData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAutocomplete(value: String => Unit): Self = this.set("onAutocomplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortFunction(value: (String, String, String) => Double): Self = this.set("sortFunction", js.Any.fromFunction3(value))
  }
}
