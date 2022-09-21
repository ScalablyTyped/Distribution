package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaPurchaseTransaction extends StObject {
  
  /**
    * All the costs associated with the products. These can be manufacturing costs, shipping expenses not borne by the end user, or any other costs, such that: * Profit = revenue - tax - cost
    */
  var cost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Currency code. Use three-character ISO-4217 code.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The transaction ID with a length limit of 128 characters.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Total non-zero revenue or grand total associated with the transaction. This value include shipping, tax, or other adjustments to total revenue that you want to include as part of your revenue calculations.
    */
  var revenue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * All the taxes associated with the transaction.
    */
  var tax: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaPurchaseTransaction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaPurchaseTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaPurchaseTransaction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaPurchaseTransaction](x: Self) {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostNull: Self = StObject.set(x, "cost", null)
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
    
    inline def setRevenueNull: Self = StObject.set(x, "revenue", null)
    
    inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
    
    inline def setTax(value: Double): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxNull: Self = StObject.set(x, "tax", null)
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
  }
}
