package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base EmbeddedObject have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
trait SchemaEmbeddedObjectSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to description.
    */
  var descriptionSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A mask that indicates which of the fields in embedded_drawing_properties
    * have been changed in this suggestion.
    */
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[SchemaEmbeddedDrawingPropertiesSuggestionState] = js.undefined
  
  /**
    * A mask that indicates which of the fields in embedded_object_border have
    * been changed in this suggestion.
    */
  var embeddedObjectBorderSuggestionState: js.UndefOr[SchemaEmbeddedObjectBorderSuggestionState] = js.undefined
  
  /**
    * A mask that indicates which of the fields in image_properties have been
    * changed in this suggestion.
    */
  var imagePropertiesSuggestionState: js.UndefOr[SchemaImagePropertiesSuggestionState] = js.undefined
  
  /**
    * A mask that indicates which of the fields in linked_content_reference
    * have been changed in this suggestion.
    */
  var linkedContentReferenceSuggestionState: js.UndefOr[SchemaLinkedContentReferenceSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_bottom.
    */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_left.
    */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_right.
    */
  var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_top.
    */
  var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A mask that indicates which of the fields in size have been changed in
    * this suggestion.
    */
  var sizeSuggestionState: js.UndefOr[SchemaSizeSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to title.
    */
  var titleSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaEmbeddedObjectSuggestionState {
  
  @scala.inline
  def apply(): SchemaEmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectSuggestionStateMutableBuilder[Self <: SchemaEmbeddedObjectSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptionSuggested(value: Boolean): Self = StObject.set(x, "descriptionSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionSuggestedUndefined: Self = StObject.set(x, "descriptionSuggested", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingPropertiesSuggestionState(value: SchemaEmbeddedDrawingPropertiesSuggestionState): Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedDrawingPropertiesSuggestionStateUndefined: Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorderSuggestionState(value: SchemaEmbeddedObjectBorderSuggestionState): Self = StObject.set(x, "embeddedObjectBorderSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectBorderSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectBorderSuggestionState", js.undefined)
    
    @scala.inline
    def setImagePropertiesSuggestionState(value: SchemaImagePropertiesSuggestionState): Self = StObject.set(x, "imagePropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropertiesSuggestionStateUndefined: Self = StObject.set(x, "imagePropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setLinkedContentReferenceSuggestionState(value: SchemaLinkedContentReferenceSuggestionState): Self = StObject.set(x, "linkedContentReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedContentReferenceSuggestionStateUndefined: Self = StObject.set(x, "linkedContentReferenceSuggestionState", js.undefined)
    
    @scala.inline
    def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
    
    @scala.inline
    def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
    
    @scala.inline
    def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
    
    @scala.inline
    def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
    
    @scala.inline
    def setSizeSuggestionState(value: SchemaSizeSuggestionState): Self = StObject.set(x, "sizeSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSuggestionStateUndefined: Self = StObject.set(x, "sizeSuggestionState", js.undefined)
    
    @scala.inline
    def setTitleSuggested(value: Boolean): Self = StObject.set(x, "titleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleSuggestedUndefined: Self = StObject.set(x, "titleSuggested", js.undefined)
  }
}
