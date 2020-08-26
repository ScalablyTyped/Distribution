package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for a unique key indicating a record that contains a finding.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordKey extends js.Object {
  var bigQueryKey: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryKey] = js.native
  var datastoreKey: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreKey] = js.native
  /**
    * Values of identifying columns in the given row. Order of values matches
    * the order of field identifiers specified in the scanning request.
    */
  var idValues: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2RecordKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordKeyOps[Self <: SchemaGooglePrivacyDlpV2RecordKey] (val x: Self) extends AnyVal {
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
    def setBigQueryKey(value: SchemaGooglePrivacyDlpV2BigQueryKey): Self = this.set("bigQueryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigQueryKey: Self = this.set("bigQueryKey", js.undefined)
    @scala.inline
    def setDatastoreKey(value: SchemaGooglePrivacyDlpV2DatastoreKey): Self = this.set("datastoreKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatastoreKey: Self = this.set("datastoreKey", js.undefined)
    @scala.inline
    def setIdValuesVarargs(value: String*): Self = this.set("idValues", js.Array(value :_*))
    @scala.inline
    def setIdValues(value: js.Array[String]): Self = this.set("idValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdValues: Self = this.set("idValues", js.undefined)
  }
  
}

