package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteStructuredFormatting extends js.Object {
  var main_text: String
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  var secondary_text: String
}

object AutocompleteStructuredFormatting {
  @scala.inline
  def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): AutocompleteStructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text, main_text_matched_substrings = main_text_matched_substrings, secondary_text = secondary_text)
  
    __obj.asInstanceOf[AutocompleteStructuredFormatting]
  }
}

