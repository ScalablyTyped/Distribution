package typings
package gulpDashIstanbulLib.gulpDashIstanbulMod.GulpIstanbulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageStats extends js.Object {
  var covered: scala.Double
  var pct: scala.Double
  var skipped: scala.Double
  var total: scala.Double
}

object CoverageStats {
  @scala.inline
  def apply(covered: scala.Double, pct: scala.Double, skipped: scala.Double, total: scala.Double): CoverageStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("covered")(covered)
    __obj.updateDynamic("pct")(pct)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[CoverageStats]
  }
}

