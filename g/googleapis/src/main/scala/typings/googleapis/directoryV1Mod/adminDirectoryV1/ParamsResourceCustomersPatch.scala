package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCustomersPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Id of the customer to be updated
    */
  var customerKey: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomer] = js.native
}
object ParamsResourceCustomersPatch {
  
  @scala.inline
  def apply(): ParamsResourceCustomersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceCustomersPatchMutableBuilder[Self <: ParamsResourceCustomersPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerKey(value: String): Self = StObject.set(x, "customerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerKeyUndefined: Self = StObject.set(x, "customerKey", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCustomer): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
