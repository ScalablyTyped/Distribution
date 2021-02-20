package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Conversion")
@js.native
class ResourceConversion protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * doubleclicksearch.conversion.get
    * @desc Retrieves a list of conversions from a DoubleClick Search engine
    * account.
    * @alias doubleclicksearch.conversion.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.adGroupId Numeric ID of the ad group.
    * @param {string=} params.adId Numeric ID of the ad.
    * @param {string} params.advertiserId Numeric ID of the advertiser.
    * @param {string} params.agencyId Numeric ID of the agency.
    * @param {string=} params.campaignId Numeric ID of the campaign.
    * @param {string=} params.criterionId Numeric ID of the criterion.
    * @param {integer} params.endDate Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {string} params.engineAccountId Numeric ID of the engine account.
    * @param {integer} params.rowCount The number of conversions to return per call.
    * @param {integer} params.startDate First date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {integer} params.startRow The 0-based starting index for retrieving conversions results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaConversionList] = js.native
  def get(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def get(params: ParamsResourceConversionGet): GaxiosPromise[SchemaConversionList] = js.native
  def get(params: ParamsResourceConversionGet, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def get(
    params: ParamsResourceConversionGet,
    options: BodyResponseCallback[SchemaConversionList],
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  def get(params: ParamsResourceConversionGet, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def get(
    params: ParamsResourceConversionGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  
  /**
    * doubleclicksearch.conversion.insert
    * @desc Inserts a batch of new conversions into DoubleClick Search.
    * @alias doubleclicksearch.conversion.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ConversionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaConversionList] = js.native
  def insert(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def insert(params: ParamsResourceConversionInsert): GaxiosPromise[SchemaConversionList] = js.native
  def insert(params: ParamsResourceConversionInsert, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def insert(
    params: ParamsResourceConversionInsert,
    options: BodyResponseCallback[SchemaConversionList],
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  def insert(params: ParamsResourceConversionInsert, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def insert(
    params: ParamsResourceConversionInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  
  /**
    * doubleclicksearch.conversion.patch
    * @desc Updates a batch of conversions in DoubleClick Search. This method
    * supports patch semantics.
    * @alias doubleclicksearch.conversion.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId Numeric ID of the advertiser.
    * @param {string} params.agencyId Numeric ID of the agency.
    * @param {integer} params.endDate Last date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {string} params.engineAccountId Numeric ID of the engine account.
    * @param {integer} params.rowCount The number of conversions to return per call.
    * @param {integer} params.startDate First date (inclusive) on which to retrieve conversions. Format is yyyymmdd.
    * @param {integer} params.startRow The 0-based starting index for retrieving conversions results.
    * @param {().ConversionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaConversionList] = js.native
  def patch(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def patch(params: ParamsResourceConversionPatch): GaxiosPromise[SchemaConversionList] = js.native
  def patch(params: ParamsResourceConversionPatch, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def patch(
    params: ParamsResourceConversionPatch,
    options: BodyResponseCallback[SchemaConversionList],
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  def patch(params: ParamsResourceConversionPatch, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def patch(
    params: ParamsResourceConversionPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  
  /**
    * doubleclicksearch.conversion.update
    * @desc Updates a batch of conversions in DoubleClick Search.
    * @alias doubleclicksearch.conversion.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ConversionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaConversionList] = js.native
  def update(callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def update(params: ParamsResourceConversionUpdate): GaxiosPromise[SchemaConversionList] = js.native
  def update(params: ParamsResourceConversionUpdate, callback: BodyResponseCallback[SchemaConversionList]): Unit = js.native
  def update(
    params: ParamsResourceConversionUpdate,
    options: BodyResponseCallback[SchemaConversionList],
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  def update(params: ParamsResourceConversionUpdate, options: MethodOptions): GaxiosPromise[SchemaConversionList] = js.native
  def update(
    params: ParamsResourceConversionUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConversionList]
  ): Unit = js.native
  
  /**
    * doubleclicksearch.conversion.updateAvailability
    * @desc Updates the availabilities of a batch of floodlight activities in
    * DoubleClick Search.
    * @alias doubleclicksearch.conversion.updateAvailability
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UpdateAvailabilityRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAvailability(): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]): Unit = js.native
  def updateAvailability(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(params: ParamsResourceConversionUpdateavailability): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]
  ): Unit = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    options: BodyResponseCallback[SchemaUpdateAvailabilityResponse],
    callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]
  ): Unit = js.native
  def updateAvailability(params: ParamsResourceConversionUpdateavailability, options: MethodOptions): GaxiosPromise[SchemaUpdateAvailabilityResponse] = js.native
  def updateAvailability(
    params: ParamsResourceConversionUpdateavailability,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateAvailabilityResponse]
  ): Unit = js.native
}
