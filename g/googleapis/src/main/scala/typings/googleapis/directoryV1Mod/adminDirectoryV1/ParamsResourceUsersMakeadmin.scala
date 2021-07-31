package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersMakeadmin
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUserMakeAdmin] = js.undefined
  
  /**
    * Email or immutable ID of the user as admin
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersMakeadmin {
  
  @scala.inline
  def apply(): ParamsResourceUsersMakeadmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMakeadmin]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersMakeadminMutableBuilder[Self <: ParamsResourceUsersMakeadmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUserMakeAdmin): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
