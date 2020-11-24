package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplacenotes")
@js.native
class ResourceMarketplacenotes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.marketplacenotes.insert
    * @desc Add notes to the proposal
    * @alias adexchangebuyer.marketplacenotes.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposalId to add notes for.
    * @param {().AddOrderNotesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaAddOrderNotesResponse]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(params: ParamsResourceMarketplacenotesInsert): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    callback: BodyResponseCallback[SchemaAddOrderNotesResponse]
  ): Unit = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    options: BodyResponseCallback[SchemaAddOrderNotesResponse],
    callback: BodyResponseCallback[SchemaAddOrderNotesResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceMarketplacenotesInsert, options: MethodOptions): GaxiosPromise[SchemaAddOrderNotesResponse] = js.native
  def insert(
    params: ParamsResourceMarketplacenotesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAddOrderNotesResponse]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.marketplacenotes.list
    * @desc Get all the notes associated with a proposal
    * @alias adexchangebuyer.marketplacenotes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pqlQuery Query string to retrieve specific notes. To search the text contents of notes, please use syntax like "WHERE note.note = "foo" or "WHERE note.note LIKE "%bar%"
    * @param {string} params.proposalId The proposalId to get notes for. To search across all proposals specify order_id = '-' as part of the URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGetOrderNotesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(params: ParamsResourceMarketplacenotesList): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    callback: BodyResponseCallback[SchemaGetOrderNotesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    options: BodyResponseCallback[SchemaGetOrderNotesResponse],
    callback: BodyResponseCallback[SchemaGetOrderNotesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMarketplacenotesList, options: MethodOptions): GaxiosPromise[SchemaGetOrderNotesResponse] = js.native
  def list(
    params: ParamsResourceMarketplacenotesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOrderNotesResponse]
  ): Unit = js.native
}
