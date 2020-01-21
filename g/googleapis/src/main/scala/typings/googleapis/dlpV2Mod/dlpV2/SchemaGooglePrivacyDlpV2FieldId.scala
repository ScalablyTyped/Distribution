package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * General identifier of a data field in a storage service.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FieldId extends js.Object {
  /**
    * Name describing the field.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2FieldId {
  @scala.inline
  def apply(name: String = null): SchemaGooglePrivacyDlpV2FieldId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FieldId]
  }
}

