package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Sendas")
@js.native
class ResourceUsersSettingsSendas protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var smimeInfo: ResourceUsersSettingsSendasSmimeinfo = js.native
  /**
    * gmail.users.settings.sendAs.create
    * @desc Creates a custom "from" send-as alias. If an SMTP MSA is specified,
    * Gmail will attempt to connect to the SMTP service to validate the
    * configuration before creating the alias. If ownership verification is
    * required for the alias, a message will be sent to the email address and
    * the resource's verification status will be set to pending; otherwise, the
    * resource will be created with verification status set to accepted. If a
    * signature is provided, Gmail will sanitize the HTML before saving it with
    * the alias.  This method is only available to service account clients that
    * have been delegated domain-wide authority.
    * @alias gmail.users.settings.sendAs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().SendAs} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaSendAs] = js.native
  def create(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def create(params: ParamsResourceUsersSettingsSendasCreate): GaxiosPromise[SchemaSendAs] = js.native
  def create(params: ParamsResourceUsersSettingsSendasCreate, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsSendasCreate,
    options: BodyResponseCallback[SchemaSendAs],
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsSendasCreate, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def create(
    params: ParamsResourceUsersSettingsSendasCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.delete
    * @desc Deletes the specified send-as alias. Revokes any verification that
    * may have been required for using it.  This method is only available to
    * service account clients that have been delegated domain-wide authority.
    * @alias gmail.users.settings.sendAs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The send-as alias to be deleted.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsSendasDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsSendasDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsSendasDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsSendasDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.get
    * @desc Gets the specified send-as alias. Fails with an HTTP 404 error if
    * the specified address is not a member of the collection.
    * @alias gmail.users.settings.sendAs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The send-as alias to be retrieved.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSendAs] = js.native
  def get(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def get(params: ParamsResourceUsersSettingsSendasGet): GaxiosPromise[SchemaSendAs] = js.native
  def get(params: ParamsResourceUsersSettingsSendasGet, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasGet,
    options: BodyResponseCallback[SchemaSendAs],
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsSendasGet, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def get(
    params: ParamsResourceUsersSettingsSendasGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.list
    * @desc Lists the send-as aliases for the specified account. The result
    * includes the primary send-as address associated with the account as well
    * as any custom "from" aliases.
    * @alias gmail.users.settings.sendAs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSendAsResponse]): Unit = js.native
  def list(params: ParamsResourceUsersSettingsSendasList): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    callback: BodyResponseCallback[SchemaListSendAsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    options: BodyResponseCallback[SchemaListSendAsResponse],
    callback: BodyResponseCallback[SchemaListSendAsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsSendasList, options: MethodOptions): GaxiosPromise[SchemaListSendAsResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsSendasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSendAsResponse]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.patch
    * @desc Updates a send-as alias. If a signature is provided, Gmail will
    * sanitize the HTML before saving it with the alias.  Addresses other than
    * the primary address for the account can only be updated by service
    * account clients that have been delegated domain-wide authority. This
    * method supports patch semantics.
    * @alias gmail.users.settings.sendAs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The send-as alias to be updated.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().SendAs} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSendAs] = js.native
  def patch(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def patch(params: ParamsResourceUsersSettingsSendasPatch): GaxiosPromise[SchemaSendAs] = js.native
  def patch(params: ParamsResourceUsersSettingsSendasPatch, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def patch(
    params: ParamsResourceUsersSettingsSendasPatch,
    options: BodyResponseCallback[SchemaSendAs],
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersSettingsSendasPatch, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def patch(
    params: ParamsResourceUsersSettingsSendasPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.update
    * @desc Updates a send-as alias. If a signature is provided, Gmail will
    * sanitize the HTML before saving it with the alias.  Addresses other than
    * the primary address for the account can only be updated by service
    * account clients that have been delegated domain-wide authority.
    * @alias gmail.users.settings.sendAs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The send-as alias to be updated.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().SendAs} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSendAs] = js.native
  def update(callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def update(params: ParamsResourceUsersSettingsSendasUpdate): GaxiosPromise[SchemaSendAs] = js.native
  def update(params: ParamsResourceUsersSettingsSendasUpdate, callback: BodyResponseCallback[SchemaSendAs]): Unit = js.native
  def update(
    params: ParamsResourceUsersSettingsSendasUpdate,
    options: BodyResponseCallback[SchemaSendAs],
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  def update(params: ParamsResourceUsersSettingsSendasUpdate, options: MethodOptions): GaxiosPromise[SchemaSendAs] = js.native
  def update(
    params: ParamsResourceUsersSettingsSendasUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSendAs]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.verify
    * @desc Sends a verification email to the specified send-as alias address.
    * The verification status must be pending.  This method is only available
    * to service account clients that have been delegated domain-wide
    * authority.
    * @alias gmail.users.settings.sendAs.verify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The send-as alias to be verified.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verify(): GaxiosPromise[Unit] = js.native
  def verify(callback: BodyResponseCallback[Unit]): Unit = js.native
  def verify(params: ParamsResourceUsersSettingsSendasVerify): GaxiosPromise[Unit] = js.native
  def verify(params: ParamsResourceUsersSettingsSendasVerify, callback: BodyResponseCallback[Unit]): Unit = js.native
  def verify(
    params: ParamsResourceUsersSettingsSendasVerify,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def verify(params: ParamsResourceUsersSettingsSendasVerify, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def verify(
    params: ParamsResourceUsersSettingsSendasVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

