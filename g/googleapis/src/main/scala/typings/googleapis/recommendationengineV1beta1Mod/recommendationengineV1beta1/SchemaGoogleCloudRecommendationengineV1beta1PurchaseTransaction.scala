package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1PurchaseTransaction extends StObject {
  
  /**
    * Optional. All the costs associated with the product. These can be manufacturing costs, shipping expenses not borne by the end user, or any other costs. Total product cost such that profit = revenue - (sum(taxes) + sum(costs)) If product_cost is not set, then profit = revenue - tax - shipping - sum(CatalogItem.costs). If CatalogItem.cost is not specified for one of the items, CatalogItem.cost based profit *cannot* be calculated for this Transaction.
    */
  var costs: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  
  /**
    * Required. Currency code. Use three-character ISO-4217 code. This field is not required if the event type is `refund`.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The transaction ID with a length limit of 128 bytes.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Total revenue or grand total associated with the transaction. This value include shipping, tax, or other adjustments to total revenue that you want to include as part of your revenue calculations. This field is not required if the event type is `refund`.
    */
  var revenue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. All the taxes associated with the transaction.
    */
  var taxes: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1PurchaseTransaction {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1PurchaseTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1PurchaseTransaction]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1PurchaseTransaction](x: Self) {
    
    inline def setCosts(value: StringDictionary[Double]): Self = StObject.set(x, "costs", value.asInstanceOf[js.Any])
    
    inline def setCostsNull: Self = StObject.set(x, "costs", null)
    
    inline def setCostsUndefined: Self = StObject.set(x, "costs", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueNull: Self = StObject.set(x, "revenue", null)
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setTaxes(value: StringDictionary[Double]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesNull: Self = StObject.set(x, "taxes", null)
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
  }
}
