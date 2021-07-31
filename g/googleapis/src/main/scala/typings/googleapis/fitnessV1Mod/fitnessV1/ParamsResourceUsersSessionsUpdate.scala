package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSessionsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The client's current time in milliseconds since epoch.
    */
  var currentTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSession] = js.undefined
  
  /**
    * The ID of the session to be created.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * Create sessions for the person identified. Use me to indicate the
    * authenticated user. Only me is supported at this time.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSessionsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceUsersSessionsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSessionsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersSessionsUpdateMutableBuilder[Self <: ParamsResourceUsersSessionsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCurrentTimeMillis(value: String): Self = StObject.set(x, "currentTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeMillisUndefined: Self = StObject.set(x, "currentTimeMillis", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSession): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
