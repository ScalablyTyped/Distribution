package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogOptions extends js.Object {
  var closeBtn: js.UndefOr[String] = js.native
  var closeBtnText: js.UndefOr[String] = js.native
  var corners: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var overlayTheme: js.UndefOr[String] = js.native
}

object DialogOptions {
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
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
    def setCloseBtn(value: String): Self = this.set("closeBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBtn: Self = this.set("closeBtn", js.undefined)
    @scala.inline
    def setCloseBtnText(value: String): Self = this.set("closeBtnText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBtnText: Self = this.set("closeBtnText", js.undefined)
    @scala.inline
    def setCorners(value: Boolean): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    @scala.inline
    def setOverlayTheme(value: String): Self = this.set("overlayTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayTheme: Self = this.set("overlayTheme", js.undefined)
  }
  
}

