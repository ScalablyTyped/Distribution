package typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Totals extends js.Object {
  var covered: Double
  var pct: Double
  var skipped: Double
  var total: Double
}

object Totals {
  @scala.inline
  def apply(covered: Double, pct: Double, skipped: Double, total: Double): Totals = {
    val __obj = js.Dynamic.literal(covered = covered, pct = pct, skipped = skipped, total = total)
  
    __obj.asInstanceOf[Totals]
  }
}

