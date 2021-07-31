package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsValuesBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.undefined
  
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
    * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas
    * requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  
  /**
    * The A1 notation of the values to retrieve.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the spreadsheet to retrieve data from.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsValuesBatchget {
  
  @scala.inline
  def apply(): ParamsResourceSpreadsheetsValuesBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsValuesBatchget]
  }
  
  @scala.inline
  implicit class ParamsResourceSpreadsheetsValuesBatchgetMutableBuilder[Self <: ParamsResourceSpreadsheetsValuesBatchget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = StObject.set(x, "dateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeRenderOptionUndefined: Self = StObject.set(x, "dateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueRenderOption(value: String): Self = StObject.set(x, "valueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRenderOptionUndefined: Self = StObject.set(x, "valueRenderOption", js.undefined)
  }
}
