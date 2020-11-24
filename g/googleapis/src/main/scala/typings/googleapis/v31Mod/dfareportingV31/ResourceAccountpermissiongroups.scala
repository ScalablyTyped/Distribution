package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Accountpermissiongroups")
@js.native
class ResourceAccountpermissiongroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.accountPermissionGroups.get
    * @desc Gets one account permission group by ID.
    * @alias dfareporting.accountPermissionGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account permission group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountPermissionGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(params: ParamsResourceAccountpermissiongroupsGet): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    callback: BodyResponseCallback[SchemaAccountPermissionGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    options: BodyResponseCallback[SchemaAccountPermissionGroup],
    callback: BodyResponseCallback[SchemaAccountPermissionGroup]
  ): Unit = js.native
  def get(params: ParamsResourceAccountpermissiongroupsGet, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroup] = js.native
  def get(
    params: ParamsResourceAccountpermissiongroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermissionGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.accountPermissionGroups.list
    * @desc Retrieves the list of account permission groups.
    * @alias dfareporting.accountPermissionGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(params: ParamsResourceAccountpermissiongroupsList): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    options: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse],
    callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountpermissiongroupsList, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissiongroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermissionGroupsListResponse]
  ): Unit = js.native
}
