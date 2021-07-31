package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Filter
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.QuotaUserResource
import typings.maximMazurokGapiClientAnalyticsadmin.anon.ResourceUpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesResource extends StObject {
  
  var androidAppDataStreams: AndroidAppDataStreamsResource = js.native
  
  /** Creates an "GA4" property with the specified location and attributes. */
  def create(request: QuotaUserResource): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def create(request: UploadType, body: GoogleAnalyticsAdminV1alphaProperty): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  /**
    * Marks target Property as soft-deleted (ie: "trashed") and returns it. This API does not have a method to restore soft-deleted properties. However, they can be restored using the
    * Trash Can UI. If the properties are not restored before the expiration time, the Property and all child resources (eg: GoogleAdsLinks, Streams, UserLinks) will be permanently
    * purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found, or is not an GA4 Property.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  var firebaseLinks: FirebaseLinksResource = js.native
  
  /** Lookup for a single "GA4" Property. Throws "Target not found" if no such property found, if property is not of the type "GA4", or if caller does not have permissions to access it. */
  def get(): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  var googleAdsLinks: GoogleAdsLinksResource = js.native
  
  var iosAppDataStreams: IosAppDataStreamsResource = js.native
  
  /**
    * Returns child Properties under the specified parent Account. Only "GA4" properties will be returned. Properties will be excluded if the caller does not have access. Soft-deleted
    * (ie: "trashed") properties are excluded by default. Returns an empty list if no relevant properties are found.
    */
  def list(): Request[GoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  def list(request: Filter): Request[GoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  
  /** Updates a property. */
  def patch(request: ResourceUpdateMask): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaProperty): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  var userLinks: UserLinksResource = js.native
  
  var webDataStreams: WebDataStreamsResource = js.native
}
