package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Cities")
@js.native
class ResourceCities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.cities.list
    * @desc Retrieves a list of cities, possibly filtered.
    * @alias dfareporting.cities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.countryDartIds Select only cities from these countries.
    * @param {string=} params.dartIds Select only cities with these DART IDs.
    * @param {string=} params.namePrefix Select only cities with names starting with this prefix.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.regionDartIds Select only cities from these regions.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCitiesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(params: ParamsResourceCitiesList): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(params: ParamsResourceCitiesList, callback: BodyResponseCallback[SchemaCitiesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCitiesList,
    options: BodyResponseCallback[SchemaCitiesListResponse],
    callback: BodyResponseCallback[SchemaCitiesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCitiesList, options: MethodOptions): GaxiosPromise[SchemaCitiesListResponse] = js.native
  def list(
    params: ParamsResourceCitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCitiesListResponse]
  ): Unit = js.native
}
