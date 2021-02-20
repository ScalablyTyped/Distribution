package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Accountpermissions")
@js.native
class ResourceAccountpermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.accountPermissions.get
    * @desc Gets one account permission by ID.
    * @alias dfareporting.accountPermissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account permission ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountPermission]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(params: ParamsResourceAccountpermissionsGet): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    callback: BodyResponseCallback[SchemaAccountPermission]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    options: BodyResponseCallback[SchemaAccountPermission],
    callback: BodyResponseCallback[SchemaAccountPermission]
  ): Unit = js.native
  def get(params: ParamsResourceAccountpermissionsGet, options: MethodOptions): GaxiosPromise[SchemaAccountPermission] = js.native
  def get(
    params: ParamsResourceAccountpermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermission]
  ): Unit = js.native
  
  /**
    * dfareporting.accountPermissions.list
    * @desc Retrieves the list of account permissions.
    * @alias dfareporting.accountPermissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(params: ParamsResourceAccountpermissionsList): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    options: BodyResponseCallback[SchemaAccountPermissionsListResponse],
    callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountpermissionsList, options: MethodOptions): GaxiosPromise[SchemaAccountPermissionsListResponse] = js.native
  def list(
    params: ParamsResourceAccountpermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountPermissionsListResponse]
  ): Unit = js.native
}
