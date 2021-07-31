package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePretargetingconfigPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to update the pretargeting config for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The specific id of the configuration to update.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPretargetingConfig] = js.undefined
}
object ParamsResourcePretargetingconfigPatch {
  
  @scala.inline
  def apply(): ParamsResourcePretargetingconfigPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePretargetingconfigPatch]
  }
  
  @scala.inline
  implicit class ParamsResourcePretargetingconfigPatchMutableBuilder[Self <: ParamsResourcePretargetingconfigPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPretargetingConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
