package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base EmbeddedObjectBorder
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
trait SchemaEmbeddedObjectBorderSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to color.
    */
  var colorSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to dash_style.
    */
  var dashStyleSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to property_state.
    */
  var propertyStateSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaEmbeddedObjectBorderSuggestionState {
  
  @scala.inline
  def apply(): SchemaEmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorderSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectBorderSuggestionStateMutableBuilder[Self <: SchemaEmbeddedObjectBorderSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSuggested(value: Boolean): Self = StObject.set(x, "colorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSuggestedUndefined: Self = StObject.set(x, "colorSuggested", js.undefined)
    
    @scala.inline
    def setDashStyleSuggested(value: Boolean): Self = StObject.set(x, "dashStyleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleSuggestedUndefined: Self = StObject.set(x, "dashStyleSuggested", js.undefined)
    
    @scala.inline
    def setPropertyStateSuggested(value: Boolean): Self = StObject.set(x, "propertyStateSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateSuggestedUndefined: Self = StObject.set(x, "propertyStateSuggested", js.undefined)
    
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
