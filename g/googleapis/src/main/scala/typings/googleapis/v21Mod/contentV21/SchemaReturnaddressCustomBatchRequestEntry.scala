package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnaddressCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Merchant Center account ID.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`"
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The return address to submit. This should be set only if the method is `insert`.
    */
  var returnAddress: js.UndefOr[SchemaReturnAddress] = js.undefined
  
  /**
    * The return address ID. This should be set only if the method is `delete` or `get`.
    */
  var returnAddressId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnaddressCustomBatchRequestEntry {
  
  inline def apply(): SchemaReturnaddressCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnaddressCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaReturnaddressCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReturnAddress(value: SchemaReturnAddress): Self = StObject.set(x, "returnAddress", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressId(value: String): Self = StObject.set(x, "returnAddressId", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressIdNull: Self = StObject.set(x, "returnAddressId", null)
    
    inline def setReturnAddressIdUndefined: Self = StObject.set(x, "returnAddressId", js.undefined)
    
    inline def setReturnAddressUndefined: Self = StObject.set(x, "returnAddress", js.undefined)
  }
}
