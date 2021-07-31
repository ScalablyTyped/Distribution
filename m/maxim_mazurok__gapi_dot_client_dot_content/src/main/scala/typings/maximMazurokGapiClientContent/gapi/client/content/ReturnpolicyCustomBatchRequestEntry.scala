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
  
  @scala.inline
  def apply(): ReturnpolicyCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ReturnpolicyCustomBatchRequestEntryMutableBuilder[Self <: ReturnpolicyCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setReturnPolicy(value: ReturnPolicy): Self = StObject.set(x, "returnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolicyId(value: String): Self = StObject.set(x, "returnPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolicyIdUndefined: Self = StObject.set(x, "returnPolicyId", js.undefined)
    
    @scala.inline
    def setReturnPolicyUndefined: Self = StObject.set(x, "returnPolicy", js.undefined)
  }
}
