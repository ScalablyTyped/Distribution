package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.lcovonly
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_lcovonly extends js.Object {
  
  def apply(name: lcovonly): Visitor[Node] = js.native
  def apply(name: lcovonly, options: Partial[LcovOnlyOptions]): Visitor[Node] = js.native
}
