package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnpolicyCustomBatchRequestEntry extends StObject {
  
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
    * The return policy to submit. This should be set only if the method is `insert`.
    */
  var returnPolicy: js.UndefOr[SchemaReturnPolicy] = js.undefined
  
  /**
    * The return policy ID. This should be set only if the method is `delete` or `get`.
    */
  var returnPolicyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnpolicyCustomBatchRequestEntry {
  
  inline def apply(): SchemaReturnpolicyCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnpolicyCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaReturnpolicyCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReturnPolicy(value: SchemaReturnPolicy): Self = StObject.set(x, "returnPolicy", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyId(value: String): Self = StObject.set(x, "returnPolicyId", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyIdNull: Self = StObject.set(x, "returnPolicyId", null)
    
    inline def setReturnPolicyIdUndefined: Self = StObject.set(x, "returnPolicyId", js.undefined)
    
    inline def setReturnPolicyUndefined: Self = StObject.set(x, "returnPolicy", js.undefined)
  }
}
