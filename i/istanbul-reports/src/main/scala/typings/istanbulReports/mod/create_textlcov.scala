package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.`text-lcov`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_textlcov extends js.Object {
  def apply(name: `text-lcov`): Visitor[Node] = js.native
  def apply(name: `text-lcov`, options: Partial[TextLcovOptions]): Visitor[Node] = js.native
}

