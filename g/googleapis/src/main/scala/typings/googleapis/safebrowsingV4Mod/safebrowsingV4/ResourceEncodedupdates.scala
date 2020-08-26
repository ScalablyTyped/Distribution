package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Encodedupdates")
@js.native
class ResourceEncodedupdates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.encodedUpdates.get
    * @alias safebrowsing.encodedUpdates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientId A client ID that uniquely identifies the client implementation of the Safe Browsing API.
    * @param {string=} params.clientVersion The version of the client implementation.
    * @param {string} params.encodedRequest A serialized FetchThreatListUpdatesRequest proto.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def get(params: ParamsResourceEncodedupdatesGet): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    options: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse],
    callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]
  ): Unit = js.native
  def get(params: ParamsResourceEncodedupdatesGet, options: MethodOptions): GaxiosPromise[SchemaFetchThreatListUpdatesResponse] = js.native
  def get(
    params: ParamsResourceEncodedupdatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFetchThreatListUpdatesResponse]
  ): Unit = js.native
}

