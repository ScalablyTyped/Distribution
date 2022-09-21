package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UploadTypeUploadprotocol
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UploadprotocolXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayVideo360AdvertiserLinkProposalsResource extends StObject {
  
  def approve(
    request: Name,
    body: GoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalRequest
  ): Request[GoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse] = js.native
  /** Approves a DisplayVideo360AdvertiserLinkProposal. The DisplayVideo360AdvertiserLinkProposal will be deleted and a new DisplayVideo360AdvertiserLink will be created. */
  def approve(request: UploadTypeUploadprotocol): Request[GoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse] = js.native
  
  def cancel(request: Name, body: GoogleAnalyticsAdminV1alphaCancelDisplayVideo360AdvertiserLinkProposalRequest): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  /**
    * Cancels a DisplayVideo360AdvertiserLinkProposal. Cancelling can mean either: - Declining a proposal initiated from Display & Video 360 - Withdrawing a proposal initiated from Google
    * Analytics After being cancelled, a proposal will eventually be deleted automatically.
    */
  def cancel(request: UploadprotocolXgafv): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  
  /** Creates a DisplayVideo360AdvertiserLinkProposal. */
  def create(request: AccesstokenAltCallback): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  
  /** Deletes a DisplayVideo360AdvertiserLinkProposal on a property. This can only be used on cancelled proposals. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single DisplayVideo360AdvertiserLinkProposal. */
  def get(): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  
  /** Lists DisplayVideo360AdvertiserLinkProposals on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse] = js.native
}
