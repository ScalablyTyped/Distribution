package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Placementgroups")
@js.native
class ResourcePlacementgroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.placementGroups.get
    * @desc Gets one placement group by ID.
    * @alias dfareporting.placementGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def get(params: ParamsResourcePlacementgroupsGet): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(params: ParamsResourcePlacementgroupsGet, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def get(
    params: ParamsResourcePlacementgroupsGet,
    options: BodyResponseCallback[SchemaPlacementGroup],
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  def get(params: ParamsResourcePlacementgroupsGet, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def get(
    params: ParamsResourcePlacementgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * dfareporting.placementGroups.insert
    * @desc Inserts a new placement group.
    * @alias dfareporting.placementGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def insert(params: ParamsResourcePlacementgroupsInsert): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(params: ParamsResourcePlacementgroupsInsert, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def insert(
    params: ParamsResourcePlacementgroupsInsert,
    options: BodyResponseCallback[SchemaPlacementGroup],
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  def insert(params: ParamsResourcePlacementgroupsInsert, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def insert(
    params: ParamsResourcePlacementgroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * dfareporting.placementGroups.list
    * @desc Retrieves a list of placement groups, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.placementGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only placement groups that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived placements. Don't set this field to select both archived and non-archived placements.
    * @param {string=} params.campaignIds Select only placement groups that belong to these campaigns.
    * @param {string=} params.contentCategoryIds Select only placement groups that are associated with these content categories.
    * @param {string=} params.directorySiteIds Select only placement groups that are associated with these directory sites.
    * @param {string=} params.ids Select only placement groups with these IDs.
    * @param {string=} params.maxEndDate Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.maxStartDate Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.minEndDate Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.minStartDate Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string=} params.placementGroupType Select only placement groups belonging with this group type. A package is a simple group of placements that acts as a single pricing point for a group of tags. A roadblock is a group of placements that not only acts as a single pricing point but also assumes that all the tags in it will be served at the same time. A roadblock requires one of its assigned placements to be marked as primary for reporting.
    * @param {string=} params.placementStrategyIds Select only placement groups that are associated with these placement strategies.
    * @param {string=} params.pricingTypes Select only placement groups with these pricing types.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for placement groups by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placement groups with names like "placement group June 2015", "placement group May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placementgroup" will match placement groups with name "my placementgroup", "placementgroup 2015", or simply "placementgroup".
    * @param {string=} params.siteIds Select only placement groups that are associated with these sites.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]): Unit = js.native
  def list(params: ParamsResourcePlacementgroupsList): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    options: BodyResponseCallback[SchemaPlacementGroupsListResponse],
    callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlacementgroupsList, options: MethodOptions): GaxiosPromise[SchemaPlacementGroupsListResponse] = js.native
  def list(
    params: ParamsResourcePlacementgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroupsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.placementGroups.patch
    * @desc Updates an existing placement group. This method supports patch
    * semantics.
    * @alias dfareporting.placementGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def patch(params: ParamsResourcePlacementgroupsPatch): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(params: ParamsResourcePlacementgroupsPatch, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def patch(
    params: ParamsResourcePlacementgroupsPatch,
    options: BodyResponseCallback[SchemaPlacementGroup],
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  def patch(params: ParamsResourcePlacementgroupsPatch, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def patch(
    params: ParamsResourcePlacementgroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  /**
    * dfareporting.placementGroups.update
    * @desc Updates an existing placement group.
    * @alias dfareporting.placementGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def update(params: ParamsResourcePlacementgroupsUpdate): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(params: ParamsResourcePlacementgroupsUpdate, callback: BodyResponseCallback[SchemaPlacementGroup]): Unit = js.native
  def update(
    params: ParamsResourcePlacementgroupsUpdate,
    options: BodyResponseCallback[SchemaPlacementGroup],
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
  def update(params: ParamsResourcePlacementgroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaPlacementGroup] = js.native
  def update(
    params: ParamsResourcePlacementgroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementGroup]
  ): Unit = js.native
}

