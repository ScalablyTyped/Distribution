package typings.langJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var fallback: String = js.native
  var locale: String = js.native
  var messages: Messages = js.native
}

object Options {
  @scala.inline
  def apply(fallback: String, locale: String, messages: Messages): Options = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

