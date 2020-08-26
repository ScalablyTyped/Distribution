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
  def apply(): SchemaGooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordLocation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordLocationOps[Self <: SchemaGooglePrivacyDlpV2RecordLocation] (val x: Self) extends AnyVal {
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
    def setFieldId(value: SchemaGooglePrivacyDlpV2FieldId): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldId: Self = this.set("fieldId", js.undefined)
    @scala.inline
    def setRecordKey(value: SchemaGooglePrivacyDlpV2RecordKey): Self = this.set("recordKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordKey: Self = this.set("recordKey", js.undefined)
    @scala.inline
    def setTableLocation(value: SchemaGooglePrivacyDlpV2TableLocation): Self = this.set("tableLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableLocation: Self = this.set("tableLocation", js.undefined)
  }
  
}

