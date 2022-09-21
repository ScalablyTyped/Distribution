package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Locationlists")
@js.native
open class ResourceAdvertisersLocationlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assignedLocations: ResourceAdvertisersLocationlistsAssignedlocations = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLocationList] = js.native
  def create(callback: BodyResponseCallback[SchemaLocationList]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocationList] = js.native
  def create(params: ParamsResourceAdvertisersLocationlistsCreate): GaxiosPromise[SchemaLocationList] = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsCreate,
    callback: BodyResponseCallback[SchemaLocationList]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsCreate,
    options: BodyResponseCallback[Readable | SchemaLocationList],
    callback: BodyResponseCallback[Readable | SchemaLocationList]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersLocationlistsCreate, options: MethodOptions): GaxiosPromise[SchemaLocationList] = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocationList]
  ): Unit = js.native
  /**
    * Creates a new location list. Returns the newly created location list if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.locationLists.create({
    *     // Required. The ID of the DV360 advertiser to which the location list belongs.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "displayName": "my_displayName",
    *       //   "locationListId": "my_locationListId",
    *       //   "locationType": "my_locationType",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "locationListId": "my_locationListId",
    *   //   "locationType": "my_locationType",
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
  def create(params: ParamsResourceAdvertisersLocationlistsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersLocationlistsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLocationList] = js.native
  def get(callback: BodyResponseCallback[SchemaLocationList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocationList] = js.native
  def get(params: ParamsResourceAdvertisersLocationlistsGet): GaxiosPromise[SchemaLocationList] = js.native
  def get(
    params: ParamsResourceAdvertisersLocationlistsGet,
    callback: BodyResponseCallback[SchemaLocationList]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersLocationlistsGet,
    options: BodyResponseCallback[Readable | SchemaLocationList],
    callback: BodyResponseCallback[Readable | SchemaLocationList]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersLocationlistsGet, options: MethodOptions): GaxiosPromise[SchemaLocationList] = js.native
  def get(
    params: ParamsResourceAdvertisersLocationlistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocationList]
  ): Unit = js.native
  /**
    * Gets a location list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.locationLists.get({
    *     // Required. The ID of the DV360 advertiser to which the fetched location list belongs.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the location list to fetch.
    *     locationListId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "locationListId": "my_locationListId",
    *   //   "locationType": "my_locationType",
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
  def get(params: ParamsResourceAdvertisersLocationlistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersLocationlistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLocationListsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationListsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLocationListsResponse] = js.native
  def list(params: ParamsResourceAdvertisersLocationlistsList): GaxiosPromise[SchemaListLocationListsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsList,
    callback: BodyResponseCallback[SchemaListLocationListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsList,
    options: BodyResponseCallback[Readable | SchemaListLocationListsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLocationListsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersLocationlistsList, options: MethodOptions): GaxiosPromise[SchemaListLocationListsResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationListsResponse]
  ): Unit = js.native
  /**
    * Lists location lists based on a given advertiser id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.locationLists.list({
    *     // Required. The ID of the DV360 advertiser to which the fetched location lists belong.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by location list fields. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `locationType` Examples: * All regional location list: `locationType="TARGETING_LOCATION_TYPE_REGIONAL"` * All proximity location list: `locationType="TARGETING_LOCATION_TYPE_PROXIMITY"`
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `locationListId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. Defaults to `100` if not set. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListLocationLists` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locationLists": [],
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
  def list(params: ParamsResourceAdvertisersLocationlistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersLocationlistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLocationList] = js.native
  def patch(callback: BodyResponseCallback[SchemaLocationList]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocationList] = js.native
  def patch(params: ParamsResourceAdvertisersLocationlistsPatch): GaxiosPromise[SchemaLocationList] = js.native
  def patch(
    params: ParamsResourceAdvertisersLocationlistsPatch,
    callback: BodyResponseCallback[SchemaLocationList]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersLocationlistsPatch,
    options: BodyResponseCallback[Readable | SchemaLocationList],
    callback: BodyResponseCallback[Readable | SchemaLocationList]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersLocationlistsPatch, options: MethodOptions): GaxiosPromise[SchemaLocationList] = js.native
  def patch(
    params: ParamsResourceAdvertisersLocationlistsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocationList]
  ): Unit = js.native
  /**
    * Updates a location list. Returns the updated location list if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.locationLists.patch({
    *     // Required. The ID of the DV360 advertiser to which the location lists belongs.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the location list. Assigned by the system.
    *     locationListId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "displayName": "my_displayName",
    *       //   "locationListId": "my_locationListId",
    *       //   "locationType": "my_locationType",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "locationListId": "my_locationListId",
    *   //   "locationType": "my_locationType",
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
  def patch(params: ParamsResourceAdvertisersLocationlistsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersLocationlistsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
