package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all shapes that match the given criteria with the provided Google
  * Sheets chart. The chart will be scaled and centered to fit within the
  * bounds of the original shape.  NOTE: Replacing shapes with a chart requires
  * at least one of the spreadsheets.readonly, spreadsheets, drive.readonly, or
  * drive OAuth scopes.
  */
@js.native
trait SchemaReplaceAllShapesWithSheetsChartRequest extends js.Object {
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The criteria that the shapes must match in order to be replaced. The
    * request will replace all of the shapes that contain the given text.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  /**
    * The mode with which the chart is linked to the source spreadsheet. When
    * not specified, the chart will be an image that is not linked.
    */
  var linkingMode: js.UndefOr[String] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given
    * pages.  Returns a 400 bad request error if given the page object ID of a
    * notes page or a notes master, or if a page with that object ID
    * doesn&#39;t exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the Google Sheets spreadsheet that contains the chart.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object SchemaReplaceAllShapesWithSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: js.UndefOr[Double] = js.undefined,
    containsText: SchemaSubstringMatchCriteria = null,
    linkingMode: String = null,
    pageObjectIds: js.Array[String] = null,
    spreadsheetId: String = null
  ): SchemaReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartId)) __obj.updateDynamic("chartId")(chartId.get.asInstanceOf[js.Any])
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode.asInstanceOf[js.Any])
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReplaceAllShapesWithSheetsChartRequest]
  }
}

