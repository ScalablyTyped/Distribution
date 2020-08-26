package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributesnaturallanguage extends js.Object {
  var `attributes-charset`: CharacterSet = js.native
  var `attributes-natural-language`: String = js.native
  var `detailed-status-message`: js.UndefOr[String] = js.native
  var `status-message`: js.UndefOr[String] = js.native
}

object Attributesnaturallanguage {
  @scala.inline
  def apply(`attributes-charset`: CharacterSet, `attributes-natural-language`: String): Attributesnaturallanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributesnaturallanguage]
  }
  @scala.inline
  implicit class AttributesnaturallanguageOps[Self <: Attributesnaturallanguage] (val x: Self) extends AnyVal {
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
    def `setAttributes-charset`(value: CharacterSet): Self = this.set("attributes-charset", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = this.set("attributes-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDetailed-status-message`(value: String): Self = this.set("detailed-status-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDetailed-status-message`: Self = this.set("detailed-status-message", js.undefined)
    @scala.inline
    def `setStatus-message`(value: String): Self = this.set("status-message", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStatus-message`: Self = this.set("status-message", js.undefined)
  }
  
}

