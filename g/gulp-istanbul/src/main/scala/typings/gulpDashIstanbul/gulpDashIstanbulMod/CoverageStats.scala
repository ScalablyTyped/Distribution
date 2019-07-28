package typings.gulpDashIstanbul.gulpDashIstanbulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageStats extends js.Object {
  var covered: Double
  var pct: Double
  var skipped: Double
  var total: Double
}

object CoverageStats {
  @scala.inline
  def apply(covered: Double, pct: Double, skipped: Double, total: Double): CoverageStats = {
    val __obj = js.Dynamic.literal(covered = covered, pct = pct, skipped = skipped, total = total)
  
    __obj.asInstanceOf[CoverageStats]
  }
}

