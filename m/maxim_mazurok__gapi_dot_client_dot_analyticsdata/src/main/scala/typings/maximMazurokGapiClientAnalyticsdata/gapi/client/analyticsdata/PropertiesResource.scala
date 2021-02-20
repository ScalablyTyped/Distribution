package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsdata.anon.Accesstoken
import typings.maximMazurokGapiClientAnalyticsdata.anon.Alt
import typings.maximMazurokGapiClientAnalyticsdata.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesResource extends StObject {
  
  /**
    * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the dimensions and metrics. In this method, a Google Analytics GA4 Property Identifier is
    * specified in the request, and the metadata response includes Custom dimensions and metrics as well as Universal metadata. For example if a custom metric with parameter name
    * `levels_unlocked` is registered to a property, the Metadata response will contain `customEvent:levels_unlocked`. Universal metadata are dimensions and metrics applicable to any
    * property such as `country` and `totalUsers`.
    */
  def getMetadata(): Request[Metadata] = js.native
  def getMetadata(request: Accesstoken): Request[Metadata] = js.native
  
  /** The Google Analytics Realtime API returns a customized report of realtime event data for your property. These reports show events and usage from the last 30 minutes. */
  def runRealtimeReport(request: Alt): Request[RunRealtimeReportResponse] = js.native
  def runRealtimeReport(request: Callback, body: RunRealtimeReportRequest): Request[RunRealtimeReportResponse] = js.native
}
