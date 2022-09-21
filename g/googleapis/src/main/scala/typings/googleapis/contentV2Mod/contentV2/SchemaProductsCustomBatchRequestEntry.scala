package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductsCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The method of the batch entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`"
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The product to insert. Only required if the method is `insert`.
    */
  var product: js.UndefOr[SchemaProduct] = js.undefined
  
  /**
    * The ID of the product to get or delete. Only defined if the method is `get` or `delete`.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductsCustomBatchRequestEntry {
  
  inline def apply(): SchemaProductsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaProductsCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setProduct(value: SchemaProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
