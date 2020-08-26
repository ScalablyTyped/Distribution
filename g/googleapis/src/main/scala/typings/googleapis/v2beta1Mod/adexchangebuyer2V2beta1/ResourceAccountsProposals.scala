package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Proposals")
@js.native
class ResourceAccountsProposals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.proposals.accept
    * @desc Mark the proposal as accepted at the given revision number. If the
    * number does not match the server's revision number an `ABORTED` error
    * message will be returned. This call updates the proposal_state from
    * `PROPOSED` to `BUYER_ACCEPTED`, or from `SELLER_ACCEPTED` to `FINALIZED`.
    * @alias adexchangebuyer2.accounts.proposals.accept
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to accept.
    * @param {().AcceptProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def accept(): GaxiosPromise[SchemaProposal] = js.native
  def accept(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def accept(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def accept(params: ParamsResourceAccountsProposalsAccept): GaxiosPromise[SchemaProposal] = js.native
  def accept(params: ParamsResourceAccountsProposalsAccept, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def accept(
    params: ParamsResourceAccountsProposalsAccept,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def accept(params: ParamsResourceAccountsProposalsAccept, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def accept(
    params: ParamsResourceAccountsProposalsAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.addNote
    * @desc Create a new note and attach it to the proposal. The note is
    * assigned a unique ID by the server. The proposal revision number will not
    * increase when associated with a new note.
    * @alias adexchangebuyer2.accounts.proposals.addNote
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to attach the note to.
    * @param {().AddNoteRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addNote(): GaxiosPromise[SchemaNote] = js.native
  def addNote(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def addNote(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def addNote(params: ParamsResourceAccountsProposalsAddnote): GaxiosPromise[SchemaNote] = js.native
  def addNote(params: ParamsResourceAccountsProposalsAddnote, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def addNote(
    params: ParamsResourceAccountsProposalsAddnote,
    options: BodyResponseCallback[SchemaNote],
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  def addNote(params: ParamsResourceAccountsProposalsAddnote, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def addNote(
    params: ParamsResourceAccountsProposalsAddnote,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.cancelNegotiation
    * @desc Cancel an ongoing negotiation on a proposal. This does not cancel
    * or end serving for the deals if the proposal has been finalized, but only
    * cancels a negotiation unilaterally.
    * @alias adexchangebuyer2.accounts.proposals.cancelNegotiation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to cancel negotiation for.
    * @param {().CancelNegotiationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancelNegotiation(): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def cancelNegotiation(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(params: ParamsResourceAccountsProposalsCancelnegotiation): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def cancelNegotiation(params: ParamsResourceAccountsProposalsCancelnegotiation, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.completeSetup
    * @desc Update the given proposal to indicate that setup has been
    * completed. This method is called by the buyer when the line items have
    * been created on their end for a finalized proposal and all the required
    * creatives have been uploaded using the creatives API. This call updates
    * the `is_setup_completed` bit on the proposal and also notifies the
    * seller. The server will advance the revision number of the most recent
    * proposal.
    * @alias adexchangebuyer2.accounts.proposals.completeSetup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to mark as setup completed.
    * @param {().CompleteSetupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeSetup(): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def completeSetup(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(params: ParamsResourceAccountsProposalsCompletesetup): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def completeSetup(params: ParamsResourceAccountsProposalsCompletesetup, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.create
    * @desc Create the given proposal. Each created proposal and any deals it
    * contains are assigned a unique ID by the server.
    * @alias adexchangebuyer2.accounts.proposals.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaProposal] = js.native
  def create(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def create(params: ParamsResourceAccountsProposalsCreate): GaxiosPromise[SchemaProposal] = js.native
  def create(params: ParamsResourceAccountsProposalsCreate, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def create(
    params: ParamsResourceAccountsProposalsCreate,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsProposalsCreate, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def create(
    params: ParamsResourceAccountsProposalsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.get
    * @desc Gets a proposal given its ID. The proposal is returned at its head
    * revision.
    * @alias adexchangebuyer2.accounts.proposals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The unique ID of the proposal
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProposal] = js.native
  def get(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceAccountsProposalsGet): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceAccountsProposalsGet, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(
    params: ParamsResourceAccountsProposalsGet,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsProposalsGet, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(
    params: ParamsResourceAccountsProposalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.list
    * @desc List proposals. A filter expression (PQL query) may be specified to
    * filter the results. To retrieve all finalized proposals, regardless if a
    * proposal is being renegotiated, see the FinalizedProposals resource. Note
    * that Bidder/ChildSeat relationships differ from the usual behavior. A
    * Bidder account can only see its child seats' proposals by specifying the
    * ChildSeat's accountId in the request path.
    * @alias adexchangebuyer2.accounts.proposals.list
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
  def list(params: ParamsResourceAccountsProposalsList): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    options: BodyResponseCallback[SchemaListProposalsResponse],
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsProposalsList, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.pause
    * @desc Update the given proposal to pause serving. This method will set
    * the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true
    * for all deals in the proposal.  It is a no-op to pause an already-paused
    * proposal. It is an error to call PauseProposal for a proposal that is not
    * finalized or renegotiating.
    * @alias adexchangebuyer2.accounts.proposals.pause
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to pause.
    * @param {().PauseProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pause(): GaxiosPromise[SchemaProposal] = js.native
  def pause(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def pause(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def pause(params: ParamsResourceAccountsProposalsPause): GaxiosPromise[SchemaProposal] = js.native
  def pause(params: ParamsResourceAccountsProposalsPause, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def pause(
    params: ParamsResourceAccountsProposalsPause,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def pause(params: ParamsResourceAccountsProposalsPause, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def pause(
    params: ParamsResourceAccountsProposalsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.resume
    * @desc Update the given proposal to resume serving. This method will set
    * the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false
    * for all deals in the proposal.  Note that if the `has_seller_paused` bit
    * is also set, serving will not resume until the seller also resumes.  It
    * is a no-op to resume an already-running proposal. It is an error to call
    * ResumeProposal for a proposal that is not finalized or renegotiating.
    * @alias adexchangebuyer2.accounts.proposals.resume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The ID of the proposal to resume.
    * @param {().ResumeProposalRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resume(): GaxiosPromise[SchemaProposal] = js.native
  def resume(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def resume(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def resume(params: ParamsResourceAccountsProposalsResume): GaxiosPromise[SchemaProposal] = js.native
  def resume(params: ParamsResourceAccountsProposalsResume, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def resume(
    params: ParamsResourceAccountsProposalsResume,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def resume(params: ParamsResourceAccountsProposalsResume, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def resume(
    params: ParamsResourceAccountsProposalsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.proposals.update
    * @desc Update the given proposal at the client known revision number. If
    * the server revision has advanced since the passed-in
    * `proposal.proposal_revision`, an `ABORTED` error message will be
    * returned. Only the buyer-modifiable fields of the proposal will be
    * updated.  Note that the deals in the proposal will be updated to match
    * the passed-in copy. If a passed-in deal does not have a `deal_id`, the
    * server will assign a new unique ID and create the deal. If passed-in deal
    * has a `deal_id`, it will be updated to match the passed-in copy. Any
    * existing deals not present in the passed-in proposal will be deleted. It
    * is an error to pass in a deal with a `deal_id` not present at head.
    * @alias adexchangebuyer2.accounts.proposals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.proposalId The unique ID of the proposal.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaProposal] = js.native
  def update(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceAccountsProposalsUpdate): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceAccountsProposalsUpdate, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(
    params: ParamsResourceAccountsProposalsUpdate,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsProposalsUpdate, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(
    params: ParamsResourceAccountsProposalsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
}

