package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base TableCellStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaTableCellStyleSuggestionState extends js.Object {
  
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
  implicit class SchemaTableCellStyleSuggestionStateOps[Self <: SchemaTableCellStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = this.set("backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorSuggested: Self = this.set("backgroundColorSuggested", js.undefined)
    
    @scala.inline
    def setBorderBottomSuggested(value: Boolean): Self = this.set("borderBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBottomSuggested: Self = this.set("borderBottomSuggested", js.undefined)
    
    @scala.inline
    def setBorderLeftSuggested(value: Boolean): Self = this.set("borderLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLeftSuggested: Self = this.set("borderLeftSuggested", js.undefined)
    
    @scala.inline
    def setBorderRightSuggested(value: Boolean): Self = this.set("borderRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRightSuggested: Self = this.set("borderRightSuggested", js.undefined)
    
    @scala.inline
    def setBorderTopSuggested(value: Boolean): Self = this.set("borderTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTopSuggested: Self = this.set("borderTopSuggested", js.undefined)
    
    @scala.inline
    def setColumnSpanSuggested(value: Boolean): Self = this.set("columnSpanSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSpanSuggested: Self = this.set("columnSpanSuggested", js.undefined)
    
    @scala.inline
    def setContentAlignmentSuggested(value: Boolean): Self = this.set("contentAlignmentSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAlignmentSuggested: Self = this.set("contentAlignmentSuggested", js.undefined)
    
    @scala.inline
    def setPaddingBottomSuggested(value: Boolean): Self = this.set("paddingBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBottomSuggested: Self = this.set("paddingBottomSuggested", js.undefined)
    
    @scala.inline
    def setPaddingLeftSuggested(value: Boolean): Self = this.set("paddingLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeftSuggested: Self = this.set("paddingLeftSuggested", js.undefined)
    
    @scala.inline
    def setPaddingRightSuggested(value: Boolean): Self = this.set("paddingRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRightSuggested: Self = this.set("paddingRightSuggested", js.undefined)
    
    @scala.inline
    def setPaddingTopSuggested(value: Boolean): Self = this.set("paddingTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTopSuggested: Self = this.set("paddingTopSuggested", js.undefined)
    
    @scala.inline
    def setRowSpanSuggested(value: Boolean): Self = this.set("rowSpanSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpanSuggested: Self = this.set("rowSpanSuggested", js.undefined)
  }
}
