package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the account that contains the product. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The REST ID of the product.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductsDelete {
  
  inline def apply(): ParamsResourceProductsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsDelete]
  }
  
  extension [Self <: ParamsResourceProductsDelete](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
