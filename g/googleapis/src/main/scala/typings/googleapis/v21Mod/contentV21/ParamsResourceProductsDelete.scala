package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The Content API Supplemental Feed ID. If present then product deletion applies to the data in a supplemental feed. If absent, entire product will be deleted.
    */
  var feedId: js.UndefOr[String] = js.undefined
  
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
    
    inline def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    inline def setFeedIdUndefined: Self = StObject.set(x, "feedId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
