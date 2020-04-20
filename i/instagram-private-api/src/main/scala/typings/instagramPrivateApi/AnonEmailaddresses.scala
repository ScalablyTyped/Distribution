package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmailaddresses extends js.Object {
  var email_addresses: js.Array[String]
  var first_name: String
  var last_name: String
  var phone_numbers: js.Array[String]
}

object AnonEmailaddresses {
  @scala.inline
  def apply(
    email_addresses: js.Array[String],
    first_name: String,
    last_name: String,
    phone_numbers: js.Array[String]
  ): AnonEmailaddresses = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], phone_numbers = phone_numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmailaddresses]
  }
}

