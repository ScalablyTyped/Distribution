package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.AltCallbackFields
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMaskUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayVideo360AdvertiserLinksResource extends StObject {
  
  /**
    * Creates a DisplayVideo360AdvertiserLink. This can only be utilized by users who have proper authorization both on the Google Analytics property and on the Display & Video 360
    * advertiser. Users who do not have access to the Display & Video 360 advertiser should instead seek to create a DisplayVideo360LinkProposal.
    */
  def create(request: AltCallbackFields): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  
  /** Deletes a DisplayVideo360AdvertiserLink on a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Look up a single DisplayVideo360AdvertiserLink */
  def get(): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  
  /** Lists all DisplayVideo360AdvertiserLinks on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse] = js.native
  
  /** Updates a DisplayVideo360AdvertiserLink on a property. */
  def patch(request: UpdateMaskUploadType): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink): Request[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
}
