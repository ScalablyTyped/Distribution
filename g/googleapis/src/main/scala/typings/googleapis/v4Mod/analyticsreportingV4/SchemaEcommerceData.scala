package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEcommerceData extends StObject {
  
  /**
    * Action associated with this e-commerce action.
    */
  var actionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this e-commerce activity.
    */
  var ecommerceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details of the products in this transaction.
    */
  var products: js.UndefOr[js.Array[SchemaProductData]] = js.undefined
  
  /**
    * Transaction details of this e-commerce action.
    */
  var transaction: js.UndefOr[SchemaTransactionData] = js.undefined
}
object SchemaEcommerceData {
  
  inline def apply(): SchemaEcommerceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEcommerceData]
  }
  
  extension [Self <: SchemaEcommerceData](x: Self) {
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setEcommerceType(value: String): Self = StObject.set(x, "ecommerceType", value.asInstanceOf[js.Any])
    
    inline def setEcommerceTypeNull: Self = StObject.set(x, "ecommerceType", null)
    
    inline def setEcommerceTypeUndefined: Self = StObject.set(x, "ecommerceType", js.undefined)
    
    inline def setProducts(value: js.Array[SchemaProductData]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaProductData*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setTransaction(value: SchemaTransactionData): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
