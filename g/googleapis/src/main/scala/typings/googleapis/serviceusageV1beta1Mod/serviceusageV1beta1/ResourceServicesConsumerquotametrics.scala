package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceusage/v1beta1", "serviceusage_v1beta1.Resource$Services$Consumerquotametrics")
@js.native
open class ResourceServicesConsumerquotametrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConsumerQuotaMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaConsumerQuotaMetric]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsumerQuotaMetric] = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsGet): GaxiosPromise[SchemaConsumerQuotaMetric] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    callback: BodyResponseCallback[SchemaConsumerQuotaMetric]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    options: BodyResponseCallback[Readable | SchemaConsumerQuotaMetric],
    callback: BodyResponseCallback[Readable | SchemaConsumerQuotaMetric]
  ): Unit = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsGet, options: MethodOptions): GaxiosPromise[SchemaConsumerQuotaMetric] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsumerQuotaMetric]
  ): Unit = js.native
  /**
    * Retrieves a summary of quota information for a specific quota metric
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await serviceusage.services.consumerQuotaMetrics.get({
    *     // The resource name of the quota limit. An example name would be: `projects/123/services/serviceusage.googleapis.com/quotas/metrics/serviceusage.googleapis.com%2Fmutate_requests`
    *     name: '[^/]+/[^/]+/services/my-service/consumerQuotaMetrics/my-consumerQuotaMetric',
    *     // Specifies the level of detail for quota information in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consumerQuotaLimits": [],
    *   //   "descendantConsumerQuotaLimits": [],
    *   //   "displayName": "my_displayName",
    *   //   "metric": "my_metric",
    *   //   "name": "my_name",
    *   //   "unit": "my_unit"
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
  def get(params: ParamsResourceServicesConsumerquotametricsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def importAdminOverrides(): GaxiosPromise[SchemaOperation] = js.native
  def importAdminOverrides(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def importAdminOverrides(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def importAdminOverrides(params: ParamsResourceServicesConsumerquotametricsImportadminoverrides): GaxiosPromise[SchemaOperation] = js.native
  def importAdminOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportadminoverrides,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def importAdminOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportadminoverrides,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def importAdminOverrides(params: ParamsResourceServicesConsumerquotametricsImportadminoverrides, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def importAdminOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportadminoverrides,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates or updates multiple admin overrides atomically, all on the same consumer, but on many different metrics or limits. The name field in the quota override message should not be set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceusage.services.consumerQuotaMetrics.importAdminOverrides({
    *       // The resource name of the consumer. An example name would be: `projects/123/services/compute.googleapis.com`
    *       parent: '[^/]+/[^/]+/services/my-service',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "force": false,
    *         //   "forceOnly": [],
    *         //   "inlineSource": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def importAdminOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportadminoverrides,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def importAdminOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportadminoverrides,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def importConsumerOverrides(): GaxiosPromise[SchemaOperation] = js.native
  def importConsumerOverrides(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def importConsumerOverrides(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def importConsumerOverrides(params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides): GaxiosPromise[SchemaOperation] = js.native
  def importConsumerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def importConsumerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def importConsumerOverrides(params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def importConsumerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates or updates multiple consumer overrides atomically, all on the same consumer, but on many different metrics or limits. The name field in the quota override message should not be set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/service.management',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceusage.services.consumerQuotaMetrics.importConsumerOverrides({
    *       // The resource name of the consumer. An example name would be: `projects/123/services/compute.googleapis.com`
    *       parent: '[^/]+/[^/]+/services/my-service',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "force": false,
    *         //   "forceOnly": [],
    *         //   "inlineSource": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def importConsumerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def importConsumerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportconsumeroverrides,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var limits: ResourceServicesConsumerquotametricsLimits = js.native
  
  def list(): GaxiosPromise[SchemaListConsumerQuotaMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConsumerQuotaMetricsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConsumerQuotaMetricsResponse] = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsList): GaxiosPromise[SchemaListConsumerQuotaMetricsResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    callback: BodyResponseCallback[SchemaListConsumerQuotaMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    options: BodyResponseCallback[Readable | SchemaListConsumerQuotaMetricsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConsumerQuotaMetricsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsList, options: MethodOptions): GaxiosPromise[SchemaListConsumerQuotaMetricsResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConsumerQuotaMetricsResponse]
  ): Unit = js.native
  /**
    * Retrieves a summary of all quota information visible to the service consumer, organized by service metric. Each metric includes information about all of its defined limits. Each limit includes the limit configuration (quota unit, preciseness, default value), the current effective limit value, and all of the overrides applied to the limit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceusage.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await serviceusage.services.consumerQuotaMetrics.list({
    *     // Requested size of the next page of data.
    *     pageSize: 'placeholder-value',
    *     // Token identifying which result to start with; returned by a previous list call.
    *     pageToken: 'placeholder-value',
    *     // Parent of the quotas resource. Some example names would be: `projects/123/services/serviceconsumermanagement.googleapis.com` `folders/345/services/serviceconsumermanagement.googleapis.com` `organizations/456/services/serviceconsumermanagement.googleapis.com`
    *     parent: '[^/]+/[^/]+/services/my-service',
    *     // Specifies the level of detail for quota information in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "metrics": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceServicesConsumerquotametricsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
