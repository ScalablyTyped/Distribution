package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompletePrediction extends js.Object {
  var description: java.lang.String
  var matched_substrings: js.Array[PredictionSubstring]
  var place_id: java.lang.String
  var terms: js.Array[PredictionTerm]
}

object QueryAutocompletePrediction {
  @scala.inline
  def apply(
    description: java.lang.String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: java.lang.String,
    terms: js.Array[PredictionTerm]
  ): QueryAutocompletePrediction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("matched_substrings")(matched_substrings)
    __obj.updateDynamic("place_id")(place_id)
    __obj.updateDynamic("terms")(terms)
    __obj.asInstanceOf[QueryAutocompletePrediction]
  }
}

