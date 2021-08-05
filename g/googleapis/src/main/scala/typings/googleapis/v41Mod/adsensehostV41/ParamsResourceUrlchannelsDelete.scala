package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrlchannelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client from which to delete the URL channel.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * URL channel to delete.
    */
  var urlChannelId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUrlchannelsDelete {
  
  inline def apply(): ParamsResourceUrlchannelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlchannelsDelete]
  }
  
  extension [Self <: ParamsResourceUrlchannelsDelete](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setUrlChannelId(value: String): Self = StObject.set(x, "urlChannelId", value.asInstanceOf[js.Any])
    
    inline def setUrlChannelIdUndefined: Self = StObject.set(x, "urlChannelId", js.undefined)
  }
}
