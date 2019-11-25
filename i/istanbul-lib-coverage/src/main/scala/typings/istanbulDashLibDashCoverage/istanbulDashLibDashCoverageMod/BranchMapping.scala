package typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchMapping extends js.Object {
  var line: Double
  var loc: Range
  var locations: js.Array[Range]
  var `type`: String
}

object BranchMapping {
  @scala.inline
  def apply(line: Double, loc: Range, locations: js.Array[Range], `type`: String): BranchMapping = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchMapping]
  }
}

