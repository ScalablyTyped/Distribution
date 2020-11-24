package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Accounts$Creatives")
@js.native
class ResourceBiddersAccountsCreatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer2.bidders.accounts.creatives.delete
    * @desc Deletes a single creative.  A creative is deactivated upon deletion
    * and does not count against active snippet quota. A deleted creative
    * should not be used in bidding (all bids with that creative will be
    * rejected).
    * @alias adexchangebuyer2.bidders.accounts.creatives.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeId The ID of the creative to delete.
    * @param {string} params.ownerName Name of the owner (bidder or account) of the creative to be deleted. For example:  - For an account-level creative for the buyer account representing bidder   123: `bidders/123/accounts/123`  - For an account-level creative for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBiddersAccountsCreativesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBiddersAccountsCreativesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceBiddersAccountsCreativesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBiddersAccountsCreativesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBiddersAccountsCreativesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}
