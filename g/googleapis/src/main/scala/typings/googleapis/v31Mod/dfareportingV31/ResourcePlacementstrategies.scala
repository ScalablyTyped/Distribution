package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Placementstrategies")
@js.native
class ResourcePlacementstrategies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.placementStrategies.delete
    * @desc Deletes an existing placement strategy.
    * @alias dfareporting.placementStrategies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement strategy ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlacementstrategiesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePlacementstrategiesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePlacementstrategiesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePlacementstrategiesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePlacementstrategiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dfareporting.placementStrategies.get
    * @desc Gets one placement strategy by ID.
    * @alias dfareporting.placementStrategies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement strategy ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(params: ParamsResourcePlacementstrategiesGet): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    options: BodyResponseCallback[SchemaPlacementStrategy],
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def get(params: ParamsResourcePlacementstrategiesGet, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def get(
    params: ParamsResourcePlacementstrategiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  
  /**
    * dfareporting.placementStrategies.insert
    * @desc Inserts a new placement strategy.
    * @alias dfareporting.placementStrategies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementStrategy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(params: ParamsResourcePlacementstrategiesInsert): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    options: BodyResponseCallback[SchemaPlacementStrategy],
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def insert(params: ParamsResourcePlacementstrategiesInsert, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def insert(
    params: ParamsResourcePlacementstrategiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  
  /**
    * dfareporting.placementStrategies.list
    * @desc Retrieves a list of placement strategies, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.placementStrategies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only placement strategies with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "placementstrategy*2015" will return objects with names like "placementstrategy June 2015", "placementstrategy April 2015", or simply "placementstrategy 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placementstrategy" will match objects with name "my placementstrategy", "placementstrategy 2015", or simply "placementstrategy".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(params: ParamsResourcePlacementstrategiesList): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    options: BodyResponseCallback[SchemaPlacementStrategiesListResponse],
    callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlacementstrategiesList, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategiesListResponse] = js.native
  def list(
    params: ParamsResourcePlacementstrategiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategiesListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.placementStrategies.patch
    * @desc Updates an existing placement strategy. This method supports patch
    * semantics.
    * @alias dfareporting.placementStrategies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement strategy ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementStrategy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(params: ParamsResourcePlacementstrategiesPatch): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    options: BodyResponseCallback[SchemaPlacementStrategy],
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def patch(params: ParamsResourcePlacementstrategiesPatch, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def patch(
    params: ParamsResourcePlacementstrategiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  
  /**
    * dfareporting.placementStrategies.update
    * @desc Updates an existing placement strategy.
    * @alias dfareporting.placementStrategies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementStrategy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(callback: BodyResponseCallback[SchemaPlacementStrategy]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(params: ParamsResourcePlacementstrategiesUpdate): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    options: BodyResponseCallback[SchemaPlacementStrategy],
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
  def update(params: ParamsResourcePlacementstrategiesUpdate, options: MethodOptions): GaxiosPromise[SchemaPlacementStrategy] = js.native
  def update(
    params: ParamsResourcePlacementstrategiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlacementStrategy]
  ): Unit = js.native
}
