package typings.googleapis.resellerV1Mod.resellerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The customerAuthToken query string is required when creating a resold
    * account that transfers a direct customer's subscription or transfers
    * another reseller customer's subscription to your reseller management.
    * This is a hexadecimal authentication token needed to complete the
    * subscription transfer. For more information, see the administrator help
    * center.
    */
  var customerAuthToken: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomer] = js.undefined
}
object ParamsResourceCustomersInsert {
  
  @scala.inline
  def apply(): ParamsResourceCustomersInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceCustomersInsertMutableBuilder[Self <: ParamsResourceCustomersInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerAuthToken(value: String): Self = StObject.set(x, "customerAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAuthTokenUndefined: Self = StObject.set(x, "customerAuthToken", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCustomer): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
