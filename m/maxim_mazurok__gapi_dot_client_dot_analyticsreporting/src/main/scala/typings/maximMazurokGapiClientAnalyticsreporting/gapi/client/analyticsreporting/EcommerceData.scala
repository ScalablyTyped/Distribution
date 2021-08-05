package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcommerceData extends StObject {
  
  /** Action associated with this e-commerce action. */
  var actionType: js.UndefOr[String] = js.undefined
  
  /** The type of this e-commerce activity. */
  var ecommerceType: js.UndefOr[String] = js.undefined
  
  /** Details of the products in this transaction. */
  var products: js.UndefOr[js.Array[ProductData]] = js.undefined
  
  /** Transaction details of this e-commerce action. */
  var transaction: js.UndefOr[TransactionData] = js.undefined
}
object EcommerceData {
  
  inline def apply(): EcommerceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcommerceData]
  }
  
  extension [Self <: EcommerceData](x: Self) {
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setEcommerceType(value: String): Self = StObject.set(x, "ecommerceType", value.asInstanceOf[js.Any])
    
    inline def setEcommerceTypeUndefined: Self = StObject.set(x, "ecommerceType", js.undefined)
    
    inline def setProducts(value: js.Array[ProductData]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: ProductData*): Self = StObject.set(x, "products", js.Array(value :_*))
    
    inline def setTransaction(value: TransactionData): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
