package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Creatives")
@js.native
class ResourceCreatives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * adexchangebuyer.creatives.addDeal
    * @desc Add a deal id association for the creative.
    * @alias adexchangebuyer.creatives.addDeal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {string} params.dealId The id of the deal id to associate with this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addDeal(): GaxiosPromise[Unit] = js.native
  def addDeal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def addDeal(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def addDeal(params: ParamsResourceCreativesAdddeal): GaxiosPromise[Unit] = js.native
  def addDeal(params: ParamsResourceCreativesAdddeal, callback: BodyResponseCallback[Unit]): Unit = js.native
  def addDeal(
    params: ParamsResourceCreativesAdddeal,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def addDeal(params: ParamsResourceCreativesAdddeal, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def addDeal(
    params: ParamsResourceCreativesAdddeal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.creatives.get
    * @desc Gets the status for a single creative. A creative will be available
    * 30-40 minutes after submission.
    * @alias adexchangebuyer.creatives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCreative] = js.native
  def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
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
    * adexchangebuyer.creatives.insert
    * @desc Submit a new creative.
    * @alias adexchangebuyer.creatives.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreative] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
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
    * adexchangebuyer.creatives.list
    * @desc Retrieves a list of the authenticated user's active creatives. A
    * creative will be available 30-40 minutes after submission.
    * @alias adexchangebuyer.creatives.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.accountId When specified, only creatives for the given account ids are returned.
    * @param {string=} params.buyerCreativeId When specified, only creatives for the given buyer creative ids are returned.
    * @param {string=} params.dealsStatusFilter When specified, only creatives having the given deals status are returned.
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    * @param {string=} params.openAuctionStatusFilter When specified, only creatives having the given open auction status are returned.
    * @param {string=} params.pageToken A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCreativesList] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativesList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativesList] = js.native
  def list(params: ParamsResourceCreativesList): GaxiosPromise[SchemaCreativesList] = js.native
  def list(params: ParamsResourceCreativesList, callback: BodyResponseCallback[SchemaCreativesList]): Unit = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: BodyResponseCallback[SchemaCreativesList],
    callback: BodyResponseCallback[SchemaCreativesList]
  ): Unit = js.native
  def list(params: ParamsResourceCreativesList, options: MethodOptions): GaxiosPromise[SchemaCreativesList] = js.native
  def list(
    params: ParamsResourceCreativesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativesList]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.creatives.listDeals
    * @desc Lists the external deal ids associated with the creative.
    * @alias adexchangebuyer.creatives.listDeals
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listDeals(): GaxiosPromise[SchemaCreativeDealIds] = js.native
  def listDeals(callback: BodyResponseCallback[SchemaCreativeDealIds]): Unit = js.native
  def listDeals(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativeDealIds] = js.native
  def listDeals(params: ParamsResourceCreativesListdeals): GaxiosPromise[SchemaCreativeDealIds] = js.native
  def listDeals(params: ParamsResourceCreativesListdeals, callback: BodyResponseCallback[SchemaCreativeDealIds]): Unit = js.native
  def listDeals(
    params: ParamsResourceCreativesListdeals,
    options: BodyResponseCallback[SchemaCreativeDealIds],
    callback: BodyResponseCallback[SchemaCreativeDealIds]
  ): Unit = js.native
  def listDeals(params: ParamsResourceCreativesListdeals, options: MethodOptions): GaxiosPromise[SchemaCreativeDealIds] = js.native
  def listDeals(
    params: ParamsResourceCreativesListdeals,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeDealIds]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.creatives.removeDeal
    * @desc Remove a deal id associated with the creative.
    * @alias adexchangebuyer.creatives.removeDeal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The id for the account that will serve this creative.
    * @param {string} params.buyerCreativeId The buyer-specific id for this creative.
    * @param {string} params.dealId The id of the deal id to disassociate with this creative.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeDeal(): GaxiosPromise[Unit] = js.native
  def removeDeal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def removeDeal(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def removeDeal(params: ParamsResourceCreativesRemovedeal): GaxiosPromise[Unit] = js.native
  def removeDeal(params: ParamsResourceCreativesRemovedeal, callback: BodyResponseCallback[Unit]): Unit = js.native
  def removeDeal(
    params: ParamsResourceCreativesRemovedeal,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def removeDeal(params: ParamsResourceCreativesRemovedeal, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def removeDeal(
    params: ParamsResourceCreativesRemovedeal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
