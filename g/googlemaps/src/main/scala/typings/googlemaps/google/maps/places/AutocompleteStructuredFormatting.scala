package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: rename to StructuredFormatting https://developers.google.com/maps/documentation/javascript/reference/places-autocomplete-service#StructuredFormatting
trait AutocompleteStructuredFormatting extends StObject {
  
  var main_text: String
  
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  
  var secondary_text: String
  
  var secondary_text_matched_substrings: js.UndefOr[js.Array[PredictionSubstring]] = js.undefined
}
object AutocompleteStructuredFormatting {
  
  inline def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): AutocompleteStructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text.asInstanceOf[js.Any], main_text_matched_substrings = main_text_matched_substrings.asInstanceOf[js.Any], secondary_text = secondary_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteStructuredFormatting]
  }
  
  extension [Self <: AutocompleteStructuredFormatting](x: Self) {
    
    inline def setMain_text(value: String): Self = StObject.set(x, "main_text", value.asInstanceOf[js.Any])
    
    inline def setMain_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "main_text_matched_substrings", value.asInstanceOf[js.Any])
    
    inline def setMain_text_matched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "main_text_matched_substrings", js.Array(value :_*))
    
    inline def setSecondary_text(value: String): Self = StObject.set(x, "secondary_text", value.asInstanceOf[js.Any])
    
    inline def setSecondary_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "secondary_text_matched_substrings", value.asInstanceOf[js.Any])
    
    inline def setSecondary_text_matched_substringsUndefined: Self = StObject.set(x, "secondary_text_matched_substrings", js.undefined)
    
    inline def setSecondary_text_matched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "secondary_text_matched_substrings", js.Array(value :_*))
  }
}
