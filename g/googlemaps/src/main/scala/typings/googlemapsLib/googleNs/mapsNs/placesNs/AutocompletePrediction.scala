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

