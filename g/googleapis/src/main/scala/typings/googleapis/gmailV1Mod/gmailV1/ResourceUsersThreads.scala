package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Threads")
@js.native
class ResourceUsersThreads protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * gmail.users.threads.delete
    * @desc Immediately and permanently deletes the specified thread. This
    * operation cannot be undone. Prefer threads.trash instead.
    * @alias gmail.users.threads.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id ID of the Thread to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersThreadsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersThreadsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersThreadsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersThreadsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersThreadsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * gmail.users.threads.get
    * @desc Gets the specified thread.
    * @alias gmail.users.threads.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format The format to return the messages in.
    * @param {string} params.id The ID of the thread to retrieve.
    * @param {string=} params.metadataHeaders When given and format is METADATA, only include headers specified.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaThread] = js.native
  def get(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def get(params: ParamsResourceUsersThreadsGet): GaxiosPromise[SchemaThread] = js.native
  def get(params: ParamsResourceUsersThreadsGet, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def get(
    params: ParamsResourceUsersThreadsGet,
    options: BodyResponseCallback[SchemaThread],
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  def get(params: ParamsResourceUsersThreadsGet, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def get(
    params: ParamsResourceUsersThreadsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  
  /**
    * gmail.users.threads.list
    * @desc Lists the threads in the user's mailbox.
    * @alias gmail.users.threads.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSpamTrash Include threads from SPAM and TRASH in the results.
    * @param {string=} params.labelIds Only return threads with labels that match all of the specified label IDs.
    * @param {integer=} params.maxResults Maximum number of threads to return.
    * @param {string=} params.pageToken Page token to retrieve a specific page of results in the list.
    * @param {string=} params.q Only return threads matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com rfc822msgid: is:unread". Parameter cannot be used when accessing the api using the gmail.metadata scope.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListThreadsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(params: ParamsResourceUsersThreadsList): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(params: ParamsResourceUsersThreadsList, callback: BodyResponseCallback[SchemaListThreadsResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersThreadsList,
    options: BodyResponseCallback[SchemaListThreadsResponse],
    callback: BodyResponseCallback[SchemaListThreadsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersThreadsList, options: MethodOptions): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(
    params: ParamsResourceUsersThreadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListThreadsResponse]
  ): Unit = js.native
  
  /**
    * gmail.users.threads.modify
    * @desc Modifies the labels applied to the thread. This applies to all
    * messages in the thread.
    * @alias gmail.users.threads.modify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the thread to modify.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().ModifyThreadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modify(): GaxiosPromise[SchemaThread] = js.native
  def modify(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def modify(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def modify(params: ParamsResourceUsersThreadsModify): GaxiosPromise[SchemaThread] = js.native
  def modify(params: ParamsResourceUsersThreadsModify, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def modify(
    params: ParamsResourceUsersThreadsModify,
    options: BodyResponseCallback[SchemaThread],
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  def modify(params: ParamsResourceUsersThreadsModify, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def modify(
    params: ParamsResourceUsersThreadsModify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  
  /**
    * gmail.users.threads.trash
    * @desc Moves the specified thread to the trash.
    * @alias gmail.users.threads.trash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the thread to Trash.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def trash(): GaxiosPromise[SchemaThread] = js.native
  def trash(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def trash(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def trash(params: ParamsResourceUsersThreadsTrash): GaxiosPromise[SchemaThread] = js.native
  def trash(params: ParamsResourceUsersThreadsTrash, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def trash(
    params: ParamsResourceUsersThreadsTrash,
    options: BodyResponseCallback[SchemaThread],
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  def trash(params: ParamsResourceUsersThreadsTrash, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def trash(
    params: ParamsResourceUsersThreadsTrash,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  
  /**
    * gmail.users.threads.untrash
    * @desc Removes the specified thread from the trash.
    * @alias gmail.users.threads.untrash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the thread to remove from Trash.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def untrash(): GaxiosPromise[SchemaThread] = js.native
  def untrash(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def untrash(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def untrash(params: ParamsResourceUsersThreadsUntrash): GaxiosPromise[SchemaThread] = js.native
  def untrash(params: ParamsResourceUsersThreadsUntrash, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def untrash(
    params: ParamsResourceUsersThreadsUntrash,
    options: BodyResponseCallback[SchemaThread],
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  def untrash(params: ParamsResourceUsersThreadsUntrash, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def untrash(
    params: ParamsResourceUsersThreadsUntrash,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
}
