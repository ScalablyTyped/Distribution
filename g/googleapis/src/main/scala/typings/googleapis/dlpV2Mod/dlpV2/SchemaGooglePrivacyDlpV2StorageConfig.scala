package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared message indicating Cloud storage type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StorageConfig extends js.Object {
  /**
    * BigQuery options specification.
    */
  var bigQueryOptions: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryOptions] = js.native
  /**
    * Google Cloud Storage options specification.
    */
  var cloudStorageOptions: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageOptions] = js.native
  /**
    * Google Cloud Datastore options specification.
    */
  var datastoreOptions: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreOptions] = js.native
  var timespanConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimespanConfig] = js.native
}

object SchemaGooglePrivacyDlpV2StorageConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StorageConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StorageConfigOps[Self <: SchemaGooglePrivacyDlpV2StorageConfig] (val x: Self) extends AnyVal {
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
    def setBigQueryOptions(value: SchemaGooglePrivacyDlpV2BigQueryOptions): Self = this.set("bigQueryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigQueryOptions: Self = this.set("bigQueryOptions", js.undefined)
    @scala.inline
    def setCloudStorageOptions(value: SchemaGooglePrivacyDlpV2CloudStorageOptions): Self = this.set("cloudStorageOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudStorageOptions: Self = this.set("cloudStorageOptions", js.undefined)
    @scala.inline
    def setDatastoreOptions(value: SchemaGooglePrivacyDlpV2DatastoreOptions): Self = this.set("datastoreOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatastoreOptions: Self = this.set("datastoreOptions", js.undefined)
    @scala.inline
    def setTimespanConfig(value: SchemaGooglePrivacyDlpV2TimespanConfig): Self = this.set("timespanConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimespanConfig: Self = this.set("timespanConfig", js.undefined)
  }
  
}

