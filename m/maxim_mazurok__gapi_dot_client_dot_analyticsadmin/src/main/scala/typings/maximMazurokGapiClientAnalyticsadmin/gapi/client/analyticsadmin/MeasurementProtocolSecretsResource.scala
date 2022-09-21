package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientAnalyticsadmin.anon.QuotaUserResource
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasurementProtocolSecretsResource extends StObject {
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  /** Creates a measurement protocol secret. */
  def create(request: ParentPrettyPrint): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  
  /** Deletes target MeasurementProtocolSecret. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single "GA4" MeasurementProtocolSecret. */
  def get(): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  
  /** Returns child MeasurementProtocolSecrets under the specified parent Property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  
  /** Updates a measurement protocol secret. */
  def patch(request: QuotaUserResource): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret): Request[GoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
}
