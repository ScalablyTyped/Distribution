package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    backgroundSuggestionState: SchemaBackgroundSuggestionState = null,
    defaultFooterIdSuggested: js.UndefOr[Boolean] = js.undefined,
    defaultHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined,
    evenPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined,
    evenPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined,
    firstPageFooterIdSuggested: js.UndefOr[Boolean] = js.undefined,
    firstPageHeaderIdSuggested: js.UndefOr[Boolean] = js.undefined,
    marginBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    marginLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    marginRightSuggested: js.UndefOr[Boolean] = js.undefined,
    marginTopSuggested: js.UndefOr[Boolean] = js.undefined,
    pageNumberStartSuggested: js.UndefOr[Boolean] = js.undefined,
    pageSizeSuggestionState: SchemaSizeSuggestionState = null,
    useEvenPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined,
    useFirstPageHeaderFooterSuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaDocumentStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (backgroundSuggestionState != null) __obj.updateDynamic("backgroundSuggestionState")(backgroundSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFooterIdSuggested)) __obj.updateDynamic("defaultFooterIdSuggested")(defaultFooterIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHeaderIdSuggested)) __obj.updateDynamic("defaultHeaderIdSuggested")(defaultHeaderIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evenPageFooterIdSuggested)) __obj.updateDynamic("evenPageFooterIdSuggested")(evenPageFooterIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evenPageHeaderIdSuggested)) __obj.updateDynamic("evenPageHeaderIdSuggested")(evenPageHeaderIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPageFooterIdSuggested)) __obj.updateDynamic("firstPageFooterIdSuggested")(firstPageFooterIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPageHeaderIdSuggested)) __obj.updateDynamic("firstPageHeaderIdSuggested")(firstPageHeaderIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottomSuggested)) __obj.updateDynamic("marginBottomSuggested")(marginBottomSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeftSuggested)) __obj.updateDynamic("marginLeftSuggested")(marginLeftSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRightSuggested)) __obj.updateDynamic("marginRightSuggested")(marginRightSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTopSuggested)) __obj.updateDynamic("marginTopSuggested")(marginTopSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageNumberStartSuggested)) __obj.updateDynamic("pageNumberStartSuggested")(pageNumberStartSuggested.get.asInstanceOf[js.Any])
    if (pageSizeSuggestionState != null) __obj.updateDynamic("pageSizeSuggestionState")(pageSizeSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(useEvenPageHeaderFooterSuggested)) __obj.updateDynamic("useEvenPageHeaderFooterSuggested")(useEvenPageHeaderFooterSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFirstPageHeaderFooterSuggested)) __obj.updateDynamic("useFirstPageHeaderFooterSuggested")(useFirstPageHeaderFooterSuggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentStyleSuggestionState]
  }
}

