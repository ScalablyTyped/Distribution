package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePromotionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. REST ID of the promotion to retrieve.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the account that contains the collection.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePromotionsGet {
  
  inline def apply(): ParamsResourcePromotionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePromotionsGet]
  }
  
  extension [Self <: ParamsResourcePromotionsGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
