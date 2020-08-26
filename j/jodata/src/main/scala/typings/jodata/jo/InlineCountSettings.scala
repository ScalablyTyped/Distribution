package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineCountSettings extends ISettings {
  var DefaultInlineCount: String = js.native
  var InlineCount: String = js.native
}

object InlineCountSettings {
  @scala.inline
  def apply(DefaultInlineCount: String, InlineCount: String, isSet: () => Boolean, reset: () => Unit): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount.asInstanceOf[js.Any], InlineCount = InlineCount.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[InlineCountSettings]
  }
  @scala.inline
  implicit class InlineCountSettingsOps[Self <: InlineCountSettings] (val x: Self) extends AnyVal {
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
    def setDefaultInlineCount(value: String): Self = this.set("DefaultInlineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineCount(value: String): Self = this.set("InlineCount", value.asInstanceOf[js.Any])
  }
  
}

