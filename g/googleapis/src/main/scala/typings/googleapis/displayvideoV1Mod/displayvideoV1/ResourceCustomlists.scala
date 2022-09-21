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

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Customlists")
@js.native
open class ResourceCustomlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomList] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomList]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomList] = js.native
  def get(params: ParamsResourceCustomlistsGet): GaxiosPromise[SchemaCustomList] = js.native
  def get(params: ParamsResourceCustomlistsGet, callback: BodyResponseCallback[SchemaCustomList]): Unit = js.native
  def get(
    params: ParamsResourceCustomlistsGet,
    options: BodyResponseCallback[Readable | SchemaCustomList],
    callback: BodyResponseCallback[Readable | SchemaCustomList]
  ): Unit = js.native
  def get(params: ParamsResourceCustomlistsGet, options: MethodOptions): GaxiosPromise[SchemaCustomList] = js.native
  def get(
    params: ParamsResourceCustomlistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomList]
  ): Unit = js.native
  /**
    * Gets a custom list.
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
    *   const res = await displayvideo.customLists.get({
    *     // The ID of the DV360 advertiser that has access to the fetched custom lists.
    *     advertiserId: 'placeholder-value',
    *     // Required. The ID of the custom list to fetch.
    *     customListId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customListId": "my_customListId",
    *   //   "displayName": "my_displayName",
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
  def get(params: ParamsResourceCustomlistsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomlistsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCustomListsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomListsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCustomListsResponse] = js.native
  def list(params: ParamsResourceCustomlistsList): GaxiosPromise[SchemaListCustomListsResponse] = js.native
  def list(
    params: ParamsResourceCustomlistsList,
    callback: BodyResponseCallback[SchemaListCustomListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomlistsList,
    options: BodyResponseCallback[Readable | SchemaListCustomListsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCustomListsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomlistsList, options: MethodOptions): GaxiosPromise[SchemaListCustomListsResponse] = js.native
  def list(
    params: ParamsResourceCustomlistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomListsResponse]
  ): Unit = js.native
  /**
    * Lists custom lists. The order is defined by the order_by parameter.
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
    *   const res = await displayvideo.customLists.list({
    *     // The ID of the DV360 advertiser that has access to the fetched custom lists.
    *     advertiserId: 'placeholder-value',
    *     // Allows filtering by custom list fields. Supported syntax: * Filter expressions for custom lists currently can only contain at most one restriction. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `CONTAINS (:)`. * Supported fields: - `displayName` Examples: * All custom lists for which the display name contains "Google": `displayName : "Google"`. The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `customListId` (default) * `displayName` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListCustomLists` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customLists": [],
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
  def list(params: ParamsResourceCustomlistsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomlistsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
