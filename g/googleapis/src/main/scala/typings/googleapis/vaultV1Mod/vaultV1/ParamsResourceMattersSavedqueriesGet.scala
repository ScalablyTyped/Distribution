package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersSavedqueriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The matter id of the parent matter for which the saved query is to be
    * retrieved.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the saved query to be retrieved.
    */
  var savedQueryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersSavedqueriesGet {
  
  inline def apply(): ParamsResourceMattersSavedqueriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesGet]
  }
  
  extension [Self <: ParamsResourceMattersSavedqueriesGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setSavedQueryId(value: String): Self = StObject.set(x, "savedQueryId", value.asInstanceOf[js.Any])
    
    inline def setSavedQueryIdUndefined: Self = StObject.set(x, "savedQueryId", js.undefined)
  }
}
