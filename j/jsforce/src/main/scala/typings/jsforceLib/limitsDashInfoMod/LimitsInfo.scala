package typings
package jsforceLib.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitsInfo extends js.Object {
  var ConcurrentAsyncGetReportInstances: Limit
  var ConcurrentSyncReportRuns: Limit
  var DailyAnalyticsDataflowJobExecutions: Limit
  var DailyApiRequests: DailyApiRequests
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
  var PermissionSets: PermissionSets
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConcurrentAsyncGetReportInstances")(ConcurrentAsyncGetReportInstances)
    __obj.updateDynamic("ConcurrentSyncReportRuns")(ConcurrentSyncReportRuns)
    __obj.updateDynamic("DailyAnalyticsDataflowJobExecutions")(DailyAnalyticsDataflowJobExecutions)
    __obj.updateDynamic("DailyApiRequests")(DailyApiRequests)
    __obj.updateDynamic("DailyAsyncApexExecutions")(DailyAsyncApexExecutions)
    __obj.updateDynamic("DailyBulkApiRequests")(DailyBulkApiRequests)
    __obj.updateDynamic("DailyDurableGenericStreamingApiEvents")(DailyDurableGenericStreamingApiEvents)
    __obj.updateDynamic("DailyDurableStreamingApiEvents")(DailyDurableStreamingApiEvents)
    __obj.updateDynamic("DailyGenericStreamingApiEvents")(DailyGenericStreamingApiEvents)
    __obj.updateDynamic("DailyStreamingApiEvents")(DailyStreamingApiEvents)
    __obj.updateDynamic("DailyWorkflowEmails")(DailyWorkflowEmails)
    __obj.updateDynamic("DataStorageMB")(DataStorageMB)
    __obj.updateDynamic("DurableStreamingApiConcurrentClients")(DurableStreamingApiConcurrentClients)
    __obj.updateDynamic("FileStorageMB")(FileStorageMB)
    __obj.updateDynamic("HourlyAsyncReportRuns")(HourlyAsyncReportRuns)
    __obj.updateDynamic("HourlyDashboardRefreshes")(HourlyDashboardRefreshes)
    __obj.updateDynamic("HourlyDashboardResults")(HourlyDashboardResults)
    __obj.updateDynamic("HourlyDashboardStatuses")(HourlyDashboardStatuses)
    __obj.updateDynamic("HourlyODataCallout")(HourlyODataCallout)
    __obj.updateDynamic("HourlySyncReportRuns")(HourlySyncReportRuns)
    __obj.updateDynamic("HourlyTimeBasedWorkflow")(HourlyTimeBasedWorkflow)
    __obj.updateDynamic("MassEmail")(MassEmail)
    __obj.updateDynamic("MonthlyPlatformEvents")(MonthlyPlatformEvents)
    __obj.updateDynamic("Package2VersionCreates")(Package2VersionCreates)
    __obj.updateDynamic("PermissionSets")(PermissionSets)
    __obj.updateDynamic("SingleEmail")(SingleEmail)
    __obj.updateDynamic("StreamingApiConcurrentClients")(StreamingApiConcurrentClients)
    __obj.asInstanceOf[LimitsInfo]
  }
}

