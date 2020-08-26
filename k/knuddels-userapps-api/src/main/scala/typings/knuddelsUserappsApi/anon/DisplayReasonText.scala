package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelTransferDisplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayReasonText extends js.Object {
  var displayReasonText: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  var transferDisplayType: js.UndefOr[KnuddelTransferDisplayType] = js.native
}

object DisplayReasonText {
  @scala.inline
  def apply(): DisplayReasonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayReasonText]
  }
  @scala.inline
  implicit class DisplayReasonTextOps[Self <: DisplayReasonText] (val x: Self) extends AnyVal {
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
    def setDisplayReasonText(value: String): Self = this.set("displayReasonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayReasonText: Self = this.set("displayReasonText", js.undefined)
    @scala.inline
    def setOnError(value: /* message */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setTransferDisplayType(value: KnuddelTransferDisplayType): Self = this.set("transferDisplayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferDisplayType: Self = this.set("transferDisplayType", js.undefined)
  }
  
}

