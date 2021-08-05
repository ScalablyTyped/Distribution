package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch products request.
  */
trait SchemaProductsCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The product to insert. Only required if the method is insert.
    */
  var product: js.UndefOr[SchemaProduct] = js.undefined
  
  /**
    * The ID of the product to get or delete. Only defined if the method is get
    * or delete.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaProductsCustomBatchRequestEntry {
  
  inline def apply(): SchemaProductsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaProductsCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setProduct(value: SchemaProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
