package typings.mailparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Address details.
  */
trait EmailAddress extends js.Object {
  /**
  	 * The email address.
  	 */
  var address: String
  /**
  	 * An array of grouped addresses.
  	 */
  var group: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  /**
  	 * The name part of the email/group.
  	 */
  var name: String
}

object EmailAddress {
  @scala.inline
  def apply(address: String, name: String, group: js.Array[EmailAddress] = null): EmailAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
}

