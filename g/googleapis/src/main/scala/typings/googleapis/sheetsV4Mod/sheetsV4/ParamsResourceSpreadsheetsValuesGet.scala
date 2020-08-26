package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpreadsheetsValuesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
    * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas
    * requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /**
    * The A1 notation of the values to retrieve.
    */
  var range: js.UndefOr[String] = js.native
  /**
    * The ID of the spreadsheet to retrieve data from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.native
}

object ParamsResourceSpreadsheetsValuesGet {
  @scala.inline
  def apply(): ParamsResourceSpreadsheetsValuesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsValuesGet]
  }
  @scala.inline
  implicit class ParamsResourceSpreadsheetsValuesGetOps[Self <: ParamsResourceSpreadsheetsValuesGet] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = this.set("dateTimeRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeRenderOption: Self = this.set("dateTimeRenderOption", js.undefined)
    @scala.inline
    def setMajorDimension(value: String): Self = this.set("majorDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorDimension: Self = this.set("majorDimension", js.undefined)
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    @scala.inline
    def setValueRenderOption(value: String): Self = this.set("valueRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRenderOption: Self = this.set("valueRenderOption", js.undefined)
  }
  
}

