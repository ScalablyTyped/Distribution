package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Subaccounts")
@js.native
class ResourceSubaccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.subaccounts.get
    * @desc Gets one subaccount by ID.
    * @alias dfareporting.subaccounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Subaccount ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSubaccount] = js.native
  def get(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def get(params: ParamsResourceSubaccountsGet): GaxiosPromise[SchemaSubaccount] = js.native
  def get(params: ParamsResourceSubaccountsGet, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def get(
    params: ParamsResourceSubaccountsGet,
    options: BodyResponseCallback[SchemaSubaccount],
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  def get(params: ParamsResourceSubaccountsGet, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def get(
    params: ParamsResourceSubaccountsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  
  /**
    * dfareporting.subaccounts.insert
    * @desc Inserts a new subaccount.
    * @alias dfareporting.subaccounts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Subaccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(params: ParamsResourceSubaccountsInsert): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(params: ParamsResourceSubaccountsInsert, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def insert(
    params: ParamsResourceSubaccountsInsert,
    options: BodyResponseCallback[SchemaSubaccount],
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  def insert(params: ParamsResourceSubaccountsInsert, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def insert(
    params: ParamsResourceSubaccountsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  
  /**
    * dfareporting.subaccounts.list
    * @desc Gets a list of subaccounts, possibly filtered. This method supports
    * paging.
    * @alias dfareporting.subaccounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only subaccounts with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "subaccount*2015" will return objects with names like "subaccount June 2015", "subaccount April 2015", or simply "subaccount 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "subaccount" will match objects with name "my subaccount", "subaccount 2015", or simply "subaccount".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSubaccountsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(params: ParamsResourceSubaccountsList): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    callback: BodyResponseCallback[SchemaSubaccountsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    options: BodyResponseCallback[SchemaSubaccountsListResponse],
    callback: BodyResponseCallback[SchemaSubaccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSubaccountsList, options: MethodOptions): GaxiosPromise[SchemaSubaccountsListResponse] = js.native
  def list(
    params: ParamsResourceSubaccountsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccountsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.subaccounts.patch
    * @desc Updates an existing subaccount. This method supports patch
    * semantics.
    * @alias dfareporting.subaccounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Subaccount ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Subaccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(params: ParamsResourceSubaccountsPatch): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(params: ParamsResourceSubaccountsPatch, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def patch(
    params: ParamsResourceSubaccountsPatch,
    options: BodyResponseCallback[SchemaSubaccount],
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  def patch(params: ParamsResourceSubaccountsPatch, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def patch(
    params: ParamsResourceSubaccountsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  
  /**
    * dfareporting.subaccounts.update
    * @desc Updates an existing subaccount.
    * @alias dfareporting.subaccounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Subaccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSubaccount] = js.native
  def update(callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def update(params: ParamsResourceSubaccountsUpdate): GaxiosPromise[SchemaSubaccount] = js.native
  def update(params: ParamsResourceSubaccountsUpdate, callback: BodyResponseCallback[SchemaSubaccount]): Unit = js.native
  def update(
    params: ParamsResourceSubaccountsUpdate,
    options: BodyResponseCallback[SchemaSubaccount],
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
  def update(params: ParamsResourceSubaccountsUpdate, options: MethodOptions): GaxiosPromise[SchemaSubaccount] = js.native
  def update(
    params: ParamsResourceSubaccountsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubaccount]
  ): Unit = js.native
}
