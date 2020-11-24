package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base DocumentStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaDocumentStyleSuggestionState extends js.Object {
  
  /**
    * A mask that indicates which of the fields in background have been changed
    * in this suggestion.
    */
  var backgroundSuggestionState: js.UndefOr[SchemaBackgroundSuggestionState] = js.native
  
  /**
    * Indicates if there was a suggested change to default_footer_id.
    */
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to default_header_id.
    */
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to even_page_footer_id.
    */
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to even_page_header_id.
    */
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to first_page_footer_id.
    */
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to first_page_header_id.
    */
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to margin_bottom.
    */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to margin_left.
    */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to margin_right.
    */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to margin_top.
    */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to page_number_start.
    */
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * A mask that indicates which of the fields in size have been changed in
    * this suggestion.
    */
  var pageSizeSuggestionState: js.UndefOr[SchemaSizeSuggestionState] = js.native
  
  /**
    * Indicates if there was a suggested change to use_even_page_header_footer.
    */
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to
    * use_first_page_header_footer.
    */
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaDocumentStyleSuggestionState {
  
  @scala.inline
  def apply(): SchemaDocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyleSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaDocumentStyleSuggestionStateOps[Self <: SchemaDocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setBackgroundSuggestionState(value: SchemaBackgroundSuggestionState): Self = this.set("backgroundSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSuggestionState: Self = this.set("backgroundSuggestionState", js.undefined)
    
    @scala.inline
    def setDefaultFooterIdSuggested(value: Boolean): Self = this.set("defaultFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFooterIdSuggested: Self = this.set("defaultFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setDefaultHeaderIdSuggested(value: Boolean): Self = this.set("defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeaderIdSuggested: Self = this.set("defaultHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setEvenPageFooterIdSuggested(value: Boolean): Self = this.set("evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenPageFooterIdSuggested: Self = this.set("evenPageFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setEvenPageHeaderIdSuggested(value: Boolean): Self = this.set("evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenPageHeaderIdSuggested: Self = this.set("evenPageHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setFirstPageFooterIdSuggested(value: Boolean): Self = this.set("firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageFooterIdSuggested: Self = this.set("firstPageFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setFirstPageHeaderIdSuggested(value: Boolean): Self = this.set("firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageHeaderIdSuggested: Self = this.set("firstPageHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setMarginBottomSuggested(value: Boolean): Self = this.set("marginBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottomSuggested: Self = this.set("marginBottomSuggested", js.undefined)
    
    @scala.inline
    def setMarginLeftSuggested(value: Boolean): Self = this.set("marginLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeftSuggested: Self = this.set("marginLeftSuggested", js.undefined)
    
    @scala.inline
    def setMarginRightSuggested(value: Boolean): Self = this.set("marginRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRightSuggested: Self = this.set("marginRightSuggested", js.undefined)
    
    @scala.inline
    def setMarginTopSuggested(value: Boolean): Self = this.set("marginTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTopSuggested: Self = this.set("marginTopSuggested", js.undefined)
    
    @scala.inline
    def setPageNumberStartSuggested(value: Boolean): Self = this.set("pageNumberStartSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumberStartSuggested: Self = this.set("pageNumberStartSuggested", js.undefined)
    
    @scala.inline
    def setPageSizeSuggestionState(value: SchemaSizeSuggestionState): Self = this.set("pageSizeSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizeSuggestionState: Self = this.set("pageSizeSuggestionState", js.undefined)
    
    @scala.inline
    def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = this.set("useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEvenPageHeaderFooterSuggested: Self = this.set("useEvenPageHeaderFooterSuggested", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = this.set("useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFirstPageHeaderFooterSuggested: Self = this.set("useFirstPageHeaderFooterSuggested", js.undefined)
  }
}
