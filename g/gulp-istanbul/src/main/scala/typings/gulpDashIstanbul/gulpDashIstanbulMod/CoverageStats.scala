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
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoverageStats]
  }
}

