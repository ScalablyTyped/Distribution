package typings.materializeDashCss.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteOptions extends js.Object {
  /**
    * Data object defining autocomplete options with optional icon strings.
    */
  var data: AutocompleteData
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
  def onAutocomplete(`this`: Autocomplete, text: String): Unit
  /**
    * Sort function that defines the order of the list of autocomplete options.
    */
  def sortFunction(a: String, b: String, inputText: String): Double
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    data: AutocompleteData,
    limit: Double,
    minLength: Double,
    onAutocomplete: (Autocomplete, String) => Unit,
    sortFunction: (String, String, String) => Double
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal(data = data, limit = limit, minLength = minLength, onAutocomplete = js.Any.fromFunction2(onAutocomplete), sortFunction = js.Any.fromFunction3(sortFunction))
  
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

