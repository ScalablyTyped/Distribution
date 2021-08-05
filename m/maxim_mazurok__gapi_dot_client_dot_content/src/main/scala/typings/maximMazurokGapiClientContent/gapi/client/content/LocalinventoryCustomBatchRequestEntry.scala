package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalinventoryCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** Local inventory of the product. */
  var localInventory: js.UndefOr[LocalInventory] = js.undefined
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** Method of the batch request entry. Acceptable values are: - "`insert`" */
  var method: js.UndefOr[String] = js.undefined
  
  /** The ID of the product for which to update local inventory. */
  var productId: js.UndefOr[String] = js.undefined
}
object LocalinventoryCustomBatchRequestEntry {
  
  inline def apply(): LocalinventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalinventoryCustomBatchRequestEntry]
  }
  
  extension [Self <: LocalinventoryCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setLocalInventory(value: LocalInventory): Self = StObject.set(x, "localInventory", value.asInstanceOf[js.Any])
    
    inline def setLocalInventoryUndefined: Self = StObject.set(x, "localInventory", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
