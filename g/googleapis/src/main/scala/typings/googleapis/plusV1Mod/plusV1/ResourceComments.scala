package typings.googleapis.plusV1Mod.plusV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plus/v1", "plus_v1.Resource$Comments")
@js.native
class ResourceComments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plus.comments.get
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plus.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaComment] = js.native
  def get(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def get(params: ParamsResourceCommentsGet, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * plus.comments.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
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
  def list(): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentFeed]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentFeed]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[SchemaCommentFeed],
    callback: BodyResponseCallback[SchemaCommentFeed]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentFeed] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentFeed]
  ): Unit = js.native
}

