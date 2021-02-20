package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Creatives")
@js.native
class ResourceCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.creatives.get
    * @desc Gets one creative by ID.
    * @alias dfareporting.creatives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceCreativesGet): GaxiosPromise[SchemaCreative] = js.native
  def get(params: ParamsResourceCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def get(params: ParamsResourceCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def get(
    params: ParamsResourceCreativesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  
  /**
    * dfareporting.creatives.insert
    * @desc Inserts a new creative.
    * @alias dfareporting.creatives.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreative] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def insert(params: ParamsResourceCreativesInsert): GaxiosPromise[SchemaCreative] = js.native
  def insert(params: ParamsResourceCreativesInsert, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativesInsert, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def insert(
    params: ParamsResourceCreativesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  
  /**
    * dfareporting.creatives.list
    * @desc Retrieves a list of creatives, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.creatives.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active creatives. Leave blank to select active and inactive creatives.
    * @param {string=} params.advertiserId Select only creatives with this advertiser ID.
    * @param {boolean=} params.archived Select only archived creatives. Leave blank to select archived and unarchived creatives.
    * @param {string=} params.campaignId Select only creatives with this campaign ID.
    * @param {string=} params.companionCreativeIds Select only in-stream video creatives with these companion IDs.
    * @param {string=} params.creativeFieldIds Select only creatives with these creative field IDs.
    * @param {string=} params.ids Select only creatives with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.renderingIds Select only creatives with these rendering IDs.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "creative*2015" will return objects with names like "creative June 2015", "creative April 2015", or simply "creative 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "creative" will match objects with name "my creative", "creative 2015", or simply "creative".
    * @param {string=} params.sizeIds Select only creatives with these size IDs.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.studioCreativeId Select only creatives corresponding to this Studio creative ID.
    * @param {string=} params.types Select only creatives with these creative types.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(params: ParamsResourceCreativesList): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(params: ParamsResourceCreativesList, callback: BodyResponseCallback[SchemaCreativesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: BodyResponseCallback[SchemaCreativesListResponse],
    callback: BodyResponseCallback[SchemaCreativesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativesList, options: MethodOptions): GaxiosPromise[SchemaCreativesListResponse] = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativesListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.creatives.patch
    * @desc Updates an existing creative. This method supports patch semantics.
    * @alias dfareporting.creatives.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCreative] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceCreativesPatch): GaxiosPromise[SchemaCreative] = js.native
  def patch(params: ParamsResourceCreativesPatch, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def patch(
    params: ParamsResourceCreativesPatch,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativesPatch, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def patch(
    params: ParamsResourceCreativesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  
  /**
    * dfareporting.creatives.update
    * @desc Updates an existing creative.
    * @alias dfareporting.creatives.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCreative] = js.native
  def update(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceCreativesUpdate): GaxiosPromise[SchemaCreative] = js.native
  def update(params: ParamsResourceCreativesUpdate, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def update(
    params: ParamsResourceCreativesUpdate,
    options: BodyResponseCallback[SchemaCreative],
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
  def update(params: ParamsResourceCreativesUpdate, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
  def update(
    params: ParamsResourceCreativesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreative]
  ): Unit = js.native
}
