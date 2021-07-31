package typings.googleapis.computeV1Mod.computeV1

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGlobaladdressesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the address resource to delete.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID
    * so that if you must retry your request, the server will know to ignore
    * the request if it has already been completed.  For example, consider a
    * situation where you make an initial request and the request times out. If
    * you make the request again with the same request ID, the server can check
    * if original operation with the same request ID was received, and if so,
    * will ignore the second request. This prevents clients from accidentally
    * creating duplicate commitments.  The request ID must be a valid UUID with
    * the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceGlobaladdressesDelete {
  
  @scala.inline
  def apply(): ParamsResourceGlobaladdressesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGlobaladdressesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceGlobaladdressesDeleteMutableBuilder[Self <: ParamsResourceGlobaladdressesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
