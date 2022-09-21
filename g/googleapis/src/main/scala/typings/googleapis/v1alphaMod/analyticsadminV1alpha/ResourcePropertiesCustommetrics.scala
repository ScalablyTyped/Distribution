package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Custommetrics")
@js.native
open class ResourcePropertiesCustommetrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def archive(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def archive(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(params: ParamsResourcePropertiesCustommetricsArchive): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(
    params: ParamsResourcePropertiesCustommetricsArchive,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def archive(
    params: ParamsResourcePropertiesCustommetricsArchive,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def archive(params: ParamsResourcePropertiesCustommetricsArchive, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(
    params: ParamsResourcePropertiesCustommetricsArchive,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Archives a CustomMetric on a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.customMetrics.archive({
    *     // Required. The name of the CustomMetric to archive. Example format: properties/1234/customMetrics/5678
    *     name: 'properties/my-propertie/customMetrics/my-customMetric',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def archive(params: ParamsResourcePropertiesCustommetricsArchive, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def archive(
    params: ParamsResourcePropertiesCustommetricsArchive,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def create(params: ParamsResourcePropertiesCustommetricsCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def create(
    params: ParamsResourcePropertiesCustommetricsCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesCustommetricsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesCustommetricsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def create(
    params: ParamsResourcePropertiesCustommetricsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  /**
    * Creates a CustomMetric.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.customMetrics.create({
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "measurementUnit": "my_measurementUnit",
    *       //   "name": "my_name",
    *       //   "parameterName": "my_parameterName",
    *       //   "restrictedMetricType": [],
    *       //   "scope": "my_scope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "measurementUnit": "my_measurementUnit",
    *   //   "name": "my_name",
    *   //   "parameterName": "my_parameterName",
    *   //   "restrictedMetricType": [],
    *   //   "scope": "my_scope"
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
  def create(params: ParamsResourcePropertiesCustommetricsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesCustommetricsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def get(params: ParamsResourcePropertiesCustommetricsGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def get(
    params: ParamsResourcePropertiesCustommetricsGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesCustommetricsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesCustommetricsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def get(
    params: ParamsResourcePropertiesCustommetricsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  /**
    * Lookup for a single CustomMetric.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.customMetrics.get({
    *     // Required. The name of the CustomMetric to get. Example format: properties/1234/customMetrics/5678
    *     name: 'properties/my-propertie/customMetrics/my-customMetric',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "measurementUnit": "my_measurementUnit",
    *   //   "name": "my_name",
    *   //   "parameterName": "my_parameterName",
    *   //   "restrictedMetricType": [],
    *   //   "scope": "my_scope"
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
  def get(params: ParamsResourcePropertiesCustommetricsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesCustommetricsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  def list(params: ParamsResourcePropertiesCustommetricsList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesCustommetricsList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesCustommetricsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesCustommetricsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesCustommetricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListCustomMetricsResponse]
  ): Unit = js.native
  /**
    * Lists CustomMetrics on a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.customMetrics.list({
    *     // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListCustomMetrics` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCustomMetrics` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customMetrics": [],
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
  def list(params: ParamsResourcePropertiesCustommetricsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesCustommetricsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def patch(params: ParamsResourcePropertiesCustommetricsPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def patch(
    params: ParamsResourcePropertiesCustommetricsPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesCustommetricsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomMetric],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesCustommetricsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def patch(
    params: ParamsResourcePropertiesCustommetricsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomMetric]
  ): Unit = js.native
  /**
    * Updates a CustomMetric on a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.customMetrics.patch({
    *     // Output only. Resource name for this CustomMetric resource. Format: properties/{property\}/customMetrics/{customMetric\}
    *     name: 'properties/my-propertie/customMetrics/my-customMetric',
    *     // Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "measurementUnit": "my_measurementUnit",
    *       //   "name": "my_name",
    *       //   "parameterName": "my_parameterName",
    *       //   "restrictedMetricType": [],
    *       //   "scope": "my_scope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "measurementUnit": "my_measurementUnit",
    *   //   "name": "my_name",
    *   //   "parameterName": "my_parameterName",
    *   //   "restrictedMetricType": [],
    *   //   "scope": "my_scope"
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
  def patch(params: ParamsResourcePropertiesCustommetricsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesCustommetricsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
