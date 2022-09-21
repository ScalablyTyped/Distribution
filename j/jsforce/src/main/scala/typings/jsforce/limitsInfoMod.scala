package typings.jsforce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object limitsInfoMod {
  
  trait DailyApiRequests
    extends StObject
       with Limit {
    
    var `Chatter Desktop`: Limit
    
    var `Chatter Mobile for BlackBerry`: Limit
    
    var `Salesforce Files`: Limit
    
    var `Salesforce Marketing Cloud`: Limit
    
    var `Salesforce for Android`: Limit
    
    var `Salesforce for iOS`: Limit
    
    var SalesforceA: Limit
  }
  object DailyApiRequests {
    
    inline def apply(
      `Chatter Desktop`: Limit,
      `Chatter Mobile for BlackBerry`: Limit,
      Max: Double,
      Remaining: Double,
      `Salesforce Files`: Limit,
      `Salesforce Marketing Cloud`: Limit,
      `Salesforce for Android`: Limit,
      `Salesforce for iOS`: Limit,
      SalesforceA: Limit
    ): DailyApiRequests = {
      val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any], SalesforceA = SalesforceA.asInstanceOf[js.Any])
      __obj.updateDynamic("Chatter Desktop")((`Chatter Desktop`).asInstanceOf[js.Any])
      __obj.updateDynamic("Chatter Mobile for BlackBerry")((`Chatter Mobile for BlackBerry`).asInstanceOf[js.Any])
      __obj.updateDynamic("Salesforce Files")((`Salesforce Files`).asInstanceOf[js.Any])
      __obj.updateDynamic("Salesforce Marketing Cloud")((`Salesforce Marketing Cloud`).asInstanceOf[js.Any])
      __obj.updateDynamic("Salesforce for Android")((`Salesforce for Android`).asInstanceOf[js.Any])
      __obj.updateDynamic("Salesforce for iOS")((`Salesforce for iOS`).asInstanceOf[js.Any])
      __obj.asInstanceOf[DailyApiRequests]
    }
    
    extension [Self <: DailyApiRequests](x: Self) {
      
      inline def `setChatter Desktop`(value: Limit): Self = StObject.set(x, "Chatter Desktop", value.asInstanceOf[js.Any])
      
      inline def `setChatter Mobile for BlackBerry`(value: Limit): Self = StObject.set(x, "Chatter Mobile for BlackBerry", value.asInstanceOf[js.Any])
      
      inline def `setSalesforce Files`(value: Limit): Self = StObject.set(x, "Salesforce Files", value.asInstanceOf[js.Any])
      
      inline def `setSalesforce Marketing Cloud`(value: Limit): Self = StObject.set(x, "Salesforce Marketing Cloud", value.asInstanceOf[js.Any])
      
      inline def `setSalesforce for Android`(value: Limit): Self = StObject.set(x, "Salesforce for Android", value.asInstanceOf[js.Any])
      
      inline def `setSalesforce for iOS`(value: Limit): Self = StObject.set(x, "Salesforce for iOS", value.asInstanceOf[js.Any])
      
      inline def setSalesforceA(value: Limit): Self = StObject.set(x, "SalesforceA", value.asInstanceOf[js.Any])
    }
  }
  
  trait Limit extends StObject {
    
    var Max: Double
    
    var Remaining: Double
  }
  object Limit {
    
    inline def apply(Max: Double, Remaining: Double): Limit = {
      val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    extension [Self <: Limit](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "Remaining", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimitInfo extends StObject {
    
    var apiUsage: typings.jsforce.anon.Limit
  }
  object LimitInfo {
    
    inline def apply(apiUsage: typings.jsforce.anon.Limit): LimitInfo = {
      val __obj = js.Dynamic.literal(apiUsage = apiUsage.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitInfo]
    }
    
    extension [Self <: LimitInfo](x: Self) {
      
      inline def setApiUsage(value: typings.jsforce.anon.Limit): Self = StObject.set(x, "apiUsage", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimitsInfo extends StObject {
    
    var ConcurrentAsyncGetReportInstances: Limit
    
    var ConcurrentSyncReportRuns: Limit
    
    var DailyAnalyticsDataflowJobExecutions: Limit
    
    var DailyApiRequests: typings.jsforce.limitsInfoMod.DailyApiRequests
    
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
    
    var PermissionSets: typings.jsforce.limitsInfoMod.PermissionSets
    
    var SingleEmail: Limit
    
    var StreamingApiConcurrentClients: Limit
  }
  object LimitsInfo {
    
    inline def apply(
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
    
    extension [Self <: LimitsInfo](x: Self) {
      
      inline def setConcurrentAsyncGetReportInstances(value: Limit): Self = StObject.set(x, "ConcurrentAsyncGetReportInstances", value.asInstanceOf[js.Any])
      
      inline def setConcurrentSyncReportRuns(value: Limit): Self = StObject.set(x, "ConcurrentSyncReportRuns", value.asInstanceOf[js.Any])
      
      inline def setDailyAnalyticsDataflowJobExecutions(value: Limit): Self = StObject.set(x, "DailyAnalyticsDataflowJobExecutions", value.asInstanceOf[js.Any])
      
      inline def setDailyApiRequests(value: DailyApiRequests): Self = StObject.set(x, "DailyApiRequests", value.asInstanceOf[js.Any])
      
      inline def setDailyAsyncApexExecutions(value: Limit): Self = StObject.set(x, "DailyAsyncApexExecutions", value.asInstanceOf[js.Any])
      
      inline def setDailyBulkApiRequests(value: DailyApiRequests): Self = StObject.set(x, "DailyBulkApiRequests", value.asInstanceOf[js.Any])
      
      inline def setDailyDurableGenericStreamingApiEvents(value: Limit): Self = StObject.set(x, "DailyDurableGenericStreamingApiEvents", value.asInstanceOf[js.Any])
      
      inline def setDailyDurableStreamingApiEvents(value: Limit): Self = StObject.set(x, "DailyDurableStreamingApiEvents", value.asInstanceOf[js.Any])
      
      inline def setDailyGenericStreamingApiEvents(value: DailyApiRequests): Self = StObject.set(x, "DailyGenericStreamingApiEvents", value.asInstanceOf[js.Any])
      
      inline def setDailyStreamingApiEvents(value: DailyApiRequests): Self = StObject.set(x, "DailyStreamingApiEvents", value.asInstanceOf[js.Any])
      
      inline def setDailyWorkflowEmails(value: Limit): Self = StObject.set(x, "DailyWorkflowEmails", value.asInstanceOf[js.Any])
      
      inline def setDataStorageMB(value: Limit): Self = StObject.set(x, "DataStorageMB", value.asInstanceOf[js.Any])
      
      inline def setDurableStreamingApiConcurrentClients(value: Limit): Self = StObject.set(x, "DurableStreamingApiConcurrentClients", value.asInstanceOf[js.Any])
      
      inline def setFileStorageMB(value: Limit): Self = StObject.set(x, "FileStorageMB", value.asInstanceOf[js.Any])
      
      inline def setHourlyAsyncReportRuns(value: Limit): Self = StObject.set(x, "HourlyAsyncReportRuns", value.asInstanceOf[js.Any])
      
      inline def setHourlyDashboardRefreshes(value: Limit): Self = StObject.set(x, "HourlyDashboardRefreshes", value.asInstanceOf[js.Any])
      
      inline def setHourlyDashboardResults(value: Limit): Self = StObject.set(x, "HourlyDashboardResults", value.asInstanceOf[js.Any])
      
      inline def setHourlyDashboardStatuses(value: Limit): Self = StObject.set(x, "HourlyDashboardStatuses", value.asInstanceOf[js.Any])
      
      inline def setHourlyODataCallout(value: Limit): Self = StObject.set(x, "HourlyODataCallout", value.asInstanceOf[js.Any])
      
      inline def setHourlySyncReportRuns(value: Limit): Self = StObject.set(x, "HourlySyncReportRuns", value.asInstanceOf[js.Any])
      
      inline def setHourlyTimeBasedWorkflow(value: Limit): Self = StObject.set(x, "HourlyTimeBasedWorkflow", value.asInstanceOf[js.Any])
      
      inline def setMassEmail(value: Limit): Self = StObject.set(x, "MassEmail", value.asInstanceOf[js.Any])
      
      inline def setMonthlyPlatformEvents(value: Limit): Self = StObject.set(x, "MonthlyPlatformEvents", value.asInstanceOf[js.Any])
      
      inline def setPackage2VersionCreates(value: Limit): Self = StObject.set(x, "Package2VersionCreates", value.asInstanceOf[js.Any])
      
      inline def setPermissionSets(value: PermissionSets): Self = StObject.set(x, "PermissionSets", value.asInstanceOf[js.Any])
      
      inline def setSingleEmail(value: Limit): Self = StObject.set(x, "SingleEmail", value.asInstanceOf[js.Any])
      
      inline def setStreamingApiConcurrentClients(value: Limit): Self = StObject.set(x, "StreamingApiConcurrentClients", value.asInstanceOf[js.Any])
    }
  }
  
  trait PermissionSets
    extends StObject
       with Limit {
    
    var CreateCustom: Limit
  }
  object PermissionSets {
    
    inline def apply(CreateCustom: Limit, Max: Double, Remaining: Double): PermissionSets = {
      val __obj = js.Dynamic.literal(CreateCustom = CreateCustom.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionSets]
    }
    
    extension [Self <: PermissionSets](x: Self) {
      
      inline def setCreateCustom(value: Limit): Self = StObject.set(x, "CreateCustom", value.asInstanceOf[js.Any])
    }
  }
}
