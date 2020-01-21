package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Delegates")
@js.native
class ResourceUsersSettingsDelegates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.settings.delegates.create
    * @desc Adds a delegate with its verification status set directly to
    * accepted, without sending any verification email. The delegate user must
    * be a member of the same G Suite organization as the delegator user. Gmail
    * imposes limtations on the number of delegates and delegators each user in
    * a G Suite organization can have. These limits depend on your
    * organization, but in general each user can have up to 25 delegates and up
    * to 10 delegators.  Note that a delegate user must be referred to by their
    * primary email address, and not an email alias.  Also note that when a new
    * delegate is created, there may be up to a one minute delay before the new
    * delegate is available for use.  This method is only available to service
    * account clients that have been delegated domain-wide authority.
    * @alias gmail.users.settings.delegates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().Delegate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaDelegate] = js.native
  def create(callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def create(params: ParamsResourceUsersSettingsDelegatesCreate): GaxiosPromise[SchemaDelegate] = js.native
  def create(params: ParamsResourceUsersSettingsDelegatesCreate, callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsDelegatesCreate,
    options: BodyResponseCallback[SchemaDelegate],
    callback: BodyResponseCallback[SchemaDelegate]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsDelegatesCreate, options: MethodOptions): GaxiosPromise[SchemaDelegate] = js.native
  def create(
    params: ParamsResourceUsersSettingsDelegatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDelegate]
  ): Unit = js.native
  /**
    * gmail.users.settings.delegates.delete
    * @desc Removes the specified delegate (which can be of any verification
    * status), and revokes any verification that may have been required for
    * using it.  Note that a delegate user must be referred to by their primary
    * email address, and not an email alias.  This method is only available to
    * service account clients that have been delegated domain-wide authority.
    * @alias gmail.users.settings.delegates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.delegateEmail The email address of the user to be removed as a delegate.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsDelegatesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsDelegatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.settings.delegates.get
    * @desc Gets the specified delegate.  Note that a delegate user must be
    * referred to by their primary email address, and not an email alias.  This
    * method is only available to service account clients that have been
    * delegated domain-wide authority.
    * @alias gmail.users.settings.delegates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.delegateEmail The email address of the user whose delegate relationship is to be retrieved.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDelegate] = js.native
  def get(callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def get(params: ParamsResourceUsersSettingsDelegatesGet): GaxiosPromise[SchemaDelegate] = js.native
  def get(params: ParamsResourceUsersSettingsDelegatesGet, callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsDelegatesGet,
    options: BodyResponseCallback[SchemaDelegate],
    callback: BodyResponseCallback[SchemaDelegate]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsDelegatesGet, options: MethodOptions): GaxiosPromise[SchemaDelegate] = js.native
  def get(
    params: ParamsResourceUsersSettingsDelegatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDelegate]
  ): Unit = js.native
  /**
    * gmail.users.settings.delegates.list
    * @desc Lists the delegates for the specified account.  This method is only
    * available to service account clients that have been delegated domain-wide
    * authority.
    * @alias gmail.users.settings.delegates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDelegatesResponse]): Unit = js.native
  def list(params: ParamsResourceUsersSettingsDelegatesList): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    callback: BodyResponseCallback[SchemaListDelegatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    options: BodyResponseCallback[SchemaListDelegatesResponse],
    callback: BodyResponseCallback[SchemaListDelegatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsDelegatesList, options: MethodOptions): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDelegatesResponse]
  ): Unit = js.native
}

