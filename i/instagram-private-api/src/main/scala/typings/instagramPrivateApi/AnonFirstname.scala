package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstname extends js.Object {
  var email_addresses: js.Array[String]
  var first_name: js.UndefOr[String] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
  var phone_numbers: js.Array[String]
}

object AnonFirstname {
  @scala.inline
  def apply(
    email_addresses: js.Array[String],
    phone_numbers: js.Array[String],
    first_name: String = null,
    last_name: String = null
  ): AnonFirstname = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses.asInstanceOf[js.Any], phone_numbers = phone_numbers.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstname]
  }
}

