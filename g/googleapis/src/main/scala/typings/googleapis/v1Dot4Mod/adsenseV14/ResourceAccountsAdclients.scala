package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Adclients")
@js.native
class ResourceAccountsAdclients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.accounts.adclients.getAdCode
    * @desc Get Auto ad code for a given ad client.
    * @alias adsense.accounts.adclients.getAdCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account which contains the ad client.
    * @param {string} params.adClientId Ad client to get the code for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAdCode(): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(params: ParamsResourceAccountsAdclientsGetadcode): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(params: ParamsResourceAccountsAdclientsGetadcode, callback: BodyResponseCallback[SchemaAdCode]): Unit = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdclientsGetadcode,
    options: BodyResponseCallback[SchemaAdCode],
    callback: BodyResponseCallback[SchemaAdCode]
  ): Unit = js.native
  def getAdCode(params: ParamsResourceAccountsAdclientsGetadcode, options: MethodOptions): GaxiosPromise[SchemaAdCode] = js.native
  def getAdCode(
    params: ParamsResourceAccountsAdclientsGetadcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdCode]
  ): Unit = js.native
  
  /**
    * adsense.accounts.adclients.list
    * @desc List all ad clients in the specified account.
    * @alias adsense.accounts.adclients.list
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
