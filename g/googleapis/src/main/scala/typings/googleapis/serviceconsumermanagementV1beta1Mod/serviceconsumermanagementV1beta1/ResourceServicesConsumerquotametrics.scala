package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1beta1", "serviceconsumermanagement_v1beta1.Resource$Services$Consumerquotametrics")
@js.native
open class ResourceServicesConsumerquotametrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaV1Beta1ConsumerQuotaMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaV1Beta1ConsumerQuotaMetric]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ConsumerQuotaMetric] = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsGet): GaxiosPromise[SchemaV1Beta1ConsumerQuotaMetric] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    callback: BodyResponseCallback[SchemaV1Beta1ConsumerQuotaMetric]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    options: BodyResponseCallback[Readable | SchemaV1Beta1ConsumerQuotaMetric],
    callback: BodyResponseCallback[Readable | SchemaV1Beta1ConsumerQuotaMetric]
  ): Unit = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsGet, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ConsumerQuotaMetric] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV1Beta1ConsumerQuotaMetric]
  ): Unit = js.native
  /**
    * Retrieves a summary of quota information for a specific quota metric.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await serviceconsumermanagement.services.consumerQuotaMetrics.get(
    *     {
    *       // The resource name of the quota metric, returned by a ListConsumerQuotaMetrics call. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus`
    *       name: 'services/my-service/[^/]+/[^/]+/consumerQuotaMetrics/my-consumerQuotaMetric',
    *       // Specifies the level of detail for quota information in the response.
    *       view: 'placeholder-value',
    *     }
    *   );
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
  
  def importProducerOverrides(): GaxiosPromise[SchemaOperation] = js.native
  def importProducerOverrides(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def importProducerOverrides(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def importProducerOverrides(params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides): GaxiosPromise[SchemaOperation] = js.native
  def importProducerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def importProducerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def importProducerOverrides(params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def importProducerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Create or update multiple producer overrides atomically, all on the same consumer, but on many different metrics or limits. The name field in the quota override message should not be set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.importProducerOverrides(
    *       {
    *         // The resource name of the consumer. An example name would be: `services/compute.googleapis.com/projects/123`
    *         parent: 'services/my-service/[^/]+/[^/]+',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "force": false,
    *           //   "forceOnly": [],
    *           //   "inlineSource": {}
    *           // }
    *         },
    *       }
    *     );
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
  def importProducerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def importProducerOverrides(
    params: ParamsResourceServicesConsumerquotametricsImportproduceroverrides,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var limits: ResourceServicesConsumerquotametricsLimits = js.native
  
  def list(): GaxiosPromise[SchemaV1Beta1ListConsumerQuotaMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaV1Beta1ListConsumerQuotaMetricsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ListConsumerQuotaMetricsResponse] = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsList): GaxiosPromise[SchemaV1Beta1ListConsumerQuotaMetricsResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    callback: BodyResponseCallback[SchemaV1Beta1ListConsumerQuotaMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    options: BodyResponseCallback[Readable | SchemaV1Beta1ListConsumerQuotaMetricsResponse],
    callback: BodyResponseCallback[Readable | SchemaV1Beta1ListConsumerQuotaMetricsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesConsumerquotametricsList, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ListConsumerQuotaMetricsResponse] = js.native
  def list(
    params: ParamsResourceServicesConsumerquotametricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV1Beta1ListConsumerQuotaMetricsResponse]
  ): Unit = js.native
  /**
    * Retrieves a summary of all quota information about this consumer that is visible to the service producer, for each quota metric defined by the service. Each metric includes information about all of its defined limits. Each limit includes the limit configuration (quota unit, preciseness, default value), the current effective limit value, and all of the overrides applied to the limit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.list({
    *       // Requested size of the next page of data.
    *       pageSize: 'placeholder-value',
    *       // Token identifying which result to start with; returned by a previous list call.
    *       pageToken: 'placeholder-value',
    *       // Parent of the quotas resource. An example parent would be: `services/serviceconsumermanagement.googleapis.com/projects/123`
    *       parent: 'services/my-service/[^/]+/[^/]+',
    *       // Specifies the level of detail for quota information in the response.
    *       view: 'placeholder-value',
    *     });
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
