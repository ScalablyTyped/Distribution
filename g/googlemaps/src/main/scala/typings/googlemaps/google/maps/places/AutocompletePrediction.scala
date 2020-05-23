package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompletePrediction extends js.Object {
  var description: String
  /**
    * The distance in meters of the place from the {@link AutocompletionRequest#origin}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/places-autocomplete-service#AutocompletePrediction.distance_meters Maps JavaScript API}
    */
  var distance_meters: js.UndefOr[Double] = js.undefined
  var id: String
  var matched_substrings: js.Array[PredictionSubstring]
  var place_id: String
  var reference: String
  var structured_formatting: AutocompleteStructuredFormatting
  var terms: js.Array[PredictionTerm]
  var types: js.Array[String]
}

object AutocompletePrediction {
  @scala.inline
  def apply(
    description: String,
    id: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    reference: String,
    structured_formatting: AutocompleteStructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[String],
    distance_meters: js.UndefOr[Double] = js.undefined
  ): AutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], structured_formatting = structured_formatting.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(distance_meters)) __obj.updateDynamic("distance_meters")(distance_meters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletePrediction]
  }
}

