package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Countries")
@js.native
class ResourceCountries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.countries.get
    * @desc Gets one country by ID.
    * @alias dfareporting.countries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dartId Country DART ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCountry] = js.native
  def get(callback: BodyResponseCallback[SchemaCountry]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCountry] = js.native
  def get(params: ParamsResourceCountriesGet): GaxiosPromise[SchemaCountry] = js.native
  def get(params: ParamsResourceCountriesGet, callback: BodyResponseCallback[SchemaCountry]): Unit = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: BodyResponseCallback[SchemaCountry],
    callback: BodyResponseCallback[SchemaCountry]
  ): Unit = js.native
  def get(params: ParamsResourceCountriesGet, options: MethodOptions): GaxiosPromise[SchemaCountry] = js.native
  def get(
    params: ParamsResourceCountriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCountry]
  ): Unit = js.native
  
  /**
    * dfareporting.countries.list
    * @desc Retrieves a list of countries.
    * @alias dfareporting.countries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCountriesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(params: ParamsResourceCountriesList): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(params: ParamsResourceCountriesList, callback: BodyResponseCallback[SchemaCountriesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: BodyResponseCallback[SchemaCountriesListResponse],
    callback: BodyResponseCallback[SchemaCountriesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCountriesList, options: MethodOptions): GaxiosPromise[SchemaCountriesListResponse] = js.native
  def list(
    params: ParamsResourceCountriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCountriesListResponse]
  ): Unit = js.native
}
