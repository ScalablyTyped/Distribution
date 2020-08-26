package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts$Adclients")
@js.native
class ResourceAccountsAdclients protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsensehost.accounts.adclients.get
    * @desc Get information about one of the ad clients in the specified
    * publisher's AdSense account.
    * @alias adsensehost.accounts.adclients.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAdClient] = js.native
  def get(callback: BodyResponseCallback[SchemaAdClient]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdClient] = js.native
  def get(params: ParamsResourceAccountsAdclientsGet): GaxiosPromise[SchemaAdClient] = js.native
  def get(params: ParamsResourceAccountsAdclientsGet, callback: BodyResponseCallback[SchemaAdClient]): Unit = js.native
  def get(
    params: ParamsResourceAccountsAdclientsGet,
    options: BodyResponseCallback[SchemaAdClient],
    callback: BodyResponseCallback[SchemaAdClient]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsAdclientsGet, options: MethodOptions): GaxiosPromise[SchemaAdClient] = js.native
  def get(
    params: ParamsResourceAccountsAdclientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClient]
  ): Unit = js.native
  /**
    * adsensehost.accounts.adclients.list
    * @desc List all hosted ad clients in the specified hosted account.
    * @alias adsensehost.accounts.adclients.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to list ad clients.
    * @param {integer=} params.maxResults The maximum number of ad clients to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAdClients] = js.native
  def list(callback: BodyResponseCallback[SchemaAdClients]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdClients] = js.native
  def list(params: ParamsResourceAccountsAdclientsList): GaxiosPromise[SchemaAdClients] = js.native
  def list(params: ParamsResourceAccountsAdclientsList, callback: BodyResponseCallback[SchemaAdClients]): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdclientsList,
    options: BodyResponseCallback[SchemaAdClients],
    callback: BodyResponseCallback[SchemaAdClients]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdclientsList, options: MethodOptions): GaxiosPromise[SchemaAdClients] = js.native
  def list(
    params: ParamsResourceAccountsAdclientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClients]
  ): Unit = js.native
}

