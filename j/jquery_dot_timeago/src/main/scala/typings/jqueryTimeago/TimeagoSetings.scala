package typings.jqueryTimeago

import typings.jqueryTimeago.anon.Day
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeagoSetings extends js.Object {
  var allowFuture: js.UndefOr[Boolean] = js.native
  var refreshMillis: js.UndefOr[Double] = js.native
  var strings: js.UndefOr[Day] = js.native
}

object TimeagoSetings {
  @scala.inline
  def apply(): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeagoSetings]
  }
  @scala.inline
  implicit class TimeagoSetingsOps[Self <: TimeagoSetings] (val x: Self) extends AnyVal {
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
    def setAllowFuture(value: Boolean): Self = this.set("allowFuture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFuture: Self = this.set("allowFuture", js.undefined)
    @scala.inline
    def setRefreshMillis(value: Double): Self = this.set("refreshMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshMillis: Self = this.set("refreshMillis", js.undefined)
    @scala.inline
    def setStrings(value: Day): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
  
}

