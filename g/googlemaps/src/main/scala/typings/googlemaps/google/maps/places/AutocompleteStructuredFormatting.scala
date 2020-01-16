package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteStructuredFormatting extends js.Object {
  var main_text: String
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  var secondary_text: String
  var secondary_text_matched_substrings: js.UndefOr[js.Array[PredictionSubstring]] = js.undefined
}

object AutocompleteStructuredFormatting {
  @scala.inline
  def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String,
    secondary_text_matched_substrings: js.Array[PredictionSubstring] = null
  ): AutocompleteStructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text.asInstanceOf[js.Any], main_text_matched_substrings = main_text_matched_substrings.asInstanceOf[js.Any], secondary_text = secondary_text.asInstanceOf[js.Any])
    if (secondary_text_matched_substrings != null) __obj.updateDynamic("secondary_text_matched_substrings")(secondary_text_matched_substrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteStructuredFormatting]
  }
}

