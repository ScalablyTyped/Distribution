package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base SheetsChartReference
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
@js.native
trait SchemaSheetsChartReferenceSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to chart_id.
    */
  var chartIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to spreadsheet_id.
    */
  var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaSheetsChartReferenceSuggestionState {
  @scala.inline
  def apply(
    chartIdSuggested: js.UndefOr[Boolean] = js.undefined,
    spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
  ): SchemaSheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartIdSuggested)) __obj.updateDynamic("chartIdSuggested")(chartIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheetIdSuggested)) __obj.updateDynamic("spreadsheetIdSuggested")(spreadsheetIdSuggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSheetsChartReferenceSuggestionState]
  }
}

