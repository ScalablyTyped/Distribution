package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Creativegroups")
@js.native
class ResourceCreativegroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.creativeGroups.get
    * @desc Gets one creative group by ID.
    * @alias dfareporting.creativeGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(params: ParamsResourceCreativegroupsGet): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(params: ParamsResourceCreativegroupsGet, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def get(
    params: ParamsResourceCreativegroupsGet,
    options: BodyResponseCallback[SchemaCreativeGroup],
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  def get(params: ParamsResourceCreativegroupsGet, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def get(
    params: ParamsResourceCreativegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeGroups.insert
    * @desc Inserts a new creative group.
    * @alias dfareporting.creativeGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(params: ParamsResourceCreativegroupsInsert): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(params: ParamsResourceCreativegroupsInsert, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def insert(
    params: ParamsResourceCreativegroupsInsert,
    options: BodyResponseCallback[SchemaCreativeGroup],
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativegroupsInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def insert(
    params: ParamsResourceCreativegroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeGroups.list
    * @desc Retrieves a list of creative groups, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.creativeGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only creative groups that belong to these advertisers.
    * @param {integer=} params.groupNumber Select only creative groups that belong to this subgroup.
    * @param {string=} params.ids Select only creative groups with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for creative groups by name or ID. Wildcards (*) are allowed. For example, "creativegroup*2015" will return creative groups with names like "creativegroup June 2015", "creativegroup April 2015", or simply "creativegroup 2015". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of "creativegroup" will match creative groups with the name "my creativegroup", "creativegroup 2015", or simply "creativegroup".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(params: ParamsResourceCreativegroupsList): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    options: BodyResponseCallback[SchemaCreativeGroupsListResponse],
    callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativegroupsList, options: MethodOptions): GaxiosPromise[SchemaCreativeGroupsListResponse] = js.native
  def list(
    params: ParamsResourceCreativegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroupsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeGroups.patch
    * @desc Updates an existing creative group. This method supports patch
    * semantics.
    * @alias dfareporting.creativeGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(params: ParamsResourceCreativegroupsPatch): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(params: ParamsResourceCreativegroupsPatch, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def patch(
    params: ParamsResourceCreativegroupsPatch,
    options: BodyResponseCallback[SchemaCreativeGroup],
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativegroupsPatch, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def patch(
    params: ParamsResourceCreativegroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeGroups.update
    * @desc Updates an existing creative group.
    * @alias dfareporting.creativeGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(params: ParamsResourceCreativegroupsUpdate): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(params: ParamsResourceCreativegroupsUpdate, callback: BodyResponseCallback[SchemaCreativeGroup]): Unit = js.native
  def update(
    params: ParamsResourceCreativegroupsUpdate,
    options: BodyResponseCallback[SchemaCreativeGroup],
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
  def update(params: ParamsResourceCreativegroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaCreativeGroup] = js.native
  def update(
    params: ParamsResourceCreativegroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeGroup]
  ): Unit = js.native
}
