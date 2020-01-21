package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Triggers")
@js.native
class ResourceAccountsContainersTriggers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.triggers.create
    * @desc Creates a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def create(params: ParamsResourceAccountsContainersTriggersCreate): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
    options: BodyResponseCallback[SchemaTrigger],
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersTriggersCreate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def create(
    params: ParamsResourceAccountsContainersTriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.delete
    * @desc Deletes a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.triggerId The GTM Trigger ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersTriggersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTriggersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersTriggersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersTriggersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersTriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.get
    * @desc Gets a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.triggerId The GTM Trigger ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def get(params: ParamsResourceAccountsContainersTriggersGet): GaxiosPromise[SchemaTrigger] = js.native
  def get(params: ParamsResourceAccountsContainersTriggersGet, callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersTriggersGet,
    options: BodyResponseCallback[SchemaTrigger],
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersTriggersGet, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def get(
    params: ParamsResourceAccountsContainersTriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.list
    * @desc Lists all GTM Triggers of a Container.
    * @alias tagmanager.accounts.containers.triggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTriggersResponse]): Unit = js.native
  def list(params: ParamsResourceAccountsContainersTriggersList): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
    options: BodyResponseCallback[SchemaListTriggersResponse],
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersTriggersList, options: MethodOptions): GaxiosPromise[SchemaListTriggersResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTriggersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.triggers.update
    * @desc Updates a GTM Trigger.
    * @alias tagmanager.accounts.containers.triggers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the trigger in storage.
    * @param {string} params.triggerId The GTM Trigger ID.
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTrigger] = js.native
  def update(callback: BodyResponseCallback[SchemaTrigger]): Unit = js.native
  def update(params: ParamsResourceAccountsContainersTriggersUpdate): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
    options: BodyResponseCallback[SchemaTrigger],
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersTriggersUpdate, options: MethodOptions): GaxiosPromise[SchemaTrigger] = js.native
  def update(
    params: ParamsResourceAccountsContainersTriggersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTrigger]
  ): Unit = js.native
}

