package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.clover
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_clover extends js.Object {
  def apply(name: clover): Visitor[Node] = js.native
  def apply(name: clover, options: Partial[RootedOptions]): Visitor[Node] = js.native
}

