package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailaddressesFirstname extends js.Object {
  var email_addresses: js.Array[String]
  var first_name: js.UndefOr[String] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
  var phone_numbers: js.Array[String]
}

object Anon_EmailaddressesFirstname {
  @scala.inline
  def apply(
    email_addresses: js.Array[String],
    phone_numbers: js.Array[String],
    first_name: String = null,
    last_name: String = null
  ): Anon_EmailaddressesFirstname = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses, phone_numbers = phone_numbers)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    __obj.asInstanceOf[Anon_EmailaddressesFirstname]
  }
}

