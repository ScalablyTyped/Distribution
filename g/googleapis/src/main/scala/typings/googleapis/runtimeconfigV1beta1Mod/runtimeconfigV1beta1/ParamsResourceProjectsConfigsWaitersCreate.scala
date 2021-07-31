package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConfigsWaitersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The path to the configuration that will own the waiter. The configuration
    * must exist beforehand; the path must be in the format:
    * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWaiter] = js.undefined
  
  /**
    * An optional but recommended unique `request_id`. If the server receives
    * two `create()` requests  with the same `request_id`, then the second
    * request will be ignored and the first resource created and stored in the
    * backend is returned. Empty `request_id` fields are ignored.  It is
    * responsibility of the client to ensure uniqueness of the `request_id`
    * strings.  `request_id` strings are limited to 64 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConfigsWaitersCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsConfigsWaitersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConfigsWaitersCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsConfigsWaitersCreateMutableBuilder[Self <: ParamsResourceProjectsConfigsWaitersCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaWaiter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
