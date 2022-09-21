package typings.googleapis.plusV1Mod.plusV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Resource$Activities")
@js.native
open class ResourceActivities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaActivity] = js.native
  def get(callback: BodyResponseCallback[SchemaActivity]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaActivity] = js.native
  def get(params: ParamsResourceActivitiesGet): GaxiosPromise[SchemaActivity] = js.native
  def get(params: ParamsResourceActivitiesGet, callback: BodyResponseCallback[SchemaActivity]): Unit = js.native
  def get(
    params: ParamsResourceActivitiesGet,
    options: BodyResponseCallback[Readable | SchemaActivity],
    callback: BodyResponseCallback[Readable | SchemaActivity]
  ): Unit = js.native
  def get(params: ParamsResourceActivitiesGet, options: MethodOptions): GaxiosPromise[SchemaActivity] = js.native
  def get(
    params: ParamsResourceActivitiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivity]
  ): Unit = js.native
  /**
    * plus.activities.get
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for more details.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.activities.get({
    *     // The ID of the activity to get.
    *     activityId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": {},
    *   //   "actor": {},
    *   //   "address": "my_address",
    *   //   "annotation": "my_annotation",
    *   //   "crosspostSource": "my_crosspostSource",
    *   //   "etag": "my_etag",
    *   //   "geocode": "my_geocode",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": {},
    *   //   "object": {},
    *   //   "placeId": "my_placeId",
    *   //   "placeName": "my_placeName",
    *   //   "provider": {},
    *   //   "published": "my_published",
    *   //   "radius": "my_radius",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url",
    *   //   "verb": "my_verb"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.activities.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceActivitiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceActivitiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(params: ParamsResourceActivitiesList): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(params: ParamsResourceActivitiesList, callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: BodyResponseCallback[Readable | SchemaActivityFeed],
    callback: BodyResponseCallback[Readable | SchemaActivityFeed]
  ): Unit = js.native
  def list(params: ParamsResourceActivitiesList, options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivityFeed]
  ): Unit = js.native
  /**
    * plus.activities.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for more details.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.activities.list({
    *     // The collection of activities to list.
    *     collection: 'placeholder-value',
    *     // The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *     // The ID of the user to get activities for. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.activities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of activities to list.
    * @param {integer=} params.maxResults The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId The ID of the user to get activities for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceActivitiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(params: ParamsResourceActivitiesSearch): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(params: ParamsResourceActivitiesSearch, callback: BodyResponseCallback[SchemaActivityFeed]): Unit = js.native
  def search(
    params: ParamsResourceActivitiesSearch,
    options: BodyResponseCallback[Readable | SchemaActivityFeed],
    callback: BodyResponseCallback[Readable | SchemaActivityFeed]
  ): Unit = js.native
  def search(params: ParamsResourceActivitiesSearch, options: MethodOptions): GaxiosPromise[SchemaActivityFeed] = js.native
  def search(
    params: ParamsResourceActivitiesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivityFeed]
  ): Unit = js.native
  /**
    * plus.activities.search
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for more details.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/plus.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const plus = google.plus('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/plus.login',
    *       'https://www.googleapis.com/auth/plus.me',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await plus.activities.search({
    *     // Specify the preferred language to search with. See search language codes for available values.
    *     language: 'placeholder-value',
    *     // The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // Specifies how to order search results.
    *     orderBy: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response. This token can be of any length.
    *     pageToken: 'placeholder-value',
    *     // Full-text search query string.
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "selfLink": "my_selfLink",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.activities.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language Specify the preferred language to search with. See search language codes for available values.
    * @param {integer=} params.maxResults The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.orderBy Specifies how to order search results.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response. This token can be of any length.
    * @param {string} params.query Full-text search query string.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(params: ParamsResourceActivitiesSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceActivitiesSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
