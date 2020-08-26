package typings.koaRatelimitLru.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remaining extends js.Object {
  val remaining: js.UndefOr[String] = js.native
  val reset: js.UndefOr[String] = js.native
  val total: js.UndefOr[String] = js.native
}

object Remaining {
  @scala.inline
  def apply(): Remaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remaining]
  }
  @scala.inline
  implicit class RemainingOps[Self <: Remaining] (val x: Self) extends AnyVal {
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
    def setRemaining(value: String): Self = this.set("remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
    @scala.inline
    def setReset(value: String): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

