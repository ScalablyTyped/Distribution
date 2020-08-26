package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullScreenEvents extends Events {
  var onCloseBtnClick: js.UndefOr[IVEvent] = js.native
}

object FullScreenEvents {
  @scala.inline
  def apply(): FullScreenEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullScreenEvents]
  }
  @scala.inline
  implicit class FullScreenEventsOps[Self <: FullScreenEvents] (val x: Self) extends AnyVal {
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
    def setOnCloseBtnClick(value: () => Unit): Self = this.set("onCloseBtnClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCloseBtnClick: Self = this.set("onCloseBtnClick", js.undefined)
  }
  
}

