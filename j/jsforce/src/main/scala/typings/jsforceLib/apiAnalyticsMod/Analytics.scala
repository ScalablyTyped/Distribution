package typings
package jsforceLib.apiAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Analytics")
@js.native
class Analytics () extends js.Object {
  def dashboard(id: java.lang.String): js.Promise[Dashboard] = js.native
  def dashboards(): js.Promise[js.Array[DashboardInfo]] = js.native
  def dashboards(callback: jsforceLib.connectionMod.Callback[js.Array[DashboardInfo]]): js.Promise[js.Array[DashboardInfo]] = js.native
  def report(id: java.lang.String): js.Promise[Report] = js.native
  def reports(): js.Promise[js.Array[ReportInfo]] = js.native
  def reports(callback: jsforceLib.connectionMod.Callback[js.Array[ReportInfo]]): js.Promise[js.Array[ReportInfo]] = js.native
}

