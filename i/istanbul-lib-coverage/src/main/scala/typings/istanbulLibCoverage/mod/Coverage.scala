package typings.istanbulLibCoverage.mod

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
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], covered = covered.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
}

