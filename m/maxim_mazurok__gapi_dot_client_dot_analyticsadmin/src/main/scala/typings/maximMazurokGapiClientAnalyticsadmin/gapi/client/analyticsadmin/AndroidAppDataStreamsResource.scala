package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.AccesstokenAlt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidAppDataStreamsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaAndroidAppDataStream): Request[GoogleAnalyticsAdminV1alphaAndroidAppDataStream] = js.native
  /** Creates an android app stream with the specified location and attributes. */
  def create(request: Xgafv): Request[GoogleAnalyticsAdminV1alphaAndroidAppDataStream] = js.native
  
  /** Deletes an android app stream on a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single AndroidAppDataStream Throws "Target not found" if no such android app data stream found, or if the caller does not have permissions to access it. */
  def get(): Request[GoogleAnalyticsAdminV1alphaAndroidAppDataStream] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaAndroidAppDataStream] = js.native
  
  /**
    * Returns child android app streams under the specified parent property. Android app streams will be excluded if the caller does not have access. Returns an empty list if no relevant
    * android app streams are found.
    */
  def list(): Request[GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListAndroidAppDataStreamsResponse] = js.native
  
  /** Updates an android app stream on a property. */
  def patch(request: AccesstokenAlt): Request[GoogleAnalyticsAdminV1alphaAndroidAppDataStream] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaAndroidAppDataStream): Request[GoogleAnalyticsAdminV1alphaAndroidAppDataStream] = js.native
}
