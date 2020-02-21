package typings.istanbulLibReport.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-report", "ReportBase")
@js.native
class ReportBase () extends js.Object {
  def this(options: Partial[ReportBaseOptions]) = this()
  def execute(context: Context): Unit = js.native
}

