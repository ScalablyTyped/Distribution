package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.NameOauthtoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosAppDataStreamsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaIosAppDataStream): Request[GoogleAnalyticsAdminV1alphaIosAppDataStream] = js.native
  /** Creates an iOS app data stream with the specified location and attributes. */
  def create(request: KeyOauthtoken): Request[GoogleAnalyticsAdminV1alphaIosAppDataStream] = js.native
  
  /** Deletes an iOS app stream on a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single IosAppDataStream Throws "Target not found" if no such iOS app data stream found, or if the caller does not have permissions to access it. */
  def get(): Request[GoogleAnalyticsAdminV1alphaIosAppDataStream] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaIosAppDataStream] = js.native
  
  /**
    * Returns child iOS app data streams under the specified parent property. iOS app data streams will be excluded if the caller does not have access. Returns an empty list if no
    * relevant iOS app data streams are found.
    */
  def list(): Request[GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListIosAppDataStreamsResponse] = js.native
  
  /** Updates an iOS app stream on a property. */
  def patch(request: NameOauthtoken): Request[GoogleAnalyticsAdminV1alphaIosAppDataStream] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaIosAppDataStream): Request[GoogleAnalyticsAdminV1alphaIosAppDataStream] = js.native
}
