package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Versions")
@js.native
class ResourceAccountsContainersVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * tagmanager.accounts.containers.versions.create
    * @desc Creates a Container Version.
    * @alias tagmanager.accounts.containers.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().CreateContainerVersionRequestVersionOptions} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(params: ParamsResourceAccountsContainersVersionsCreate): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    options: BodyResponseCallback[SchemaCreateContainerVersionResponse],
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsContainersVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaCreateContainerVersionResponse] = js.native
  def create(
    params: ParamsResourceAccountsContainersVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateContainerVersionResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.delete
    * @desc Deletes a Container Version.
    * @alias tagmanager.accounts.containers.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVersionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAccountsContainersVersionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAccountsContainersVersionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsContainersVersionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAccountsContainersVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.get
    * @desc Gets a Container Version.
    * @alias tagmanager.accounts.containers.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID. Specify published to retrieve the currently published version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(params: ParamsResourceAccountsContainersVersionsGet): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    options: BodyResponseCallback[SchemaContainerVersion],
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsContainersVersionsGet, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def get(
    params: ParamsResourceAccountsContainersVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.list
    * @desc Lists all Container Versions of a GTM Container.
    * @alias tagmanager.accounts.containers.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {boolean=} params.headers Retrieve headers only when true.
    * @param {boolean=} params.includeDeleted Also retrieve deleted (archived) versions when true.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContainerVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersVersionsList): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
    options: BodyResponseCallback[SchemaListContainerVersionsResponse],
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersVersionsList, options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.publish
    * @desc Publishes a Container Version.
    * @alias tagmanager.accounts.containers.versions.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]): Unit = js.native
  def publish(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(params: ParamsResourceAccountsContainersVersionsPublish): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]
  ): Unit = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    options: BodyResponseCallback[SchemaPublishContainerVersionResponse],
    callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]
  ): Unit = js.native
  def publish(params: ParamsResourceAccountsContainersVersionsPublish, options: MethodOptions): GaxiosPromise[SchemaPublishContainerVersionResponse] = js.native
  def publish(
    params: ParamsResourceAccountsContainersVersionsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublishContainerVersionResponse]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.restore
    * @desc Restores a Container Version. This will overwrite the container's
    * current configuration (including its variables, triggers and tags). The
    * operation will not have any effect on the version that is being served
    * (i.e. the published version).
    * @alias tagmanager.accounts.containers.versions.restore
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restore(): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def restore(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(params: ParamsResourceAccountsContainersVersionsRestore): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    options: BodyResponseCallback[SchemaContainerVersion],
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def restore(params: ParamsResourceAccountsContainersVersionsRestore, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def restore(
    params: ParamsResourceAccountsContainersVersionsRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.undelete
    * @desc Undeletes a Container Version.
    * @alias tagmanager.accounts.containers.versions.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def undelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(params: ParamsResourceAccountsContainersVersionsUndelete): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    options: BodyResponseCallback[SchemaContainerVersion],
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def undelete(params: ParamsResourceAccountsContainersVersionsUndelete, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def undelete(
    params: ParamsResourceAccountsContainersVersionsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  
  /**
    * tagmanager.accounts.containers.versions.update
    * @desc Updates a Container Version.
    * @alias tagmanager.accounts.containers.versions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.containerVersionId The GTM Container Version ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {().ContainerVersion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(params: ParamsResourceAccountsContainersVersionsUpdate): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    options: BodyResponseCallback[SchemaContainerVersion],
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersVersionsUpdate, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def update(
    params: ParamsResourceAccountsContainersVersionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
}
