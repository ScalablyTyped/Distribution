package typings.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsenBuildSettings extends js.Object {
  var additionalProperties: js.UndefOr[Boolean] = js.native
  var copy: js.UndefOr[Boolean] = js.native
}

object JsenBuildSettings {
  @scala.inline
  def apply(): JsenBuildSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsenBuildSettings]
  }
  @scala.inline
  implicit class JsenBuildSettingsOps[Self <: JsenBuildSettings] (val x: Self) extends AnyVal {
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
    def setAdditionalProperties(value: Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setCopy(value: Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
  }
  
}

