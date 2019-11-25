package typings.jsforce.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitsInfo extends js.Object {
  var ConcurrentAsyncGetReportInstances: Limit
  var ConcurrentSyncReportRuns: Limit
  var DailyAnalyticsDataflowJobExecutions: Limit
  var DailyApiRequests: typings.jsforce.limitsDashInfoMod.DailyApiRequests
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
  var PermissionSets: typings.jsforce.limitsDashInfoMod.PermissionSets
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
    val __obj = js.Dynamic.literal(ConcurrentAsyncGetReportInstances = ConcurrentAsyncGetReportInstances.asInstanceOf[js.Any], ConcurrentSyncReportRuns = ConcurrentSyncReportRuns.asInstanceOf[js.Any], DailyAnalyticsDataflowJobExecutions = DailyAnalyticsDataflowJobExecutions.asInstanceOf[js.Any], DailyApiRequests = DailyApiRequests.asInstanceOf[js.Any], DailyAsyncApexExecutions = DailyAsyncApexExecutions.asInstanceOf[js.Any], DailyBulkApiRequests = DailyBulkApiRequests.asInstanceOf[js.Any], DailyDurableGenericStreamingApiEvents = DailyDurableGenericStreamingApiEvents.asInstanceOf[js.Any], DailyDurableStreamingApiEvents = DailyDurableStreamingApiEvents.asInstanceOf[js.Any], DailyGenericStreamingApiEvents = DailyGenericStreamingApiEvents.asInstanceOf[js.Any], DailyStreamingApiEvents = DailyStreamingApiEvents.asInstanceOf[js.Any], DailyWorkflowEmails = DailyWorkflowEmails.asInstanceOf[js.Any], DataStorageMB = DataStorageMB.asInstanceOf[js.Any], DurableStreamingApiConcurrentClients = DurableStreamingApiConcurrentClients.asInstanceOf[js.Any], FileStorageMB = FileStorageMB.asInstanceOf[js.Any], HourlyAsyncReportRuns = HourlyAsyncReportRuns.asInstanceOf[js.Any], HourlyDashboardRefreshes = HourlyDashboardRefreshes.asInstanceOf[js.Any], HourlyDashboardResults = HourlyDashboardResults.asInstanceOf[js.Any], HourlyDashboardStatuses = HourlyDashboardStatuses.asInstanceOf[js.Any], HourlyODataCallout = HourlyODataCallout.asInstanceOf[js.Any], HourlySyncReportRuns = HourlySyncReportRuns.asInstanceOf[js.Any], HourlyTimeBasedWorkflow = HourlyTimeBasedWorkflow.asInstanceOf[js.Any], MassEmail = MassEmail.asInstanceOf[js.Any], MonthlyPlatformEvents = MonthlyPlatformEvents.asInstanceOf[js.Any], Package2VersionCreates = Package2VersionCreates.asInstanceOf[js.Any], PermissionSets = PermissionSets.asInstanceOf[js.Any], SingleEmail = SingleEmail.asInstanceOf[js.Any], StreamingApiConcurrentClients = StreamingApiConcurrentClients.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LimitsInfo]
  }
}

