package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the AllocateQuota method.
  */
@js.native
trait SchemaAllocateQuotaResponse extends StObject {
  
  /**
    * Indicates the decision of the allocate.
    */
  var allocateErrors: js.UndefOr[js.Array[SchemaQuotaError]] = js.native
  
  /**
    * WARNING: DO NOT use this field until this warning message is removed.
    */
  var allocateInfo: js.UndefOr[SchemaAllocateInfo] = js.native
  
  /**
    * The same operation_id value used in the AllocateQuotaRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * Quota metrics to indicate the result of allocation. Depending on the
    * request, one or more of the following metrics will be included:  1. Per
    * quota group or per quota metric incremental usage will be specified using
    * the following delta metric :
    * &quot;serviceruntime.googleapis.com/api/consumer/quota_used_count&quot;
    * 2. The quota limit reached condition will be specified using the
    * following boolean metric :
    * &quot;serviceruntime.googleapis.com/quota/exceeded&quot;
    */
  var quotaMetrics: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.native
  
  /**
    * ID of the actual config used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}
object SchemaAllocateQuotaResponse {
  
  @scala.inline
  def apply(): SchemaAllocateQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateQuotaResponse]
  }
  
  @scala.inline
  implicit class SchemaAllocateQuotaResponseMutableBuilder[Self <: SchemaAllocateQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocateErrors(value: js.Array[SchemaQuotaError]): Self = StObject.set(x, "allocateErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocateErrorsUndefined: Self = StObject.set(x, "allocateErrors", js.undefined)
    
    @scala.inline
    def setAllocateErrorsVarargs(value: SchemaQuotaError*): Self = StObject.set(x, "allocateErrors", js.Array(value :_*))
    
    @scala.inline
    def setAllocateInfo(value: SchemaAllocateInfo): Self = StObject.set(x, "allocateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocateInfoUndefined: Self = StObject.set(x, "allocateInfo", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setQuotaMetrics(value: js.Array[SchemaMetricValueSet]): Self = StObject.set(x, "quotaMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaMetricsUndefined: Self = StObject.set(x, "quotaMetrics", js.undefined)
    
    @scala.inline
    def setQuotaMetricsVarargs(value: SchemaMetricValueSet*): Self = StObject.set(x, "quotaMetrics", js.Array(value :_*))
    
    @scala.inline
    def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
