package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Drafts")
@js.native
class ResourceUsersDrafts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.drafts.create
    * @desc Creates a new draft with the DRAFT label.
    * @alias gmail.users.drafts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaDraft] = js.native
  def create(callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def create(params: ParamsResourceUsersDraftsCreate): GaxiosPromise[SchemaDraft] = js.native
  def create(params: ParamsResourceUsersDraftsCreate, callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def create(
    params: ParamsResourceUsersDraftsCreate,
    options: BodyResponseCallback[SchemaDraft],
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  def create(params: ParamsResourceUsersDraftsCreate, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def create(
    params: ParamsResourceUsersDraftsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  /**
    * gmail.users.drafts.delete
    * @desc Immediately and permanently deletes the specified draft. Does not
    * simply trash it.
    * @alias gmail.users.drafts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the draft to delete.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDraftsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDraftsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDraftsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDraftsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersDraftsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.drafts.get
    * @desc Gets the specified draft.
    * @alias gmail.users.drafts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format The format to return the draft in.
    * @param {string} params.id The ID of the draft to retrieve.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDraft] = js.native
  def get(callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def get(params: ParamsResourceUsersDraftsGet): GaxiosPromise[SchemaDraft] = js.native
  def get(params: ParamsResourceUsersDraftsGet, callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def get(
    params: ParamsResourceUsersDraftsGet,
    options: BodyResponseCallback[SchemaDraft],
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  def get(params: ParamsResourceUsersDraftsGet, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def get(
    params: ParamsResourceUsersDraftsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  /**
    * gmail.users.drafts.list
    * @desc Lists the drafts in the user's mailbox.
    * @alias gmail.users.drafts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSpamTrash Include drafts from SPAM and TRASH in the results.
    * @param {integer=} params.maxResults Maximum number of drafts to return.
    * @param {string=} params.pageToken Page token to retrieve a specific page of results in the list.
    * @param {string=} params.q Only return draft messages matching the specified query. Supports the same query format as the Gmail search box. For example, "from:someuser@example.com rfc822msgid: is:unread".
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDraftsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(params: ParamsResourceUsersDraftsList): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(params: ParamsResourceUsersDraftsList, callback: BodyResponseCallback[SchemaListDraftsResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersDraftsList,
    options: BodyResponseCallback[SchemaListDraftsResponse],
    callback: BodyResponseCallback[SchemaListDraftsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersDraftsList, options: MethodOptions): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(
    params: ParamsResourceUsersDraftsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDraftsResponse]
  ): Unit = js.native
  /**
    * gmail.users.drafts.send
    * @desc Sends the specified, existing draft to the recipients in the To,
    * Cc, and Bcc headers.
    * @alias gmail.users.drafts.send
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def send(): GaxiosPromise[SchemaMessage] = js.native
  def send(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceUsersDraftsSend): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceUsersDraftsSend, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(
    params: ParamsResourceUsersDraftsSend,
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def send(params: ParamsResourceUsersDraftsSend, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(
    params: ParamsResourceUsersDraftsSend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * gmail.users.drafts.update
    * @desc Replaces a draft's content.
    * @alias gmail.users.drafts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the draft to update.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaDraft] = js.native
  def update(callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def update(params: ParamsResourceUsersDraftsUpdate): GaxiosPromise[SchemaDraft] = js.native
  def update(params: ParamsResourceUsersDraftsUpdate, callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def update(
    params: ParamsResourceUsersDraftsUpdate,
    options: BodyResponseCallback[SchemaDraft],
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  def update(params: ParamsResourceUsersDraftsUpdate, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def update(
    params: ParamsResourceUsersDraftsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
}

