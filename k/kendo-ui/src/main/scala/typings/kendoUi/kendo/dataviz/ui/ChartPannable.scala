package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPannable extends js.Object {
  var key: js.UndefOr[String] = js.native
  var lock: js.UndefOr[String] = js.native
}

object ChartPannable {
  @scala.inline
  def apply(): ChartPannable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPannable]
  }
  @scala.inline
  implicit class ChartPannableOps[Self <: ChartPannable] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLock(value: String): Self = this.set("lock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
  }
  
}

