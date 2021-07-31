package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductstatusesCustombatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Flag to include full product data in the results of this request. The
    * default value is false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductstatusesCustomBatchRequest] = js.undefined
}
object ParamsResourceProductstatusesCustombatch {
  
  @scala.inline
  def apply(): ParamsResourceProductstatusesCustombatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductstatusesCustombatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProductstatusesCustombatchMutableBuilder[Self <: ParamsResourceProductstatusesCustombatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaProductstatusesCustomBatchRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
