package typings.hoxy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hoxy.hoxy.Slow> */
@js.native
trait PartialSlow extends js.Object {
  var down: js.UndefOr[Double] = js.native
  var latency: js.UndefOr[Double] = js.native
  var rate: js.UndefOr[Double] = js.native
  var up: js.UndefOr[Double] = js.native
}

object PartialSlow {
  @scala.inline
  def apply(): PartialSlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSlow]
  }
  @scala.inline
  implicit class PartialSlowOps[Self <: PartialSlow] (val x: Self) extends AnyVal {
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
    def setDown(value: Double): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setUp(value: Double): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
  
}

