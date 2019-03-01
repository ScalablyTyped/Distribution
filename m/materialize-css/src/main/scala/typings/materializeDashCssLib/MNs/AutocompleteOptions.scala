package typings
package materializeDashCssLib.MNs

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
  var limit: scala.Double
  /**
    * Minimum number of characters before autocomplete starts.
    * @default 1
    */
  var minLength: scala.Double
  /**
    * Callback for when autocompleted.
    */
  def onAutocomplete(`this`: Autocomplete, text: java.lang.String): scala.Unit
  /**
    * Sort function that defines the order of the list of autocomplete options.
    */
  def sortFunction(a: java.lang.String, b: java.lang.String, inputText: java.lang.String): scala.Double
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    data: AutocompleteData,
    limit: scala.Double,
    minLength: scala.Double,
    onAutocomplete: js.Function2[Autocomplete, java.lang.String, scala.Unit],
    sortFunction: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Double]
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("minLength")(minLength)
    __obj.updateDynamic("onAutocomplete")(onAutocomplete)
    __obj.updateDynamic("sortFunction")(sortFunction)
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

