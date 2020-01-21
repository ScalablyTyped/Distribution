package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity in a dataset is a field or set of fields that correspond to a
  * single person. For example, in medical records the `EntityId` might be a
  * patient identifier, or for financial records it might be an account
  * identifier. This message is used when generalizations or analysis must take
  * into account that multiple rows correspond to the same entity.
  */
@js.native
trait SchemaGooglePrivacyDlpV2EntityId extends js.Object {
  /**
    * Composite key indicating which field contains the entity identifier.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2EntityId {
  @scala.inline
  def apply(field: SchemaGooglePrivacyDlpV2FieldId = null): SchemaGooglePrivacyDlpV2EntityId = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2EntityId]
  }
}

