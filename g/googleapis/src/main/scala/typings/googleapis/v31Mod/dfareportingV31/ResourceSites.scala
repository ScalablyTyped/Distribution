package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Sites")
@js.native
class ResourceSites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.sites.get
    * @desc Gets one site by ID.
    * @alias dfareporting.sites.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Site ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSite] = js.native
  def get(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(params: ParamsResourceSitesGet): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceSitesGet, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(
    params: ParamsResourceSitesGet,
    options: BodyResponseCallback[SchemaSite],
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceSitesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  /**
    * dfareporting.sites.insert
    * @desc Inserts a new site.
    * @alias dfareporting.sites.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Site} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSite] = js.native
  def insert(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def insert(params: ParamsResourceSitesInsert): GaxiosPromise[SchemaSite] = js.native
  def insert(params: ParamsResourceSitesInsert, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def insert(
    params: ParamsResourceSitesInsert,
    options: BodyResponseCallback[SchemaSite],
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  def insert(params: ParamsResourceSitesInsert, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def insert(
    params: ParamsResourceSitesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * dfareporting.sites.list
    * @desc Retrieves a list of sites, possibly filtered. This method supports
    * paging.
    * @alias dfareporting.sites.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsInStreamVideoPlacements This search filter is no longer supported and will have no effect on the results returned.
    * @param {boolean=} params.acceptsInterstitialPlacements This search filter is no longer supported and will have no effect on the results returned.
    * @param {boolean=} params.acceptsPublisherPaidPlacements Select only sites that accept publisher paid placements.
    * @param {boolean=} params.adWordsSite Select only AdWords sites.
    * @param {boolean=} params.approved Select only approved sites.
    * @param {string=} params.campaignIds Select only sites with these campaign IDs.
    * @param {string=} params.directorySiteIds Select only sites with these directory site IDs.
    * @param {string=} params.ids Select only sites with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name, ID or keyName. Wildcards (*) are allowed. For example, "site*2015" will return objects with names like "site June 2015", "site April 2015", or simply "site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "site" will match objects with name "my site", "site 2015", or simply "site".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only sites with this subaccount ID.
    * @param {boolean=} params.unmappedSite Select only sites that have not been mapped to a directory site.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(params: ParamsResourceSitesList): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(params: ParamsResourceSitesList, callback: BodyResponseCallback[SchemaSitesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSitesList,
    options: BodyResponseCallback[SchemaSitesListResponse],
    callback: BodyResponseCallback[SchemaSitesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesList, options: MethodOptions): GaxiosPromise[SchemaSitesListResponse] = js.native
  def list(
    params: ParamsResourceSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSitesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.sites.patch
    * @desc Updates an existing site. This method supports patch semantics.
    * @alias dfareporting.sites.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Site ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Site} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSite] = js.native
  def patch(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def patch(params: ParamsResourceSitesPatch): GaxiosPromise[SchemaSite] = js.native
  def patch(params: ParamsResourceSitesPatch, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def patch(
    params: ParamsResourceSitesPatch,
    options: BodyResponseCallback[SchemaSite],
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  def patch(params: ParamsResourceSitesPatch, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def patch(
    params: ParamsResourceSitesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * dfareporting.sites.update
    * @desc Updates an existing site.
    * @alias dfareporting.sites.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Site} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSite] = js.native
  def update(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def update(params: ParamsResourceSitesUpdate): GaxiosPromise[SchemaSite] = js.native
  def update(params: ParamsResourceSitesUpdate, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def update(
    params: ParamsResourceSitesUpdate,
    options: BodyResponseCallback[SchemaSite],
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  def update(params: ParamsResourceSitesUpdate, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def update(
    params: ParamsResourceSitesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
}

