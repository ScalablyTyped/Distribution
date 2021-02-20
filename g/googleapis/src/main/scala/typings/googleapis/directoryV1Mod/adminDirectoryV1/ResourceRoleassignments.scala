package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Roleassignments")
@js.native
class ResourceRoleassignments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.roleAssignments.delete
    * @desc Deletes a role assignment.
    * @alias directory.roleAssignments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleAssignmentId Immutable ID of the role assignment.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoleassignmentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRoleassignmentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRoleassignmentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRoleassignmentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceRoleassignmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.roleAssignments.get
    * @desc Retrieve a role assignment.
    * @alias directory.roleAssignments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleAssignmentId Immutable ID of the role assignment.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(params: ParamsResourceRoleassignmentsGet): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(params: ParamsResourceRoleassignmentsGet, callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def get(
    params: ParamsResourceRoleassignmentsGet,
    options: BodyResponseCallback[SchemaRoleAssignment],
    callback: BodyResponseCallback[SchemaRoleAssignment]
  ): Unit = js.native
  def get(params: ParamsResourceRoleassignmentsGet, options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def get(
    params: ParamsResourceRoleassignmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoleAssignment]
  ): Unit = js.native
  
  /**
    * directory.roleAssignments.insert
    * @desc Creates a role assignment.
    * @alias directory.roleAssignments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().RoleAssignment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(params: ParamsResourceRoleassignmentsInsert): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(params: ParamsResourceRoleassignmentsInsert, callback: BodyResponseCallback[SchemaRoleAssignment]): Unit = js.native
  def insert(
    params: ParamsResourceRoleassignmentsInsert,
    options: BodyResponseCallback[SchemaRoleAssignment],
    callback: BodyResponseCallback[SchemaRoleAssignment]
  ): Unit = js.native
  def insert(params: ParamsResourceRoleassignmentsInsert, options: MethodOptions): GaxiosPromise[SchemaRoleAssignment] = js.native
  def insert(
    params: ParamsResourceRoleassignmentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoleAssignment]
  ): Unit = js.native
  
  /**
    * directory.roleAssignments.list
    * @desc Retrieves a paginated list of all roleAssignments.
    * @alias directory.roleAssignments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {string=} params.roleId Immutable ID of a role. If included in the request, returns only role assignments containing this role ID.
    * @param {string=} params.userKey The user's primary email address, alias email address, or unique user ID. If included in the request, returns role assignments only for this user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(callback: BodyResponseCallback[SchemaRoleAssignments]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(params: ParamsResourceRoleassignmentsList): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(params: ParamsResourceRoleassignmentsList, callback: BodyResponseCallback[SchemaRoleAssignments]): Unit = js.native
  def list(
    params: ParamsResourceRoleassignmentsList,
    options: BodyResponseCallback[SchemaRoleAssignments],
    callback: BodyResponseCallback[SchemaRoleAssignments]
  ): Unit = js.native
  def list(params: ParamsResourceRoleassignmentsList, options: MethodOptions): GaxiosPromise[SchemaRoleAssignments] = js.native
  def list(
    params: ParamsResourceRoleassignmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoleAssignments]
  ): Unit = js.native
}
