package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentStyleSuggestionState extends StObject {
  
  /**
    * A mask that indicates which of the fields in background have been changed in this suggestion.
    */
  var backgroundSuggestionState: js.UndefOr[SchemaBackgroundSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to default_footer_id.
    */
  var defaultFooterIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to default_header_id.
    */
  var defaultHeaderIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to even_page_footer_id.
    */
  var evenPageFooterIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to even_page_header_id.
    */
  var evenPageHeaderIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to first_page_footer_id.
    */
  var firstPageFooterIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to first_page_header_id.
    */
  var firstPageHeaderIdSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_bottom.
    */
  var marginBottomSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_footer.
    */
  var marginFooterSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_header.
    */
  var marginHeaderSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_left.
    */
  var marginLeftSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_right.
    */
  var marginRightSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to margin_top.
    */
  var marginTopSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to page_number_start.
    */
  var pageNumberStartSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A mask that indicates which of the fields in size have been changed in this suggestion.
    */
  var pageSizeSuggestionState: js.UndefOr[SchemaSizeSuggestionState] = js.undefined
  
  /**
    * Indicates if there was a suggested change to use_custom_header_footer_margins.
    */
  var useCustomHeaderFooterMarginsSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to use_even_page_header_footer.
    */
  var useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if there was a suggested change to use_first_page_header_footer.
    */
  var useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDocumentStyleSuggestionState {
  
  inline def apply(): SchemaDocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyleSuggestionState]
  }
  
  extension [Self <: SchemaDocumentStyleSuggestionState](x: Self) {
    
    inline def setBackgroundSuggestionState(value: SchemaBackgroundSuggestionState): Self = StObject.set(x, "backgroundSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSuggestionStateUndefined: Self = StObject.set(x, "backgroundSuggestionState", js.undefined)
    
    inline def setDefaultFooterIdSuggested(value: Boolean): Self = StObject.set(x, "defaultFooterIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setDefaultFooterIdSuggestedNull: Self = StObject.set(x, "defaultFooterIdSuggested", null)
    
    inline def setDefaultFooterIdSuggestedUndefined: Self = StObject.set(x, "defaultFooterIdSuggested", js.undefined)
    
    inline def setDefaultHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "defaultHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeaderIdSuggestedNull: Self = StObject.set(x, "defaultHeaderIdSuggested", null)
    
    inline def setDefaultHeaderIdSuggestedUndefined: Self = StObject.set(x, "defaultHeaderIdSuggested", js.undefined)
    
    inline def setEvenPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setEvenPageFooterIdSuggestedNull: Self = StObject.set(x, "evenPageFooterIdSuggested", null)
    
    inline def setEvenPageFooterIdSuggestedUndefined: Self = StObject.set(x, "evenPageFooterIdSuggested", js.undefined)
    
    inline def setEvenPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "evenPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setEvenPageHeaderIdSuggestedNull: Self = StObject.set(x, "evenPageHeaderIdSuggested", null)
    
    inline def setEvenPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "evenPageHeaderIdSuggested", js.undefined)
    
    inline def setFirstPageFooterIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageFooterIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setFirstPageFooterIdSuggestedNull: Self = StObject.set(x, "firstPageFooterIdSuggested", null)
    
    inline def setFirstPageFooterIdSuggestedUndefined: Self = StObject.set(x, "firstPageFooterIdSuggested", js.undefined)
    
    inline def setFirstPageHeaderIdSuggested(value: Boolean): Self = StObject.set(x, "firstPageHeaderIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setFirstPageHeaderIdSuggestedNull: Self = StObject.set(x, "firstPageHeaderIdSuggested", null)
    
    inline def setFirstPageHeaderIdSuggestedUndefined: Self = StObject.set(x, "firstPageHeaderIdSuggested", js.undefined)
    
    inline def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomSuggestedNull: Self = StObject.set(x, "marginBottomSuggested", null)
    
    inline def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
    
    inline def setMarginFooterSuggested(value: Boolean): Self = StObject.set(x, "marginFooterSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginFooterSuggestedNull: Self = StObject.set(x, "marginFooterSuggested", null)
    
    inline def setMarginFooterSuggestedUndefined: Self = StObject.set(x, "marginFooterSuggested", js.undefined)
    
    inline def setMarginHeaderSuggested(value: Boolean): Self = StObject.set(x, "marginHeaderSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginHeaderSuggestedNull: Self = StObject.set(x, "marginHeaderSuggested", null)
    
    inline def setMarginHeaderSuggestedUndefined: Self = StObject.set(x, "marginHeaderSuggested", js.undefined)
    
    inline def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftSuggestedNull: Self = StObject.set(x, "marginLeftSuggested", null)
    
    inline def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
    
    inline def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginRightSuggestedNull: Self = StObject.set(x, "marginRightSuggested", null)
    
    inline def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
    
    inline def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginTopSuggestedNull: Self = StObject.set(x, "marginTopSuggested", null)
    
    inline def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
    
    inline def setPageNumberStartSuggested(value: Boolean): Self = StObject.set(x, "pageNumberStartSuggested", value.asInstanceOf[js.Any])
    
    inline def setPageNumberStartSuggestedNull: Self = StObject.set(x, "pageNumberStartSuggested", null)
    
    inline def setPageNumberStartSuggestedUndefined: Self = StObject.set(x, "pageNumberStartSuggested", js.undefined)
    
    inline def setPageSizeSuggestionState(value: SchemaSizeSuggestionState): Self = StObject.set(x, "pageSizeSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setPageSizeSuggestionStateUndefined: Self = StObject.set(x, "pageSizeSuggestionState", js.undefined)
    
    inline def setUseCustomHeaderFooterMarginsSuggested(value: Boolean): Self = StObject.set(x, "useCustomHeaderFooterMarginsSuggested", value.asInstanceOf[js.Any])
    
    inline def setUseCustomHeaderFooterMarginsSuggestedNull: Self = StObject.set(x, "useCustomHeaderFooterMarginsSuggested", null)
    
    inline def setUseCustomHeaderFooterMarginsSuggestedUndefined: Self = StObject.set(x, "useCustomHeaderFooterMarginsSuggested", js.undefined)
    
    inline def setUseEvenPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    inline def setUseEvenPageHeaderFooterSuggestedNull: Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", null)
    
    inline def setUseEvenPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useEvenPageHeaderFooterSuggested", js.undefined)
    
    inline def setUseFirstPageHeaderFooterSuggested(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", value.asInstanceOf[js.Any])
    
    inline def setUseFirstPageHeaderFooterSuggestedNull: Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", null)
    
    inline def setUseFirstPageHeaderFooterSuggestedUndefined: Self = StObject.set(x, "useFirstPageHeaderFooterSuggested", js.undefined)
  }
}
