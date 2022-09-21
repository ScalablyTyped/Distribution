package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImagePropertiesSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to brightness.
    */
  var brightnessSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to content_uri.
    */
  var contentUriSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to contrast.
    */
  var contrastSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A mask that indicates which of the fields in crop_properties have been changed in this suggestion.
    */
  var cropPropertiesSuggestionState: js.UndefOr[SchemaCropPropertiesSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to source_uri.
    */
  var sourceUriSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to transparency.
    */
  var transparencySuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaImagePropertiesSuggestionState {
  
  inline def apply(): SchemaImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagePropertiesSuggestionState]
  }
  
  extension [Self <: SchemaImagePropertiesSuggestionState](x: Self) {
    
    inline def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
    
    inline def setAngleSuggestedNull: Self = StObject.set(x, "angleSuggested", null)
    
    inline def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
    
    inline def setBrightnessSuggested(value: Boolean): Self = StObject.set(x, "brightnessSuggested", value.asInstanceOf[js.Any])
    
    inline def setBrightnessSuggestedNull: Self = StObject.set(x, "brightnessSuggested", null)
    
    inline def setBrightnessSuggestedUndefined: Self = StObject.set(x, "brightnessSuggested", js.undefined)
    
    inline def setContentUriSuggested(value: Boolean): Self = StObject.set(x, "contentUriSuggested", value.asInstanceOf[js.Any])
    
    inline def setContentUriSuggestedNull: Self = StObject.set(x, "contentUriSuggested", null)
    
    inline def setContentUriSuggestedUndefined: Self = StObject.set(x, "contentUriSuggested", js.undefined)
    
    inline def setContrastSuggested(value: Boolean): Self = StObject.set(x, "contrastSuggested", value.asInstanceOf[js.Any])
    
    inline def setContrastSuggestedNull: Self = StObject.set(x, "contrastSuggested", null)
    
    inline def setContrastSuggestedUndefined: Self = StObject.set(x, "contrastSuggested", js.undefined)
    
    inline def setCropPropertiesSuggestionState(value: SchemaCropPropertiesSuggestionState): Self = StObject.set(x, "cropPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setCropPropertiesSuggestionStateUndefined: Self = StObject.set(x, "cropPropertiesSuggestionState", js.undefined)
    
    inline def setSourceUriSuggested(value: Boolean): Self = StObject.set(x, "sourceUriSuggested", value.asInstanceOf[js.Any])
    
    inline def setSourceUriSuggestedNull: Self = StObject.set(x, "sourceUriSuggested", null)
    
    inline def setSourceUriSuggestedUndefined: Self = StObject.set(x, "sourceUriSuggested", js.undefined)
    
    inline def setTransparencySuggested(value: Boolean): Self = StObject.set(x, "transparencySuggested", value.asInstanceOf[js.Any])
    
    inline def setTransparencySuggestedNull: Self = StObject.set(x, "transparencySuggested", null)
    
    inline def setTransparencySuggestedUndefined: Self = StObject.set(x, "transparencySuggested", js.undefined)
  }
}
