package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Filters")
@js.native
class ResourceManagementFilters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.filters.delete
    * @desc Delete a filter.
    * @alias analytics.management.filters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the filter for.
    * @param {string} params.filterId ID of the filter to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaFilter] = js.native
  def delete(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def delete(params: ParamsResourceManagementFiltersDelete): GaxiosPromise[SchemaFilter] = js.native
  def delete(params: ParamsResourceManagementFiltersDelete, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def delete(
    params: ParamsResourceManagementFiltersDelete,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementFiltersDelete, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def delete(
    params: ParamsResourceManagementFiltersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  
  /**
    * analytics.management.filters.get
    * @desc Returns a filters to which the user has access.
    * @alias analytics.management.filters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve filters for.
    * @param {string} params.filterId Filter ID to retrieve filters for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFilter] = js.native
  def get(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceManagementFiltersGet): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceManagementFiltersGet, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(
    params: ParamsResourceManagementFiltersGet,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def get(params: ParamsResourceManagementFiltersGet, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(
    params: ParamsResourceManagementFiltersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  
  /**
    * analytics.management.filters.insert
    * @desc Create a new filter.
    * @alias analytics.management.filters.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create filter for.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaFilter] = js.native
  def insert(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def insert(params: ParamsResourceManagementFiltersInsert): GaxiosPromise[SchemaFilter] = js.native
  def insert(params: ParamsResourceManagementFiltersInsert, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def insert(
    params: ParamsResourceManagementFiltersInsert,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementFiltersInsert, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def insert(
    params: ParamsResourceManagementFiltersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  
  /**
    * analytics.management.filters.list
    * @desc Lists all filters for an account
    * @alias analytics.management.filters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve filters for.
    * @param {integer=} params.max-results The maximum number of filters to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFilters] = js.native
  def list(callback: BodyResponseCallback[SchemaFilters]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFilters] = js.native
  def list(params: ParamsResourceManagementFiltersList): GaxiosPromise[SchemaFilters] = js.native
  def list(params: ParamsResourceManagementFiltersList, callback: BodyResponseCallback[SchemaFilters]): Unit = js.native
  def list(
    params: ParamsResourceManagementFiltersList,
    options: BodyResponseCallback[SchemaFilters],
    callback: BodyResponseCallback[SchemaFilters]
  ): Unit = js.native
  def list(params: ParamsResourceManagementFiltersList, options: MethodOptions): GaxiosPromise[SchemaFilters] = js.native
  def list(
    params: ParamsResourceManagementFiltersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilters]
  ): Unit = js.native
  
  /**
    * analytics.management.filters.patch
    * @desc Updates an existing filter. This method supports patch semantics.
    * @alias analytics.management.filters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the filter belongs.
    * @param {string} params.filterId ID of the filter to be updated.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaFilter] = js.native
  def patch(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def patch(params: ParamsResourceManagementFiltersPatch): GaxiosPromise[SchemaFilter] = js.native
  def patch(params: ParamsResourceManagementFiltersPatch, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def patch(
    params: ParamsResourceManagementFiltersPatch,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementFiltersPatch, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def patch(
    params: ParamsResourceManagementFiltersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  
  /**
    * analytics.management.filters.update
    * @desc Updates an existing filter.
    * @alias analytics.management.filters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the filter belongs.
    * @param {string} params.filterId ID of the filter to be updated.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFilter] = js.native
  def update(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def update(params: ParamsResourceManagementFiltersUpdate): GaxiosPromise[SchemaFilter] = js.native
  def update(params: ParamsResourceManagementFiltersUpdate, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def update(
    params: ParamsResourceManagementFiltersUpdate,
    options: BodyResponseCallback[SchemaFilter],
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  def update(params: ParamsResourceManagementFiltersUpdate, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def update(
    params: ParamsResourceManagementFiltersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
}
