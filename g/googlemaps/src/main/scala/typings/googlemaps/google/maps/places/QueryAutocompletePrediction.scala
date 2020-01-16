package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompletePrediction extends js.Object {
  var description: String
  var id: js.UndefOr[String] = js.undefined
  var matched_substrings: js.Array[PredictionSubstring]
  var place_id: String
  var terms: js.Array[PredictionTerm]
}

object QueryAutocompletePrediction {
  @scala.inline
  def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    terms: js.Array[PredictionTerm],
    id: String = null
  ): QueryAutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompletePrediction]
  }
}

