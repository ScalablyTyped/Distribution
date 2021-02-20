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
trait ParamsResourceSchemasPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Immutable ID of the G Suite account
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSchema] = js.native
  
  /**
    * Name or immutable ID of the schema.
    */
  var schemaKey: js.UndefOr[String] = js.native
}
object ParamsResourceSchemasPatch {
  
  @scala.inline
  def apply(): ParamsResourceSchemasPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSchemasPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceSchemasPatchMutableBuilder[Self <: ParamsResourceSchemasPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSchema): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSchemaKey(value: String): Self = StObject.set(x, "schemaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaKeyUndefined: Self = StObject.set(x, "schemaKey", js.undefined)
  }
}
