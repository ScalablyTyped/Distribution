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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[BranchMapping]
  }
}

