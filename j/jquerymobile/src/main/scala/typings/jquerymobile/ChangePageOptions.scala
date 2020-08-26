package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangePageOptions extends js.Object {
  var allowSamePageTransition: js.UndefOr[Boolean] = js.native
  var changeHash: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataUrl: js.UndefOr[String] = js.native
  var pageContainer: js.UndefOr[JQuery] = js.native
  var reloadPage: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var showLoadMsg: js.UndefOr[Boolean] = js.native
  var transition: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ChangePageOptions {
  @scala.inline
  def apply(): ChangePageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePageOptions]
  }
  @scala.inline
  implicit class ChangePageOptionsOps[Self <: ChangePageOptions] (val x: Self) extends AnyVal {
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
    def setAllowSamePageTransition(value: Boolean): Self = this.set("allowSamePageTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSamePageTransition: Self = this.set("allowSamePageTransition", js.undefined)
    @scala.inline
    def setChangeHash(value: Boolean): Self = this.set("changeHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeHash: Self = this.set("changeHash", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    @scala.inline
    def setPageContainer(value: JQuery): Self = this.set("pageContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageContainer: Self = this.set("pageContainer", js.undefined)
    @scala.inline
    def setReloadPage(value: Boolean): Self = this.set("reloadPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReloadPage: Self = this.set("reloadPage", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setShowLoadMsg(value: Boolean): Self = this.set("showLoadMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLoadMsg: Self = this.set("showLoadMsg", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

