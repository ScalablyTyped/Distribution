package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Site Directory contact.
  */
@js.native
trait SchemaDirectorySiteContact extends js.Object {
  /**
    * Address of this directory site contact.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Email address of this directory site contact.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * First name of this directory site contact.
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * ID of this directory site contact. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContact&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Last name of this directory site contact.
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * Phone number of this directory site contact.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Directory site contact role.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Title or designation of this directory site contact.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Directory site contact type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDirectorySiteContact {
  @scala.inline
  def apply(): SchemaDirectorySiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContact]
  }
  @scala.inline
  implicit class SchemaDirectorySiteContactOps[Self <: SchemaDirectorySiteContact] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

