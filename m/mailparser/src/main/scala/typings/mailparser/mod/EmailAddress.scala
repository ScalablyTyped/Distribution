package typings.mailparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Address details.
  */
@js.native
trait EmailAddress extends js.Object {
  /**
    * The email address.
    */
  var address: String = js.native
  /**
    * An array of grouped addresses.
    */
  var group: js.UndefOr[js.Array[EmailAddress]] = js.native
  /**
    * The name part of the email/group.
    */
  var name: String = js.native
}

object EmailAddress {
  @scala.inline
  def apply(address: String, name: String): EmailAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
  @scala.inline
  implicit class EmailAddressOps[Self <: EmailAddress] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupVarargs(value: EmailAddress*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: js.Array[EmailAddress]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
  }
  
}

