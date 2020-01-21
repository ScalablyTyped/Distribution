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
  def apply(
    contactInfo: String = null,
    contactName: String = null,
    contactTitle: String = null,
    contactType: String = null,
    signatureUserProfileId: String = null
  ): SchemaOrderContact = {
    val __obj = js.Dynamic.literal()
    if (contactInfo != null) __obj.updateDynamic("contactInfo")(contactInfo.asInstanceOf[js.Any])
    if (contactName != null) __obj.updateDynamic("contactName")(contactName.asInstanceOf[js.Any])
    if (contactTitle != null) __obj.updateDynamic("contactTitle")(contactTitle.asInstanceOf[js.Any])
    if (contactType != null) __obj.updateDynamic("contactType")(contactType.asInstanceOf[js.Any])
    if (signatureUserProfileId != null) __obj.updateDynamic("signatureUserProfileId")(signatureUserProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderContact]
  }
}

