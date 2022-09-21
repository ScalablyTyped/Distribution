package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.ResourceUpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.ResourceUploadType
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataStreamsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaDataStream): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  /** Creates a DataStream. */
  def create(request: ResourceUploadType): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  
  /** Deletes a DataStream on a property. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single DataStream. */
  def get(): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  
  /** Returns the Site Tag for the specified web stream. Site Tags are immutable singletons. */
  def getGlobalSiteTag(): Request[GoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  def getGlobalSiteTag(request: Name): Request[GoogleAnalyticsAdminV1alphaGlobalSiteTag] = js.native
  
  /** Lists DataStreams on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListDataStreamsResponse] = js.native
  
  var measurementProtocolSecrets: MeasurementProtocolSecretsResource = js.native
  
  /** Updates a DataStream on a property. */
  def patch(request: ResourceUpdateMask): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaDataStream): Request[GoogleAnalyticsAdminV1alphaDataStream] = js.native
}
