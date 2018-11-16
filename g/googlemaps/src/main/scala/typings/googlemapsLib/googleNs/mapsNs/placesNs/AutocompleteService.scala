package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.places.AutocompleteService")
@js.native
class AutocompleteService () extends js.Object {
  def getPlacePredictions(
    request: AutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[AutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getQueryPredictions(
    request: QueryAutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[QueryAutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

