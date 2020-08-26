package typings.istanbulLibCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Totals extends js.Object {
  var covered: Double = js.native
  var pct: Double = js.native
  var skipped: Double = js.native
  var total: Double = js.native
}

object Totals {
  @scala.inline
  def apply(covered: Double, pct: Double, skipped: Double, total: Double): Totals = {
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totals]
  }
  @scala.inline
  implicit class TotalsOps[Self <: Totals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCovered(value: Double): Self = this.set("covered", value.asInstanceOf[js.Any])
    @scala.inline
    def setPct(value: Double): Self = this.set("pct", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

