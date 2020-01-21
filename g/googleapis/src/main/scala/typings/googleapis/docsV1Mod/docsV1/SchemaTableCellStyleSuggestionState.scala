package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined,
    borderBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    borderLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    borderRightSuggested: js.UndefOr[Boolean] = js.undefined,
    borderTopSuggested: js.UndefOr[Boolean] = js.undefined,
    columnSpanSuggested: js.UndefOr[Boolean] = js.undefined,
    contentAlignmentSuggested: js.UndefOr[Boolean] = js.undefined,
    paddingBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    paddingLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    paddingRightSuggested: js.UndefOr[Boolean] = js.undefined,
    paddingTopSuggested: js.UndefOr[Boolean] = js.undefined,
    rowSpanSuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaTableCellStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomSuggested)) __obj.updateDynamic("borderBottomSuggested")(borderBottomSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLeftSuggested)) __obj.updateDynamic("borderLeftSuggested")(borderLeftSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRightSuggested)) __obj.updateDynamic("borderRightSuggested")(borderRightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopSuggested)) __obj.updateDynamic("borderTopSuggested")(borderTopSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSpanSuggested)) __obj.updateDynamic("columnSpanSuggested")(columnSpanSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(contentAlignmentSuggested)) __obj.updateDynamic("contentAlignmentSuggested")(contentAlignmentSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingBottomSuggested)) __obj.updateDynamic("paddingBottomSuggested")(paddingBottomSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftSuggested)) __obj.updateDynamic("paddingLeftSuggested")(paddingLeftSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRightSuggested)) __obj.updateDynamic("paddingRightSuggested")(paddingRightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopSuggested)) __obj.updateDynamic("paddingTopSuggested")(paddingTopSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpanSuggested)) __obj.updateDynamic("rowSpanSuggested")(rowSpanSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableCellStyleSuggestionState]
  }
}

