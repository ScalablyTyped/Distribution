package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Directorysites")
@js.native
class ResourceDirectorysites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.directorySites.get
    * @desc Gets one directory site by ID.
    * @alias dfareporting.directorySites.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Directory site ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(params: ParamsResourceDirectorysitesGet): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(params: ParamsResourceDirectorysitesGet, callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def get(
    params: ParamsResourceDirectorysitesGet,
    options: BodyResponseCallback[SchemaDirectorySite],
    callback: BodyResponseCallback[SchemaDirectorySite]
  ): Unit = js.native
  def get(params: ParamsResourceDirectorysitesGet, options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(
    params: ParamsResourceDirectorysitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySite]
  ): Unit = js.native
  
  /**
    * dfareporting.directorySites.insert
    * @desc Inserts a new directory site.
    * @alias dfareporting.directorySites.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().DirectorySite} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(params: ParamsResourceDirectorysitesInsert): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(params: ParamsResourceDirectorysitesInsert, callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def insert(
    params: ParamsResourceDirectorysitesInsert,
    options: BodyResponseCallback[SchemaDirectorySite],
    callback: BodyResponseCallback[SchemaDirectorySite]
  ): Unit = js.native
  def insert(params: ParamsResourceDirectorysitesInsert, options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(
    params: ParamsResourceDirectorysitesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySite]
  ): Unit = js.native
  
  /**
    * dfareporting.directorySites.list
    * @desc Retrieves a list of directory sites, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.directorySites.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acceptsInStreamVideoPlacements This search filter is no longer supported and will have no effect on the results returned.
    * @param {boolean=} params.acceptsInterstitialPlacements This search filter is no longer supported and will have no effect on the results returned.
    * @param {boolean=} params.acceptsPublisherPaidPlacements Select only directory sites that accept publisher paid placements. This field can be left blank.
    * @param {boolean=} params.active Select only active directory sites. Leave blank to retrieve both active and inactive directory sites.
    * @param {string=} params.dfpNetworkCode Select only directory sites with this Ad Manager network code.
    * @param {string=} params.ids Select only directory sites with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name, ID or URL. Wildcards (*) are allowed. For example, "directory site*2015" will return objects with names like "directory site June 2015", "directory site April 2015", or simply "directory site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "directory site" will match objects with name "my directory site", "directory site 2015" or simply, "directory site".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDirectorySitesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(params: ParamsResourceDirectorysitesList): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    callback: BodyResponseCallback[SchemaDirectorySitesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    options: BodyResponseCallback[SchemaDirectorySitesListResponse],
    callback: BodyResponseCallback[SchemaDirectorySitesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDirectorysitesList, options: MethodOptions): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySitesListResponse]
  ): Unit = js.native
}
