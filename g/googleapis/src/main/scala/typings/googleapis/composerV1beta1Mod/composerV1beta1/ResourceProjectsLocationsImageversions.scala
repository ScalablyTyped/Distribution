package typings.googleapis.composerV1beta1Mod.composerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/composer/v1beta1", "composer_v1beta1.Resource$Projects$Locations$Imageversions")
@js.native
class ResourceProjectsLocationsImageversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * composer.projects.locations.imageVersions.list
    * @desc List ImageVersions for provided location.
    * @alias composer.projects.locations.imageVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of image_versions to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent List ImageVersions in the given project and location, in the form: "projects/{projectId}/locations/{locationId}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListImageVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsImageversionsList): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    callback: BodyResponseCallback[SchemaListImageVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    options: BodyResponseCallback[SchemaListImageVersionsResponse],
    callback: BodyResponseCallback[SchemaListImageVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsImageversionsList, options: MethodOptions): GaxiosPromise[SchemaListImageVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsImageversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListImageVersionsResponse]
  ): Unit = js.native
}
