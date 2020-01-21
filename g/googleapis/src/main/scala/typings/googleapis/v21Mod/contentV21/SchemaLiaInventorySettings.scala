package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaInventorySettings extends js.Object {
  /**
    * The email of the contact for the inventory verification process.
    */
  var inventoryVerificationContactEmail: js.UndefOr[String] = js.native
  /**
    * The name of the contact for the inventory verification process.
    */
  var inventoryVerificationContactName: js.UndefOr[String] = js.native
  /**
    * The status of the verification contact.
    */
  var inventoryVerificationContactStatus: js.UndefOr[String] = js.native
  /**
    * The status of the inventory verification process.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaLiaInventorySettings {
  @scala.inline
  def apply(
    inventoryVerificationContactEmail: String = null,
    inventoryVerificationContactName: String = null,
    inventoryVerificationContactStatus: String = null,
    status: String = null
  ): SchemaLiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    if (inventoryVerificationContactEmail != null) __obj.updateDynamic("inventoryVerificationContactEmail")(inventoryVerificationContactEmail.asInstanceOf[js.Any])
    if (inventoryVerificationContactName != null) __obj.updateDynamic("inventoryVerificationContactName")(inventoryVerificationContactName.asInstanceOf[js.Any])
    if (inventoryVerificationContactStatus != null) __obj.updateDynamic("inventoryVerificationContactStatus")(inventoryVerificationContactStatus.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiaInventorySettings]
  }
}

