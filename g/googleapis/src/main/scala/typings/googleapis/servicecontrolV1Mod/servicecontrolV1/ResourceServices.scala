package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicecontrol/v1", "servicecontrol_v1.Resource$Services")
@js.native
class ResourceServices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * servicecontrol.services.allocateQuota
    * @desc Attempts to allocate quota for the specified consumer. It should be
    * called before the operation is executed.  This method requires the
    * `servicemanagement.services.quota` permission on the specified service.
    * For more information, see [Cloud IAM](https://cloud.google.com/iam).
    * **NOTE:** The client **must** fail-open on server errors `INTERNAL`,
    * `UNKNOWN`, `DEADLINE_EXCEEDED`, and `UNAVAILABLE`. To ensure system
    * reliability, the server may inject these errors to prohibit any hard
    * dependency on the quota functionality.
    * @alias servicecontrol.services.allocateQuota
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName Name of the service as specified in the service configuration. For example, `"pubsub.googleapis.com"`.  See google.api.Service for the definition of a service name.
    * @param {().AllocateQuotaRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def allocateQuota(): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(callback: BodyResponseCallback[SchemaAllocateQuotaResponse]): Unit = js.native
  def allocateQuota(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(params: ParamsResourceServicesAllocatequota): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    callback: BodyResponseCallback[SchemaAllocateQuotaResponse]
  ): Unit = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    options: BodyResponseCallback[SchemaAllocateQuotaResponse],
    callback: BodyResponseCallback[SchemaAllocateQuotaResponse]
  ): Unit = js.native
  def allocateQuota(params: ParamsResourceServicesAllocatequota, options: MethodOptions): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAllocateQuotaResponse]
  ): Unit = js.native
  
  /**
    * servicecontrol.services.check
    * @desc Checks whether an operation on a service should be allowed to
    * proceed based on the configuration of the service and related policies.
    * It must be called before the operation is executed.  If feasible, the
    * client should cache the check results and reuse them for 60 seconds. In
    * case of any server errors, the client should rely on the cached results
    * for much longer time to avoid outage. WARNING: There is general 60s delay
    * for the configuration and policy propagation, therefore callers MUST NOT
    * depend on the `Check` method having the latest policy information.  NOTE:
    * the CheckRequest has the size limit of 64KB.  This method requires the
    * `servicemanagement.services.check` permission on the specified service.
    * For more information, see [Cloud IAM](https://cloud.google.com/iam).
    * @alias servicecontrol.services.check
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.  See [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
    * @param {().CheckRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def check(): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
  def check(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(params: ParamsResourceServicesCheck): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(params: ParamsResourceServicesCheck, callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
  def check(
    params: ParamsResourceServicesCheck,
    options: BodyResponseCallback[SchemaCheckResponse],
    callback: BodyResponseCallback[SchemaCheckResponse]
  ): Unit = js.native
  def check(params: ParamsResourceServicesCheck, options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(
    params: ParamsResourceServicesCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * servicecontrol.services.report
    * @desc Reports operation results to Google Service Control, such as logs
    * and metrics. It should be called after an operation is completed.  If
    * feasible, the client should aggregate reporting data for up to 5 seconds
    * to reduce API traffic. Limiting aggregation to 5 seconds is to reduce
    * data loss during client crashes. Clients should carefully choose the
    * aggregation time window to avoid data loss risk more than 0.01% for
    * business and compliance reasons.  NOTE: the ReportRequest has the size
    * limit of 1MB.  This method requires the
    * `servicemanagement.services.report` permission on the specified service.
    * For more information, see [Google Cloud
    * IAM](https://cloud.google.com/iam).
    * @alias servicecontrol.services.report
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.  See [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
    * @param {().ReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def report(): GaxiosPromise[SchemaReportResponse] = js.native
  def report(callback: BodyResponseCallback[SchemaReportResponse]): Unit = js.native
  def report(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReportResponse] = js.native
  def report(params: ParamsResourceServicesReport): GaxiosPromise[SchemaReportResponse] = js.native
  def report(params: ParamsResourceServicesReport, callback: BodyResponseCallback[SchemaReportResponse]): Unit = js.native
  def report(
    params: ParamsResourceServicesReport,
    options: BodyResponseCallback[SchemaReportResponse],
    callback: BodyResponseCallback[SchemaReportResponse]
  ): Unit = js.native
  def report(params: ParamsResourceServicesReport, options: MethodOptions): GaxiosPromise[SchemaReportResponse] = js.native
  def report(
    params: ParamsResourceServicesReport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportResponse]
  ): Unit = js.native
}
