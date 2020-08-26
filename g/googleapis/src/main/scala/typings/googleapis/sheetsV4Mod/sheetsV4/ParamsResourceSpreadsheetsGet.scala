package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpreadsheetsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.native
  /**
    * The ranges to retrieve from the spreadsheet.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.native
  /**
    * The spreadsheet to request.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

object ParamsResourceSpreadsheetsGet {
  @scala.inline
  def apply(): ParamsResourceSpreadsheetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsGet]
  }
  @scala.inline
  implicit class ParamsResourceSpreadsheetsGetOps[Self <: ParamsResourceSpreadsheetsGet] (val x: Self) extends AnyVal {
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
    def setIncludeGridData(value: Boolean): Self = this.set("includeGridData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGridData: Self = this.set("includeGridData", js.undefined)
    @scala.inline
    def setRangesVarargs(value: String*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[String]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
  
}

