package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/urlshortener/v1", "urlshortener_v1.Resource$Url")
@js.native
class ResourceUrl protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * urlshortener.url.get
    * @desc Expands a short URL or gets creation time and analytics.
    * @alias urlshortener.url.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.projection Additional information to return.
    * @param {string} params.shortUrl The short URL, including the protocol.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUrl] = js.native
  def get(callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
  def get(params: ParamsResourceUrlGet): GaxiosPromise[SchemaUrl] = js.native
  def get(params: ParamsResourceUrlGet, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
  def get(
    params: ParamsResourceUrlGet,
    options: BodyResponseCallback[SchemaUrl],
    callback: BodyResponseCallback[SchemaUrl]
  ): Unit = js.native
  def get(params: ParamsResourceUrlGet, options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
  def get(params: ParamsResourceUrlGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
  /**
    * urlshortener.url.insert
    * @desc Creates a new short URL.
    * @alias urlshortener.url.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Url} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaUrl] = js.native
  def insert(callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
  def insert(params: ParamsResourceUrlInsert): GaxiosPromise[SchemaUrl] = js.native
  def insert(params: ParamsResourceUrlInsert, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
  def insert(
    params: ParamsResourceUrlInsert,
    options: BodyResponseCallback[SchemaUrl],
    callback: BodyResponseCallback[SchemaUrl]
  ): Unit = js.native
  def insert(params: ParamsResourceUrlInsert, options: MethodOptions): GaxiosPromise[SchemaUrl] = js.native
  def insert(params: ParamsResourceUrlInsert, options: MethodOptions, callback: BodyResponseCallback[SchemaUrl]): Unit = js.native
  /**
    * urlshortener.url.list
    * @desc Retrieves a list of URLs shortened by a user.
    * @alias urlshortener.url.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.projection Additional information to return.
    * @param {string=} params.start-token Token for requesting successive pages of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaUrlHistory] = js.native
  def list(callback: BodyResponseCallback[SchemaUrlHistory]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlHistory] = js.native
  def list(params: ParamsResourceUrlList): GaxiosPromise[SchemaUrlHistory] = js.native
  def list(params: ParamsResourceUrlList, callback: BodyResponseCallback[SchemaUrlHistory]): Unit = js.native
  def list(
    params: ParamsResourceUrlList,
    options: BodyResponseCallback[SchemaUrlHistory],
    callback: BodyResponseCallback[SchemaUrlHistory]
  ): Unit = js.native
  def list(params: ParamsResourceUrlList, options: MethodOptions): GaxiosPromise[SchemaUrlHistory] = js.native
  def list(
    params: ParamsResourceUrlList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlHistory]
  ): Unit = js.native
}

