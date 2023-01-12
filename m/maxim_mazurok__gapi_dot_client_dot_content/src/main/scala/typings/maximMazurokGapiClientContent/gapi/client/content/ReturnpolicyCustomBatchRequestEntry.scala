package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnpolicyCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** The Merchant Center account ID. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" */
  var method: js.UndefOr[String] = js.undefined
  
  /** The return policy to submit. This should be set only if the method is `insert`. */
  var returnPolicy: js.UndefOr[ReturnPolicy] = js.undefined
  
  /** The return policy ID. This should be set only if the method is `delete` or `get`. */
  var returnPolicyId: js.UndefOr[String] = js.undefined
}
object ReturnpolicyCustomBatchRequestEntry {
  
  inline def apply(): ReturnpolicyCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnpolicyCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReturnPolicy(value: ReturnPolicy): Self = StObject.set(x, "returnPolicy", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyId(value: String): Self = StObject.set(x, "returnPolicyId", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyIdUndefined: Self = StObject.set(x, "returnPolicyId", js.undefined)
    
    inline def setReturnPolicyUndefined: Self = StObject.set(x, "returnPolicy", js.undefined)
  }
}
