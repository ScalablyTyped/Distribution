package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.`json-summary`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_jsonsummary extends js.Object {
  
  def apply(name: `json-summary`): Visitor[Node] = js.native
  def apply(name: `json-summary`, options: Partial[JsonSummaryOptions]): Visitor[Node] = js.native
}
