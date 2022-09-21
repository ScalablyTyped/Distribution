package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The Content API Supplemental Feed ID. If present then product insertion applies to the data in a supplemental feed.
    */
  var feedId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that contains the product. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProduct] = js.undefined
}
object ParamsResourceProductsInsert {
  
  inline def apply(): ParamsResourceProductsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsInsert]
  }
  
  extension [Self <: ParamsResourceProductsInsert](x: Self) {
    
    inline def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    inline def setFeedIdUndefined: Self = StObject.set(x, "feedId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaProduct): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
