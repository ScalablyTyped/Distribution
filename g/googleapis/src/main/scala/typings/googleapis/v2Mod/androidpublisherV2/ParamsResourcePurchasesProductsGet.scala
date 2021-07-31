package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePurchasesProductsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The package name of the application the inapp product was sold in (for
    * example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The inapp product SKU (for example, 'com.some.thing.inapp1').
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The token provided to the user's device when the inapp product was
    * purchased.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourcePurchasesProductsGet {
  
  @scala.inline
  def apply(): ParamsResourcePurchasesProductsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesProductsGet]
  }
  
  @scala.inline
  implicit class ParamsResourcePurchasesProductsGetMutableBuilder[Self <: ParamsResourcePurchasesProductsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
