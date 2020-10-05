package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteService extends js.Object {
  def getPlacePredictions(
    request: AutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[AutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit = js.native
  def getQueryPredictions(
    request: QueryAutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[QueryAutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit = js.native
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
  @scala.inline
  implicit class AutocompleteServiceOps[Self <: AutocompleteService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPlacePredictions(
      value: (AutocompletionRequest, js.Function2[
          /* result */ js.Array[AutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]) => Unit
    ): Self = this.set("getPlacePredictions", js.Any.fromFunction2(value))
    @scala.inline
    def setGetQueryPredictions(
      value: (QueryAutocompletionRequest, js.Function2[
          /* result */ js.Array[QueryAutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]) => Unit
    ): Self = this.set("getQueryPredictions", js.Any.fromFunction2(value))
  }
  
}

