package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Comments")
@js.native
class ResourceComments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.comments.create
    * @desc Creates a new comment on a file.
    * @alias drive.comments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaComment] = js.native
  def create(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def create(params: ParamsResourceCommentsCreate): GaxiosPromise[SchemaComment] = js.native
  def create(params: ParamsResourceCommentsCreate, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def create(
    params: ParamsResourceCommentsCreate,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def create(params: ParamsResourceCommentsCreate, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def create(
    params: ParamsResourceCommentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  
  /**
    * drive.comments.delete
    * @desc Deletes a comment.
    * @alias drive.comments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
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
    * drive.comments.get
    * @desc Gets a comment by ID.
    * @alias drive.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to return deleted comments. Deleted comments will not include their original content.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaComment] = js.native
  def get(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
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
    * drive.comments.list
    * @desc Lists a file's comments.
    * @alias drive.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to include deleted comments. Deleted comments will not include their original content.
    * @param {integer=} params.pageSize The maximum number of comments to return per page.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {string=} params.startModifiedTime The minimum value of 'modifiedTime' for the result comments (RFC 3339 date-time).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCommentList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[SchemaCommentList],
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  
  /**
    * drive.comments.update
    * @desc Updates a comment with patch semantics.
    * @alias drive.comments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaComment] = js.native
  def update(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
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
