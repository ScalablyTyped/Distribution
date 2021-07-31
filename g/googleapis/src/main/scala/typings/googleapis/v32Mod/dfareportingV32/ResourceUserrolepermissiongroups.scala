package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Userrolepermissiongroups")
@js.native
class ResourceUserrolepermissiongroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.userRolePermissionGroups.get
    * @desc Gets one user role permission group by ID.
    * @alias dfareporting.userRolePermissionGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role permission group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaUserRolePermissionGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(params: ParamsResourceUserrolepermissiongroupsGet): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    options: BodyResponseCallback[SchemaUserRolePermissionGroup],
    callback: BodyResponseCallback[SchemaUserRolePermissionGroup]
  ): Unit = js.native
  def get(params: ParamsResourceUserrolepermissiongroupsGet, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroup] = js.native
  def get(
    params: ParamsResourceUserrolepermissiongroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.userRolePermissionGroups.list
    * @desc Gets a list of all supported user role permission groups.
    * @alias dfareporting.userRolePermissionGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(params: ParamsResourceUserrolepermissiongroupsList): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    options: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse],
    callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserrolepermissiongroupsList, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissiongroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermissionGroupsListResponse]
  ): Unit = js.native
}
