package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Forwardingaddresses")
@js.native
class ResourceUsersSettingsForwardingaddresses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.settings.forwardingAddresses.create
    * @desc Creates a forwarding address. If ownership verification is
    * required, a message will be sent to the recipient and the resource's
    * verification status will be set to pending; otherwise, the resource will
    * be created with verification status set to accepted.  This method is only
    * available to service account clients that have been delegated domain-wide
    * authority.
    * @alias gmail.users.settings.forwardingAddresses.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().ForwardingAddress} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(callback: BodyResponseCallback[SchemaForwardingAddress]): Unit = js.native
  def create(params: ParamsResourceUsersSettingsForwardingaddressesCreate): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    options: BodyResponseCallback[SchemaForwardingAddress],
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsForwardingaddressesCreate, options: MethodOptions): GaxiosPromise[SchemaForwardingAddress] = js.native
  def create(
    params: ParamsResourceUsersSettingsForwardingaddressesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  /**
    * gmail.users.settings.forwardingAddresses.delete
    * @desc Deletes the specified forwarding address and revokes any
    * verification that may have been required.  This method is only available
    * to service account clients that have been delegated domain-wide
    * authority.
    * @alias gmail.users.settings.forwardingAddresses.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingEmail The forwarding address to be deleted.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsForwardingaddressesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsForwardingaddressesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsForwardingaddressesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.settings.forwardingAddresses.get
    * @desc Gets the specified forwarding address.
    * @alias gmail.users.settings.forwardingAddresses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingEmail The forwarding address to be retrieved.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(callback: BodyResponseCallback[SchemaForwardingAddress]): Unit = js.native
  def get(params: ParamsResourceUsersSettingsForwardingaddressesGet): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    options: BodyResponseCallback[SchemaForwardingAddress],
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsForwardingaddressesGet, options: MethodOptions): GaxiosPromise[SchemaForwardingAddress] = js.native
  def get(
    params: ParamsResourceUsersSettingsForwardingaddressesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaForwardingAddress]
  ): Unit = js.native
  /**
    * gmail.users.settings.forwardingAddresses.list
    * @desc Lists the forwarding addresses for the specified account.
    * @alias gmail.users.settings.forwardingAddresses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]): Unit = js.native
  def list(params: ParamsResourceUsersSettingsForwardingaddressesList): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    options: BodyResponseCallback[SchemaListForwardingAddressesResponse],
    callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsForwardingaddressesList, options: MethodOptions): GaxiosPromise[SchemaListForwardingAddressesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsForwardingaddressesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListForwardingAddressesResponse]
  ): Unit = js.native
}

