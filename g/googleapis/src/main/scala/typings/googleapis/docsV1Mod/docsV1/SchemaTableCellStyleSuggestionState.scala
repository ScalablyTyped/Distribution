package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base TableCellStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaTableCellStyleSuggestionState extends StObject {
  
  /**
    * Indicates if there was a suggested change to background_color.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to border_bottom.
    */
  var borderBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to border_left.
    */
  var borderLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to border_right.
    */
  var borderRightSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to border_top.
    */
  var borderTopSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to column_span.
    */
  var columnSpanSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to content_alignment.
    */
  var contentAlignmentSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to padding_bottom.
    */
  var paddingBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to padding_left.
    */
  var paddingLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to padding_right.
    */
  var paddingRightSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to padding_top.
    */
  var paddingTopSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to row_span.
    */
  var rowSpanSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaTableCellStyleSuggestionState {
  
  @scala.inline
  def apply(): SchemaTableCellStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellStyleSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaTableCellStyleSuggestionStateMutableBuilder[Self <: SchemaTableCellStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
    
    @scala.inline
    def setBorderBottomSuggested(value: Boolean): Self = StObject.set(x, "borderBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomSuggestedUndefined: Self = StObject.set(x, "borderBottomSuggested", js.undefined)
    
    @scala.inline
    def setBorderLeftSuggested(value: Boolean): Self = StObject.set(x, "borderLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftSuggestedUndefined: Self = StObject.set(x, "borderLeftSuggested", js.undefined)
    
    @scala.inline
    def setBorderRightSuggested(value: Boolean): Self = StObject.set(x, "borderRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightSuggestedUndefined: Self = StObject.set(x, "borderRightSuggested", js.undefined)
    
    @scala.inline
    def setBorderTopSuggested(value: Boolean): Self = StObject.set(x, "borderTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopSuggestedUndefined: Self = StObject.set(x, "borderTopSuggested", js.undefined)
    
    @scala.inline
    def setColumnSpanSuggested(value: Boolean): Self = StObject.set(x, "columnSpanSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanSuggestedUndefined: Self = StObject.set(x, "columnSpanSuggested", js.undefined)
    
    @scala.inline
    def setContentAlignmentSuggested(value: Boolean): Self = StObject.set(x, "contentAlignmentSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAlignmentSuggestedUndefined: Self = StObject.set(x, "contentAlignmentSuggested", js.undefined)
    
    @scala.inline
    def setPaddingBottomSuggested(value: Boolean): Self = StObject.set(x, "paddingBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomSuggestedUndefined: Self = StObject.set(x, "paddingBottomSuggested", js.undefined)
    
    @scala.inline
    def setPaddingLeftSuggested(value: Boolean): Self = StObject.set(x, "paddingLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftSuggestedUndefined: Self = StObject.set(x, "paddingLeftSuggested", js.undefined)
    
    @scala.inline
    def setPaddingRightSuggested(value: Boolean): Self = StObject.set(x, "paddingRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightSuggestedUndefined: Self = StObject.set(x, "paddingRightSuggested", js.undefined)
    
    @scala.inline
    def setPaddingTopSuggested(value: Boolean): Self = StObject.set(x, "paddingTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopSuggestedUndefined: Self = StObject.set(x, "paddingTopSuggested", js.undefined)
    
    @scala.inline
    def setRowSpanSuggested(value: Boolean): Self = StObject.set(x, "rowSpanSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanSuggestedUndefined: Self = StObject.set(x, "rowSpanSuggested", js.undefined)
  }
}
