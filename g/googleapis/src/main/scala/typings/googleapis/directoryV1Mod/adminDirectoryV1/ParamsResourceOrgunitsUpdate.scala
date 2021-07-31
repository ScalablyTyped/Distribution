package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrgunitsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Immutable ID of the G Suite account
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Full path of the organizational unit or its ID
    */
  var orgUnitPath: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaOrgUnit] = js.undefined
}
object ParamsResourceOrgunitsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceOrgunitsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrgunitsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceOrgunitsUpdateMutableBuilder[Self <: ParamsResourceOrgunitsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setOrgUnitPath(value: js.Array[String]): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    @scala.inline
    def setOrgUnitPathVarargs(value: String*): Self = StObject.set(x, "orgUnitPath", js.Array(value :_*))
    
    @scala.inline
    def setRequestBody(value: SchemaOrgUnit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
