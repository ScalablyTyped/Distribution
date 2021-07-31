package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAutocompletePrediction extends StObject {
  
  var description: String
  
  var id: js.UndefOr[String] = js.undefined
  
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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompletePrediction]
  }
  
  @scala.inline
  implicit class QueryAutocompletePredictionMutableBuilder[Self <: QueryAutocompletePrediction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMatched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matched_substrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matched_substrings", js.Array(value :_*))
    
    @scala.inline
    def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
  }
}
