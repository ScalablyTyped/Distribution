package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeOptions extends js.Object {
  var autoSendLogs: js.UndefOr[Boolean] = js.native
  var autoUpdateConfig: js.UndefOr[Boolean] = js.native
  var capture: js.UndefOr[Boolean] = js.native
  var filters: js.UndefOr[Filter] = js.native
  var level: js.UndefOr[String] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
}

object NativeOptions {
  @scala.inline
  def apply(): NativeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeOptions]
  }
  @scala.inline
  implicit class NativeOptionsOps[Self <: NativeOptions] (val x: Self) extends AnyVal {
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
    def setAutoSendLogs(value: Boolean): Self = this.set("autoSendLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSendLogs: Self = this.set("autoSendLogs", js.undefined)
    @scala.inline
    def setAutoUpdateConfig(value: Boolean): Self = this.set("autoUpdateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpdateConfig: Self = this.set("autoUpdateConfig", js.undefined)
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setFilters(value: Filter): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
  }
  
}

