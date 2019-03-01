package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompletePrediction extends js.Object {
  var description: java.lang.String
  var matched_substrings: js.Array[PredictionSubstring]
  var place_id: java.lang.String
  var reference: java.lang.String
  var structured_formatting: AutocompleteStructuredFormatting
  var terms: js.Array[PredictionTerm]
  var types: js.Array[java.lang.String]
}

object AutocompletePrediction {
  @scala.inline
  def apply(
    description: java.lang.String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: java.lang.String,
    reference: java.lang.String,
    structured_formatting: AutocompleteStructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[java.lang.String]
  ): AutocompletePrediction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("matched_substrings")(matched_substrings)
    __obj.updateDynamic("place_id")(place_id)
    __obj.updateDynamic("reference")(reference)
    __obj.updateDynamic("structured_formatting")(structured_formatting)
    __obj.updateDynamic("terms")(terms)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[AutocompletePrediction]
  }
}

