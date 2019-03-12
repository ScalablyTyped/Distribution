package typings
package jsforceLib.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitsInfo extends js.Object {
  var ConcurrentAsyncGetReportInstances: Limit
  var ConcurrentSyncReportRuns: Limit
  var DailyAnalyticsDataflowJobExecutions: Limit
  var DailyApiRequests: jsforceLib.limitsDashInfoMod.DailyApiRequests
  var DailyAsyncApexExecutions: Limit
  var DailyBulkApiRequests: DailyApiRequests
  var DailyDurableGenericStreamingApiEvents: Limit
  var DailyDurableStreamingApiEvents: Limit
  var DailyGenericStreamingApiEvents: DailyApiRequests
  var DailyStreamingApiEvents: DailyApiRequests
  var DailyWorkflowEmails: Limit
  var DataStorageMB: Limit
  var DurableStreamingApiConcurrentClients: Limit
  var FileStorageMB: Limit
  var HourlyAsyncReportRuns: Limit
  var HourlyDashboardRefreshes: Limit
  var HourlyDashboardResults: Limit
  var HourlyDashboardStatuses: Limit
  var HourlyODataCallout: Limit
  var HourlySyncReportRuns: Limit
  var HourlyTimeBasedWorkflow: Limit
  var MassEmail: Limit
  var MonthlyPlatformEvents: Limit
  var Package2VersionCreates: Limit
  var PermissionSets: jsforceLib.limitsDashInfoMod.PermissionSets
  var SingleEmail: Limit
  var StreamingApiConcurrentClients: Limit
}

object LimitsInfo {
  @scala.inline
  def apply(
    ConcurrentAsyncGetReportInstances: Limit,
    ConcurrentSyncReportRuns: Limit,
    DailyAnalyticsDataflowJobExecutions: Limit,
    DailyApiRequests: DailyApiRequests,
    DailyAsyncApexExecutions: Limit,
    DailyBulkApiRequests: DailyApiRequests,
    DailyDurableGenericStreamingApiEvents: Limit,
    DailyDurableStreamingApiEvents: Limit,
    DailyGenericStreamingApiEvents: DailyApiRequests,
    DailyStreamingApiEvents: DailyApiRequests,
    DailyWorkflowEmails: Limit,
    DataStorageMB: Limit,
    DurableStreamingApiConcurrentClients: Limit,
    FileStorageMB: Limit,
    HourlyAsyncReportRuns: Limit,
    HourlyDashboardRefreshes: Limit,
    HourlyDashboardResults: Limit,
    HourlyDashboardStatuses: Limit,
    HourlyODataCallout: Limit,
    HourlySyncReportRuns: Limit,
    HourlyTimeBasedWorkflow: Limit,
    MassEmail: Limit,
    MonthlyPlatformEvents: Limit,
    Package2VersionCreates: Limit,
    PermissionSets: PermissionSets,
    SingleEmail: Limit,
    StreamingApiConcurrentClients: Limit
  ): LimitsInfo = {
    val __obj = js.Dynamic.literal(ConcurrentAsyncGetReportInstances = ConcurrentAsyncGetReportInstances, ConcurrentSyncReportRuns = ConcurrentSyncReportRuns, DailyAnalyticsDataflowJobExecutions = DailyAnalyticsDataflowJobExecutions, DailyApiRequests = DailyApiRequests, DailyAsyncApexExecutions = DailyAsyncApexExecutions, DailyBulkApiRequests = DailyBulkApiRequests, DailyDurableGenericStreamingApiEvents = DailyDurableGenericStreamingApiEvents, DailyDurableStreamingApiEvents = DailyDurableStreamingApiEvents, DailyGenericStreamingApiEvents = DailyGenericStreamingApiEvents, DailyStreamingApiEvents = DailyStreamingApiEvents, DailyWorkflowEmails = DailyWorkflowEmails, DataStorageMB = DataStorageMB, DurableStreamingApiConcurrentClients = DurableStreamingApiConcurrentClients, FileStorageMB = FileStorageMB, HourlyAsyncReportRuns = HourlyAsyncReportRuns, HourlyDashboardRefreshes = HourlyDashboardRefreshes, HourlyDashboardResults = HourlyDashboardResults, HourlyDashboardStatuses = HourlyDashboardStatuses, HourlyODataCallout = HourlyODataCallout, HourlySyncReportRuns = HourlySyncReportRuns, HourlyTimeBasedWorkflow = HourlyTimeBasedWorkflow, MassEmail = MassEmail, MonthlyPlatformEvents = MonthlyPlatformEvents, Package2VersionCreates = Package2VersionCreates, PermissionSets = PermissionSets, SingleEmail = SingleEmail, StreamingApiConcurrentClients = StreamingApiConcurrentClients)
  
    __obj.asInstanceOf[LimitsInfo]
  }
}

