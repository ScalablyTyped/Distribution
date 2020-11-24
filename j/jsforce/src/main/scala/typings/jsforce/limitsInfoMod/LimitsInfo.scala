package typings.jsforce.limitsInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitsInfo extends js.Object {
  
  var ConcurrentAsyncGetReportInstances: Limit = js.native
  
  var ConcurrentSyncReportRuns: Limit = js.native
  
  var DailyAnalyticsDataflowJobExecutions: Limit = js.native
  
  var DailyApiRequests: typings.jsforce.limitsInfoMod.DailyApiRequests = js.native
  
  var DailyAsyncApexExecutions: Limit = js.native
  
  var DailyBulkApiRequests: DailyApiRequests = js.native
  
  var DailyDurableGenericStreamingApiEvents: Limit = js.native
  
  var DailyDurableStreamingApiEvents: Limit = js.native
  
  var DailyGenericStreamingApiEvents: DailyApiRequests = js.native
  
  var DailyStreamingApiEvents: DailyApiRequests = js.native
  
  var DailyWorkflowEmails: Limit = js.native
  
  var DataStorageMB: Limit = js.native
  
  var DurableStreamingApiConcurrentClients: Limit = js.native
  
  var FileStorageMB: Limit = js.native
  
  var HourlyAsyncReportRuns: Limit = js.native
  
  var HourlyDashboardRefreshes: Limit = js.native
  
  var HourlyDashboardResults: Limit = js.native
  
  var HourlyDashboardStatuses: Limit = js.native
  
  var HourlyODataCallout: Limit = js.native
  
  var HourlySyncReportRuns: Limit = js.native
  
  var HourlyTimeBasedWorkflow: Limit = js.native
  
  var MassEmail: Limit = js.native
  
  var MonthlyPlatformEvents: Limit = js.native
  
  var Package2VersionCreates: Limit = js.native
  
  var PermissionSets: typings.jsforce.limitsInfoMod.PermissionSets = js.native
  
  var SingleEmail: Limit = js.native
  
  var StreamingApiConcurrentClients: Limit = js.native
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
  
  @scala.inline
  implicit class LimitsInfoOps[Self <: LimitsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConcurrentAsyncGetReportInstances(value: Limit): Self = this.set("ConcurrentAsyncGetReportInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentSyncReportRuns(value: Limit): Self = this.set("ConcurrentSyncReportRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyAnalyticsDataflowJobExecutions(value: Limit): Self = this.set("DailyAnalyticsDataflowJobExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyApiRequests(value: DailyApiRequests): Self = this.set("DailyApiRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyAsyncApexExecutions(value: Limit): Self = this.set("DailyAsyncApexExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyBulkApiRequests(value: DailyApiRequests): Self = this.set("DailyBulkApiRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyDurableGenericStreamingApiEvents(value: Limit): Self = this.set("DailyDurableGenericStreamingApiEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyDurableStreamingApiEvents(value: Limit): Self = this.set("DailyDurableStreamingApiEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyGenericStreamingApiEvents(value: DailyApiRequests): Self = this.set("DailyGenericStreamingApiEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyStreamingApiEvents(value: DailyApiRequests): Self = this.set("DailyStreamingApiEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyWorkflowEmails(value: Limit): Self = this.set("DailyWorkflowEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStorageMB(value: Limit): Self = this.set("DataStorageMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurableStreamingApiConcurrentClients(value: Limit): Self = this.set("DurableStreamingApiConcurrentClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileStorageMB(value: Limit): Self = this.set("FileStorageMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyAsyncReportRuns(value: Limit): Self = this.set("HourlyAsyncReportRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyDashboardRefreshes(value: Limit): Self = this.set("HourlyDashboardRefreshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyDashboardResults(value: Limit): Self = this.set("HourlyDashboardResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyDashboardStatuses(value: Limit): Self = this.set("HourlyDashboardStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyODataCallout(value: Limit): Self = this.set("HourlyODataCallout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlySyncReportRuns(value: Limit): Self = this.set("HourlySyncReportRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyTimeBasedWorkflow(value: Limit): Self = this.set("HourlyTimeBasedWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassEmail(value: Limit): Self = this.set("MassEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyPlatformEvents(value: Limit): Self = this.set("MonthlyPlatformEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackage2VersionCreates(value: Limit): Self = this.set("Package2VersionCreates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSets(value: PermissionSets): Self = this.set("PermissionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleEmail(value: Limit): Self = this.set("SingleEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingApiConcurrentClients(value: Limit): Self = this.set("StreamingApiConcurrentClients", value.asInstanceOf[js.Any])
  }
}
