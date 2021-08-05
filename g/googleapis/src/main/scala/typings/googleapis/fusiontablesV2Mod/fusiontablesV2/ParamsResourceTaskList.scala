package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTaskList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum number of tasks to return. Default is 5.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Continuation token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first result returned in the current page.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Table whose tasks are being listed.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTaskList {
  
  inline def apply(): ParamsResourceTaskList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTaskList]
  }
  
  extension [Self <: ParamsResourceTaskList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
