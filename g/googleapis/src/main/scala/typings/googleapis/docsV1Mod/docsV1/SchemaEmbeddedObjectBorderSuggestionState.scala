package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmbeddedObjectBorderSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to color.
    */
  var colorSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to dash_style.
    */
  var dashStyleSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to property_state.
    */
  var propertyStateSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaEmbeddedObjectBorderSuggestionState {
  
  inline def apply(): SchemaEmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorderSuggestionState]
  }
  
  extension [Self <: SchemaEmbeddedObjectBorderSuggestionState](x: Self) {
    
    inline def setColorSuggested(value: Boolean): Self = StObject.set(x, "colorSuggested", value.asInstanceOf[js.Any])
    
    inline def setColorSuggestedNull: Self = StObject.set(x, "colorSuggested", null)
    
    inline def setColorSuggestedUndefined: Self = StObject.set(x, "colorSuggested", js.undefined)
    
    inline def setDashStyleSuggested(value: Boolean): Self = StObject.set(x, "dashStyleSuggested", value.asInstanceOf[js.Any])
    
    inline def setDashStyleSuggestedNull: Self = StObject.set(x, "dashStyleSuggested", null)
    
    inline def setDashStyleSuggestedUndefined: Self = StObject.set(x, "dashStyleSuggested", js.undefined)
    
    inline def setPropertyStateSuggested(value: Boolean): Self = StObject.set(x, "propertyStateSuggested", value.asInstanceOf[js.Any])
    
    inline def setPropertyStateSuggestedNull: Self = StObject.set(x, "propertyStateSuggested", null)
    
    inline def setPropertyStateSuggestedUndefined: Self = StObject.set(x, "propertyStateSuggested", js.undefined)
    
    inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    inline def setWidthSuggestedNull: Self = StObject.set(x, "widthSuggested", null)
    
    inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
