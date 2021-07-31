package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePosInventory
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the POS or inventory data provider.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPosInventoryRequest] = js.undefined
  
  /**
    * The ID of the target merchant.
    */
  var targetMerchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePosInventory {
  
  @scala.inline
  def apply(): ParamsResourcePosInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePosInventory]
  }
  
  @scala.inline
  implicit class ParamsResourcePosInventoryMutableBuilder[Self <: ParamsResourcePosInventory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPosInventoryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setTargetMerchantId(value: String): Self = StObject.set(x, "targetMerchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMerchantIdUndefined: Self = StObject.set(x, "targetMerchantId", js.undefined)
  }
}
