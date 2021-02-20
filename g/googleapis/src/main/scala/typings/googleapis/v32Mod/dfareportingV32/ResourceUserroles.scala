package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Userroles")
@js.native
class ResourceUserroles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.userRoles.delete
    * @desc Deletes an existing user role.
    * @alias dfareporting.userRoles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUserrolesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUserrolesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUserrolesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUserrolesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUserrolesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dfareporting.userRoles.get
    * @desc Gets one user role by ID.
    * @alias dfareporting.userRoles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUserRole] = js.native
  def get(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def get(params: ParamsResourceUserrolesGet): GaxiosPromise[SchemaUserRole] = js.native
  def get(params: ParamsResourceUserrolesGet, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def get(
    params: ParamsResourceUserrolesGet,
    options: BodyResponseCallback[SchemaUserRole],
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  def get(params: ParamsResourceUserrolesGet, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def get(
    params: ParamsResourceUserrolesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  
  /**
    * dfareporting.userRoles.insert
    * @desc Inserts a new user role.
    * @alias dfareporting.userRoles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().UserRole} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaUserRole] = js.native
  def insert(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def insert(params: ParamsResourceUserrolesInsert): GaxiosPromise[SchemaUserRole] = js.native
  def insert(params: ParamsResourceUserrolesInsert, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def insert(
    params: ParamsResourceUserrolesInsert,
    options: BodyResponseCallback[SchemaUserRole],
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  def insert(params: ParamsResourceUserrolesInsert, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def insert(
    params: ParamsResourceUserrolesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  
  /**
    * dfareporting.userRoles.list
    * @desc Retrieves a list of user roles, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.userRoles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.accountUserRoleOnly Select only account level user roles not associated with any specific subaccount.
    * @param {string=} params.ids Select only user roles with the specified IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "userrole*2015" will return objects with names like "userrole June 2015", "userrole April 2015", or simply "userrole 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "userrole" will match objects with name "my userrole", "userrole 2015", or simply "userrole".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only user roles that belong to this subaccount.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUserRolesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(params: ParamsResourceUserrolesList): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(params: ParamsResourceUserrolesList, callback: BodyResponseCallback[SchemaUserRolesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceUserrolesList,
    options: BodyResponseCallback[SchemaUserRolesListResponse],
    callback: BodyResponseCallback[SchemaUserRolesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserrolesList, options: MethodOptions): GaxiosPromise[SchemaUserRolesListResponse] = js.native
  def list(
    params: ParamsResourceUserrolesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRolesListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.userRoles.patch
    * @desc Updates an existing user role. This method supports patch
    * semantics.
    * @alias dfareporting.userRoles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().UserRole} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaUserRole] = js.native
  def patch(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def patch(params: ParamsResourceUserrolesPatch): GaxiosPromise[SchemaUserRole] = js.native
  def patch(params: ParamsResourceUserrolesPatch, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def patch(
    params: ParamsResourceUserrolesPatch,
    options: BodyResponseCallback[SchemaUserRole],
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  def patch(params: ParamsResourceUserrolesPatch, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def patch(
    params: ParamsResourceUserrolesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  
  /**
    * dfareporting.userRoles.update
    * @desc Updates an existing user role.
    * @alias dfareporting.userRoles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().UserRole} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaUserRole] = js.native
  def update(callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def update(params: ParamsResourceUserrolesUpdate): GaxiosPromise[SchemaUserRole] = js.native
  def update(params: ParamsResourceUserrolesUpdate, callback: BodyResponseCallback[SchemaUserRole]): Unit = js.native
  def update(
    params: ParamsResourceUserrolesUpdate,
    options: BodyResponseCallback[SchemaUserRole],
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
  def update(params: ParamsResourceUserrolesUpdate, options: MethodOptions): GaxiosPromise[SchemaUserRole] = js.native
  def update(
    params: ParamsResourceUserrolesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserRole]
  ): Unit = js.native
}
