package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The style of the document.
  */
trait SchemaDocumentStyle extends StObject {
  
  /**
    * The background of the document.
    */
  var background: js.UndefOr[SchemaBackground] = js.undefined
  
  /**
    * The ID of the default footer. If not set, there is no default footer.
    */
  var defaultFooterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the default header. If not set, there is no default header.
    */
  var defaultHeaderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the footer used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on even pages. If not set,
    * there is no even page footer.
    */
  var evenPageFooterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the header used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_header_id or this value for the header on even pages. If not set,
    * there is no even page header.
    */
  var evenPageHeaderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the footer used only for the first page. If not set then a
    * unique footer for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on the first page. If not
    * set, there is no first page footer.
    */
  var firstPageFooterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the header used only for the first page. If not set then a
    * unique header for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_header_id or this value for the header on the first page. If not
    * set, there is no first page header.
    */
  var firstPageHeaderId: js.UndefOr[String] = js.undefined
  
  /**
    * The bottom page margin.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The left page margin.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The right page margin.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The top page margin.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * The page number from which to start counting the number of pages.
    */
  var pageNumberStart: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of a page in the document.
    */
  var pageSize: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * Indicates whether to use the even page header / footer IDs for the even
    * pages.
    */
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to use the first page header / footer IDs for the first
    * page.
    */
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
}
object SchemaDocumentStyle {
  
  @scala.inline
  def apply(): SchemaDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyle]
  }
  
  @scala.inline
  implicit class SchemaDocumentStyleMutableBuilder[Self <: SchemaDocumentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: SchemaBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setDefaultFooterId(value: String): Self = StObject.set(x, "defaultFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFooterIdUndefined: Self = StObject.set(x, "defaultFooterId", js.undefined)
    
    @scala.inline
    def setDefaultHeaderId(value: String): Self = StObject.set(x, "defaultHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeaderIdUndefined: Self = StObject.set(x, "defaultHeaderId", js.undefined)
    
    @scala.inline
    def setEvenPageFooterId(value: String): Self = StObject.set(x, "evenPageFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPageFooterIdUndefined: Self = StObject.set(x, "evenPageFooterId", js.undefined)
    
    @scala.inline
    def setEvenPageHeaderId(value: String): Self = StObject.set(x, "evenPageHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenPageHeaderIdUndefined: Self = StObject.set(x, "evenPageHeaderId", js.undefined)
    
    @scala.inline
    def setFirstPageFooterId(value: String): Self = StObject.set(x, "firstPageFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageFooterIdUndefined: Self = StObject.set(x, "firstPageFooterId", js.undefined)
    
    @scala.inline
    def setFirstPageHeaderId(value: String): Self = StObject.set(x, "firstPageHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageHeaderIdUndefined: Self = StObject.set(x, "firstPageHeaderId", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: SchemaDimension): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: SchemaDimension): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: SchemaDimension): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: SchemaDimension): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setPageNumberStart(value: Double): Self = StObject.set(x, "pageNumberStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberStartUndefined: Self = StObject.set(x, "pageNumberStart", js.undefined)
    
    @scala.inline
    def setPageSize(value: SchemaSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setUseEvenPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useEvenPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEvenPageHeaderFooterUndefined: Self = StObject.set(x, "useEvenPageHeaderFooter", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooter(value: Boolean): Self = StObject.set(x, "useFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFirstPageHeaderFooterUndefined: Self = StObject.set(x, "useFirstPageHeaderFooter", js.undefined)
  }
}
