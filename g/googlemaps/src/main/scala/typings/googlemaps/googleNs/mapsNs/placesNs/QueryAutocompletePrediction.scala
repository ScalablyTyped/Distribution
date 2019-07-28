package typings.googlemaps.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompletePrediction extends js.Object {
  var description: String
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
    terms: js.Array[PredictionTerm]
  ): QueryAutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description, matched_substrings = matched_substrings, place_id = place_id, terms = terms)
  
    __obj.asInstanceOf[QueryAutocompletePrediction]
  }
}

