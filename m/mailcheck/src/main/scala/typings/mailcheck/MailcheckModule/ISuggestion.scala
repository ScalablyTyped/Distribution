package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestion extends js.Object {
  var address: String = js.native
  var domain: String = js.native
  var full: String = js.native
}

object ISuggestion {
  @scala.inline
  def apply(address: String, domain: String, full: String): ISuggestion = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestion]
  }
  @scala.inline
  implicit class ISuggestionOps[Self <: ISuggestion] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
  }
  
}

