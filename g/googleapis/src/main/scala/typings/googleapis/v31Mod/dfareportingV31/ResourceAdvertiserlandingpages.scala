package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Advertiserlandingpages")
@js.native
class ResourceAdvertiserlandingpages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.advertiserLandingPages.get
    * @desc Gets one landing page by ID.
    * @alias dfareporting.advertiserLandingPages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Landing page ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLandingPage] = js.native
  def get(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def get(params: ParamsResourceAdvertiserlandingpagesGet): GaxiosPromise[SchemaLandingPage] = js.native
  def get(params: ParamsResourceAdvertiserlandingpagesGet, callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def get(
    params: ParamsResourceAdvertiserlandingpagesGet,
    options: BodyResponseCallback[SchemaLandingPage],
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertiserlandingpagesGet, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def get(
    params: ParamsResourceAdvertiserlandingpagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.insert
    * @desc Inserts a new landing page.
    * @alias dfareporting.advertiserLandingPages.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().LandingPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def insert(params: ParamsResourceAdvertiserlandingpagesInsert): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    options: BodyResponseCallback[SchemaLandingPage],
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def insert(params: ParamsResourceAdvertiserlandingpagesInsert, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.list
    * @desc Retrieves a list of landing pages.
    * @alias dfareporting.advertiserLandingPages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only landing pages that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived landing pages. Don't set this field to select both archived and non-archived landing pages.
    * @param {string=} params.ids Select only landing pages with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for landing pages by name or ID. Wildcards (*) are allowed. For example, "landingpage*2017" will return landing pages with names like "landingpage July 2017", "landingpage March 2017", or simply "landingpage 2017". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "landingpage" will match campaigns with name "my landingpage", "landingpage 2015", or simply "landingpage".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only landing pages that belong to this subaccount.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]): Unit = js.native
  def list(params: ParamsResourceAdvertiserlandingpagesList): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    options: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse],
    callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertiserlandingpagesList, options: MethodOptions): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.patch
    * @desc Updates an existing landing page. This method supports patch
    * semantics.
    * @alias dfareporting.advertiserLandingPages.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Landing page ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().LandingPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def patch(params: ParamsResourceAdvertiserlandingpagesPatch): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    options: BodyResponseCallback[SchemaLandingPage],
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertiserlandingpagesPatch, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.update
    * @desc Updates an existing landing page.
    * @alias dfareporting.advertiserLandingPages.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().LandingPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLandingPage] = js.native
  def update(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def update(params: ParamsResourceAdvertiserlandingpagesUpdate): GaxiosPromise[SchemaLandingPage] = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    options: BodyResponseCallback[SchemaLandingPage],
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def update(params: ParamsResourceAdvertiserlandingpagesUpdate, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
}

