package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Videoformats")
@js.native
class ResourceVideoformats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.videoFormats.get
    * @desc Gets one video format by ID.
    * @alias dfareporting.videoFormats.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id Video format ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(callback: BodyResponseCallback[SchemaVideoFormat]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(params: ParamsResourceVideoformatsGet): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(params: ParamsResourceVideoformatsGet, callback: BodyResponseCallback[SchemaVideoFormat]): Unit = js.native
  def get(
    params: ParamsResourceVideoformatsGet,
    options: BodyResponseCallback[SchemaVideoFormat],
    callback: BodyResponseCallback[SchemaVideoFormat]
  ): Unit = js.native
  def get(params: ParamsResourceVideoformatsGet, options: MethodOptions): GaxiosPromise[SchemaVideoFormat] = js.native
  def get(
    params: ParamsResourceVideoformatsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoFormat]
  ): Unit = js.native
  
  /**
    * dfareporting.videoFormats.list
    * @desc Lists available video formats.
    * @alias dfareporting.videoFormats.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVideoFormatsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(params: ParamsResourceVideoformatsList): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    callback: BodyResponseCallback[SchemaVideoFormatsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    options: BodyResponseCallback[SchemaVideoFormatsListResponse],
    callback: BodyResponseCallback[SchemaVideoFormatsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceVideoformatsList, options: MethodOptions): GaxiosPromise[SchemaVideoFormatsListResponse] = js.native
  def list(
    params: ParamsResourceVideoformatsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVideoFormatsListResponse]
  ): Unit = js.native
}
