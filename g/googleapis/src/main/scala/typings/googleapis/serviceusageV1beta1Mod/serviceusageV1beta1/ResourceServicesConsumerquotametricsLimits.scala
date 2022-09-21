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

@JSImport("googleapis/build/src/apis/serviceusage/v1beta1", "serviceusage_v1beta1.Resource$Services$Consumerquotametrics$Limits")
@js.native
open class ResourceServicesConsumerquotametricsLimits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var adminOverrides: ResourceServicesConsumerquotametricsLimitsAdminoverrides = js.native
  
  var consumerOverrides: ResourceServicesConsumerquotametricsLimitsConsumeroverrides = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaConsumerQuotaLimit] = js.native
  def get(callback: BodyResponseCallback[SchemaConsumerQuotaLimit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsumerQuotaLimit] = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsLimitsGet): GaxiosPromise[SchemaConsumerQuotaLimit] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    callback: BodyResponseCallback[SchemaConsumerQuotaLimit]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    options: BodyResponseCallback[Readable | SchemaConsumerQuotaLimit],
    callback: BodyResponseCallback[Readable | SchemaConsumerQuotaLimit]
  ): Unit = js.native
  def get(params: ParamsResourceServicesConsumerquotametricsLimitsGet, options: MethodOptions): GaxiosPromise[SchemaConsumerQuotaLimit] = js.native
  def get(
    params: ParamsResourceServicesConsumerquotametricsLimitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsumerQuotaLimit]
  ): Unit = js.native
  /**
    * Retrieves a summary of quota information for a specific quota limit.
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
    *   const res = await serviceusage.services.consumerQuotaMetrics.limits.get({
    *     // The resource name of the quota limit. Use the quota limit resource name returned by previous ListConsumerQuotaMetrics and GetConsumerQuotaMetric API calls.
    *     name: '[^/]+/[^/]+/services/my-service/consumerQuotaMetrics/my-consumerQuotaMetric/limits/my-limit',
    *     // Specifies the level of detail for quota information in the response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowsAdminOverrides": false,
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
}
