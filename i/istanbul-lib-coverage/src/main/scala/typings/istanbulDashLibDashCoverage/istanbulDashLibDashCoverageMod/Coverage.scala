package typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coverage extends js.Object {
  var coverage: Double
  var covered: Double
  var total: Double
}

object Coverage {
  @scala.inline
  def apply(coverage: Double, covered: Double, total: Double): Coverage = {
    val __obj = js.Dynamic.literal(coverage = coverage, covered = covered, total = total)
  
    __obj.asInstanceOf[Coverage]
  }
}

