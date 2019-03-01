package typings
package mailcheckLib.MailcheckModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestion extends js.Object {
  var address: java.lang.String
  var domain: java.lang.String
  var full: java.lang.String
}

object ISuggestion {
  @scala.inline
  def apply(address: java.lang.String, domain: java.lang.String, full: java.lang.String): ISuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("full")(full)
    __obj.asInstanceOf[ISuggestion]
  }
}

