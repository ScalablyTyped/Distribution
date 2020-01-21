package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quasi-identifier column has a custom_tag, used to know which column in
  * the data corresponds to which column in the statistical model.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuasiIdField extends js.Object {
  var customTag: js.UndefOr[String] = js.native
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2QuasiIdField {
  @scala.inline
  def apply(customTag: String = null, field: SchemaGooglePrivacyDlpV2FieldId = null): SchemaGooglePrivacyDlpV2QuasiIdField = {
    val __obj = js.Dynamic.literal()
    if (customTag != null) __obj.updateDynamic("customTag")(customTag.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuasiIdField]
  }
}

