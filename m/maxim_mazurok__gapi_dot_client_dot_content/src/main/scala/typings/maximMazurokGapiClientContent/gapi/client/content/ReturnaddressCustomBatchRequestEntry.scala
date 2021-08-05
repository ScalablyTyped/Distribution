package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnaddressCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** The Merchant Center account ID. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" */
  var method: js.UndefOr[String] = js.undefined
  
  /** The return address to submit. This should be set only if the method is `insert`. */
  var returnAddress: js.UndefOr[ReturnAddress] = js.undefined
  
  /** The return address ID. This should be set only if the method is `delete` or `get`. */
  var returnAddressId: js.UndefOr[String] = js.undefined
}
object ReturnaddressCustomBatchRequestEntry {
  
  inline def apply(): ReturnaddressCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchRequestEntry]
  }
  
  extension [Self <: ReturnaddressCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReturnAddress(value: ReturnAddress): Self = StObject.set(x, "returnAddress", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressId(value: String): Self = StObject.set(x, "returnAddressId", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressIdUndefined: Self = StObject.set(x, "returnAddressId", js.undefined)
    
    inline def setReturnAddressUndefined: Self = StObject.set(x, "returnAddress", js.undefined)
  }
}
