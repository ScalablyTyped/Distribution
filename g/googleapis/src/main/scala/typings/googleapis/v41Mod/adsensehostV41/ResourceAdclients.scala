package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Adclients")
@js.native
class ResourceAdclients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.adclients.get
    * @desc Get information about one of the ad clients in the Host AdSense
    * account.
    * @alias adsensehost.adclients.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAdClient] = js.native
  def get(callback: BodyResponseCallback[SchemaAdClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdClient] = js.native
  def get(params: ParamsResourceAdclientsGet): GaxiosPromise[SchemaAdClient] = js.native
  def get(params: ParamsResourceAdclientsGet, callback: BodyResponseCallback[SchemaAdClient]): Unit = js.native
  def get(
    params: ParamsResourceAdclientsGet,
    options: BodyResponseCallback[SchemaAdClient],
    callback: BodyResponseCallback[SchemaAdClient]
  ): Unit = js.native
  def get(params: ParamsResourceAdclientsGet, options: MethodOptions): GaxiosPromise[SchemaAdClient] = js.native
  def get(
    params: ParamsResourceAdclientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClient]
  ): Unit = js.native
  
  /**
    * adsensehost.adclients.list
    * @desc List all host ad clients in this AdSense account.
    * @alias adsensehost.adclients.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of ad clients to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAdClients] = js.native
  def list(callback: BodyResponseCallback[SchemaAdClients]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdClients] = js.native
  def list(params: ParamsResourceAdclientsList): GaxiosPromise[SchemaAdClients] = js.native
  def list(params: ParamsResourceAdclientsList, callback: BodyResponseCallback[SchemaAdClients]): Unit = js.native
  def list(
    params: ParamsResourceAdclientsList,
    options: BodyResponseCallback[SchemaAdClients],
    callback: BodyResponseCallback[SchemaAdClients]
  ): Unit = js.native
  def list(params: ParamsResourceAdclientsList, options: MethodOptions): GaxiosPromise[SchemaAdClients] = js.native
  def list(
    params: ParamsResourceAdclientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdClients]
  ): Unit = js.native
}
