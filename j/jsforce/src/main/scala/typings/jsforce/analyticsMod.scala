package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.queryMod.ExplainInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsMod {
  
  @JSImport("jsforce/api/analytics", "Analytics")
  @js.native
  class Analytics () extends StObject {
    
    def dashboard(id: String): js.Promise[Dashboard] = js.native
    
    def dashboards(): js.Promise[js.Array[DashboardInfo]] = js.native
    def dashboards(callback: Callback[js.Array[DashboardInfo]]): js.Promise[js.Array[DashboardInfo]] = js.native
    
    def report(id: String): js.Promise[Report] = js.native
    
    def reports(): js.Promise[js.Array[ReportInfo]] = js.native
    def reports(callback: Callback[js.Array[ReportInfo]]): js.Promise[js.Array[ReportInfo]] = js.native
  }
  
  @JSImport("jsforce/api/analytics", "Dashboard")
  @js.native
  class Dashboard () extends StObject {
    
    def clone(name: String, folderid: String): js.Promise[js.Any] = js.native
    def clone(name: String, folderid: String, callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    def clone(name: js.Object, folderid: String): js.Promise[js.Any] = js.native
    def clone(name: js.Object, folderid: String, callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def components(componentIds: js.Function0[js.Any | js.Array[String] | String]): js.Promise[js.Any] = js.native
    def components(componentIds: js.Function0[js.Any | js.Array[String] | String], callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def del(): js.Promise[js.Any] = js.native
    def del(callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def delete(): js.Promise[js.Any] = js.native
    def delete(callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def describe(): js.Promise[js.Any] = js.native
    def describe(callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def destory(): js.Promise[js.Any] = js.native
    def destory(callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def refresh(): js.Promise[js.Any] = js.native
    def refresh(callback: Callback[js.Object]): js.Promise[js.Any] = js.native
    
    def status(): js.Promise[js.Any] = js.native
    def status(callback: Callback[js.Object]): js.Promise[js.Any] = js.native
  }
  
  @JSImport("jsforce/api/analytics", "Report")
  @js.native
  class Report () extends StObject {
    
    def clone(name: String): js.Promise[ReportResult] = js.native
    def clone(name: String, callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
    
    def del(): js.Promise[ReportResult] = js.native
    def del(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
    
    def delete(): js.Promise[ReportResult] = js.native
    def delete(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
    
    def describe(): js.Promise[ReportMetadata] = js.native
    def describe(callback: Callback[ReportMetadata]): js.Promise[ReportMetadata] = js.native
    
    def destory(): js.Promise[ReportResult] = js.native
    def destory(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
    
    def exec(options: js.Function0[js.Any | js.Object]): js.Promise[ReportResult] = js.native
    def exec(options: js.Function0[js.Any | js.Object], callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
    
    def execute(options: js.Function0[js.Any | js.Object]): js.Promise[ReportResult] = js.native
    def execute(options: js.Function0[js.Any | js.Object], callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
    
    def executeAsync(options: js.Function0[js.Any | js.Object]): js.Promise[ReportInstanceAttrs] = js.native
    def executeAsync(options: js.Function0[js.Any | js.Object], callback: Callback[ReportInstanceAttrs]): js.Promise[ReportInstanceAttrs] = js.native
    
    def explain(): js.Promise[ExplainInfo] = js.native
    def explain(callback: Callback[ExplainInfo]): js.Promise[ExplainInfo] = js.native
    
    def instance(id: String): ReportInstance = js.native
    
    def instances(): js.Promise[js.Array[ReportInstance]] = js.native
    def instances(callback: Callback[js.Array[ReportInstance]]): js.Promise[js.Array[ReportInstance]] = js.native
    
    def run(options: js.Function0[js.Any | js.Object]): js.Promise[ReportResult] = js.native
    def run(options: js.Function0[js.Any | js.Object], callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  }
  
  @JSImport("jsforce/api/analytics", "ReportInstance")
  @js.native
  class ReportInstance protected () extends StObject {
    def this(report: Report, id: String) = this()
    
    def retrieve(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  }
  
  trait DashboardInfo extends StObject
  
  trait ReportInfo extends StObject
  
  trait ReportInstanceAttrs extends StObject
  
  trait ReportMetadata extends StObject
  
  trait ReportResult extends StObject
}
