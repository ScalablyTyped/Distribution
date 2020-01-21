package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Encodedfullhashes")
@js.native
class ResourceEncodedfullhashes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * safebrowsing.encodedFullHashes.get
    * @alias safebrowsing.encodedFullHashes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientId A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing API.
    * @param {string=} params.clientVersion The version of the client implementation.
    * @param {string} params.encodedRequest A serialized FindFullHashesRequest proto.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFindFullHashesResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaFindFullHashesResponse]): Unit = js.native
  def get(params: ParamsResourceEncodedfullhashesGet): GaxiosPromise[SchemaFindFullHashesResponse] = js.native
  def get(
    params: ParamsResourceEncodedfullhashesGet,
    callback: BodyResponseCallback[SchemaFindFullHashesResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceEncodedfullhashesGet,
    options: BodyResponseCallback[SchemaFindFullHashesResponse],
    callback: BodyResponseCallback[SchemaFindFullHashesResponse]
  ): Unit = js.native
  def get(params: ParamsResourceEncodedfullhashesGet, options: MethodOptions): GaxiosPromise[SchemaFindFullHashesResponse] = js.native
  def get(
    params: ParamsResourceEncodedfullhashesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindFullHashesResponse]
  ): Unit = js.native
}

