package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPageOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var loadMsgDelay: js.UndefOr[Double] = js.native
  var pageContainer: js.UndefOr[JQuery] = js.native
  var reloadPage: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var showLoadMsg: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object LoadPageOptions {
  @scala.inline
  def apply(): LoadPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPageOptions]
  }
  @scala.inline
  implicit class LoadPageOptionsOps[Self <: LoadPageOptions] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLoadMsgDelay(value: Double): Self = this.set("loadMsgDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMsgDelay: Self = this.set("loadMsgDelay", js.undefined)
    @scala.inline
    def setPageContainer(value: JQuery): Self = this.set("pageContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageContainer: Self = this.set("pageContainer", js.undefined)
    @scala.inline
    def setReloadPage(value: Boolean): Self = this.set("reloadPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReloadPage: Self = this.set("reloadPage", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setShowLoadMsg(value: Boolean): Self = this.set("showLoadMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLoadMsg: Self = this.set("showLoadMsg", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

