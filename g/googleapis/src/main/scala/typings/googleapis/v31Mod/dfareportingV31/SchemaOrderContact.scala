package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contact of an order.
  */
@js.native
trait SchemaOrderContact extends js.Object {
  /**
    * Free-form information about this contact. It could be any information
    * related to this contact in addition to type, title, name, and signature
    * user profile ID.
    */
  var contactInfo: js.UndefOr[String] = js.native
  /**
    * Name of this contact.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * Title of this contact.
    */
  var contactTitle: js.UndefOr[String] = js.native
  /**
    * Type of this contact.
    */
  var contactType: js.UndefOr[String] = js.native
  /**
    * ID of the user profile containing the signature that will be embedded
    * into order documents.
    */
  var signatureUserProfileId: js.UndefOr[String] = js.native
}

object SchemaOrderContact {
  @scala.inline
  def apply(): SchemaOrderContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderContact]
  }
  @scala.inline
  implicit class SchemaOrderContactOps[Self <: SchemaOrderContact] (val x: Self) extends AnyVal {
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
    def setContactInfo(value: String): Self = this.set("contactInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactInfo: Self = this.set("contactInfo", js.undefined)
    @scala.inline
    def setContactName(value: String): Self = this.set("contactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactName: Self = this.set("contactName", js.undefined)
    @scala.inline
    def setContactTitle(value: String): Self = this.set("contactTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactTitle: Self = this.set("contactTitle", js.undefined)
    @scala.inline
    def setContactType(value: String): Self = this.set("contactType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactType: Self = this.set("contactType", js.undefined)
    @scala.inline
    def setSignatureUserProfileId(value: String): Self = this.set("signatureUserProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureUserProfileId: Self = this.set("signatureUserProfileId", js.undefined)
  }
  
}

