package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Creatives$Dealassociations")
@js.native
class ResourceAccountsCreativesDealassociations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.creatives.dealAssociations.add
    * @desc Associate an existing deal with a creative.
    * @alias adexchangebuyer2.accounts.creatives.dealAssociations.add
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account the creative belongs to.
    * @param {string} params.creativeId The ID of the creative associated with the deal.
    * @param {().AddDealAssociationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def add(): GaxiosPromise[SchemaEmpty] = js.native
  def add(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def add(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def add(params: ParamsResourceAccountsCreativesDealassociationsAdd): GaxiosPromise[SchemaEmpty] = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def add(params: ParamsResourceAccountsCreativesDealassociationsAdd, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def add(
    params: ParamsResourceAccountsCreativesDealassociationsAdd,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.dealAssociations.list
    * @desc List all creative-deal associations.
    * @alias adexchangebuyer2.accounts.creatives.dealAssociations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account to list the associations from. Specify "-" to list all creatives the current user has access to.
    * @param {string} params.creativeId The creative ID to list the associations from. Specify "-" to list all creatives under the above account.
    * @param {integer=} params.pageSize Requested page size. Server may return fewer associations than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListDealAssociationsResponse.next_page_token returned from the previous call to 'ListDealAssociations' method.
    * @param {string=} params.query An optional query string to filter deal associations. If no filter is specified, all associations will be returned. Supported queries are: <ul> <li>accountId=<i>account_id_string</i> <li>creativeId=<i>creative_id_string</i> <li>dealsId=<i>deals_id_string</i> <li>dealsStatus:{approved, conditionally_approved, disapproved,                   not_checked} <li>openAuctionStatus:{approved, conditionally_approved, disapproved,                          not_checked} </ul> Example: 'dealsId=12345 AND dealsStatus:disapproved'
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDealAssociationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(params: ParamsResourceAccountsCreativesDealassociationsList): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    callback: BodyResponseCallback[SchemaListDealAssociationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    options: BodyResponseCallback[SchemaListDealAssociationsResponse],
    callback: BodyResponseCallback[SchemaListDealAssociationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCreativesDealassociationsList, options: MethodOptions): GaxiosPromise[SchemaListDealAssociationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCreativesDealassociationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDealAssociationsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.creatives.dealAssociations.remove
    * @desc Remove the association between a deal and a creative.
    * @alias adexchangebuyer2.accounts.creatives.dealAssociations.remove
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account the creative belongs to.
    * @param {string} params.creativeId The ID of the creative associated with the deal.
    * @param {().RemoveDealAssociationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def remove(): GaxiosPromise[SchemaEmpty] = js.native
  def remove(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def remove(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def remove(params: ParamsResourceAccountsCreativesDealassociationsRemove): GaxiosPromise[SchemaEmpty] = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def remove(params: ParamsResourceAccountsCreativesDealassociationsRemove, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def remove(
    params: ParamsResourceAccountsCreativesDealassociationsRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

