package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shared message indicating Cloud storage type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StorageConfig extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2StorageConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2StorageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigQueryOptions(value: SchemaGooglePrivacyDlpV2BigQueryOptions): Self = StObject.set(x, "bigQueryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryOptionsUndefined: Self = StObject.set(x, "bigQueryOptions", js.undefined)
    
    @scala.inline
    def setCloudStorageOptions(value: SchemaGooglePrivacyDlpV2CloudStorageOptions): Self = StObject.set(x, "cloudStorageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudStorageOptionsUndefined: Self = StObject.set(x, "cloudStorageOptions", js.undefined)
    
    @scala.inline
    def setDatastoreOptions(value: SchemaGooglePrivacyDlpV2DatastoreOptions): Self = StObject.set(x, "datastoreOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreOptionsUndefined: Self = StObject.set(x, "datastoreOptions", js.undefined)
    
    @scala.inline
    def setTimespanConfig(value: SchemaGooglePrivacyDlpV2TimespanConfig): Self = StObject.set(x, "timespanConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimespanConfigUndefined: Self = StObject.set(x, "timespanConfig", js.undefined)
  }
}
