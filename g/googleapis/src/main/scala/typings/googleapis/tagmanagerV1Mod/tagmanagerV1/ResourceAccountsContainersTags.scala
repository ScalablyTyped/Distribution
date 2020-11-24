package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Tags")
@js.native
class ResourceAccountsContainersTags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.tags.create
    * @desc Creates a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTag] = js.native
  def create(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceAccountsContainersTagsCreate): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceAccountsContainersTagsCreate, callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersTagsCreate,
    options: BodyResponseCallback[SchemaTag],
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersTagsCreate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceAccountsContainersTagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.tags.delete
    * @desc Deletes a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.tagId The GTM Tag ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTagsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersTagsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersTagsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersTagsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersTagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.tags.get
    * @desc Gets a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.tagId The GTM Tag ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTag] = js.native
  def get(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceAccountsContainersTagsGet): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceAccountsContainersTagsGet, callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersTagsGet,
    options: BodyResponseCallback[SchemaTag],
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersTagsGet, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceAccountsContainersTagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.tags.list
    * @desc Lists all GTM Tags of a Container.
    * @alias tagmanager.accounts.containers.tags.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTagsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersTagsList): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
    options: BodyResponseCallback[SchemaListTagsResponse],
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersTagsList, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersTagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.tags.update
    * @desc Updates a GTM Tag.
    * @alias tagmanager.accounts.containers.tags.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the tag in storage.
    * @param {string} params.tagId The GTM Tag ID.
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTag] = js.native
  def update(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(params: ParamsResourceAccountsContainersTagsUpdate): GaxiosPromise[SchemaTag] = js.native
  def update(params: ParamsResourceAccountsContainersTagsUpdate, callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersTagsUpdate,
    options: BodyResponseCallback[SchemaTag],
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersTagsUpdate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def update(
    params: ParamsResourceAccountsContainersTagsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
}
