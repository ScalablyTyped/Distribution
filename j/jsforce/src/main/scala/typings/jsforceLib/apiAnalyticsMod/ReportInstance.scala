package typings
package jsforceLib.apiAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "ReportInstance")
@js.native
class ReportInstance protected () extends js.Object {
  def this(report: Report, id: java.lang.String) = this()
  def retrieve(callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
}

