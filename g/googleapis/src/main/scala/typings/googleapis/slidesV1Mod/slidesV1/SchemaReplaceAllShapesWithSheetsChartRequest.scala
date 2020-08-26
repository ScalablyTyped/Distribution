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
  def apply(): SchemaReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithSheetsChartRequest]
  }
  @scala.inline
  implicit class SchemaReplaceAllShapesWithSheetsChartRequestOps[Self <: SchemaReplaceAllShapesWithSheetsChartRequest] (val x: Self) extends AnyVal {
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
    def setChartId(value: Double): Self = this.set("chartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartId: Self = this.set("chartId", js.undefined)
    @scala.inline
    def setContainsText(value: SchemaSubstringMatchCriteria): Self = this.set("containsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsText: Self = this.set("containsText", js.undefined)
    @scala.inline
    def setLinkingMode(value: String): Self = this.set("linkingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkingMode: Self = this.set("linkingMode", js.undefined)
    @scala.inline
    def setPageObjectIdsVarargs(value: String*): Self = this.set("pageObjectIds", js.Array(value :_*))
    @scala.inline
    def setPageObjectIds(value: js.Array[String]): Self = this.set("pageObjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageObjectIds: Self = this.set("pageObjectIds", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
  
}

