package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverageTotal extends js.Object {
  var covered: scala.Double
  var pct: scala.Double
  var skipped: scala.Double
  var total: scala.Double
}

object FileCoverageTotal {
  @scala.inline
  def apply(covered: scala.Double, pct: scala.Double, skipped: scala.Double, total: scala.Double): FileCoverageTotal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("covered")(covered)
    __obj.updateDynamic("pct")(pct)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[FileCoverageTotal]
  }
}

