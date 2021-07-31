package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Floodlightactivitygroups")
@js.native
class ResourceFloodlightactivitygroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.floodlightActivityGroups.get
    * @desc Gets one floodlight activity group by ID.
    * @alias dfareporting.floodlightActivityGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity Group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(params: ParamsResourceFloodlightactivitygroupsGet): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    options: BodyResponseCallback[SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightactivitygroupsGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def get(
    params: ParamsResourceFloodlightactivitygroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightActivityGroups.insert
    * @desc Inserts a new floodlight activity group.
    * @alias dfareporting.floodlightActivityGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivityGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(params: ParamsResourceFloodlightactivitygroupsInsert): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    options: BodyResponseCallback[SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceFloodlightactivitygroupsInsert, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitygroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightActivityGroups.list
    * @desc Retrieves a list of floodlight activity groups, possibly filtered.
    * This method supports paging.
    * @alias dfareporting.floodlightActivityGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only floodlight activity groups with the specified advertiser ID. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.floodlightConfigurationId Select only floodlight activity groups with the specified floodlight configuration ID. Must specify either advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.ids Select only floodlight activity groups with the specified IDs. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "floodlightactivitygroup*2015" will return objects with names like "floodlightactivitygroup June 2015", "floodlightactivitygroup April 2015", or simply "floodlightactivitygroup 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivitygroup" will match objects with name "my floodlightactivitygroup activity", "floodlightactivitygroup 2015", or simply "floodlightactivitygroup".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.type Select only floodlight activity groups with the specified floodlight activity group type.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(params: ParamsResourceFloodlightactivitygroupsList): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    options: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse],
    callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFloodlightactivitygroupsList, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroupsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitygroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroupsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightActivityGroups.patch
    * @desc Updates an existing floodlight activity group. This method supports
    * patch semantics.
    * @alias dfareporting.floodlightActivityGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity Group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivityGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(params: ParamsResourceFloodlightactivitygroupsPatch): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    options: BodyResponseCallback[SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightactivitygroupsPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitygroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.floodlightActivityGroups.update
    * @desc Updates an existing floodlight activity group.
    * @alias dfareporting.floodlightActivityGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivityGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaFloodlightActivityGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(params: ParamsResourceFloodlightactivitygroupsUpdate): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    options: BodyResponseCallback[SchemaFloodlightActivityGroup],
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
  def update(params: ParamsResourceFloodlightactivitygroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivityGroup] = js.native
  def update(
    params: ParamsResourceFloodlightactivitygroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivityGroup]
  ): Unit = js.native
}
