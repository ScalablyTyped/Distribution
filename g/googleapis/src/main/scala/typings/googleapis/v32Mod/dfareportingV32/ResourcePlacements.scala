package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Placements")
@js.native
class ResourcePlacements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.placements.generatetags
    * @desc Generates tags for a placement.
    * @alias dfareporting.placements.generatetags
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.campaignId Generate placements belonging to this campaign. This is a required field.
    * @param {string=} params.placementIds Generate tags for these placements.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.tagFormats Tag formats to generate for these placements.  Note: PLACEMENT_TAG_STANDARD can only be generated for 1x1 placements.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generatetags(): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]): Unit = js.native
  def generatetags(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(params: ParamsResourcePlacementsGeneratetags): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]
  ): Unit = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    options: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse],
    callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]
  ): Unit = js.native
  def generatetags(params: ParamsResourcePlacementsGeneratetags, options: MethodOptions): GaxiosPromise[SchemaPlacementsGenerateTagsResponse] = js.native
  def generatetags(
    params: ParamsResourcePlacementsGeneratetags,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementsGenerateTagsResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.placements.get
    * @desc Gets one placement by ID.
    * @alias dfareporting.placements.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPlacement] = js.native
  def get(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def get(params: ParamsResourcePlacementsGet): GaxiosPromise[SchemaPlacement] = js.native
  def get(params: ParamsResourcePlacementsGet, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def get(
    params: ParamsResourcePlacementsGet,
    options: BodyResponseCallback[SchemaPlacement],
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  def get(params: ParamsResourcePlacementsGet, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def get(
    params: ParamsResourcePlacementsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  
  /**
    * dfareporting.placements.insert
    * @desc Inserts a new placement.
    * @alias dfareporting.placements.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Placement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPlacement] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def insert(params: ParamsResourcePlacementsInsert): GaxiosPromise[SchemaPlacement] = js.native
  def insert(params: ParamsResourcePlacementsInsert, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def insert(
    params: ParamsResourcePlacementsInsert,
    options: BodyResponseCallback[SchemaPlacement],
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  def insert(params: ParamsResourcePlacementsInsert, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def insert(
    params: ParamsResourcePlacementsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  
  /**
    * dfareporting.placements.list
    * @desc Retrieves a list of placements, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.placements.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only placements that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived placements. Don't set this field to select both archived and non-archived placements.
    * @param {string=} params.campaignIds Select only placements that belong to these campaigns.
    * @param {string=} params.compatibilities Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
    * @param {string=} params.contentCategoryIds Select only placements that are associated with these content categories.
    * @param {string=} params.directorySiteIds Select only placements that are associated with these directory sites.
    * @param {string=} params.groupIds Select only placements that belong to these placement groups.
    * @param {string=} params.ids Select only placements with these IDs.
    * @param {string=} params.maxEndDate Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.maxStartDate Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.minEndDate Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.minStartDate Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string=} params.paymentSource Select only placements with this payment source.
    * @param {string=} params.placementStrategyIds Select only placements that are associated with these placement strategies.
    * @param {string=} params.pricingTypes Select only placements with these pricing types.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placements with names like "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply "placement".
    * @param {string=} params.siteIds Select only placements that are associated with these sites.
    * @param {string=} params.sizeIds Select only placements that are associated with these sizes.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlacementsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(params: ParamsResourcePlacementsList): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(params: ParamsResourcePlacementsList, callback: BodyResponseCallback[SchemaPlacementsListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlacementsList,
    options: BodyResponseCallback[SchemaPlacementsListResponse],
    callback: BodyResponseCallback[SchemaPlacementsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlacementsList, options: MethodOptions): GaxiosPromise[SchemaPlacementsListResponse] = js.native
  def list(
    params: ParamsResourcePlacementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.placements.patch
    * @desc Updates an existing placement. This method supports patch
    * semantics.
    * @alias dfareporting.placements.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Placement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPlacement] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def patch(params: ParamsResourcePlacementsPatch): GaxiosPromise[SchemaPlacement] = js.native
  def patch(params: ParamsResourcePlacementsPatch, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def patch(
    params: ParamsResourcePlacementsPatch,
    options: BodyResponseCallback[SchemaPlacement],
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  def patch(params: ParamsResourcePlacementsPatch, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def patch(
    params: ParamsResourcePlacementsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  
  /**
    * dfareporting.placements.update
    * @desc Updates an existing placement.
    * @alias dfareporting.placements.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Placement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPlacement] = js.native
  def update(callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def update(params: ParamsResourcePlacementsUpdate): GaxiosPromise[SchemaPlacement] = js.native
  def update(params: ParamsResourcePlacementsUpdate, callback: BodyResponseCallback[SchemaPlacement]): Unit = js.native
  def update(
    params: ParamsResourcePlacementsUpdate,
    options: BodyResponseCallback[SchemaPlacement],
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
  def update(params: ParamsResourcePlacementsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlacement] = js.native
  def update(
    params: ParamsResourcePlacementsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacement]
  ): Unit = js.native
}
