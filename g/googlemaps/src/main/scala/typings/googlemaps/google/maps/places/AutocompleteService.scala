package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteService extends js.Object {
  def getPlacePredictions(
    request: AutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[AutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit
  def getQueryPredictions(
    request: QueryAutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[QueryAutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit
}

object AutocompleteService {
  @scala.inline
  def apply(
    getPlacePredictions: (AutocompletionRequest, js.Function2[
      /* result */ js.Array[AutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]) => Unit,
    getQueryPredictions: (QueryAutocompletionRequest, js.Function2[
      /* result */ js.Array[QueryAutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]) => Unit
  ): AutocompleteService = {
    val __obj = js.Dynamic.literal(getPlacePredictions = js.Any.fromFunction2(getPlacePredictions), getQueryPredictions = js.Any.fromFunction2(getQueryPredictions))
    __obj.asInstanceOf[AutocompleteService]
  }
}

