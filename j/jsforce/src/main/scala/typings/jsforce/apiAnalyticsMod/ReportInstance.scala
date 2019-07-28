package typings.jsforce.apiAnalyticsMod

import typings.jsforce.connectionMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "ReportInstance")
@js.native
class ReportInstance protected () extends js.Object {
  def this(report: Report, id: String) = this()
  def retrieve(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
}

