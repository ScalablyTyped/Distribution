package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.teamcity
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_teamcity extends js.Object {
  
  def apply(name: teamcity): Visitor[Node] = js.native
  def apply(name: teamcity, options: Partial[TeamcityOptions]): Visitor[Node] = js.native
}
