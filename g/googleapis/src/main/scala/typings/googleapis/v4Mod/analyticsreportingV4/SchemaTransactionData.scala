package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransactionData extends StObject {
  
  /**
    * The transaction ID, supplied by the e-commerce tracking method, for the purchase in the shopping cart.
    */
  var transactionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total sale revenue (excluding shipping and tax) of the transaction.
    */
  var transactionRevenue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total cost of shipping.
    */
  var transactionShipping: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total tax for the transaction.
    */
  var transactionTax: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTransactionData {
  
  inline def apply(): SchemaTransactionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionData]
  }
  
  extension [Self <: SchemaTransactionData](x: Self) {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    inline def setTransactionRevenue(value: Double): Self = StObject.set(x, "transactionRevenue", value.asInstanceOf[js.Any])
    
    inline def setTransactionRevenueNull: Self = StObject.set(x, "transactionRevenue", null)
    
    inline def setTransactionRevenueUndefined: Self = StObject.set(x, "transactionRevenue", js.undefined)
    
    inline def setTransactionShipping(value: Double): Self = StObject.set(x, "transactionShipping", value.asInstanceOf[js.Any])
    
    inline def setTransactionShippingNull: Self = StObject.set(x, "transactionShipping", null)
    
    inline def setTransactionShippingUndefined: Self = StObject.set(x, "transactionShipping", js.undefined)
    
    inline def setTransactionTax(value: Double): Self = StObject.set(x, "transactionTax", value.asInstanceOf[js.Any])
    
    inline def setTransactionTaxNull: Self = StObject.set(x, "transactionTax", null)
    
    inline def setTransactionTaxUndefined: Self = StObject.set(x, "transactionTax", js.undefined)
  }
}
