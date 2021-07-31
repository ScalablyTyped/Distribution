package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base DocumentStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
trait SchemaDocumentStyleSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in background have been changed
    * in this suggestion.
    */
  var backgroundSuggestionState: js.UndefOr[SchemaBackgroundSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to default_footer_id.
    */
  var defaultFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to default_header_id.
    */
  var defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to even_page_footer_id.
    */
  var evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to even_page_header_id.
    */
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to first_page_footer_id.
    */
  var firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to first_page_header_id.
    */
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined
  
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
    * Indicates if there was a suggested change to page_number_start.
    */
  var pageNumberStartSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A mask that indicates which of the fields in size have been changed in
    * this suggestion.
    */
  var pageSizeSuggestionState: js.UndefOr[SchemaSizeSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to use_even_page_header_footer.
    */
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if there was a suggested change to
    * use_first_page_header_footer.
    */
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
}
object SchemaDocumentStyleSuggestionState {
  
  @scala.inline
  def apply(): SchemaDocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyleSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaDocumentStyleSuggestionStateMutableBuilder[Self <: SchemaDocumentStyleSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundSuggestionState(value: SchemaBackgroundSuggestionState): Self = StObject.set(x, "backgroundSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundSuggestionStateUndefined: Self = StObject.set(x, "backgroundSuggestionState", js.undefined)
    
    @scala.inline
    def setDefaultFooterIdSuggested(value: Boolean): Self = StObject.set(x, "defaultFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFooterIdSuggestedUndefined: Self = StObject.set(x, "defaultFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setDefaultHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeaderIdSuggestedUndefined: Self = StObject.set(x, "defaultHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setEvenPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPageFooterIdSuggestedUndefined: Self = StObject.set(x, "evenPageFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setEvenPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "evenPageHeaderIdSuggested", js.undefined)
    
    @scala.inline
    def setFirstPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageFooterIdSuggestedUndefined: Self = StObject.set(x, "firstPageFooterIdSuggested", js.undefined)
    
    @scala.inline
    def setFirstPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "firstPageHeaderIdSuggested", js.undefined)
    
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
    def setPageNumberStartSuggested(value: Boolean): Self = StObject.set(x, "pageNumberStartSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberStartSuggestedUndefined: Self = StObject.set(x, "pageNumberStartSuggested", js.undefined)
    
    @scala.inline
    def setPageSizeSuggestionState(value: SchemaSizeSuggestionState): Self = StObject.set(x, "pageSizeSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeSuggestionStateUndefined: Self = StObject.set(x, "pageSizeSuggestionState", js.undefined)
    
    @scala.inline
    def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEvenPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFirstPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", js.undefined)
  }
}
