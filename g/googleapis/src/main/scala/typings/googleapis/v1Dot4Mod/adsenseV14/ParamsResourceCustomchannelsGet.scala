package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCustomchannelsGet extends StandardParameters {
  
  /**
    * Ad client which contains the custom channel.
    */
  var adClientId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Custom channel to retrieve.
    */
  var customChannelId: js.UndefOr[String] = js.native
}
object ParamsResourceCustomchannelsGet {
  
  @scala.inline
  def apply(): ParamsResourceCustomchannelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomchannelsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceCustomchannelsGetMutableBuilder[Self <: ParamsResourceCustomchannelsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomChannelId(value: String): Self = StObject.set(x, "customChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomChannelIdUndefined: Self = StObject.set(x, "customChannelId", js.undefined)
  }
}
