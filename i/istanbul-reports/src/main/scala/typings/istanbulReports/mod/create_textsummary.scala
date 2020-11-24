package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.`text-summary`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_textsummary extends js.Object {
  
  def apply(name: `text-summary`): Visitor[Node] = js.native
  def apply(name: `text-summary`, options: Partial[TextSummaryOptions]): Visitor[Node] = js.native
}
