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
  def apply(): SchemaSheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChartReferenceSuggestionState]
  }
  @scala.inline
  implicit class SchemaSheetsChartReferenceSuggestionStateOps[Self <: SchemaSheetsChartReferenceSuggestionState] (val x: Self) extends AnyVal {
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
    def setChartIdSuggested(value: Boolean): Self = this.set("chartIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartIdSuggested: Self = this.set("chartIdSuggested", js.undefined)
    @scala.inline
    def setSpreadsheetIdSuggested(value: Boolean): Self = this.set("spreadsheetIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetIdSuggested: Self = this.set("spreadsheetIdSuggested", js.undefined)
  }
  
}

