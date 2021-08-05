package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the products in an e-commerce transaction.
  */
trait SchemaProductData extends StObject {
  
  /**
    * The total revenue from purchased product items.
    */
  var itemRevenue: js.UndefOr[Double] = js.undefined
  
  /**
    * The product name, supplied by the e-commerce tracking application, for
    * the purchased items.
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of this product units in the transaction.
    */
  var productQuantity: js.UndefOr[String] = js.undefined
  
  /**
    * Unique code that represents the product.
    */
  var productSku: js.UndefOr[String] = js.undefined
}
object SchemaProductData {
  
  inline def apply(): SchemaProductData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductData]
  }
  
  extension [Self <: SchemaProductData](x: Self) {
    
    inline def setItemRevenue(value: Double): Self = StObject.set(x, "itemRevenue", value.asInstanceOf[js.Any])
    
    inline def setItemRevenueUndefined: Self = StObject.set(x, "itemRevenue", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setProductQuantity(value: String): Self = StObject.set(x, "productQuantity", value.asInstanceOf[js.Any])
    
    inline def setProductQuantityUndefined: Self = StObject.set(x, "productQuantity", js.undefined)
    
    inline def setProductSku(value: String): Self = StObject.set(x, "productSku", value.asInstanceOf[js.Any])
    
    inline def setProductSkuUndefined: Self = StObject.set(x, "productSku", js.undefined)
  }
}
