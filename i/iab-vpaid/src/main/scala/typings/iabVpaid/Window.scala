package typings.iabVpaid

import typings.iabVpaid.iab.vpaid.VpaidCreative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /** VPAID entry point */
  var getVPAIDAd: js.UndefOr[js.Function0[VpaidCreative]] = js.native
}

object Window {
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setGetVPAIDAd(value: () => VpaidCreative): Self = this.set("getVPAIDAd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetVPAIDAd: Self = this.set("getVPAIDAd", js.undefined)
  }
  
}

