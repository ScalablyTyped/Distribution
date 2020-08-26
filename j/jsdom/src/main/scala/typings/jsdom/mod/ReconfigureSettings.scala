package typings.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconfigureSettings extends js.Object {
  var url: js.UndefOr[String] = js.native
  var windowTop: js.UndefOr[DOMWindow] = js.native
}

object ReconfigureSettings {
  @scala.inline
  def apply(): ReconfigureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconfigureSettings]
  }
  @scala.inline
  implicit class ReconfigureSettingsOps[Self <: ReconfigureSettings] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWindowTop(value: DOMWindow): Self = this.set("windowTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTop: Self = this.set("windowTop", js.undefined)
  }
  
}

