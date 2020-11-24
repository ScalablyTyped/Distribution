package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Users")
@js.native
class ResourceUsers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * sql.users.delete
    * @desc Deletes a user from a Cloud SQL instance.
    * @alias sql.users.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.host Host of the user in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.name Name of the user in the instance.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceUsersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceUsersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.users.insert
    * @desc Creates a new user in a Cloud SQL instance.
    * @alias sql.users.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceUsersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceUsersInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * sql.users.list
    * @desc Lists users in the specified Cloud SQL instance.
    * @alias sql.users.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[SchemaUsersListResponse],
    callback: BodyResponseCallback[SchemaUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersListResponse]
  ): Unit = js.native
  
  /**
    * sql.users.update
    * @desc Updates an existing user in a Cloud SQL instance.
    * @alias sql.users.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.host Host of the user in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.name Name of the user in the instance.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceUsersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceUsersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
