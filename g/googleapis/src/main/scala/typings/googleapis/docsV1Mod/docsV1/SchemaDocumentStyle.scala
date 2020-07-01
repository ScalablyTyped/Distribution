package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of the document.
  */
@js.native
trait SchemaDocumentStyle extends js.Object {
  /**
    * The background of the document.
    */
  var background: js.UndefOr[SchemaBackground] = js.native
  /**
    * The ID of the default footer. If not set, there is no default footer.
    */
  var defaultFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the default header. If not set, there is no default header.
    */
  var defaultHeaderId: js.UndefOr[String] = js.native
  /**
    * The ID of the footer used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on even pages. If not set,
    * there is no even page footer.
    */
  var evenPageFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the header used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_header_id or this value for the header on even pages. If not set,
    * there is no even page header.
    */
  var evenPageHeaderId: js.UndefOr[String] = js.native
  /**
    * The ID of the footer used only for the first page. If not set then a
    * unique footer for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on the first page. If not
    * set, there is no first page footer.
    */
  var firstPageFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the header used only for the first page. If not set then a
    * unique header for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_header_id or this value for the header on the first page. If not
    * set, there is no first page header.
    */
  var firstPageHeaderId: js.UndefOr[String] = js.native
  /**
    * The bottom page margin.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.native
  /**
    * The left page margin.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.native
  /**
    * The right page margin.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.native
  /**
    * The top page margin.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.native
  /**
    * The page number from which to start counting the number of pages.
    */
  var pageNumberStart: js.UndefOr[Double] = js.native
  /**
    * The size of a page in the document.
    */
  var pageSize: js.UndefOr[SchemaSize] = js.native
  /**
    * Indicates whether to use the even page header / footer IDs for the even
    * pages.
    */
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to use the first page header / footer IDs for the first
    * page.
    */
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.native
}

object SchemaDocumentStyle {
  @scala.inline
  def apply(
    background: SchemaBackground = null,
    defaultFooterId: String = null,
    defaultHeaderId: String = null,
    evenPageFooterId: String = null,
    evenPageHeaderId: String = null,
    firstPageFooterId: String = null,
    firstPageHeaderId: String = null,
    marginBottom: SchemaDimension = null,
    marginLeft: SchemaDimension = null,
    marginRight: SchemaDimension = null,
    marginTop: SchemaDimension = null,
    pageNumberStart: js.UndefOr[Double] = js.undefined,
    pageSize: SchemaSize = null,
    useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.undefined,
    useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.undefined
  ): SchemaDocumentStyle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (defaultFooterId != null) __obj.updateDynamic("defaultFooterId")(defaultFooterId.asInstanceOf[js.Any])
    if (defaultHeaderId != null) __obj.updateDynamic("defaultHeaderId")(defaultHeaderId.asInstanceOf[js.Any])
    if (evenPageFooterId != null) __obj.updateDynamic("evenPageFooterId")(evenPageFooterId.asInstanceOf[js.Any])
    if (evenPageHeaderId != null) __obj.updateDynamic("evenPageHeaderId")(evenPageHeaderId.asInstanceOf[js.Any])
    if (firstPageFooterId != null) __obj.updateDynamic("firstPageFooterId")(firstPageFooterId.asInstanceOf[js.Any])
    if (firstPageHeaderId != null) __obj.updateDynamic("firstPageHeaderId")(firstPageHeaderId.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (!js.isUndefined(pageNumberStart)) __obj.updateDynamic("pageNumberStart")(pageNumberStart.get.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useEvenPageHeaderFooter)) __obj.updateDynamic("useEvenPageHeaderFooter")(useEvenPageHeaderFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFirstPageHeaderFooter)) __obj.updateDynamic("useFirstPageHeaderFooter")(useFirstPageHeaderFooter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentStyle]
  }
}

