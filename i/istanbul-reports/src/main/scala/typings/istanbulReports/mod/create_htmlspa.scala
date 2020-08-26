package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.`html-spa`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_htmlspa extends js.Object {
  def apply(name: `html-spa`): Visitor[Node] = js.native
  def apply(name: `html-spa`, options: Partial[HtmlSpaOptions]): Visitor[Node] = js.native
}

