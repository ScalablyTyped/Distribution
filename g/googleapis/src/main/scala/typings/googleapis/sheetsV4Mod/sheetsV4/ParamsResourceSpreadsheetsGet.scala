package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ranges to retrieve from the spreadsheet.
    */
  var ranges: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The spreadsheet to request.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsGet {
  
  @scala.inline
  def apply(): ParamsResourceSpreadsheetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSpreadsheetsGetMutableBuilder[Self <: ParamsResourceSpreadsheetsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
    
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
  }
}
