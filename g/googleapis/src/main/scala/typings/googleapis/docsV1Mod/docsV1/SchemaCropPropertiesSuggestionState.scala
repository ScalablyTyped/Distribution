package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCropPropertiesSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_bottom.
    */
  var offsetBottomSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_left.
    */
  var offsetLeftSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_right.
    */
  var offsetRightSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to offset_top.
    */
  var offsetTopSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCropPropertiesSuggestionState {
  
  inline def apply(): SchemaCropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropPropertiesSuggestionState]
  }
  
  extension [Self <: SchemaCropPropertiesSuggestionState](x: Self) {
    
    inline def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
    
    inline def setAngleSuggestedNull: Self = StObject.set(x, "angleSuggested", null)
    
    inline def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
    
    inline def setOffsetBottomSuggested(value: Boolean): Self = StObject.set(x, "offsetBottomSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetBottomSuggestedNull: Self = StObject.set(x, "offsetBottomSuggested", null)
    
    inline def setOffsetBottomSuggestedUndefined: Self = StObject.set(x, "offsetBottomSuggested", js.undefined)
    
    inline def setOffsetLeftSuggested(value: Boolean): Self = StObject.set(x, "offsetLeftSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftSuggestedNull: Self = StObject.set(x, "offsetLeftSuggested", null)
    
    inline def setOffsetLeftSuggestedUndefined: Self = StObject.set(x, "offsetLeftSuggested", js.undefined)
    
    inline def setOffsetRightSuggested(value: Boolean): Self = StObject.set(x, "offsetRightSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetRightSuggestedNull: Self = StObject.set(x, "offsetRightSuggested", null)
    
    inline def setOffsetRightSuggestedUndefined: Self = StObject.set(x, "offsetRightSuggested", js.undefined)
    
    inline def setOffsetTopSuggested(value: Boolean): Self = StObject.set(x, "offsetTopSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopSuggestedNull: Self = StObject.set(x, "offsetTopSuggested", null)
    
    inline def setOffsetTopSuggestedUndefined: Self = StObject.set(x, "offsetTopSuggested", js.undefined)
  }
}
