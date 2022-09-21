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
trait CustomMetricsResource extends StObject {
  
  def archive(request: Name, body: GoogleAnalyticsAdminV1alphaArchiveCustomMetricRequest): Request[js.Object] = js.native
  /** Archives a CustomMetric on a property. */
  def archive(request: OauthtokenPrettyPrint): Request[js.Object] = js.native
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaCustomMetric): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  /** Creates a CustomMetric. */
  def create(request: OauthtokenParent): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  
  /** Lookup for a single CustomMetric. */
  def get(): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  
  /** Lists CustomMetrics on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListCustomMetricsResponse] = js.native
  
  /** Updates a CustomMetric on a property. */
  def patch(request: PrettyPrintQuotaUser): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaCustomMetric): Request[GoogleAnalyticsAdminV1alphaCustomMetric] = js.native
}
