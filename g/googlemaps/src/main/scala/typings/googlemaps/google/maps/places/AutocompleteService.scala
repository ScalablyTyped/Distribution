package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteService extends StObject {
  
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
  
  @scala.inline
  implicit class AutocompleteServiceMutableBuilder[Self <: AutocompleteService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPlacePredictions(
      value: (AutocompletionRequest, js.Function2[
          /* result */ js.Array[AutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "getPlacePredictions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetQueryPredictions(
      value: (QueryAutocompletionRequest, js.Function2[
          /* result */ js.Array[QueryAutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "getQueryPredictions", js.Any.fromFunction2(value))
  }
}
