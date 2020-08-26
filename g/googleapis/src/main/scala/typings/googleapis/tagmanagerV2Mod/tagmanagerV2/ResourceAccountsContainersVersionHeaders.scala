package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Version_headers")
@js.native
class ResourceAccountsContainersVersionHeaders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.version_headers.latest
    * @desc Gets the latest container version header
    * @alias tagmanager.accounts.containers.version_headers.latest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def latest(): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(callback: BodyResponseCallback[SchemaContainerVersionHeader]): Unit = js.native
  def latest(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(params: ParamsResourceAccountsContainersVersionHeadersLatest): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    callback: BodyResponseCallback[SchemaContainerVersionHeader]
  ): Unit = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    options: BodyResponseCallback[SchemaContainerVersionHeader],
    callback: BodyResponseCallback[SchemaContainerVersionHeader]
  ): Unit = js.native
  def latest(params: ParamsResourceAccountsContainersVersionHeadersLatest, options: MethodOptions): GaxiosPromise[SchemaContainerVersionHeader] = js.native
  def latest(
    params: ParamsResourceAccountsContainersVersionHeadersLatest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerVersionHeader]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.version_headers.list
    * @desc Lists all Container Versions of a GTM Container.
    * @alias tagmanager.accounts.containers.version_headers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeDeleted Also retrieve deleted (archived) versions when true.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListContainerVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(params: ParamsResourceAccountsContainersVersionHeadersList): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    options: BodyResponseCallback[SchemaListContainerVersionsResponse],
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsContainersVersionHeadersList, options: MethodOptions): GaxiosPromise[SchemaListContainerVersionsResponse] = js.native
  def list(
    params: ParamsResourceAccountsContainersVersionHeadersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListContainerVersionsResponse]
  ): Unit = js.native
}

