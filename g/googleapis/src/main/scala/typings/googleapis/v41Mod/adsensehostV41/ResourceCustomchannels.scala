package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Customchannels")
@js.native
class ResourceCustomchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.customchannels.delete
    * @desc Delete a specific custom channel from the host AdSense account.
    * @alias adsensehost.customchannels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client from which to delete the custom channel.
    * @param {string} params.customChannelId Custom channel to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(params: ParamsResourceCustomchannelsDelete): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(params: ParamsResourceCustomchannelsDelete, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def delete(
    params: ParamsResourceCustomchannelsDelete,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomchannelsDelete, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def delete(
    params: ParamsResourceCustomchannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  
  /**
    * adsensehost.customchannels.get
    * @desc Get a specific custom channel from the host AdSense account.
    * @alias adsensehost.customchannels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client from which to get the custom channel.
    * @param {string} params.customChannelId Custom channel to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceCustomchannelsGet): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(params: ParamsResourceCustomchannelsGet, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def get(params: ParamsResourceCustomchannelsGet, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def get(
    params: ParamsResourceCustomchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  
  /**
    * adsensehost.customchannels.insert
    * @desc Add a new custom channel to the host AdSense account.
    * @alias adsensehost.customchannels.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client to which the new custom channel will be added.
    * @param {().CustomChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(params: ParamsResourceCustomchannelsInsert): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(params: ParamsResourceCustomchannelsInsert, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def insert(
    params: ParamsResourceCustomchannelsInsert,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def insert(params: ParamsResourceCustomchannelsInsert, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def insert(
    params: ParamsResourceCustomchannelsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  
  /**
    * adsensehost.customchannels.list
    * @desc List all host custom channels in this AdSense account.
    * @alias adsensehost.customchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to list custom channels.
    * @param {integer=} params.maxResults The maximum number of custom channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceCustomchannelsList): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(params: ParamsResourceCustomchannelsList, callback: BodyResponseCallback[SchemaCustomChannels]): Unit = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: BodyResponseCallback[SchemaCustomChannels],
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  def list(params: ParamsResourceCustomchannelsList, options: MethodOptions): GaxiosPromise[SchemaCustomChannels] = js.native
  def list(
    params: ParamsResourceCustomchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannels]
  ): Unit = js.native
  
  /**
    * adsensehost.customchannels.patch
    * @desc Update a custom channel in the host AdSense account. This method
    * supports patch semantics.
    * @alias adsensehost.customchannels.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client in which the custom channel will be updated.
    * @param {string} params.customChannelId Custom channel to get.
    * @param {().CustomChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(params: ParamsResourceCustomchannelsPatch): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(params: ParamsResourceCustomchannelsPatch, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def patch(
    params: ParamsResourceCustomchannelsPatch,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomchannelsPatch, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def patch(
    params: ParamsResourceCustomchannelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  
  /**
    * adsensehost.customchannels.update
    * @desc Update a custom channel in the host AdSense account.
    * @alias adsensehost.customchannels.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client in which the custom channel will be updated.
    * @param {().CustomChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(params: ParamsResourceCustomchannelsUpdate): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(params: ParamsResourceCustomchannelsUpdate, callback: BodyResponseCallback[SchemaCustomChannel]): Unit = js.native
  def update(
    params: ParamsResourceCustomchannelsUpdate,
    options: BodyResponseCallback[SchemaCustomChannel],
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
  def update(params: ParamsResourceCustomchannelsUpdate, options: MethodOptions): GaxiosPromise[SchemaCustomChannel] = js.native
  def update(
    params: ParamsResourceCustomchannelsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomChannel]
  ): Unit = js.native
}
