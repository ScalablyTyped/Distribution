package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a row or record.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordLocation extends js.Object {
  /**
    * Field id of the field containing the finding.
    */
  var fieldId: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * Key of the finding.
    */
  var recordKey: js.UndefOr[SchemaGooglePrivacyDlpV2RecordKey] = js.native
  /**
    * Location within a `ContentItem.Table`.
    */
  var tableLocation: js.UndefOr[SchemaGooglePrivacyDlpV2TableLocation] = js.native
}

object SchemaGooglePrivacyDlpV2RecordLocation {
  @scala.inline
  def apply(
    fieldId: SchemaGooglePrivacyDlpV2FieldId = null,
    recordKey: SchemaGooglePrivacyDlpV2RecordKey = null,
    tableLocation: SchemaGooglePrivacyDlpV2TableLocation = null
  ): SchemaGooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    if (fieldId != null) __obj.updateDynamic("fieldId")(fieldId.asInstanceOf[js.Any])
    if (recordKey != null) __obj.updateDynamic("recordKey")(recordKey.asInstanceOf[js.Any])
    if (tableLocation != null) __obj.updateDynamic("tableLocation")(tableLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordLocation]
  }
}

