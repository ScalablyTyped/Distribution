package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.AnonBlockName
import typings.istanbulReports.istanbulReportsStrings.teamcity
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_teamcity extends js.Object {
  def apply(name: teamcity): Visitor[Node] = js.native
  def apply(name: teamcity, options: Partial[Options with AnonBlockName]): Visitor[Node] = js.native
}

