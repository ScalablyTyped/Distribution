package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the AllocateQuota method.
  */
@js.native
trait SchemaAllocateQuotaResponse extends js.Object {
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
  implicit class SchemaAllocateQuotaResponseOps[Self <: SchemaAllocateQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllocateErrorsVarargs(value: SchemaQuotaError*): Self = this.set("allocateErrors", js.Array(value :_*))
    @scala.inline
    def setAllocateErrors(value: js.Array[SchemaQuotaError]): Self = this.set("allocateErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocateErrors: Self = this.set("allocateErrors", js.undefined)
    @scala.inline
    def setAllocateInfo(value: SchemaAllocateInfo): Self = this.set("allocateInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocateInfo: Self = this.set("allocateInfo", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setQuotaMetricsVarargs(value: SchemaMetricValueSet*): Self = this.set("quotaMetrics", js.Array(value :_*))
    @scala.inline
    def setQuotaMetrics(value: js.Array[SchemaMetricValueSet]): Self = this.set("quotaMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaMetrics: Self = this.set("quotaMetrics", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

