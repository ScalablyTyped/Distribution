package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2StorageConfig extends StObject {
  
  /**
    * BigQuery options.
    */
  var bigQueryOptions: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryOptions] = js.undefined
  
  /**
    * Cloud Storage options.
    */
  var cloudStorageOptions: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageOptions] = js.undefined
  
  /**
    * Google Cloud Datastore options.
    */
  var datastoreOptions: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreOptions] = js.undefined
  
  /**
    * Hybrid inspection options.
    */
  var hybridOptions: js.UndefOr[SchemaGooglePrivacyDlpV2HybridOptions] = js.undefined
  
  var timespanConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimespanConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2StorageConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StorageConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2StorageConfig](x: Self) {
    
    inline def setBigQueryOptions(value: SchemaGooglePrivacyDlpV2BigQueryOptions): Self = StObject.set(x, "bigQueryOptions", value.asInstanceOf[js.Any])
    
    inline def setBigQueryOptionsUndefined: Self = StObject.set(x, "bigQueryOptions", js.undefined)
    
    inline def setCloudStorageOptions(value: SchemaGooglePrivacyDlpV2CloudStorageOptions): Self = StObject.set(x, "cloudStorageOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageOptionsUndefined: Self = StObject.set(x, "cloudStorageOptions", js.undefined)
    
    inline def setDatastoreOptions(value: SchemaGooglePrivacyDlpV2DatastoreOptions): Self = StObject.set(x, "datastoreOptions", value.asInstanceOf[js.Any])
    
    inline def setDatastoreOptionsUndefined: Self = StObject.set(x, "datastoreOptions", js.undefined)
    
    inline def setHybridOptions(value: SchemaGooglePrivacyDlpV2HybridOptions): Self = StObject.set(x, "hybridOptions", value.asInstanceOf[js.Any])
    
    inline def setHybridOptionsUndefined: Self = StObject.set(x, "hybridOptions", js.undefined)
    
    inline def setTimespanConfig(value: SchemaGooglePrivacyDlpV2TimespanConfig): Self = StObject.set(x, "timespanConfig", value.asInstanceOf[js.Any])
    
    inline def setTimespanConfigUndefined: Self = StObject.set(x, "timespanConfig", js.undefined)
  }
}
