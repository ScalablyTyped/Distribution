package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.html
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_html extends js.Object {
  def apply(name: html): Visitor[Node] = js.native
  def apply(name: html, options: Partial[HtmlOptions]): Visitor[Node] = js.native
}

