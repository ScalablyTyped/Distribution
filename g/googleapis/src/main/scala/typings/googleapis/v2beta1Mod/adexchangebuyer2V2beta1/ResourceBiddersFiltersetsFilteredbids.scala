package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Filtersets$Filteredbids")
@js.native
class ResourceBiddersFiltersetsFilteredbids protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var creatives: ResourceBiddersFiltersetsFilteredbidsCreatives = js.native
  
  var details: ResourceBiddersFiltersetsFilteredbidsDetails = js.native
  
  /**
    * adexchangebuyer2.bidders.filterSets.filteredBids.list
    * @desc List all reasons for which bids were filtered, with the number of
    * bids filtered for each reason.
    * @alias adexchangebuyer2.bidders.filterSets.filteredBids.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.filterSetName Name of the filter set that should be applied to the requested metrics. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListFilteredBidsResponse.nextPageToken returned from the previous call to the filteredBids.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListFilteredBidsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFilteredBidsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFilteredBidsResponse] = js.native
  def list(params: ParamsResourceBiddersFiltersetsFilteredbidsList): GaxiosPromise[SchemaListFilteredBidsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsFilteredbidsList,
    callback: BodyResponseCallback[SchemaListFilteredBidsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsFilteredbidsList,
    options: BodyResponseCallback[SchemaListFilteredBidsResponse],
    callback: BodyResponseCallback[SchemaListFilteredBidsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersFiltersetsFilteredbidsList, options: MethodOptions): GaxiosPromise[SchemaListFilteredBidsResponse] = js.native
  def list(
    params: ParamsResourceBiddersFiltersetsFilteredbidsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFilteredBidsResponse]
  ): Unit = js.native
}
