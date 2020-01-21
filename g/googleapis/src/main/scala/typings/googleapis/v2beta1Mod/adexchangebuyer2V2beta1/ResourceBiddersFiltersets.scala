package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Filtersets")
@js.native
class ResourceBiddersFiltersets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var bidMetrics: ResourceBiddersFiltersetsBidmetrics = js.native
  var bidResponseErrors: ResourceBiddersFiltersetsBidresponseerrors = js.native
  var bidResponsesWithoutBids: ResourceBiddersFiltersetsBidresponseswithoutbids = js.native
  var context: APIRequestContext = js.native
  var filteredBidRequests: ResourceBiddersFiltersetsFilteredbidrequests = js.native
  var filteredBids: ResourceBiddersFiltersetsFilteredbids = js.native
  var impressionMetrics: ResourceBiddersFiltersetsImpressionmetrics = js.native
  var losingBids: ResourceBiddersFiltersetsLosingbids = js.native
  var nonBillableWinningBids: ResourceBiddersFiltersetsNonbillablewinningbids = js.native
  /**
    * adexchangebuyer2.bidders.filterSets.create
    * @desc Creates the specified filter set for the account with the given
    * account ID.
    * @alias adexchangebuyer2.bidders.filterSets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.isTransient Whether the filter set is transient, or should be persisted indefinitely. By default, filter sets are not transient. If transient, it will be available for at least 1 hour after creation.
    * @param {string} params.ownerName Name of the owner (bidder or account) of the filter set to be created. For example:  - For a bidder-level filter set for bidder 123: `bidders/123`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456`
    * @param {().FilterSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaFilterSet] = js.native
  def create(callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def create(params: ParamsResourceBiddersFiltersetsCreate): GaxiosPromise[SchemaFilterSet] = js.native
  def create(params: ParamsResourceBiddersFiltersetsCreate, callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def create(
    params: ParamsResourceBiddersFiltersetsCreate,
    options: BodyResponseCallback[SchemaFilterSet],
    callback: BodyResponseCallback[SchemaFilterSet]
  ): Unit = js.native
  def create(params: ParamsResourceBiddersFiltersetsCreate, options: MethodOptions): GaxiosPromise[SchemaFilterSet] = js.native
  def create(
    params: ParamsResourceBiddersFiltersetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilterSet]
  ): Unit = js.native
  /**
    * adexchangebuyer2.bidders.filterSets.delete
    * @desc Deletes the requested filter set from the account with the given
    * account ID.
    * @alias adexchangebuyer2.bidders.filterSets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Full name of the resource to delete. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceBiddersFiltersetsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBiddersFiltersetsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceBiddersFiltersetsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBiddersFiltersetsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBiddersFiltersetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * adexchangebuyer2.bidders.filterSets.get
    * @desc Retrieves the requested filter set for the account with the given
    * account ID.
    * @alias adexchangebuyer2.bidders.filterSets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Full name of the resource being requested. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFilterSet] = js.native
  def get(callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def get(params: ParamsResourceBiddersFiltersetsGet): GaxiosPromise[SchemaFilterSet] = js.native
  def get(params: ParamsResourceBiddersFiltersetsGet, callback: BodyResponseCallback[SchemaFilterSet]): Unit = js.native
  def get(
    params: ParamsResourceBiddersFiltersetsGet,
    options: BodyResponseCallback[SchemaFilterSet],
    callback: BodyResponseCallback[SchemaFilterSet]
  ): Unit = js.native
  def get(params: ParamsResourceBiddersFiltersetsGet, options: MethodOptions): GaxiosPromise[SchemaFilterSet] = js.native
  def get(
    params: ParamsResourceBiddersFiltersetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilterSet]
  ): Unit = js.native
  /**
    * adexchangebuyer2.bidders.filterSets.list
    * @desc Lists all filter sets for the account with the given account ID.
    * @alias adexchangebuyer2.bidders.filterSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.ownerName Name of the owner (bidder or account) of the filter sets to be listed. For example:  - For a bidder-level filter set for bidder 123: `bidders/123`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456`
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListFilterSetsResponse.nextPageToken returned from the previous call to the accounts.filterSets.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFilterSetsResponse]): Unit = js.native
  def list(params: ParamsResourceBiddersFiltersetsList): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    callback: BodyResponseCallback[SchemaListFilterSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    options: BodyResponseCallback[SchemaListFilterSetsResponse],
    callback: BodyResponseCallback[SchemaListFilterSetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersFiltersetsList, options: MethodOptions): GaxiosPromise[SchemaListFilterSetsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFilterSetsResponse]
  ): Unit = js.native
}

