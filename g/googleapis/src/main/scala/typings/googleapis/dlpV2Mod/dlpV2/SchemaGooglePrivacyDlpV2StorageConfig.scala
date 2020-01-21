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
  def apply(
    bigQueryOptions: SchemaGooglePrivacyDlpV2BigQueryOptions = null,
    cloudStorageOptions: SchemaGooglePrivacyDlpV2CloudStorageOptions = null,
    datastoreOptions: SchemaGooglePrivacyDlpV2DatastoreOptions = null,
    timespanConfig: SchemaGooglePrivacyDlpV2TimespanConfig = null
  ): SchemaGooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    if (bigQueryOptions != null) __obj.updateDynamic("bigQueryOptions")(bigQueryOptions.asInstanceOf[js.Any])
    if (cloudStorageOptions != null) __obj.updateDynamic("cloudStorageOptions")(cloudStorageOptions.asInstanceOf[js.Any])
    if (datastoreOptions != null) __obj.updateDynamic("datastoreOptions")(datastoreOptions.asInstanceOf[js.Any])
    if (timespanConfig != null) __obj.updateDynamic("timespanConfig")(timespanConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StorageConfig]
  }
}

