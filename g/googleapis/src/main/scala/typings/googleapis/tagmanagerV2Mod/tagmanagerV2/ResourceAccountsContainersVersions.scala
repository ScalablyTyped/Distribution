package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Versions")
@js.native
class ResourceAccountsContainersVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.versions.delete
    * @desc Deletes a Container Version.
    * @alias tagmanager.accounts.containers.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * @param {string=} params.containerVersionId The GTM ContainerVersion ID. Specify published to retrieve the currently published version.
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * tagmanager.accounts.containers.versions.live
    * @desc Gets the live (i.e. published) container version
    * @alias tagmanager.accounts.containers.versions.live
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def live(): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def live(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(params: ParamsResourceAccountsContainersVersionsLive): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
    options: BodyResponseCallback[SchemaContainerVersion],
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def live(params: ParamsResourceAccountsContainersVersionsLive, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def live(
    params: ParamsResourceAccountsContainersVersionsLive,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.versions.publish
    * @desc Publishes a Container Version.
    * @alias tagmanager.accounts.containers.versions.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * tagmanager.accounts.containers.versions.set_latest
    * @desc Sets the latest version used for synchronization of workspaces when
    * detecting conflicts and errors.
    * @alias tagmanager.accounts.containers.versions.set_latest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set_latest(): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(callback: BodyResponseCallback[SchemaContainerVersion]): Unit = js.native
  def set_latest(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(params: ParamsResourceAccountsContainersVersionsSetLatest): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
    options: BodyResponseCallback[SchemaContainerVersion],
    callback: BodyResponseCallback[SchemaContainerVersion]
  ): Unit = js.native
  def set_latest(params: ParamsResourceAccountsContainersVersionsSetLatest, options: MethodOptions): GaxiosPromise[SchemaContainerVersion] = js.native
  def set_latest(
    params: ParamsResourceAccountsContainersVersionsSetLatest,
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
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container version in storage.
    * @param {string} params.path GTM ContainerVersion's API relative path. Example: accounts/{account_id}/containers/{container_id}/versions/{version_id}
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

