package typings.googleapis.vaultV1Mod.vaultV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters")
@js.native
class ResourceMatters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * vault.matters.addPermissions
    * @desc Adds an account as a matter collaborator.
    * @alias vault.matters.addPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().AddMatterPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addPermissions(): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(callback: BodyResponseCallback[SchemaMatterPermission]): Unit = js.native
  def addPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(params: ParamsResourceMattersAddpermissions): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    callback: BodyResponseCallback[SchemaMatterPermission]
  ): Unit = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    options: BodyResponseCallback[SchemaMatterPermission],
    callback: BodyResponseCallback[SchemaMatterPermission]
  ): Unit = js.native
  def addPermissions(params: ParamsResourceMattersAddpermissions, options: MethodOptions): GaxiosPromise[SchemaMatterPermission] = js.native
  def addPermissions(
    params: ParamsResourceMattersAddpermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatterPermission]
  ): Unit = js.native
  
  /**
    * vault.matters.close
    * @desc Closes the specified matter. Returns matter with updated state.
    * @alias vault.matters.close
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().CloseMatterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def close(): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(callback: BodyResponseCallback[SchemaCloseMatterResponse]): Unit = js.native
  def close(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(params: ParamsResourceMattersClose): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(params: ParamsResourceMattersClose, callback: BodyResponseCallback[SchemaCloseMatterResponse]): Unit = js.native
  def close(
    params: ParamsResourceMattersClose,
    options: BodyResponseCallback[SchemaCloseMatterResponse],
    callback: BodyResponseCallback[SchemaCloseMatterResponse]
  ): Unit = js.native
  def close(params: ParamsResourceMattersClose, options: MethodOptions): GaxiosPromise[SchemaCloseMatterResponse] = js.native
  def close(
    params: ParamsResourceMattersClose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCloseMatterResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * vault.matters.create
    * @desc Creates a new matter with the given name and description. The
    * initial state is open, and the owner is the method caller. Returns the
    * created matter with default view.
    * @alias vault.matters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Matter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaMatter] = js.native
  def create(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def create(params: ParamsResourceMattersCreate): GaxiosPromise[SchemaMatter] = js.native
  def create(params: ParamsResourceMattersCreate, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def create(
    params: ParamsResourceMattersCreate,
    options: BodyResponseCallback[SchemaMatter],
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  def create(params: ParamsResourceMattersCreate, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def create(
    params: ParamsResourceMattersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  
  /**
    * vault.matters.delete
    * @desc Deletes the specified matter. Returns matter with updated state.
    * @alias vault.matters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaMatter] = js.native
  def delete(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def delete(params: ParamsResourceMattersDelete): GaxiosPromise[SchemaMatter] = js.native
  def delete(params: ParamsResourceMattersDelete, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def delete(
    params: ParamsResourceMattersDelete,
    options: BodyResponseCallback[SchemaMatter],
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  def delete(params: ParamsResourceMattersDelete, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def delete(
    params: ParamsResourceMattersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  
  var exports: ResourceMattersExports = js.native
  
  /**
    * vault.matters.get
    * @desc Gets the specified matter.
    * @alias vault.matters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {string=} params.view Specifies which parts of the Matter to return in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMatter] = js.native
  def get(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def get(params: ParamsResourceMattersGet): GaxiosPromise[SchemaMatter] = js.native
  def get(params: ParamsResourceMattersGet, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def get(
    params: ParamsResourceMattersGet,
    options: BodyResponseCallback[SchemaMatter],
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  def get(params: ParamsResourceMattersGet, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def get(
    params: ParamsResourceMattersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  
  var holds: ResourceMattersHolds = js.native
  
  /**
    * vault.matters.list
    * @desc Lists matters the user has access to.
    * @alias vault.matters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The number of matters to return in the response. Default and maximum are 100.
    * @param {string=} params.pageToken The pagination token as returned in the response.
    * @param {string=} params.state If set, list only matters with that specific state. The default is listing matters of all states.
    * @param {string=} params.view Specifies which parts of the matter to return in response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMattersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(params: ParamsResourceMattersList): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(params: ParamsResourceMattersList, callback: BodyResponseCallback[SchemaListMattersResponse]): Unit = js.native
  def list(
    params: ParamsResourceMattersList,
    options: BodyResponseCallback[SchemaListMattersResponse],
    callback: BodyResponseCallback[SchemaListMattersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMattersList, options: MethodOptions): GaxiosPromise[SchemaListMattersResponse] = js.native
  def list(
    params: ParamsResourceMattersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMattersResponse]
  ): Unit = js.native
  
  /**
    * vault.matters.removePermissions
    * @desc Removes an account as a matter collaborator.
    * @alias vault.matters.removePermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().RemoveMatterPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removePermissions(): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removePermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(params: ParamsResourceMattersRemovepermissions): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(params: ParamsResourceMattersRemovepermissions, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removePermissions(
    params: ParamsResourceMattersRemovepermissions,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removePermissions(params: ParamsResourceMattersRemovepermissions, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removePermissions(
    params: ParamsResourceMattersRemovepermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * vault.matters.reopen
    * @desc Reopens the specified matter. Returns matter with updated state.
    * @alias vault.matters.reopen
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().ReopenMatterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reopen(): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(callback: BodyResponseCallback[SchemaReopenMatterResponse]): Unit = js.native
  def reopen(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(params: ParamsResourceMattersReopen): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(params: ParamsResourceMattersReopen, callback: BodyResponseCallback[SchemaReopenMatterResponse]): Unit = js.native
  def reopen(
    params: ParamsResourceMattersReopen,
    options: BodyResponseCallback[SchemaReopenMatterResponse],
    callback: BodyResponseCallback[SchemaReopenMatterResponse]
  ): Unit = js.native
  def reopen(params: ParamsResourceMattersReopen, options: MethodOptions): GaxiosPromise[SchemaReopenMatterResponse] = js.native
  def reopen(
    params: ParamsResourceMattersReopen,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReopenMatterResponse]
  ): Unit = js.native
  
  var savedQueries: ResourceMattersSavedqueries = js.native
  
  /**
    * vault.matters.undelete
    * @desc Undeletes the specified matter. Returns matter with updated state.
    * @alias vault.matters.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().UndeleteMatterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[SchemaMatter] = js.native
  def undelete(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def undelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def undelete(params: ParamsResourceMattersUndelete): GaxiosPromise[SchemaMatter] = js.native
  def undelete(params: ParamsResourceMattersUndelete, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def undelete(
    params: ParamsResourceMattersUndelete,
    options: BodyResponseCallback[SchemaMatter],
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  def undelete(params: ParamsResourceMattersUndelete, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def undelete(
    params: ParamsResourceMattersUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  
  /**
    * vault.matters.update
    * @desc Updates the specified matter. This updates only the name and
    * description of the matter, identified by matter id. Changes to any other
    * fields are ignored. Returns the default view of the matter.
    * @alias vault.matters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().Matter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaMatter] = js.native
  def update(callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def update(params: ParamsResourceMattersUpdate): GaxiosPromise[SchemaMatter] = js.native
  def update(params: ParamsResourceMattersUpdate, callback: BodyResponseCallback[SchemaMatter]): Unit = js.native
  def update(
    params: ParamsResourceMattersUpdate,
    options: BodyResponseCallback[SchemaMatter],
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
  def update(params: ParamsResourceMattersUpdate, options: MethodOptions): GaxiosPromise[SchemaMatter] = js.native
  def update(
    params: ParamsResourceMattersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMatter]
  ): Unit = js.native
}
