package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientContent.anon.QuotaUserRegionCode
import typings.maximMazurokGapiClientContent.anon.RegionCode
import typings.maximMazurokGapiClientContent.anon.RegionCodeResource
import typings.maximMazurokGapiClientContent.anon.RegionCodeUpdateMask
import typings.maximMazurokGapiClientContent.anon.ResourceUploadType
import typings.maximMazurokGapiClientContent.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyongoogleprogramsResource extends StObject {
  
  def activate(request: PrettyPrintQuotaUser, body: ActivateBuyOnGoogleProgramRequest): Request[Unit] = js.native
  /**
    * Reactivates the BoG program in your Merchant Center account. Moves the program to the active state when allowed, for example, when paused. This method is only available to selected
    * merchants.
    */
  def activate(request: RegionCode): Request[Unit] = js.native
  
  /** Retrieves a status of the BoG program for your Merchant Center account. */
  def get(): Request[BuyOnGoogleProgramStatus] = js.native
  def get(request: PrettyPrintQuotaUser): Request[BuyOnGoogleProgramStatus] = js.native
  
  def onboard(request: PrettyPrintQuotaUser, body: OnboardBuyOnGoogleProgramRequest): Request[Unit] = js.native
  /**
    * Onboards the BoG program in your Merchant Center account. By using this method, you agree to the [Terms of
    * Service](https://merchants.google.com/mc/termsofservice/transactions/US/latest). Calling this method is only possible if the authenticated account is the same as the merchant id in
    * the request. Calling this method multiple times will only accept Terms of Service if the latest version is not currently signed.
    */
  def onboard(request: QuotaUserRegionCode): Request[Unit] = js.native
  
  def patch(request: RegionCodeUpdateMask, body: BuyOnGoogleProgramStatus): Request[BuyOnGoogleProgramStatus] = js.native
  /** Updates the status of the BoG program for your Merchant Center account. */
  def patch(request: UpdateMask): Request[BuyOnGoogleProgramStatus] = js.native
  
  def pause(request: PrettyPrintQuotaUser, body: PauseBuyOnGoogleProgramRequest): Request[Unit] = js.native
  /** Pauses the BoG program in your Merchant Center account. This method is only available to selected merchants. */
  def pause(request: RegionCodeResource): Request[Unit] = js.native
  
  def requestreview(request: PrettyPrintQuotaUser, body: RequestReviewBuyOnGoogleProgramRequest): Request[Unit] = js.native
  /**
    * Requests review and then activates the BoG program in your Merchant Center account for the first time. Moves the program to the REVIEW_PENDING state. This method is only available
    * to selected merchants.
    */
  def requestreview(request: ResourceUploadType): Request[Unit] = js.native
}
