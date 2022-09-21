package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicecontrol/v2", "servicecontrol_v2.Resource$Services")
@js.native
open class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
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
    * Private Preview. This feature is only available for approved services. This method provides admission control for services that are integrated with [Service Infrastructure](https://cloud.google.com/service-infrastructure). It checks whether an operation should be allowed based on the service configuration and relevant policies. It must be called before the operation is executed. For more information, see [Admission Control](https://cloud.google.com/service-infrastructure/docs/admission-control). NOTE: The admission control has an expected policy propagation delay of 60s. The caller **must** not depend on the most recent policy changes. NOTE: The admission control has a hard limit of 1 referenced resources per call. If an operation refers to more than 1 resources, the caller must call the Check method multiple times. This method requires the `servicemanagement.services.check` permission on the specified service. For more information, see [Service Control API Access Control](https://cloud.google.com/service-infrastructure/docs/service-control/access-control).
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
    * const servicecontrol = google.servicecontrol('v2');
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
    *       //   "attributes": {},
    *       //   "flags": "my_flags",
    *       //   "resources": [],
    *       //   "serviceConfigId": "my_serviceConfigId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "headers": {},
    *   //   "status": {}
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
    * Private Preview. This feature is only available for approved services. This method provides telemetry reporting for services that are integrated with [Service Infrastructure](https://cloud.google.com/service-infrastructure). It reports a list of operations that have occurred on a service. It must be called after the operations have been executed. For more information, see [Telemetry Reporting](https://cloud.google.com/service-infrastructure/docs/telemetry-reporting). NOTE: The telemetry reporting has a hard limit of 1000 operations and 1MB per Report call. It is recommended to have no more than 100 operations per call. This method requires the `servicemanagement.services.report` permission on the specified service. For more information, see [Service Control API Access Control](https://cloud.google.com/service-infrastructure/docs/service-control/access-control).
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
    * const servicecontrol = google.servicecontrol('v2');
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
    *   // {}
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
