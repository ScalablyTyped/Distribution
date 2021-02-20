package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Replies")
@js.native
class ResourceReplies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.replies.delete
    * @desc Deletes a reply.
    * @alias drive.replies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepliesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepliesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRepliesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRepliesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepliesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * drive.replies.get
    * @desc Gets a reply.
    * @alias drive.replies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted If set, this will succeed when retrieving a deleted reply.
    * @param {string} params.replyId The ID of the reply.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCommentReply] = js.native
  def get(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def get(params: ParamsResourceRepliesGet): GaxiosPromise[SchemaCommentReply] = js.native
  def get(params: ParamsResourceRepliesGet, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: BodyResponseCallback[SchemaCommentReply],
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  def get(params: ParamsResourceRepliesGet, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  
  /**
    * drive.replies.insert
    * @desc Creates a new reply to the given comment.
    * @alias drive.replies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().CommentReply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(params: ParamsResourceRepliesInsert): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(params: ParamsResourceRepliesInsert, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def insert(
    params: ParamsResourceRepliesInsert,
    options: BodyResponseCallback[SchemaCommentReply],
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  def insert(params: ParamsResourceRepliesInsert, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(
    params: ParamsResourceRepliesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  
  /**
    * drive.replies.list
    * @desc Lists all of the replies to a comment.
    * @alias drive.replies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted If set, all replies, including deleted replies (with content stripped) will be returned.
    * @param {integer=} params.maxResults The maximum number of replies to include in the response, used for paging.
    * @param {string=} params.pageToken The continuation token, used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentReplyList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(params: ParamsResourceRepliesList): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(params: ParamsResourceRepliesList, callback: BodyResponseCallback[SchemaCommentReplyList]): Unit = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: BodyResponseCallback[SchemaCommentReplyList],
    callback: BodyResponseCallback[SchemaCommentReplyList]
  ): Unit = js.native
  def list(params: ParamsResourceRepliesList, options: MethodOptions): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReplyList]
  ): Unit = js.native
  
  /**
    * drive.replies.patch
    * @desc Updates an existing reply. This method supports patch semantics.
    * @alias drive.replies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {().CommentReply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(params: ParamsResourceRepliesPatch): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(params: ParamsResourceRepliesPatch, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def patch(
    params: ParamsResourceRepliesPatch,
    options: BodyResponseCallback[SchemaCommentReply],
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  def patch(params: ParamsResourceRepliesPatch, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(
    params: ParamsResourceRepliesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  
  /**
    * drive.replies.update
    * @desc Updates an existing reply.
    * @alias drive.replies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {().CommentReply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCommentReply] = js.native
  def update(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def update(params: ParamsResourceRepliesUpdate): GaxiosPromise[SchemaCommentReply] = js.native
  def update(params: ParamsResourceRepliesUpdate, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: BodyResponseCallback[SchemaCommentReply],
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  def update(params: ParamsResourceRepliesUpdate, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
}
