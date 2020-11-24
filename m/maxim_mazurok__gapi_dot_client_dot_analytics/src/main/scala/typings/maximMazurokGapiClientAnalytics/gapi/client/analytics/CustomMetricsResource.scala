package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typings.maximMazurokGapiClientAnalytics.anon.AltCustomMetricId
import typings.maximMazurokGapiClientAnalytics.anon.AltFields
import typings.maximMazurokGapiClientAnalytics.anon.CustomMetricId
import typings.maximMazurokGapiClientAnalytics.anon.CustomMetricIdFields
import typings.maximMazurokGapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMetricsResource extends js.Object {
  
  /** Get a custom metric to which the user has access. */
  def get(): Request[CustomMetric] = js.native
  def get(request: CustomMetricId): Request[CustomMetric] = js.native
  
  def insert(request: AccountIdAlt, body: CustomMetric): Request[CustomMetric] = js.native
  /** Create a new custom metric. */
  def insert(request: AltFields): Request[CustomMetric] = js.native
  
  /** Lists custom metrics to which the user has access. */
  def list(): Request[CustomMetrics] = js.native
  def list(request: Startindex): Request[CustomMetrics] = js.native
  
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: AltCustomMetricId): Request[CustomMetric] = js.native
  def patch(request: CustomMetricIdFields, body: CustomMetric): Request[CustomMetric] = js.native
  
  /** Updates an existing custom metric. */
  def update(request: AltCustomMetricId): Request[CustomMetric] = js.native
  def update(request: CustomMetricIdFields, body: CustomMetric): Request[CustomMetric] = js.native
}
