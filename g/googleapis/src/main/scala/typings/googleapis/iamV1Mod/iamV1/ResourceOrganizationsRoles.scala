package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Organizations$Roles")
@js.native
class ResourceOrganizationsRoles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * iam.organizations.roles.create
    * @desc Creates a new Role.
    * @alias iam.organizations.roles.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The resource name of the parent resource in one of the following formats: `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    * @param {().CreateRoleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaRole] = js.native
  def create(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def create(params: ParamsResourceOrganizationsRolesCreate): GaxiosPromise[SchemaRole] = js.native
  def create(params: ParamsResourceOrganizationsRolesCreate, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsRolesCreate,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsRolesCreate, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def create(
    params: ParamsResourceOrganizationsRolesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  
  /**
    * iam.organizations.roles.delete
    * @desc Soft deletes a role. The role is suspended and cannot be used to
    * create new IAM Policy Bindings. The Role will not be included in
    * `ListRoles()` unless `show_deleted` is set in the `ListRolesRequest`. The
    * Role contains the deleted boolean set. Existing Bindings remains, but are
    * inactive. The Role can be undeleted within 7 days. After 7 days the Role
    * is deleted and all Bindings associated with the role are removed.
    * @alias iam.organizations.roles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.etag Used to perform a consistent read-modify-write.
    * @param {string} params.name The resource name of the role in one of the following formats: `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaRole] = js.native
  def delete(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def delete(params: ParamsResourceOrganizationsRolesDelete): GaxiosPromise[SchemaRole] = js.native
  def delete(params: ParamsResourceOrganizationsRolesDelete, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsRolesDelete,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsRolesDelete, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def delete(
    params: ParamsResourceOrganizationsRolesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  
  /**
    * iam.organizations.roles.get
    * @desc Gets a Role definition.
    * @alias iam.organizations.roles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the role in one of the following formats: `roles/{ROLE_NAME}` `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRole] = js.native
  def get(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceOrganizationsRolesGet): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceOrganizationsRolesGet, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsRolesGet,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsRolesGet, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(
    params: ParamsResourceOrganizationsRolesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  
  /**
    * iam.organizations.roles.list
    * @desc Lists the Roles defined on a resource.
    * @alias iam.organizations.roles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional limit on the number of roles to include in the response.
    * @param {string=} params.pageToken Optional pagination token returned in an earlier ListRolesResponse.
    * @param {string} params.parent The resource name of the parent resource in one of the following formats: `` (empty string) -- this refers to curated roles. `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    * @param {boolean=} params.showDeleted Include Roles that have been deleted.
    * @param {string=} params.view Optional view for the returned Role objects. When `FULL` is specified, the `includedPermissions` field is returned, which includes a list of all permissions in the role. The default value is `BASIC`, which does not return the `includedPermissions` field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRolesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(params: ParamsResourceOrganizationsRolesList): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    callback: BodyResponseCallback[SchemaListRolesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    options: BodyResponseCallback[SchemaListRolesResponse],
    callback: BodyResponseCallback[SchemaListRolesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsRolesList, options: MethodOptions): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRolesResponse]
  ): Unit = js.native
  
  /**
    * iam.organizations.roles.patch
    * @desc Updates a Role definition.
    * @alias iam.organizations.roles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the role in one of the following formats: `roles/{ROLE_NAME}` `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {string=} params.updateMask A mask describing which fields in the Role have changed.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRole] = js.native
  def patch(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceOrganizationsRolesPatch): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceOrganizationsRolesPatch, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsRolesPatch,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsRolesPatch, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(
    params: ParamsResourceOrganizationsRolesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  
  /**
    * iam.organizations.roles.undelete
    * @desc Undelete a Role, bringing it back in its previous state.
    * @alias iam.organizations.roles.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the role in one of the following formats: `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}` `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    * @param {().UndeleteRoleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[SchemaRole] = js.native
  def undelete(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def undelete(params: ParamsResourceOrganizationsRolesUndelete): GaxiosPromise[SchemaRole] = js.native
  def undelete(params: ParamsResourceOrganizationsRolesUndelete, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def undelete(
    params: ParamsResourceOrganizationsRolesUndelete,
    options: BodyResponseCallback[SchemaRole],
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  def undelete(params: ParamsResourceOrganizationsRolesUndelete, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def undelete(
    params: ParamsResourceOrganizationsRolesUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
}
