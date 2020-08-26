package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site Contact
  */
@js.native
trait SchemaSiteContact extends js.Object {
  /**
    * Address of this site contact.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Site contact type.
    */
  var contactType: js.UndefOr[String] = js.native
  /**
    * Email address of this site contact. This is a required field.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * First name of this site contact.
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * ID of this site contact. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Last name of this site contact.
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * Primary phone number of this site contact.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Title or designation of this site contact.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaSiteContact {
  @scala.inline
  def apply(): SchemaSiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteContact]
  }
  @scala.inline
  implicit class SchemaSiteContactOps[Self <: SchemaSiteContact] (val x: Self) extends AnyVal {
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
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setContactType(value: String): Self = this.set("contactType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactType: Self = this.set("contactType", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

