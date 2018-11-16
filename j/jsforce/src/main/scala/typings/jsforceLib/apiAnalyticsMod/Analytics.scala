package typings
package jsforceLib.apiAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Analytics")
@js.native
class Analytics () extends js.Object {
  def dashboard(id: java.lang.String): stdLib.Promise[Dashboard] = js.native
  def dashboards(): stdLib.Promise[js.Array[DashboardInfo]] = js.native
  def dashboards(callback: jsforceLib.connectionMod.Callback[js.Array[DashboardInfo]]): stdLib.Promise[js.Array[DashboardInfo]] = js.native
  def report(id: java.lang.String): stdLib.Promise[Report] = js.native
  def reports(): stdLib.Promise[js.Array[ReportInfo]] = js.native
  def reports(callback: jsforceLib.connectionMod.Callback[js.Array[ReportInfo]]): stdLib.Promise[js.Array[ReportInfo]] = js.native
}

