package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsDevelopermetadataSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSearchDeveloperMetadataRequest] = js.undefined
  
  /**
    * The ID of the spreadsheet to retrieve metadata from.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsDevelopermetadataSearch {
  
  @scala.inline
  def apply(): ParamsResourceSpreadsheetsDevelopermetadataSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsDevelopermetadataSearch]
  }
  
  @scala.inline
  implicit class ParamsResourceSpreadsheetsDevelopermetadataSearchMutableBuilder[Self <: ParamsResourceSpreadsheetsDevelopermetadataSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSearchDeveloperMetadataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
