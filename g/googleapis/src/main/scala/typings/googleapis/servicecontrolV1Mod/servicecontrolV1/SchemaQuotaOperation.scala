package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuotaOperation extends StObject {
  
  /**
    * Identity of the consumer for whom this quota operation is being performed. This can be in one of the following formats: project:, project_number:, api_key:.
    */
  var consumerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels describing the operation.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Fully qualified name of the API method for which this quota operation is requested. This name is used for matching quota rules or metric rules and billing status rules defined in service configuration. This field should not be set if any of the following is true: (1) the quota operation is performed on non-API resources. (2) quota_metrics is set because the caller is doing quota override. Example of an RPC method name: google.example.library.v1.LibraryService.CreateShelf
    */
  var methodName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identity of the operation. For Allocation Quota, this is expected to be unique within the scope of the service that generated the operation, and guarantees idempotency in case of retries. In order to ensure best performance and latency in the Quota backends, operation_ids are optimally associated with time, so that related operations can be accessed fast in storage. For this reason, the recommended token for services that intend to operate at a high QPS is Unix time in nanos + UUID
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents information about this operation. Each MetricValueSet corresponds to a metric defined in the service configuration. The data type used in the MetricValueSet must agree with the data type specified in the metric definition. Within a single operation, it is not allowed to have more than one MetricValue instances that have the same metric names and identical label value combinations. If a request has such duplicated MetricValue instances, the entire request is rejected with an invalid argument error. This field is mutually exclusive with method_name.
    */
  var quotaMetrics: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.undefined
  
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaQuotaOperation {
  
  inline def apply(): SchemaQuotaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaOperation]
  }
  
  extension [Self <: SchemaQuotaOperation](x: Self) {
    
    inline def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    inline def setConsumerIdNull: Self = StObject.set(x, "consumerId", null)
    
    inline def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameNull: Self = StObject.set(x, "methodName", null)
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setQuotaMetrics(value: js.Array[SchemaMetricValueSet]): Self = StObject.set(x, "quotaMetrics", value.asInstanceOf[js.Any])
    
    inline def setQuotaMetricsUndefined: Self = StObject.set(x, "quotaMetrics", js.undefined)
    
    inline def setQuotaMetricsVarargs(value: SchemaMetricValueSet*): Self = StObject.set(x, "quotaMetrics", js.Array(value*))
    
    inline def setQuotaMode(value: String): Self = StObject.set(x, "quotaMode", value.asInstanceOf[js.Any])
    
    inline def setQuotaModeNull: Self = StObject.set(x, "quotaMode", null)
    
    inline def setQuotaModeUndefined: Self = StObject.set(x, "quotaMode", js.undefined)
  }
}
