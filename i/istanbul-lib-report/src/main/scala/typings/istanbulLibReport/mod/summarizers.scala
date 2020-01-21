package typings.istanbulLibReport.mod

import typings.istanbulLibCoverage.mod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-report", "summarizers")
@js.native
object summarizers extends js.Object {
  def flat(coverageMap: CoverageMap): Tree[Node] = js.native
  def nested(coverageMap: CoverageMap): Tree[Node] = js.native
  def pkg(coverageMap: CoverageMap): Tree[Node] = js.native
}

