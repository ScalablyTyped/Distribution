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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Datastreams")
@js.native
open class ResourcePropertiesDatastreams protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def create(params: ParamsResourcePropertiesDatastreamsCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataStream],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesDatastreamsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  /**
    * Creates a DataStream.
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
    *   const res = await analyticsadmin.properties.dataStreams.create({
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "androidAppStreamData": {},
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "iosAppStreamData": {},
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime",
    *       //   "webStreamData": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidAppStreamData": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosAppStreamData": {},
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "webStreamData": {}
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
  def create(params: ParamsResourcePropertiesDatastreamsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePropertiesDatastreamsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesDatastreamsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a DataStream on a property.
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
    *   const res = await analyticsadmin.properties.dataStreams.delete({
    *     // Required. The name of the DataStream to delete. Example format: properties/1234/dataStreams/5678
    *     name: 'properties/my-propertie/dataStreams/my-dataStream',
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
  def delete(params: ParamsResourcePropertiesDatastreamsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def get(params: ParamsResourcePropertiesDatastreamsGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataStream],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesDatastreamsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  /**
    * Lookup for a single DataStream.
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
    *   const res = await analyticsadmin.properties.dataStreams.get({
    *     // Required. The name of the DataStream to get. Example format: properties/1234/dataStreams/5678
    *     name: 'properties/my-propertie/dataStreams/my-dataStream',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidAppStreamData": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosAppStreamData": {},
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "webStreamData": {}
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
  def get(params: ParamsResourcePropertiesDatastreamsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getGlobalSiteTag(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag]): Unit = js.native
  def getGlobalSiteTag(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(params: ParamsResourcePropertiesDatastreamsGetglobalsitetag): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(
    params: ParamsResourcePropertiesDatastreamsGetglobalsitetag,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag]
  ): Unit = js.native
  def getGlobalSiteTag(
    params: ParamsResourcePropertiesDatastreamsGetglobalsitetag,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag]
  ): Unit = js.native
  def getGlobalSiteTag(params: ParamsResourcePropertiesDatastreamsGetglobalsitetag, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(
    params: ParamsResourcePropertiesDatastreamsGetglobalsitetag,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag]
  ): Unit = js.native
  /**
    * Returns the Site Tag for the specified web stream. Site Tags are immutable singletons.
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
    *   const res = await analyticsadmin.properties.dataStreams.getGlobalSiteTag({
    *     // Required. The name of the site tag to lookup. Note that site tags are singletons and do not have unique IDs. Format: properties/{property_id\}/dataStreams/{stream_id\}/globalSiteTag Example: "properties/123/dataStreams/456/globalSiteTag"
    *     name: 'properties/my-propertie/dataStreams/my-dataStream/globalSiteTag',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "snippet": "my_snippet"
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
  def getGlobalSiteTag(params: ParamsResourcePropertiesDatastreamsGetglobalsitetag, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGlobalSiteTag(
    params: ParamsResourcePropertiesDatastreamsGetglobalsitetag,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  def list(params: ParamsResourcePropertiesDatastreamsList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesDatastreamsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListDataStreamsResponse]
  ): Unit = js.native
  /**
    * Lists DataStreams on a property.
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
    *   const res = await analyticsadmin.properties.dataStreams.list({
    *     // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListDataStreams` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListDataStreams` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataStreams": [],
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
  def list(params: ParamsResourcePropertiesDatastreamsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var measurementProtocolSecrets: ResourcePropertiesDatastreamsMeasurementprotocolsecrets = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def patch(params: ParamsResourcePropertiesDatastreamsPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataStream],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesDatastreamsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataStream] = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  ): Unit = js.native
  /**
    * Updates a DataStream on a property.
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
    *   const res = await analyticsadmin.properties.dataStreams.patch({
    *     // Output only. Resource name of this Data Stream. Format: properties/{property_id\}/dataStreams/{stream_id\} Example: "properties/1000/dataStreams/2000"
    *     name: 'properties/my-propertie/dataStreams/my-dataStream',
    *     // Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "androidAppStreamData": {},
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "iosAppStreamData": {},
    *       //   "name": "my_name",
    *       //   "type": "my_type",
    *       //   "updateTime": "my_updateTime",
    *       //   "webStreamData": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidAppStreamData": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "iosAppStreamData": {},
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "updateTime": "my_updateTime",
    *   //   "webStreamData": {}
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
  def patch(params: ParamsResourcePropertiesDatastreamsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
