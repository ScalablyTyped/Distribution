package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.lcov
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_lcov extends js.Object {
  def apply(name: lcov): Visitor[Node] = js.native
  def apply(name: lcov, options: Partial[scala.Nothing]): Visitor[Node] = js.native
}

