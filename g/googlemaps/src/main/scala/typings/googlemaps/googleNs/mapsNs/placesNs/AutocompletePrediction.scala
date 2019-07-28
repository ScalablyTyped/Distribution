package typings.googlemaps.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompletePrediction extends js.Object {
  var description: String
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
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    reference: String,
    structured_formatting: AutocompleteStructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): AutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description, matched_substrings = matched_substrings, place_id = place_id, reference = reference, structured_formatting = structured_formatting, terms = terms, types = types)
  
    __obj.asInstanceOf[AutocompletePrediction]
  }
}

