package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectPositioning have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
trait SchemaPositionedObjectPositioningSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to layout.
    */
  var layoutSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to left_offset.
    */
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to top_offset.
    */
  var topOffsetSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaPositionedObjectPositioningSuggestionState {
  
  inline def apply(): SchemaPositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPositioningSuggestionState]
  }
  
  extension [Self <: SchemaPositionedObjectPositioningSuggestionState](x: Self) {
    
    inline def setLayoutSuggested(value: Boolean): Self = StObject.set(x, "layoutSuggested", value.asInstanceOf[js.Any])
    
    inline def setLayoutSuggestedUndefined: Self = StObject.set(x, "layoutSuggested", js.undefined)
    
    inline def setLeftOffsetSuggested(value: Boolean): Self = StObject.set(x, "leftOffsetSuggested", value.asInstanceOf[js.Any])
    
    inline def setLeftOffsetSuggestedUndefined: Self = StObject.set(x, "leftOffsetSuggested", js.undefined)
    
    inline def setTopOffsetSuggested(value: Boolean): Self = StObject.set(x, "topOffsetSuggested", value.asInstanceOf[js.Any])
    
    inline def setTopOffsetSuggestedUndefined: Self = StObject.set(x, "topOffsetSuggested", js.undefined)
  }
}
