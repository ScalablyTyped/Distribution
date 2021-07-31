package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.OauthtokenParent
import typings.maximMazurokGapiClientAnalyticsadmin.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDataStreamsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaWebDataStream): Request[GoogleAnalyticsAdminV1alphaWebDataStream] = js.native
  /** Creates a web stream with the specified location and attributes. */
  def create(request: OauthtokenParent): Request[GoogleAnalyticsAdminV1alphaWebDataStream] = js.native
  
  /** Deletes a web stream on a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single WebDataStream Throws "Target not found" if no such web data stream found, or if the caller does not have permissions to access it. */
  def get(): Request[GoogleAnalyticsAdminV1alphaWebDataStream] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaWebDataStream] = js.native
  
  /** Returns the singleton enhanced measurement settings for this web stream. Note that the stream must enable enhanced measurement for these settings to take effect. */
  def getEnhancedMeasurementSettings(): Request[GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings] = js.native
  def getEnhancedMeasurementSettings(request: Name): Request[GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings] = js.native
  
  /** Returns the Site Tag for the specified web stream. Site Tags are immutable singletons. */
  def getGlobalSiteTag(): Request[GoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(request: Name): Request[GoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  
  /**
    * Returns child web data streams under the specified parent property. Web data streams will be excluded if the caller does not have access. Returns an empty list if no relevant web
    * data streams are found.
    */
  def list(): Request[GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListWebDataStreamsResponse] = js.native
  
  /** Updates a web stream on a property. */
  def patch(request: OauthtokenPrettyPrint): Request[GoogleAnalyticsAdminV1alphaWebDataStream] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaWebDataStream): Request[GoogleAnalyticsAdminV1alphaWebDataStream] = js.native
  
  /** Updates the singleton enhanced measurement settings for this web stream. Note that the stream must enable enhanced measurement for these settings to take effect. */
  def updateEnhancedMeasurementSettings(request: PrettyPrintQuotaUser): Request[GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings] = js.native
  def updateEnhancedMeasurementSettings(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings): Request[GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings] = js.native
}
