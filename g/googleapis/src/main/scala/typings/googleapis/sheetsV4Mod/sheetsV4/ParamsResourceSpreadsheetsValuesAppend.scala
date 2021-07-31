package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsValuesAppend
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Determines if the update response should include the values of the cells
    * that were appended. By default, responses do not include the updated
    * values.
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How the input data should be inserted.
    */
  var insertDataOption: js.UndefOr[String] = js.undefined
  
  /**
    * The A1 notation of a range to search for a logical table of data. Values
    * will be appended after the last row of the table.
    */
  var range: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaValueRange] = js.undefined
  
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE. The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.undefined
  
  /**
    * Determines how values in the response should be rendered. The default
    * render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the spreadsheet to update.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * How the input data should be interpreted.
    */
  var valueInputOption: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsValuesAppend {
  
  @scala.inline
  def apply(): ParamsResourceSpreadsheetsValuesAppend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsValuesAppend]
  }
  
  @scala.inline
  implicit class ParamsResourceSpreadsheetsValuesAppendMutableBuilder[Self <: ParamsResourceSpreadsheetsValuesAppend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeValuesInResponse(value: Boolean): Self = StObject.set(x, "includeValuesInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValuesInResponseUndefined: Self = StObject.set(x, "includeValuesInResponse", js.undefined)
    
    @scala.inline
    def setInsertDataOption(value: String): Self = StObject.set(x, "insertDataOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertDataOptionUndefined: Self = StObject.set(x, "insertDataOption", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaValueRange): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setResponseDateTimeRenderOption(value: String): Self = StObject.set(x, "responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDateTimeRenderOptionUndefined: Self = StObject.set(x, "responseDateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setResponseValueRenderOption(value: String): Self = StObject.set(x, "responseValueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseValueRenderOptionUndefined: Self = StObject.set(x, "responseValueRenderOption", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setValueInputOption(value: String): Self = StObject.set(x, "valueInputOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInputOptionUndefined: Self = StObject.set(x, "valueInputOption", js.undefined)
  }
}
