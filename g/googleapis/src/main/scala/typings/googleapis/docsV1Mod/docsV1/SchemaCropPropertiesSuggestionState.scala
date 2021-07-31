package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base CropProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
trait SchemaCropPropertiesSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_bottom.
    */
  var offsetBottomSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_left.
    */
  var offsetLeftSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_right.
    */
  var offsetRightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_top.
    */
  var offsetTopSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaCropPropertiesSuggestionState {
  
  @scala.inline
  def apply(): SchemaCropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaCropPropertiesSuggestionStateMutableBuilder[Self <: SchemaCropPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
    
    @scala.inline
    def setOffsetBottomSuggested(value: Boolean): Self = StObject.set(x, "offsetBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetBottomSuggestedUndefined: Self = StObject.set(x, "offsetBottomSuggested", js.undefined)
    
    @scala.inline
    def setOffsetLeftSuggested(value: Boolean): Self = StObject.set(x, "offsetLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftSuggestedUndefined: Self = StObject.set(x, "offsetLeftSuggested", js.undefined)
    
    @scala.inline
    def setOffsetRightSuggested(value: Boolean): Self = StObject.set(x, "offsetRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRightSuggestedUndefined: Self = StObject.set(x, "offsetRightSuggested", js.undefined)
    
    @scala.inline
    def setOffsetTopSuggested(value: Boolean): Self = StObject.set(x, "offsetTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopSuggestedUndefined: Self = StObject.set(x, "offsetTopSuggested", js.undefined)
  }
}
