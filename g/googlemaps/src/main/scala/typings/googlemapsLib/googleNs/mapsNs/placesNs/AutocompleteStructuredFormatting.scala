package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteStructuredFormatting extends js.Object {
  var main_text: java.lang.String
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  var secondary_text: java.lang.String
}

object AutocompleteStructuredFormatting {
  @scala.inline
  def apply(
    main_text: java.lang.String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: java.lang.String
  ): AutocompleteStructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text, main_text_matched_substrings = main_text_matched_substrings, secondary_text = secondary_text)
  
    __obj.asInstanceOf[AutocompleteStructuredFormatting]
  }
}

