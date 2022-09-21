package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsdata.anon.Accesstoken
import typings.maximMazurokGapiClientAnalyticsdata.anon.Alt
import typings.maximMazurokGapiClientAnalyticsdata.anon.Callback
import typings.maximMazurokGapiClientAnalyticsdata.anon.Fields
import typings.maximMazurokGapiClientAnalyticsdata.anon.Key
import typings.maximMazurokGapiClientAnalyticsdata.anon.Oauthtoken
import typings.maximMazurokGapiClientAnalyticsdata.anon.PrettyPrint
import typings.maximMazurokGapiClientAnalyticsdata.anon.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesResource extends StObject {
  
  /** Returns multiple pivot reports in a batch. All reports must be for the same GA4 Property. */
  def batchRunPivotReports(request: Accesstoken): Request[BatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(request: Alt, body: BatchRunPivotReportsRequest): Request[BatchRunPivotReportsResponse] = js.native
  
  def batchRunReports(request: Alt, body: BatchRunReportsRequest): Request[BatchRunReportsResponse] = js.native
  /** Returns multiple reports in a batch. All reports must be for the same GA4 Property. */
  def batchRunReports(request: Callback): Request[BatchRunReportsResponse] = js.native
  
  def checkCompatibility(request: Alt, body: CheckCompatibilityRequest): Request[CheckCompatibilityResponse] = js.native
  /**
    * This compatibility method lists dimensions and metrics that can be added to a report request and maintain compatibility. This method fails if the request's dimensions and metrics
    * are incompatible. In Google Analytics, reports fail if they request incompatible dimensions and/or metrics; in that case, you will need to remove dimensions and/or metrics from the
    * incompatible report until the report is compatible. The Realtime and Core reports have different compatibility rules. This method checks compatibility for Core reports.
    */
  def checkCompatibility(request: Fields): Request[CheckCompatibilityResponse] = js.native
  
  /**
    * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the dimensions and metrics. In this method, a Google Analytics GA4 Property Identifier is
    * specified in the request, and the metadata response includes Custom dimensions and metrics as well as Universal metadata. For example if a custom metric with parameter name
    * `levels_unlocked` is registered to a property, the Metadata response will contain `customEvent:levels_unlocked`. Universal metadata are dimensions and metrics applicable to any
    * property such as `country` and `totalUsers`.
    */
  def getMetadata(): Request[Metadata] = js.native
  def getMetadata(request: Key): Request[Metadata] = js.native
  
  def runPivotReport(request: Alt, body: RunPivotReportRequest): Request[RunPivotReportResponse] = js.native
  /**
    * Returns a customized pivot report of your Google Analytics event data. Pivot reports are more advanced and expressive formats than regular reports. In a pivot report, dimensions are
    * only visible if they are included in a pivot. Multiple pivots can be specified to further dissect your data.
    */
  def runPivotReport(request: Oauthtoken): Request[RunPivotReportResponse] = js.native
  
  def runRealtimeReport(request: Alt, body: RunRealtimeReportRequest): Request[RunRealtimeReportResponse] = js.native
  /**
    * Returns a customized report of realtime event data for your property. Events appear in realtime reports seconds after they have been sent to the Google Analytics. Realtime reports
    * show events and usage data for the periods of time ranging from the present moment to 30 minutes ago (up to 60 minutes for Google Analytics 360 properties). For a guide to
    * constructing realtime requests & understanding responses, see [Creating a Realtime Report](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-basics).
    */
  def runRealtimeReport(request: PrettyPrint): Request[RunRealtimeReportResponse] = js.native
  
  def runReport(request: Alt, body: RunReportRequest): Request[RunReportResponse] = js.native
  /**
    * Returns a customized report of your Google Analytics event data. Reports contain statistics derived from data collected by the Google Analytics tracking code. The data returned from
    * the API is as a table with columns for the requested dimensions and metrics. Metrics are individual measurements of user activity on your property, such as active users or event
    * count. Dimensions break down metrics across some common criteria, such as country or event name. For a guide to constructing requests & understanding responses, see [Creating a
    * Report](https://developers.google.com/analytics/devguides/reporting/data/v1/basics).
    */
  def runReport(request: Property): Request[RunReportResponse] = js.native
}
