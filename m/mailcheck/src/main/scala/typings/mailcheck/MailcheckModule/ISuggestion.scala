package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestion extends js.Object {
  var address: String
  var domain: String
  var full: String
}

object ISuggestion {
  @scala.inline
  def apply(address: String, domain: String, full: String): ISuggestion = {
    val __obj = js.Dynamic.literal(address = address, domain = domain, full = full)
  
    __obj.asInstanceOf[ISuggestion]
  }
}

