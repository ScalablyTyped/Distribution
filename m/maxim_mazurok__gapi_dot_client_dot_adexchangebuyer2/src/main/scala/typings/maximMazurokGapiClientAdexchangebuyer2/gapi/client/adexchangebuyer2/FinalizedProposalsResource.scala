package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AccountIdAlt
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.AltCallback
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.Filter
import typings.maximMazurokGapiClientAdexchangebuyer2.anon.ProposalId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizedProposalsResource extends StObject {
  
  /** List finalized proposals, regardless if a proposal is being renegotiated. A filter expression (PQL query) may be specified to filter the results. The notes will not be returned. */
  def list(): Request[ListProposalsResponse] = js.native
  def list(request: Filter): Request[ListProposalsResponse] = js.native
  
  def pause(request: AccountIdAlt, body: PauseProposalDealsRequest): Request[Proposal] = js.native
  /**
    * Update given deals to pause serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true for all listed deals in the request. Currently, this
    * method only applies to PG and PD deals. For PA deals, please call accounts.proposals.pause endpoint. It is a no-op to pause already-paused deals. It is an error to call
    * PauseProposalDeals for deals which are not part of the proposal of proposal_id or which are not finalized or renegotiating.
    */
  def pause(request: ProposalId): Request[Proposal] = js.native
  
  def resume(request: AccountIdAlt, body: ResumeProposalDealsRequest): Request[Proposal] = js.native
  /**
    * Update given deals to resume serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false for all listed deals in the request. Currently,
    * this method only applies to PG and PD deals. For PA deals, please call accounts.proposals.resume endpoint. It is a no-op to resume running deals or deals paused by the other party.
    * It is an error to call ResumeProposalDeals for deals which are not part of the proposal of proposal_id or which are not finalized or renegotiating.
    */
  def resume(request: AltCallback): Request[Proposal] = js.native
}
