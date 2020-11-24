package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Comments")
@js.native
class ResourceComments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.comments.delete
    * @desc Deletes a comment.
    * @alias youtube.comments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the comment ID for the resource that is being deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCommentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * youtube.comments.insert
    * @desc Creates a reply to an existing comment. Note: To create a top-level
    * comment, use the commentThreads.insert method.
    * @alias youtube.comments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter identifies the properties that the API response will include. Set the parameter value to snippet. The snippet part has a quota cost of 2 units.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaComment] = js.native
  def insert(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def insert(params: ParamsResourceCommentsInsert): GaxiosPromise[SchemaComment] = js.native
  def insert(params: ParamsResourceCommentsInsert, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def insert(
    params: ParamsResourceCommentsInsert,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def insert(params: ParamsResourceCommentsInsert, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def insert(
    params: ParamsResourceCommentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  
  /**
    * youtube.comments.list
    * @desc Returns a list of comments that match the API request parameters.
    * @alias youtube.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The id parameter specifies a comma-separated list of comment IDs for the resources that are being retrieved. In a comment resource, the id property specifies the comment's ID.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.  Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies the next page of the result that can be retrieved.  Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string=} params.parentId The parentId parameter specifies the ID of the comment for which replies should be retrieved.  Note: YouTube currently supports replies only for top-level comments. However, replies to replies may be supported in the future.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more comment resource properties that the API response will include.
    * @param {string=} params.textFormat This parameter indicates whether the API should return comments formatted as HTML or as plain text.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCommentListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentListResponse] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentListResponse] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[SchemaCommentListResponse],
    callback: BodyResponseCallback[SchemaCommentListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentListResponse] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentListResponse]
  ): Unit = js.native
  
  /**
    * youtube.comments.markAsSpam
    * @desc Expresses the caller's opinion that one or more comments should be
    * flagged as spam.
    * @alias youtube.comments.markAsSpam
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies a comma-separated list of IDs of comments that the caller believes should be classified as spam.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def markAsSpam(): GaxiosPromise[Unit] = js.native
  def markAsSpam(callback: BodyResponseCallback[Unit]): Unit = js.native
  def markAsSpam(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam): GaxiosPromise[Unit] = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, callback: BodyResponseCallback[Unit]): Unit = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.comments.setModerationStatus
    * @desc Sets the moderation status of one or more comments. The API request
    * must be authorized by the owner of the channel or video associated with
    * the comments.
    * @alias youtube.comments.setModerationStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.banAuthor The banAuthor parameter lets you indicate that you want to automatically reject any additional comments written by the comment's author. Set the parameter value to true to ban the author.  Note: This parameter is only valid if the moderationStatus parameter is also set to rejected.
    * @param {string} params.id The id parameter specifies a comma-separated list of IDs that identify the comments for which you are updating the moderation status.
    * @param {string} params.moderationStatus Identifies the new moderation status of the specified comments.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setModerationStatus(): GaxiosPromise[Unit] = js.native
  def setModerationStatus(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setModerationStatus(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setModerationStatus(params: ParamsResourceCommentsSetmoderationstatus): GaxiosPromise[Unit] = js.native
  def setModerationStatus(params: ParamsResourceCommentsSetmoderationstatus, callback: BodyResponseCallback[Unit]): Unit = js.native
  def setModerationStatus(
    params: ParamsResourceCommentsSetmoderationstatus,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setModerationStatus(params: ParamsResourceCommentsSetmoderationstatus, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setModerationStatus(
    params: ParamsResourceCommentsSetmoderationstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.comments.update
    * @desc Modifies a comment.
    * @alias youtube.comments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter identifies the properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaComment] = js.native
  def update(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def update(params: ParamsResourceCommentsUpdate): GaxiosPromise[SchemaComment] = js.native
  def update(params: ParamsResourceCommentsUpdate, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def update(
    params: ParamsResourceCommentsUpdate,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def update(params: ParamsResourceCommentsUpdate, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def update(
    params: ParamsResourceCommentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
}
