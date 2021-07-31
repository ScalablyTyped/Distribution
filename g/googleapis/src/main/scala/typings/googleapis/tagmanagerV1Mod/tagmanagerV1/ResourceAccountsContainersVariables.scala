package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Variables")
@js.native
class ResourceAccountsContainersVariables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.variables.create
    * @desc Creates a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaVariable] = js.native
  def create(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(params: ParamsResourceAccountsContainersVariablesCreate): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceAccountsContainersVariablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.variables.delete
    * @desc Deletes a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.variableId The GTM Variable ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVariablesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVariablesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersVariablesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersVariablesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersVariablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.variables.get
    * @desc Gets a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.variableId The GTM Variable ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVariable] = js.native
  def get(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(params: ParamsResourceAccountsContainersVariablesGet): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersVariablesGet, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceAccountsContainersVariablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.variables.list
    * @desc Lists all GTM Variables of a Container.
    * @alias tagmanager.accounts.containers.variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVariablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(params: ParamsResourceAccountsContainersVariablesList): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
    options: BodyResponseCallback[SchemaListVariablesResponse],
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersVariablesList, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVariablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.variables.update
    * @desc Updates a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the variable in storage.
    * @param {string} params.variableId The GTM Variable ID.
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaVariable] = js.native
  def update(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(params: ParamsResourceAccountsContainersVariablesUpdate): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersVariablesUpdate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceAccountsContainersVariablesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
}
