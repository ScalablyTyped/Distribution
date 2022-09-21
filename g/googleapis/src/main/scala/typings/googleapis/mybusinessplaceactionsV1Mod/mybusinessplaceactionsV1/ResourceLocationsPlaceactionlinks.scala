package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessplaceactions/v1", "mybusinessplaceactions_v1.Resource$Locations$Placeactionlinks")
@js.native
open class ResourceLocationsPlaceactionlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def create(callback: BodyResponseCallback[SchemaPlaceActionLink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def create(params: ParamsResourceLocationsPlaceactionlinksCreate): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def create(
    params: ParamsResourceLocationsPlaceactionlinksCreate,
    callback: BodyResponseCallback[SchemaPlaceActionLink]
  ): Unit = js.native
  def create(
    params: ParamsResourceLocationsPlaceactionlinksCreate,
    options: BodyResponseCallback[Readable | SchemaPlaceActionLink],
    callback: BodyResponseCallback[Readable | SchemaPlaceActionLink]
  ): Unit = js.native
  def create(params: ParamsResourceLocationsPlaceactionlinksCreate, options: MethodOptions): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def create(
    params: ParamsResourceLocationsPlaceactionlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaceActionLink]
  ): Unit = js.native
  /**
    * Creates a place action link associated with the specified location, and returns it. The request is considered duplicate if the `parent`, `place_action_link.uri` and `place_action_link.place_action_type` are the same as a previous request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessplaceactions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessplaceactions = google.mybusinessplaceactions('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessplaceactions.locations.placeActionLinks.create({
    *     // Required. The resource name of the location where to create this place action link. `locations/{location_id\}`.
    *     parent: 'locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "isEditable": false,
    *       //   "isPreferred": false,
    *       //   "name": "my_name",
    *       //   "orderOnlineMetadata": {},
    *       //   "placeActionType": "my_placeActionType",
    *       //   "providerType": "my_providerType",
    *       //   "updateTime": "my_updateTime",
    *       //   "uri": "my_uri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "isEditable": false,
    *   //   "isPreferred": false,
    *   //   "name": "my_name",
    *   //   "orderOnlineMetadata": {},
    *   //   "placeActionType": "my_placeActionType",
    *   //   "providerType": "my_providerType",
    *   //   "updateTime": "my_updateTime",
    *   //   "uri": "my_uri"
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
  def create(params: ParamsResourceLocationsPlaceactionlinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceLocationsPlaceactionlinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsPlaceactionlinksDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsPlaceactionlinksDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLocationsPlaceactionlinksDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLocationsPlaceactionlinksDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceLocationsPlaceactionlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a place action link from the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessplaceactions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessplaceactions = google.mybusinessplaceactions('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessplaceactions.locations.placeActionLinks.delete({
    *     // Required. The resource name of the place action link to remove from the location.
    *     name: 'locations/my-location/placeActionLinks/my-placeActionLink',
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
  def delete(params: ParamsResourceLocationsPlaceactionlinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLocationsPlaceactionlinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def get(callback: BodyResponseCallback[SchemaPlaceActionLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def get(params: ParamsResourceLocationsPlaceactionlinksGet): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def get(
    params: ParamsResourceLocationsPlaceactionlinksGet,
    callback: BodyResponseCallback[SchemaPlaceActionLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceLocationsPlaceactionlinksGet,
    options: BodyResponseCallback[Readable | SchemaPlaceActionLink],
    callback: BodyResponseCallback[Readable | SchemaPlaceActionLink]
  ): Unit = js.native
  def get(params: ParamsResourceLocationsPlaceactionlinksGet, options: MethodOptions): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def get(
    params: ParamsResourceLocationsPlaceactionlinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaceActionLink]
  ): Unit = js.native
  /**
    * Gets the specified place action link.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessplaceactions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessplaceactions = google.mybusinessplaceactions('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessplaceactions.locations.placeActionLinks.get({
    *     // Required. The name of the place action link to fetch.
    *     name: 'locations/my-location/placeActionLinks/my-placeActionLink',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "isEditable": false,
    *   //   "isPreferred": false,
    *   //   "name": "my_name",
    *   //   "orderOnlineMetadata": {},
    *   //   "placeActionType": "my_placeActionType",
    *   //   "providerType": "my_providerType",
    *   //   "updateTime": "my_updateTime",
    *   //   "uri": "my_uri"
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
  def get(params: ParamsResourceLocationsPlaceactionlinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLocationsPlaceactionlinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPlaceActionLinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPlaceActionLinksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPlaceActionLinksResponse] = js.native
  def list(params: ParamsResourceLocationsPlaceactionlinksList): GaxiosPromise[SchemaListPlaceActionLinksResponse] = js.native
  def list(
    params: ParamsResourceLocationsPlaceactionlinksList,
    callback: BodyResponseCallback[SchemaListPlaceActionLinksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLocationsPlaceactionlinksList,
    options: BodyResponseCallback[Readable | SchemaListPlaceActionLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaListPlaceActionLinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsPlaceactionlinksList, options: MethodOptions): GaxiosPromise[SchemaListPlaceActionLinksResponse] = js.native
  def list(
    params: ParamsResourceLocationsPlaceactionlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPlaceActionLinksResponse]
  ): Unit = js.native
  /**
    * Lists the place action links for the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessplaceactions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessplaceactions = google.mybusinessplaceactions('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessplaceactions.locations.placeActionLinks.list({
    *     // Optional. A filter constraining the place action links to return. The response includes entries that match the filter. We support only the following filter: 1. place_action_type=XYZ where XYZ is a valid PlaceActionType.
    *     filter: 'placeholder-value',
    *     // Optional. How many place action links to return per page. Default of 10. The minimum is 1.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, returns the next page of place action links.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the location whose place action links will be listed. `locations/{location_id\}`.
    *     parent: 'locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "placeActionLinks": []
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
  def list(params: ParamsResourceLocationsPlaceactionlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLocationsPlaceactionlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlaceActionLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def patch(params: ParamsResourceLocationsPlaceactionlinksPatch): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def patch(
    params: ParamsResourceLocationsPlaceactionlinksPatch,
    callback: BodyResponseCallback[SchemaPlaceActionLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceLocationsPlaceactionlinksPatch,
    options: BodyResponseCallback[Readable | SchemaPlaceActionLink],
    callback: BodyResponseCallback[Readable | SchemaPlaceActionLink]
  ): Unit = js.native
  def patch(params: ParamsResourceLocationsPlaceactionlinksPatch, options: MethodOptions): GaxiosPromise[SchemaPlaceActionLink] = js.native
  def patch(
    params: ParamsResourceLocationsPlaceactionlinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlaceActionLink]
  ): Unit = js.native
  /**
    * Updates the specified place action link and returns it.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessplaceactions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessplaceactions = google.mybusinessplaceactions('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessplaceactions.locations.placeActionLinks.patch({
    *     // Optional. The resource name, in the format `locations/{location_id\}/placeActionLinks/{place_action_link_id\}`. The name field will only be considered in UpdatePlaceActionLink and DeletePlaceActionLink requests for updating and deleting links respectively. However, it will be ignored in CreatePlaceActionLink request, where `place_action_link_id` will be assigned by the server on successful creation of a new link and returned as part of the response.
    *     name: 'locations/my-location/placeActionLinks/my-placeActionLink',
    *     // Required. The specific fields to update. The only editable fields are `uri`, `place_action_type` and `is_preferred`. If the updated link already exists at the same location with the same `place_action_type` and `uri`, fails with an `ALREADY_EXISTS` error.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "isEditable": false,
    *       //   "isPreferred": false,
    *       //   "name": "my_name",
    *       //   "orderOnlineMetadata": {},
    *       //   "placeActionType": "my_placeActionType",
    *       //   "providerType": "my_providerType",
    *       //   "updateTime": "my_updateTime",
    *       //   "uri": "my_uri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "isEditable": false,
    *   //   "isPreferred": false,
    *   //   "name": "my_name",
    *   //   "orderOnlineMetadata": {},
    *   //   "placeActionType": "my_placeActionType",
    *   //   "providerType": "my_providerType",
    *   //   "updateTime": "my_updateTime",
    *   //   "uri": "my_uri"
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
  def patch(params: ParamsResourceLocationsPlaceactionlinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceLocationsPlaceactionlinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
