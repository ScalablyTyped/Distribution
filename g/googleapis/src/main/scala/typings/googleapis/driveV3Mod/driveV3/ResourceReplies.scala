package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Replies")
@js.native
class ResourceReplies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.replies.create
    * @desc Creates a new reply to a comment.
    * @alias drive.replies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().Reply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaReply] = js.native
  def create(callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def create(params: ParamsResourceRepliesCreate): GaxiosPromise[SchemaReply] = js.native
  def create(params: ParamsResourceRepliesCreate, callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def create(
    params: ParamsResourceRepliesCreate,
    options: BodyResponseCallback[SchemaReply],
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  def create(params: ParamsResourceRepliesCreate, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def create(
    params: ParamsResourceRepliesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  
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
    * @desc Gets a reply by ID.
    * @alias drive.replies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to return deleted replies. Deleted replies will not include their original content.
    * @param {string} params.replyId The ID of the reply.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReply] = js.native
  def get(callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def get(params: ParamsResourceRepliesGet): GaxiosPromise[SchemaReply] = js.native
  def get(params: ParamsResourceRepliesGet, callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: BodyResponseCallback[SchemaReply],
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  def get(params: ParamsResourceRepliesGet, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  
  /**
    * drive.replies.list
    * @desc Lists a comment's replies.
    * @alias drive.replies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to include deleted replies. Deleted replies will not include their original content.
    * @param {integer=} params.pageSize The maximum number of replies to return per page.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaReplyList] = js.native
  def list(callback: BodyResponseCallback[SchemaReplyList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReplyList] = js.native
  def list(params: ParamsResourceRepliesList): GaxiosPromise[SchemaReplyList] = js.native
  def list(params: ParamsResourceRepliesList, callback: BodyResponseCallback[SchemaReplyList]): Unit = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: BodyResponseCallback[SchemaReplyList],
    callback: BodyResponseCallback[SchemaReplyList]
  ): Unit = js.native
  def list(params: ParamsResourceRepliesList, options: MethodOptions): GaxiosPromise[SchemaReplyList] = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplyList]
  ): Unit = js.native
  
  /**
    * drive.replies.update
    * @desc Updates a reply with patch semantics.
    * @alias drive.replies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {().Reply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaReply] = js.native
  def update(callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def update(params: ParamsResourceRepliesUpdate): GaxiosPromise[SchemaReply] = js.native
  def update(params: ParamsResourceRepliesUpdate, callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: BodyResponseCallback[SchemaReply],
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  def update(params: ParamsResourceRepliesUpdate, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
}
