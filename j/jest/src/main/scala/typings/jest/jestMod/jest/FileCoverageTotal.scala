package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverageTotal extends js.Object {
  var covered: Double
  var pct: js.UndefOr[Double] = js.undefined
  var skipped: Double
  var total: Double
}

object FileCoverageTotal {
  @scala.inline
  def apply(covered: Double, skipped: Double, total: Double, pct: Int | Double = null): FileCoverageTotal = {
    val __obj = js.Dynamic.literal(covered = covered, skipped = skipped, total = total)
    if (pct != null) __obj.updateDynamic("pct")(pct.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverageTotal]
  }
}

