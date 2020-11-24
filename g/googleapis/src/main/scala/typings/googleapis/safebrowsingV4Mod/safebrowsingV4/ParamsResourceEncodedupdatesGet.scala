package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEncodedupdatesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A client ID that uniquely identifies the client implementation of the
    * Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.native
  
  /**
    * A serialized FetchThreatListUpdatesRequest proto.
    */
  var encodedRequest: js.UndefOr[String] = js.native
}
object ParamsResourceEncodedupdatesGet {
  
  @scala.inline
  def apply(): ParamsResourceEncodedupdatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEncodedupdatesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceEncodedupdatesGetOps[Self <: ParamsResourceEncodedupdatesGet] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    
    @scala.inline
    def setEncodedRequest(value: String): Self = this.set("encodedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedRequest: Self = this.set("encodedRequest", js.undefined)
  }
}
