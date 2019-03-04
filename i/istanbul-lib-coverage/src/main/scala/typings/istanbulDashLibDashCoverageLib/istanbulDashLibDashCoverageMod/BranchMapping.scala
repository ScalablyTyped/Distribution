package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchMapping extends js.Object {
  var line: scala.Double
  var loc: Range
  var locations: js.Array[Range]
  var `type`: java.lang.String
}

object BranchMapping {
  @scala.inline
  def apply(line: scala.Double, loc: Range, locations: js.Array[Range], `type`: java.lang.String): BranchMapping = {
    val __obj = js.Dynamic.literal(line = line, loc = loc, locations = locations)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BranchMapping]
  }
}

