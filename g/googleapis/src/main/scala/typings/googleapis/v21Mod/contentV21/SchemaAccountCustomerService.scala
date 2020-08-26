package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountCustomerService extends js.Object {
  /**
    * Customer service email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Customer service phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * Customer service URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaAccountCustomerService {
  @scala.inline
  def apply(): SchemaAccountCustomerService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountCustomerService]
  }
  @scala.inline
  implicit class SchemaAccountCustomerServiceOps[Self <: SchemaAccountCustomerService] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

