package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.cobertura
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_cobertura extends js.Object {
  def apply(name: cobertura): Visitor[Node] = js.native
  def apply(name: cobertura, options: Partial[CoberturaOptions]): Visitor[Node] = js.native
}

