package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Members")
@js.native
class ResourceMembers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.members.delete
    * @desc Remove membership.
    * @alias directory.members.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {string} params.memberKey Email or immutable ID of the member
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMembersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMembersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceMembersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceMembersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceMembersDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * directory.members.get
    * @desc Retrieve Group Member
    * @alias directory.members.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {string} params.memberKey Email or immutable ID of the member
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMember] = js.native
  def get(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def get(params: ParamsResourceMembersGet): GaxiosPromise[SchemaMember] = js.native
  def get(params: ParamsResourceMembersGet, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def get(
    params: ParamsResourceMembersGet,
    options: BodyResponseCallback[SchemaMember],
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  def get(params: ParamsResourceMembersGet, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def get(
    params: ParamsResourceMembersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  
  /**
    * directory.members.hasMember
    * @desc Checks whether the given user is a member of the group. Membership
    * can be direct or nested.
    * @alias directory.members.hasMember
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    * @param {string} params.memberKey Identifies the user member in the API request. The value can be the user's primary email address, alias, or unique ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def hasMember(): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(callback: BodyResponseCallback[SchemaMembersHasMember]): Unit = js.native
  def hasMember(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(params: ParamsResourceMembersHasmember): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(params: ParamsResourceMembersHasmember, callback: BodyResponseCallback[SchemaMembersHasMember]): Unit = js.native
  def hasMember(
    params: ParamsResourceMembersHasmember,
    options: BodyResponseCallback[SchemaMembersHasMember],
    callback: BodyResponseCallback[SchemaMembersHasMember]
  ): Unit = js.native
  def hasMember(params: ParamsResourceMembersHasmember, options: MethodOptions): GaxiosPromise[SchemaMembersHasMember] = js.native
  def hasMember(
    params: ParamsResourceMembersHasmember,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembersHasMember]
  ): Unit = js.native
  
  /**
    * directory.members.insert
    * @desc Add user to the specified group.
    * @alias directory.members.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {().Member} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaMember] = js.native
  def insert(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def insert(params: ParamsResourceMembersInsert): GaxiosPromise[SchemaMember] = js.native
  def insert(params: ParamsResourceMembersInsert, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def insert(
    params: ParamsResourceMembersInsert,
    options: BodyResponseCallback[SchemaMember],
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  def insert(params: ParamsResourceMembersInsert, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def insert(
    params: ParamsResourceMembersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  
  /**
    * directory.members.list
    * @desc Retrieve all members in a group (paginated)
    * @alias directory.members.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {boolean=} params.includeDerivedMembership Whether to list indirect memberships. Default: false.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 200
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.roles Comma separated role values to filter list results on.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMembers] = js.native
  def list(callback: BodyResponseCallback[SchemaMembers]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMembers] = js.native
  def list(params: ParamsResourceMembersList): GaxiosPromise[SchemaMembers] = js.native
  def list(params: ParamsResourceMembersList, callback: BodyResponseCallback[SchemaMembers]): Unit = js.native
  def list(
    params: ParamsResourceMembersList,
    options: BodyResponseCallback[SchemaMembers],
    callback: BodyResponseCallback[SchemaMembers]
  ): Unit = js.native
  def list(params: ParamsResourceMembersList, options: MethodOptions): GaxiosPromise[SchemaMembers] = js.native
  def list(
    params: ParamsResourceMembersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembers]
  ): Unit = js.native
  
  /**
    * directory.members.patch
    * @desc Update membership of a user in the specified group. This method
    * supports patch semantics.
    * @alias directory.members.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {string} params.memberKey Email or immutable ID of the user. If ID, it should match with id of member object
    * @param {().Member} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaMember] = js.native
  def patch(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def patch(params: ParamsResourceMembersPatch): GaxiosPromise[SchemaMember] = js.native
  def patch(params: ParamsResourceMembersPatch, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def patch(
    params: ParamsResourceMembersPatch,
    options: BodyResponseCallback[SchemaMember],
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  def patch(params: ParamsResourceMembersPatch, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def patch(
    params: ParamsResourceMembersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  
  /**
    * directory.members.update
    * @desc Update membership of a user in the specified group.
    * @alias directory.members.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {string} params.memberKey Email or immutable ID of the user. If ID, it should match with id of member object
    * @param {().Member} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaMember] = js.native
  def update(callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def update(params: ParamsResourceMembersUpdate): GaxiosPromise[SchemaMember] = js.native
  def update(params: ParamsResourceMembersUpdate, callback: BodyResponseCallback[SchemaMember]): Unit = js.native
  def update(
    params: ParamsResourceMembersUpdate,
    options: BodyResponseCallback[SchemaMember],
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
  def update(params: ParamsResourceMembersUpdate, options: MethodOptions): GaxiosPromise[SchemaMember] = js.native
  def update(
    params: ParamsResourceMembersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMember]
  ): Unit = js.native
}
