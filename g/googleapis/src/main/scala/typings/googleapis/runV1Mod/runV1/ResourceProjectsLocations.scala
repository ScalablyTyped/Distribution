package typings.googleapis.runV1Mod.runV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Projects$Locations")
@js.native
class ResourceProjectsLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.projects.locations.get
    * @desc Gets information about a location.
    * @alias run.projects.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceProjectsLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: BodyResponseCallback[SchemaLocation],
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
}

