package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Groups")
@js.native
class ResourceGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var aliases: ResourceGroupsAliases = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.groups.delete
    * @desc Delete Group
    * @alias directory.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.groups.get
    * @desc Retrieve Group
    * @alias directory.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def get(params: ParamsResourceGroupsGet): GaxiosPromise[SchemaGroup] = js.native
  def get(params: ParamsResourceGroupsGet, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def get(
    params: ParamsResourceGroupsGet,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def get(params: ParamsResourceGroupsGet, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def get(
    params: ParamsResourceGroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  
  /**
    * directory.groups.insert
    * @desc Create Group
    * @alias directory.groups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def insert(params: ParamsResourceGroupsInsert): GaxiosPromise[SchemaGroup] = js.native
  def insert(params: ParamsResourceGroupsInsert, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupsInsert, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  
  /**
    * directory.groups.list
    * @desc Retrieve all groups of a domain or of a user given a userKey
    * (paginated)
    * @alias directory.groups.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customer Immutable ID of the G Suite account. In case of multi-domain, to fetch all groups for a customer, fill this field instead of domain.
    * @param {string=} params.domain Name of the domain. Fill this field to get groups from only this domain. To return all groups in a multi-domain fill customer field instead.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 200
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.query Query string search. Should be of the form "". Complete documentation is at https://developers.google.com/admin-sdk/directory/v1/guides/search-groups
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order. Only of use when orderBy is also used
    * @param {string=} params.userKey Email or immutable Id of the user if only those groups are to be listed, the given user is a member of. If Id, it should match with id of user object
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGroups] = js.native
  def list(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def list(params: ParamsResourceGroupsList): GaxiosPromise[SchemaGroups] = js.native
  def list(params: ParamsResourceGroupsList, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: BodyResponseCallback[SchemaGroups],
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsList, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroups]
  ): Unit = js.native
  
  /**
    * directory.groups.patch
    * @desc Update Group. This method supports patch semantics.
    * @alias directory.groups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def patch(params: ParamsResourceGroupsPatch): GaxiosPromise[SchemaGroup] = js.native
  def patch(params: ParamsResourceGroupsPatch, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def patch(
    params: ParamsResourceGroupsPatch,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceGroupsPatch, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def patch(
    params: ParamsResourceGroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  
  /**
    * directory.groups.update
    * @desc Update Group
    * @alias directory.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceGroupsUpdate): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceGroupsUpdate, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def update(params: ParamsResourceGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
}
