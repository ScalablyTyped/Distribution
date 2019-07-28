package typings.jestDashCli.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverageTotal extends js.Object {
  var covered: Double
  var pct: Double
  var skipped: Double
  var total: Double
}

object FileCoverageTotal {
  @scala.inline
  def apply(covered: Double, pct: Double, skipped: Double, total: Double): FileCoverageTotal = {
    val __obj = js.Dynamic.literal(covered = covered, pct = pct, skipped = skipped, total = total)
  
    __obj.asInstanceOf[FileCoverageTotal]
  }
}

