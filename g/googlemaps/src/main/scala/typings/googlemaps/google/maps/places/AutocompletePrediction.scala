package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompletePrediction extends StObject {
  
  var description: String
  
  /**
    * The distance in meters of the place from the {@link AutocompletionRequest#origin}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/places-autocomplete-service#AutocompletePrediction.distance_meters Maps JavaScript API}
    */
  var distance_meters: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], structured_formatting = structured_formatting.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletePrediction]
  }
  
  @scala.inline
  implicit class AutocompletePredictionMutableBuilder[Self <: AutocompletePrediction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance_meters(value: Double): Self = StObject.set(x, "distance_meters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance_metersUndefined: Self = StObject.set(x, "distance_meters", js.undefined)
    
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
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructured_formatting(value: AutocompleteStructuredFormatting): Self = StObject.set(x, "structured_formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
