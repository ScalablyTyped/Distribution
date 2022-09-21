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

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1beta1", "serviceconsumermanagement_v1beta1.Resource$Services$Consumerquotametrics$Limits")
@js.native
open class ResourceServicesConsumerquotametricsLimits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaV1Beta1ConsumerQuotaLimit] = js.native
  def get(callback: BodyResponseCallback[SchemaV1Beta1ConsumerQuotaLimit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ConsumerQuotaLimit] = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsLimitsGet): GaxiosPromise[SchemaV1Beta1ConsumerQuotaLimit] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    callback: BodyResponseCallback[SchemaV1Beta1ConsumerQuotaLimit]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    options: BodyResponseCallback[Readable | SchemaV1Beta1ConsumerQuotaLimit],
    callback: BodyResponseCallback[Readable | SchemaV1Beta1ConsumerQuotaLimit]
  ): Unit = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsLimitsGet, options: MethodOptions): GaxiosPromise[SchemaV1Beta1ConsumerQuotaLimit] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaV1Beta1ConsumerQuotaLimit]
  ): Unit = js.native
  /**
    * Retrieves a summary of quota information for a specific quota limit.
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
    *     await serviceconsumermanagement.services.consumerQuotaMetrics.limits.get({
    *       // The resource name of the quota limit, returned by a ListConsumerQuotaMetrics or GetConsumerQuotaMetric call. An example name would be: `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
    *       name: 'services/my-service/[^/]+/[^/]+/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit',
    *       // Specifies the level of detail for quota information in the response.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "isPrecise": false,
    *   //   "metric": "my_metric",
    *   //   "name": "my_name",
    *   //   "quotaBuckets": [],
    *   //   "supportedLocations": [],
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
  def get(params: ParamsResourceServicesConsumerquotametricsLimitsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var producerOverrides: ResourceServicesConsumerquotametricsLimitsProduceroverrides = js.native
}
