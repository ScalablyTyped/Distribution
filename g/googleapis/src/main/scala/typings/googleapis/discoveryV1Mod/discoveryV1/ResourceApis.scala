package typings.googleapis.discoveryV1Mod.discoveryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/discovery/v1", "discovery_v1.Resource$Apis")
@js.native
class ResourceApis protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * discovery.apis.getRest
    * @desc Retrieve the description of a particular version of an api.
    * @alias discovery.apis.getRest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.api The name of the API.
    * @param {string} params.version The version of the API.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRest(): GaxiosPromise[SchemaRestDescription] = js.native
  def getRest(callback: BodyResponseCallback[SchemaRestDescription]): Unit = js.native
  def getRest(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRestDescription] = js.native
  def getRest(params: ParamsResourceApisGetrest): GaxiosPromise[SchemaRestDescription] = js.native
  def getRest(params: ParamsResourceApisGetrest, callback: BodyResponseCallback[SchemaRestDescription]): Unit = js.native
  def getRest(
    params: ParamsResourceApisGetrest,
    options: BodyResponseCallback[SchemaRestDescription],
    callback: BodyResponseCallback[SchemaRestDescription]
  ): Unit = js.native
  def getRest(params: ParamsResourceApisGetrest, options: MethodOptions): GaxiosPromise[SchemaRestDescription] = js.native
  def getRest(
    params: ParamsResourceApisGetrest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRestDescription]
  ): Unit = js.native
  /**
    * discovery.apis.list
    * @desc Retrieve the list of APIs supported at this endpoint.
    * @alias discovery.apis.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.name Only include APIs with the given name.
    * @param {boolean=} params.preferred Return only the preferred version of an API.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDirectoryList] = js.native
  def list(callback: BodyResponseCallback[SchemaDirectoryList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectoryList] = js.native
  def list(params: ParamsResourceApisList): GaxiosPromise[SchemaDirectoryList] = js.native
  def list(params: ParamsResourceApisList, callback: BodyResponseCallback[SchemaDirectoryList]): Unit = js.native
  def list(
    params: ParamsResourceApisList,
    options: BodyResponseCallback[SchemaDirectoryList],
    callback: BodyResponseCallback[SchemaDirectoryList]
  ): Unit = js.native
  def list(params: ParamsResourceApisList, options: MethodOptions): GaxiosPromise[SchemaDirectoryList] = js.native
  def list(
    params: ParamsResourceApisList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectoryList]
  ): Unit = js.native
}

