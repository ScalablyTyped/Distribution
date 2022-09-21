package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicecontrol/v1", "servicecontrol_v1.Resource$Services")
@js.native
open class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def allocateQuota(): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(callback: BodyResponseCallback[SchemaAllocateQuotaResponse]): Unit = js.native
  def allocateQuota(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(params: ParamsResourceServicesAllocatequota): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    callback: BodyResponseCallback[SchemaAllocateQuotaResponse]
  ): Unit = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    options: BodyResponseCallback[Readable | SchemaAllocateQuotaResponse],
    callback: BodyResponseCallback[Readable | SchemaAllocateQuotaResponse]
  ): Unit = js.native
  def allocateQuota(params: ParamsResourceServicesAllocatequota, options: MethodOptions): GaxiosPromise[SchemaAllocateQuotaResponse] = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAllocateQuotaResponse]
  ): Unit = js.native
  /**
    * Attempts to allocate quota for the specified consumer. It should be called before the operation is executed. This method requires the `servicemanagement.services.quota` permission on the specified service. For more information, see [Cloud IAM](https://cloud.google.com/iam). **NOTE:** The client **must** fail-open on server errors `INTERNAL`, `UNKNOWN`, `DEADLINE_EXCEEDED`, and `UNAVAILABLE`. To ensure system reliability, the server may inject these errors to prohibit any hard dependency on the quota functionality.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicecontrol.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicecontrol = google.servicecontrol('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/servicecontrol',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicecontrol.services.allocateQuota({
    *     // Name of the service as specified in the service configuration. For example, `"pubsub.googleapis.com"`. See google.api.Service for the definition of a service name.
    *     serviceName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allocateOperation": {},
    *       //   "serviceConfigId": "my_serviceConfigId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allocateErrors": [],
    *   //   "allocateInfo": {},
    *   //   "operationId": "my_operationId",
    *   //   "quotaMetrics": [],
    *   //   "serviceConfigId": "my_serviceConfigId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def allocateQuota(params: ParamsResourceServicesAllocatequota, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def allocateQuota(
    params: ParamsResourceServicesAllocatequota,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def check(): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
  def check(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(params: ParamsResourceServicesCheck): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(params: ParamsResourceServicesCheck, callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
  def check(
    params: ParamsResourceServicesCheck,
    options: BodyResponseCallback[Readable | SchemaCheckResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckResponse]
  ): Unit = js.native
  def check(params: ParamsResourceServicesCheck, options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
  def check(
    params: ParamsResourceServicesCheck,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckResponse]
  ): Unit = js.native
  /**
    * Checks whether an operation on a service should be allowed to proceed based on the configuration of the service and related policies. It must be called before the operation is executed. If feasible, the client should cache the check results and reuse them for 60 seconds. In case of any server errors, the client should rely on the cached results for much longer time to avoid outage. WARNING: There is general 60s delay for the configuration and policy propagation, therefore callers MUST NOT depend on the `Check` method having the latest policy information. NOTE: the CheckRequest has the size limit (wire-format byte size) of 1MB. This method requires the `servicemanagement.services.check` permission on the specified service. For more information, see [Cloud IAM](https://cloud.google.com/iam).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicecontrol.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicecontrol = google.servicecontrol('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/servicecontrol',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicecontrol.services.check({
    *     // The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
    *     serviceName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "operation": {},
    *       //   "requestProjectSettings": false,
    *       //   "serviceConfigId": "my_serviceConfigId",
    *       //   "skipActivationCheck": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "checkErrors": [],
    *   //   "checkInfo": {},
    *   //   "operationId": "my_operationId",
    *   //   "quotaInfo": {},
    *   //   "serviceConfigId": "my_serviceConfigId",
    *   //   "serviceRolloutId": "my_serviceRolloutId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def check(params: ParamsResourceServicesCheck, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def check(
    params: ParamsResourceServicesCheck,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def report(): GaxiosPromise[SchemaReportResponse] = js.native
  def report(callback: BodyResponseCallback[SchemaReportResponse]): Unit = js.native
  def report(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReportResponse] = js.native
  def report(params: ParamsResourceServicesReport): GaxiosPromise[SchemaReportResponse] = js.native
  def report(params: ParamsResourceServicesReport, callback: BodyResponseCallback[SchemaReportResponse]): Unit = js.native
  def report(
    params: ParamsResourceServicesReport,
    options: BodyResponseCallback[Readable | SchemaReportResponse],
    callback: BodyResponseCallback[Readable | SchemaReportResponse]
  ): Unit = js.native
  def report(params: ParamsResourceServicesReport, options: MethodOptions): GaxiosPromise[SchemaReportResponse] = js.native
  def report(
    params: ParamsResourceServicesReport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportResponse]
  ): Unit = js.native
  /**
    * Reports operation results to Google Service Control, such as logs and metrics. It should be called after an operation is completed. If feasible, the client should aggregate reporting data for up to 5 seconds to reduce API traffic. Limiting aggregation to 5 seconds is to reduce data loss during client crashes. Clients should carefully choose the aggregation time window to avoid data loss risk more than 0.01% for business and compliance reasons. NOTE: the ReportRequest has the size limit (wire-format byte size) of 1MB. This method requires the `servicemanagement.services.report` permission on the specified service. For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/servicecontrol.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const servicecontrol = google.servicecontrol('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/servicecontrol',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await servicecontrol.services.report({
    *     // The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
    *     serviceName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "operations": [],
    *       //   "serviceConfigId": "my_serviceConfigId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "reportErrors": [],
    *   //   "serviceConfigId": "my_serviceConfigId",
    *   //   "serviceRolloutId": "my_serviceRolloutId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def report(params: ParamsResourceServicesReport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def report(
    params: ParamsResourceServicesReport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
