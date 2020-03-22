package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.OptionsmaxColsnumber
import typings.istanbulReports.istanbulReportsStrings.text
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_text extends js.Object {
  def apply(name: text): Visitor[Node] = js.native
  def apply(name: text, options: Partial[OptionsmaxColsnumber]): Visitor[Node] = js.native
}

