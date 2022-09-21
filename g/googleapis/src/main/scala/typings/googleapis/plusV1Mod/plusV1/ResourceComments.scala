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

@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Resource$Comments")
@js.native
open class ResourceComments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaComment] = js.native
  def get(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def get(params: ParamsResourceCommentsGet, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * plus.comments.get
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
    *   const res = await plus.comments.get({
    *     // The ID of the comment to get.
    *     commentId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actor": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "inReplyTo": [],
    *   //   "kind": "my_kind",
    *   //   "object": {},
    *   //   "plusoners": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "updated": "my_updated",
    *   //   "verb": "my_verb"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias plus.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceCommentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentFeed]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentFeed]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[Readable | SchemaCommentFeed],
    callback: BodyResponseCallback[Readable | SchemaCommentFeed]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentFeed]
  ): Unit = js.native
  /**
    * plus.comments.list
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
    *   const res = await plus.comments.list({
    *     // The ID of the activity to get comments for.
    *     activityId: 'placeholder-value',
    *     // The maximum number of comments to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    *     maxResults: 'placeholder-value',
    *     // The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *     // The order in which to sort the list of comments.
    *     sortOrder: 'placeholder-value',
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
    * @alias plus.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get comments for.
    * @param {integer=} params.maxResults The maximum number of comments to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string=} params.sortOrder The order in which to sort the list of comments.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceCommentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
