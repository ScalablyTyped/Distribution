package typings.istanbulLibCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coverage extends js.Object {
  var coverage: Double = js.native
  var covered: Double = js.native
  var total: Double = js.native
}

object Coverage {
  @scala.inline
  def apply(coverage: Double, covered: Double, total: Double): Coverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], covered = covered.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coverage]
  }
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
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
    def setCoverage(value: Double): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCovered(value: Double): Self = this.set("covered", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

