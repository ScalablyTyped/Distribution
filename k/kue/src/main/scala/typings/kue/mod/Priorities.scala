package typings.kue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Priorities extends js.Object {
  var critical: Double = js.native
  var high: Double = js.native
  var low: Double = js.native
  var medium: Double = js.native
  var normal: Double = js.native
}

object Priorities {
  @scala.inline
  def apply(critical: Double, high: Double, low: Double, medium: Double, normal: Double): Priorities = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priorities]
  }
  @scala.inline
  implicit class PrioritiesOps[Self <: Priorities] (val x: Self) extends AnyVal {
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
    def setCritical(value: Double): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: Double): Self = this.set("normal", value.asInstanceOf[js.Any])
  }
  
}

