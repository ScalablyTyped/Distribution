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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Customdimensions")
@js.native
open class ResourcePropertiesCustomdimensions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def archive(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def archive(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(params: ParamsResourcePropertiesCustomdimensionsArchive): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(
    params: ParamsResourcePropertiesCustomdimensionsArchive,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def archive(
    params: ParamsResourcePropertiesCustomdimensionsArchive,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def archive(params: ParamsResourcePropertiesCustomdimensionsArchive, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(
    params: ParamsResourcePropertiesCustomdimensionsArchive,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Archives a CustomDimension on a property.
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
    *   const res = await analyticsadmin.properties.customDimensions.archive({
    *     // Required. The name of the CustomDimension to archive. Example format: properties/1234/customDimensions/5678
    *     name: 'properties/my-propertie/customDimensions/my-customDimension',
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
  def archive(params: ParamsResourcePropertiesCustomdimensionsArchive, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def archive(
    params: ParamsResourcePropertiesCustomdimensionsArchive,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def create(params: ParamsResourcePropertiesCustomdimensionsCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def create(
    params: ParamsResourcePropertiesCustomdimensionsCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesCustomdimensionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesCustomdimensionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def create(
    params: ParamsResourcePropertiesCustomdimensionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  /**
    * Creates a CustomDimension.
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
    *   const res = await analyticsadmin.properties.customDimensions.create({
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "disallowAdsPersonalization": false,
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "parameterName": "my_parameterName",
    *       //   "scope": "my_scope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "disallowAdsPersonalization": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "parameterName": "my_parameterName",
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
  def create(params: ParamsResourcePropertiesCustomdimensionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesCustomdimensionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def get(params: ParamsResourcePropertiesCustomdimensionsGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def get(
    params: ParamsResourcePropertiesCustomdimensionsGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesCustomdimensionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesCustomdimensionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def get(
    params: ParamsResourcePropertiesCustomdimensionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  /**
    * Lookup for a single CustomDimension.
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
    *   const res = await analyticsadmin.properties.customDimensions.get({
    *     // Required. The name of the CustomDimension to get. Example format: properties/1234/customDimensions/5678
    *     name: 'properties/my-propertie/customDimensions/my-customDimension',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "disallowAdsPersonalization": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "parameterName": "my_parameterName",
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
  def get(params: ParamsResourcePropertiesCustomdimensionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesCustomdimensionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  def list(params: ParamsResourcePropertiesCustomdimensionsList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesCustomdimensionsList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesCustomdimensionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesCustomdimensionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesCustomdimensionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListCustomDimensionsResponse]
  ): Unit = js.native
  /**
    * Lists CustomDimensions on a property.
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
    *   const res = await analyticsadmin.properties.customDimensions.list({
    *     // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListCustomDimensions` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCustomDimensions` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customDimensions": [],
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
  def list(params: ParamsResourcePropertiesCustomdimensionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesCustomdimensionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def patch(params: ParamsResourcePropertiesCustomdimensionsPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def patch(
    params: ParamsResourcePropertiesCustomdimensionsPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesCustomdimensionsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomDimension],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesCustomdimensionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def patch(
    params: ParamsResourcePropertiesCustomdimensionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaCustomDimension]
  ): Unit = js.native
  /**
    * Updates a CustomDimension on a property.
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
    *   const res = await analyticsadmin.properties.customDimensions.patch({
    *     // Output only. Resource name for this CustomDimension resource. Format: properties/{property\}/customDimensions/{customDimension\}
    *     name: 'properties/my-propertie/customDimensions/my-customDimension',
    *     // Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "disallowAdsPersonalization": false,
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "parameterName": "my_parameterName",
    *       //   "scope": "my_scope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "disallowAdsPersonalization": false,
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "parameterName": "my_parameterName",
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
  def patch(params: ParamsResourcePropertiesCustomdimensionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesCustomdimensionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
