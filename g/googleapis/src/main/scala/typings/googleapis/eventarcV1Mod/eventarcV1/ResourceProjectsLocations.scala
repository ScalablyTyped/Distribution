package typings.googleapis.eventarcV1Mod.eventarcV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/eventarc/v1", "eventarc_v1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var channelConnections: ResourceProjectsLocationsChannelconnections = js.native
  
  var channels: ResourceProjectsLocationsChannels = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: BodyResponseCallback[Readable | SchemaLocation],
    callback: BodyResponseCallback[Readable | SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  /**
    * Gets information about a location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/eventarc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const eventarc = google.eventarc('v1');
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
    *   const res = await eventarc.projects.locations.get({
    *     // Resource name for the location.
    *     name: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "labels": {},
    *   //   "locationId": "my_locationId",
    *   //   "metadata": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsLocationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getGoogleChannelConfig(): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def getGoogleChannelConfig(callback: BodyResponseCallback[SchemaGoogleChannelConfig]): Unit = js.native
  def getGoogleChannelConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def getGoogleChannelConfig(params: ParamsResourceProjectsLocationsGetgooglechannelconfig): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def getGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsGetgooglechannelconfig,
    callback: BodyResponseCallback[SchemaGoogleChannelConfig]
  ): Unit = js.native
  def getGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsGetgooglechannelconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleChannelConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleChannelConfig]
  ): Unit = js.native
  def getGoogleChannelConfig(params: ParamsResourceProjectsLocationsGetgooglechannelconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def getGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsGetgooglechannelconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChannelConfig]
  ): Unit = js.native
  /**
    * Get a GoogleChannelConfig
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/eventarc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const eventarc = google.eventarc('v1');
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
    *   const res = await eventarc.projects.locations.getGoogleChannelConfig({
    *     // Required. The name of the config to get.
    *     name: 'projects/my-project/locations/my-location/googleChannelConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cryptoKeyName": "my_cryptoKeyName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def getGoogleChannelConfig(params: ParamsResourceProjectsLocationsGetgooglechannelconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsGetgooglechannelconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsList): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: BodyResponseCallback[Readable | SchemaListLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsList, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  /**
    * Lists information about the supported locations for this service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/eventarc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const eventarc = google.eventarc('v1');
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
    *   const res = await eventarc.projects.locations.list({
    *     // A filter to narrow down results to a preferred subset. The filtering language accepts strings like `"displayName=tokyo"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The resource that owns the locations collection, if applicable.
    *     name: 'projects/my-project',
    *     // The maximum number of results to return. If not set, the service selects a default.
    *     pageSize: 'placeholder-value',
    *     // A page token received from the `next_page_token` field in the response. Send that page token to receive the subsequent page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locations": [],
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
  def list(params: ParamsResourceProjectsLocationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  var providers: ResourceProjectsLocationsProviders = js.native
  
  var triggers: ResourceProjectsLocationsTriggers = js.native
  
  def updateGoogleChannelConfig(): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def updateGoogleChannelConfig(callback: BodyResponseCallback[SchemaGoogleChannelConfig]): Unit = js.native
  def updateGoogleChannelConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def updateGoogleChannelConfig(params: ParamsResourceProjectsLocationsUpdategooglechannelconfig): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def updateGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsUpdategooglechannelconfig,
    callback: BodyResponseCallback[SchemaGoogleChannelConfig]
  ): Unit = js.native
  def updateGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsUpdategooglechannelconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleChannelConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleChannelConfig]
  ): Unit = js.native
  def updateGoogleChannelConfig(params: ParamsResourceProjectsLocationsUpdategooglechannelconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleChannelConfig] = js.native
  def updateGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsUpdategooglechannelconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleChannelConfig]
  ): Unit = js.native
  /**
    * Update a single GoogleChannelConfig
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/eventarc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const eventarc = google.eventarc('v1');
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
    *   const res = await eventarc.projects.locations.updateGoogleChannelConfig({
    *     // Required. The resource name of the config. Must be in the format of, `projects/{project\}/locations/{location\}/googleChannelConfig`.
    *     name: 'projects/my-project/locations/my-location/googleChannelConfig',
    *     // The fields to be updated; only fields explicitly provided are updated. If no field mask is provided, all provided fields in the request are updated. To update all fields, provide a field mask of "*".
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cryptoKeyName": "my_cryptoKeyName",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cryptoKeyName": "my_cryptoKeyName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def updateGoogleChannelConfig(params: ParamsResourceProjectsLocationsUpdategooglechannelconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateGoogleChannelConfig(
    params: ParamsResourceProjectsLocationsUpdategooglechannelconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
