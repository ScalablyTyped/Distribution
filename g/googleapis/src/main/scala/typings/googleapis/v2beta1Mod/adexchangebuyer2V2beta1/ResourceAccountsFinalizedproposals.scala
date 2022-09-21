package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Finalizedproposals")
@js.native
open class ResourceAccountsFinalizedproposals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProposalsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(params: ParamsResourceAccountsFinalizedproposalsList): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    options: BodyResponseCallback[Readable | SchemaListProposalsResponse],
    callback: BodyResponseCallback[Readable | SchemaListProposalsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsFinalizedproposalsList, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  /**
    * List finalized proposals, regardless if a proposal is being renegotiated. A filter expression (PQL query) may be specified to filter the results. The notes will not be returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.finalizedProposals.list({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // An optional PQL filter query used to query for proposals. Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
    *     filter: 'placeholder-value',
    *     // Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER.
    *     filterSyntax: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListProposalsResponse.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "proposals": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceAccountsFinalizedproposalsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsFinalizedproposalsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[SchemaProposal] = js.native
  def pause(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def pause(params: ParamsResourceAccountsFinalizedproposalsPause): GaxiosPromise[SchemaProposal] = js.native
  def pause(
    params: ParamsResourceAccountsFinalizedproposalsPause,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def pause(
    params: ParamsResourceAccountsFinalizedproposalsPause,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def pause(params: ParamsResourceAccountsFinalizedproposalsPause, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def pause(
    params: ParamsResourceAccountsFinalizedproposalsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update given deals to pause serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true for all listed deals in the request. Currently, this method only applies to PG and PD deals. For PA deals, please call accounts.proposals.pause endpoint. It is a no-op to pause already-paused deals. It is an error to call PauseProposalDeals for deals which are not part of the proposal of proposal_id or which are not finalized or renegotiating.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.finalizedProposals.pause({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The proposal_id of the proposal containing the deals.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "externalDealIds": [],
    *       //   "reason": "my_reason"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": {},
    *   //   "buyer": {},
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def pause(params: ParamsResourceAccountsFinalizedproposalsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceAccountsFinalizedproposalsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaProposal] = js.native
  def resume(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def resume(params: ParamsResourceAccountsFinalizedproposalsResume): GaxiosPromise[SchemaProposal] = js.native
  def resume(
    params: ParamsResourceAccountsFinalizedproposalsResume,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def resume(
    params: ParamsResourceAccountsFinalizedproposalsResume,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def resume(params: ParamsResourceAccountsFinalizedproposalsResume, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def resume(
    params: ParamsResourceAccountsFinalizedproposalsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update given deals to resume serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false for all listed deals in the request. Currently, this method only applies to PG and PD deals. For PA deals, please call accounts.proposals.resume endpoint. It is a no-op to resume running deals or deals paused by the other party. It is an error to call ResumeProposalDeals for deals which are not part of the proposal of proposal_id or which are not finalized or renegotiating.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.finalizedProposals.resume({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The proposal_id of the proposal containing the deals.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "externalDealIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": {},
    *   //   "buyer": {},
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def resume(params: ParamsResourceAccountsFinalizedproposalsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceAccountsFinalizedproposalsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
