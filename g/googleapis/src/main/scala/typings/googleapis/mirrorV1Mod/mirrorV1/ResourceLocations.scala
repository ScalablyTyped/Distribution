package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Locations")
@js.native
class ResourceLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * mirror.locations.get
    * @desc Gets a single location by ID.
    * @alias mirror.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the location or latest for the last known location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceLocationsGet,
    options: BodyResponseCallback[SchemaLocation],
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  
  /**
    * mirror.locations.list
    * @desc Retrieves a list of locations for the user.
    * @alias mirror.locations.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaLocationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaLocationsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLocationsListResponse] = js.native
  def list(params: ParamsResourceLocationsList): GaxiosPromise[SchemaLocationsListResponse] = js.native
  def list(params: ParamsResourceLocationsList, callback: BodyResponseCallback[SchemaLocationsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceLocationsList,
    options: BodyResponseCallback[SchemaLocationsListResponse],
    callback: BodyResponseCallback[SchemaLocationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsList, options: MethodOptions): GaxiosPromise[SchemaLocationsListResponse] = js.native
  def list(
    params: ParamsResourceLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocationsListResponse]
  ): Unit = js.native
}
