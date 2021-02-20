package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users")
@js.native
class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var aliases: ResourceUsersAliases = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.users.delete
    * @desc Delete user
    * @alias directory.users.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.users.get
    * @desc retrieve user
    * @alias directory.users.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customFieldMask Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    * @param {string=} params.projection What subset of fields to fetch for this user.
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {string=} params.viewType Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUser] = js.native
  def get(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  
  /**
    * directory.users.insert
    * @desc create user.
    * @alias directory.users.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaUser] = js.native
  def insert(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersInsert, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  
  /**
    * directory.users.list
    * @desc Retrieve either deleted users or all users in a domain (paginated)
    * @alias directory.users.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customer Immutable ID of the G Suite account. In case of multi-domain, to fetch all users for a customer, fill this field instead of domain.
    * @param {string=} params.customFieldMask Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    * @param {string=} params.domain Name of the domain. Fill this field to get users from only this domain. To return all users in a multi-domain fill customer field instead.
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100. Max allowed is 500
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection What subset of fields to fetch for this user.
    * @param {string=} params.query Query string search. Should be of the form "". Complete documentation is at https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    * @param {string=} params.showDeleted If set to true retrieves the list of deleted users. Default is false
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order.
    * @param {string=} params.viewType Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUsers] = js.native
  def list(callback: BodyResponseCallback[SchemaUsers]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsers] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaUsers] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaUsers]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[SchemaUsers],
    callback: BodyResponseCallback[SchemaUsers]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaUsers] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsers]
  ): Unit = js.native
  
  /**
    * directory.users.makeAdmin
    * @desc change admin status of a user
    * @alias directory.users.makeAdmin
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user as admin
    * @param {().UserMakeAdmin} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def makeAdmin(): GaxiosPromise[Unit] = js.native
  def makeAdmin(callback: BodyResponseCallback[Unit]): Unit = js.native
  def makeAdmin(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin, callback: BodyResponseCallback[Unit]): Unit = js.native
  def makeAdmin(
    params: ParamsResourceUsersMakeadmin,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsResourceUsersMakeadmin, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.users.patch
    * @desc update user. This method supports patch semantics.
    * @alias directory.users.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user. If ID, it should match with id of user object
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaUser] = js.native
  def patch(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersPatch, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  
  var photos: ResourceUsersPhotos = js.native
  
  /**
    * directory.users.undelete
    * @desc Undelete a deleted user
    * @alias directory.users.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey The immutable id of the user
    * @param {().UserUndelete} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Unit] = js.native
  def undelete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def undelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsResourceUsersUndelete): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsResourceUsersUndelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def undelete(
    params: ParamsResourceUsersUndelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def undelete(params: ParamsResourceUsersUndelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsResourceUsersUndelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.users.update
    * @desc update user
    * @alias directory.users.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user. If ID, it should match with id of user object
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaUser] = js.native
  def update(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def update(params: ParamsResourceUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  
  /**
    * directory.users.watch
    * @desc Watch for changes in users list
    * @alias directory.users.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customer Immutable ID of the G Suite account. In case of multi-domain, to fetch all users for a customer, fill this field instead of domain.
    * @param {string=} params.customFieldMask Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    * @param {string=} params.domain Name of the domain. Fill this field to get users from only this domain. To return all users in a multi-domain fill customer field instead.
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100. Max allowed is 500
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection What subset of fields to fetch for this user.
    * @param {string=} params.query Query string search. Should be of the form "". Complete documentation is at https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    * @param {string=} params.showDeleted If set to true retrieves the list of deleted users. Default is false
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order.
    * @param {string=} params.viewType Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceUsersWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceUsersWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceUsersWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceUsersWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
