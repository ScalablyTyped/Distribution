package typings.istanbulLibCoverage.mod

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
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totals]
  }
}

