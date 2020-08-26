package typings.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsenSettings extends js.Object {
  var formats: js.UndefOr[JsenFormats] = js.native
  var greedy: js.UndefOr[Boolean] = js.native
  @JSName("missing$Ref")
  var missing$Ref: js.UndefOr[Boolean] = js.native
  var schemas: js.UndefOr[js.Any] = js.native
}

object JsenSettings {
  @scala.inline
  def apply(): JsenSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsenSettings]
  }
  @scala.inline
  implicit class JsenSettingsOps[Self <: JsenSettings] (val x: Self) extends AnyVal {
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
    def setFormats(value: JsenFormats): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreedy: Self = this.set("greedy", js.undefined)
    @scala.inline
    def setMissing$Ref(value: Boolean): Self = this.set("missing$Ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissing$Ref: Self = this.set("missing$Ref", js.undefined)
    @scala.inline
    def setSchemas(value: js.Any): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
  
}

