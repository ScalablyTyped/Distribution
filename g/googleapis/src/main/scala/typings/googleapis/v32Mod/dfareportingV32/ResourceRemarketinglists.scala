package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Remarketinglists")
@js.native
class ResourceRemarketinglists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.remarketingLists.get
    * @desc Gets one remarketing list by ID.
    * @alias dfareporting.remarketingLists.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Remarketing list ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(params: ParamsResourceRemarketinglistsGet): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(params: ParamsResourceRemarketinglistsGet, callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def get(
    params: ParamsResourceRemarketinglistsGet,
    options: BodyResponseCallback[SchemaRemarketingList],
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def get(params: ParamsResourceRemarketinglistsGet, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def get(
    params: ParamsResourceRemarketinglistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  
  /**
    * dfareporting.remarketingLists.insert
    * @desc Inserts a new remarketing list.
    * @alias dfareporting.remarketingLists.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(params: ParamsResourceRemarketinglistsInsert): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    options: BodyResponseCallback[SchemaRemarketingList],
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def insert(params: ParamsResourceRemarketinglistsInsert, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def insert(
    params: ParamsResourceRemarketinglistsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  
  /**
    * dfareporting.remarketingLists.list
    * @desc Retrieves a list of remarketing lists, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.remarketingLists.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active or only inactive remarketing lists.
    * @param {string} params.advertiserId Select only remarketing lists owned by this advertiser.
    * @param {string=} params.floodlightActivityId Select only remarketing lists that have this floodlight activity ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.name Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "remarketing list*2015" will return objects with names like "remarketing list June 2015", "remarketing list April 2015", or simply "remarketing list 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "remarketing list" will match objects with name "my remarketing list", "remarketing list 2015", or simply "remarketing list".
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaRemarketingListsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(params: ParamsResourceRemarketinglistsList): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    callback: BodyResponseCallback[SchemaRemarketingListsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    options: BodyResponseCallback[SchemaRemarketingListsListResponse],
    callback: BodyResponseCallback[SchemaRemarketingListsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRemarketinglistsList, options: MethodOptions): GaxiosPromise[SchemaRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceRemarketinglistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingListsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.remarketingLists.patch
    * @desc Updates an existing remarketing list. This method supports patch
    * semantics.
    * @alias dfareporting.remarketingLists.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Remarketing list ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(params: ParamsResourceRemarketinglistsPatch): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(params: ParamsResourceRemarketinglistsPatch, callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def patch(
    params: ParamsResourceRemarketinglistsPatch,
    options: BodyResponseCallback[SchemaRemarketingList],
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def patch(params: ParamsResourceRemarketinglistsPatch, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def patch(
    params: ParamsResourceRemarketinglistsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  
  /**
    * dfareporting.remarketingLists.update
    * @desc Updates an existing remarketing list.
    * @alias dfareporting.remarketingLists.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().RemarketingList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(callback: BodyResponseCallback[SchemaRemarketingList]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(params: ParamsResourceRemarketinglistsUpdate): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    options: BodyResponseCallback[SchemaRemarketingList],
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
  def update(params: ParamsResourceRemarketinglistsUpdate, options: MethodOptions): GaxiosPromise[SchemaRemarketingList] = js.native
  def update(
    params: ParamsResourceRemarketinglistsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRemarketingList]
  ): Unit = js.native
}
