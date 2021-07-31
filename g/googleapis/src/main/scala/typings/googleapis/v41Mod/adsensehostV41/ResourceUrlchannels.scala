package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Urlchannels")
@js.native
class ResourceUrlchannels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.urlchannels.delete
    * @desc Delete a URL channel from the host AdSense account.
    * @alias adsensehost.urlchannels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client from which to delete the URL channel.
    * @param {string} params.urlChannelId URL channel to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(params: ParamsResourceUrlchannelsDelete): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(params: ParamsResourceUrlchannelsDelete, callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def delete(
    params: ParamsResourceUrlchannelsDelete,
    options: BodyResponseCallback[SchemaUrlChannel],
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  def delete(params: ParamsResourceUrlchannelsDelete, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def delete(
    params: ParamsResourceUrlchannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  
  /**
    * adsensehost.urlchannels.insert
    * @desc Add a new URL channel to the host AdSense account.
    * @alias adsensehost.urlchannels.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client to which the new URL channel will be added.
    * @param {().UrlChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(params: ParamsResourceUrlchannelsInsert): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(params: ParamsResourceUrlchannelsInsert, callback: BodyResponseCallback[SchemaUrlChannel]): Unit = js.native
  def insert(
    params: ParamsResourceUrlchannelsInsert,
    options: BodyResponseCallback[SchemaUrlChannel],
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  def insert(params: ParamsResourceUrlchannelsInsert, options: MethodOptions): GaxiosPromise[SchemaUrlChannel] = js.native
  def insert(
    params: ParamsResourceUrlchannelsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannel]
  ): Unit = js.native
  
  /**
    * adsensehost.urlchannels.list
    * @desc List all host URL channels in the host AdSense account.
    * @alias adsensehost.urlchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to list URL channels.
    * @param {integer=} params.maxResults The maximum number of URL channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through URL channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaUrlChannels]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(params: ParamsResourceUrlchannelsList): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(params: ParamsResourceUrlchannelsList, callback: BodyResponseCallback[SchemaUrlChannels]): Unit = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: BodyResponseCallback[SchemaUrlChannels],
    callback: BodyResponseCallback[SchemaUrlChannels]
  ): Unit = js.native
  def list(params: ParamsResourceUrlchannelsList, options: MethodOptions): GaxiosPromise[SchemaUrlChannels] = js.native
  def list(
    params: ParamsResourceUrlchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlChannels]
  ): Unit = js.native
}
