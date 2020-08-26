package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTransport extends js.Object {
  var discover: js.UndefOr[js.Any] = js.native
  var read: js.UndefOr[js.Any] = js.native
}

object PivotTransport {
  @scala.inline
  def apply(): PivotTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransport]
  }
  @scala.inline
  implicit class PivotTransportOps[Self <: PivotTransport] (val x: Self) extends AnyVal {
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
    def setDiscover(value: js.Any): Self = this.set("discover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscover: Self = this.set("discover", js.undefined)
    @scala.inline
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
  
}

