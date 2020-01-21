package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Userrolepermissions")
@js.native
class ResourceUserrolepermissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.userRolePermissions.get
    * @desc Gets one user role permission by ID.
    * @alias dfareporting.userRolePermissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role permission ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(callback: BodyResponseCallback[SchemaUserRolePermission]): Unit = js.native
  def get(params: ParamsResourceUserrolepermissionsGet): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    callback: BodyResponseCallback[SchemaUserRolePermission]
  ): Unit = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    options: BodyResponseCallback[SchemaUserRolePermission],
    callback: BodyResponseCallback[SchemaUserRolePermission]
  ): Unit = js.native
  def get(params: ParamsResourceUserrolepermissionsGet, options: MethodOptions): GaxiosPromise[SchemaUserRolePermission] = js.native
  def get(
    params: ParamsResourceUserrolepermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermission]
  ): Unit = js.native
  /**
    * dfareporting.userRolePermissions.list
    * @desc Gets a list of user role permissions, possibly filtered.
    * @alias dfareporting.userRolePermissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only user role permissions with these IDs.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]): Unit = js.native
  def list(params: ParamsResourceUserrolepermissionsList): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    options: BodyResponseCallback[SchemaUserRolePermissionsListResponse],
    callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserrolepermissionsList, options: MethodOptions): GaxiosPromise[SchemaUserRolePermissionsListResponse] = js.native
  def list(
    params: ParamsResourceUserrolepermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolePermissionsListResponse]
  ): Unit = js.native
}

