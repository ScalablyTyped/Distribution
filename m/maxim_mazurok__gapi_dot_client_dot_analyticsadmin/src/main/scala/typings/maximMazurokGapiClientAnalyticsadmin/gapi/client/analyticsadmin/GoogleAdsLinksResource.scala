package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.FieldsKey
import typings.maximMazurokGapiClientAnalyticsadmin.anon.KeyName
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAdsLinksResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaGoogleAdsLink): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  /** Creates a GoogleAdsLink. */
  def create(request: FieldsKey): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  
  /** Deletes a GoogleAdsLink on a property */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lists GoogleAdsLinks on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  
  /** Updates a GoogleAdsLink on a property */
  def patch(request: KeyName): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaGoogleAdsLink): Request[GoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
}
