package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectPositioning have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPositioningSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to layout.
    */
  var layoutSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to left_offset.
    */
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to top_offset.
    */
  var topOffsetSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaPositionedObjectPositioningSuggestionState {
  
  @scala.inline
  def apply(): SchemaPositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPositioningSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaPositionedObjectPositioningSuggestionStateMutableBuilder[Self <: SchemaPositionedObjectPositioningSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutSuggested(value: Boolean): Self = StObject.set(x, "layoutSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutSuggestedUndefined: Self = StObject.set(x, "layoutSuggested", js.undefined)
    
    @scala.inline
    def setLeftOffsetSuggested(value: Boolean): Self = StObject.set(x, "leftOffsetSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftOffsetSuggestedUndefined: Self = StObject.set(x, "leftOffsetSuggested", js.undefined)
    
    @scala.inline
    def setTopOffsetSuggested(value: Boolean): Self = StObject.set(x, "topOffsetSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopOffsetSuggestedUndefined: Self = StObject.set(x, "topOffsetSuggested", js.undefined)
  }
}
