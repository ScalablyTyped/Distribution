package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Finalizedproposals")
@js.native
class ResourceAccountsFinalizedproposals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer2.accounts.finalizedProposals.list
    * @desc List finalized proposals, regardless if a proposal is being
    * renegotiated. A filter expression (PQL query) may be specified to filter
    * the results. The notes will not be returned.
    * @alias adexchangebuyer2.accounts.finalizedProposals.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string=} params.filter An optional PQL filter query used to query for proposals.  Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
    * @param {string=} params.filterSyntax Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken The page token as returned from ListProposalsResponse.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProposalsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(params: ParamsResourceAccountsFinalizedproposalsList): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    options: BodyResponseCallback[SchemaListProposalsResponse],
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsFinalizedproposalsList, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
}
