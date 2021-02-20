package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: rename to StructuredFormatting https://developers.google.com/maps/documentation/javascript/reference/places-autocomplete-service#StructuredFormatting
@js.native
trait AutocompleteStructuredFormatting extends StObject {
  
  var main_text: String = js.native
  
  var main_text_matched_substrings: js.Array[PredictionSubstring] = js.native
  
  var secondary_text: String = js.native
  
  var secondary_text_matched_substrings: js.UndefOr[js.Array[PredictionSubstring]] = js.native
}
object AutocompleteStructuredFormatting {
  
  @scala.inline
  def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): AutocompleteStructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text.asInstanceOf[js.Any], main_text_matched_substrings = main_text_matched_substrings.asInstanceOf[js.Any], secondary_text = secondary_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteStructuredFormatting]
  }
  
  @scala.inline
  implicit class AutocompleteStructuredFormattingMutableBuilder[Self <: AutocompleteStructuredFormatting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMain_text(value: String): Self = StObject.set(x, "main_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "main_text_matched_substrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain_text_matched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "main_text_matched_substrings", js.Array(value :_*))
    
    @scala.inline
    def setSecondary_text(value: String): Self = StObject.set(x, "secondary_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "secondary_text_matched_substrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary_text_matched_substringsUndefined: Self = StObject.set(x, "secondary_text_matched_substrings", js.undefined)
    
    @scala.inline
    def setSecondary_text_matched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "secondary_text_matched_substrings", js.Array(value :_*))
  }
}
