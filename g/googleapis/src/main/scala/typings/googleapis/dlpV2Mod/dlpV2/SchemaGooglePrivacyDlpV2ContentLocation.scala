package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ContentLocation extends StObject {
  
  /**
    * Name of the container where the finding is located. The top level name is the source file name or table name. Names of some common storage containers are formatted as follows: * BigQuery tables: `{project_id\}:{dataset_id\}.{table_id\}` * Cloud Storage files: `gs://{bucket\}/{path\}` * Datastore namespace: {namespace\} Nested names could be absent if the embedded object has no string identifier (for example, an image contained within a document).
    */
  var containerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Finding container modification timestamp, if applicable. For Cloud Storage, this field contains the last file modification timestamp. For a BigQuery table, this field contains the last_modified_time property. For Datastore, this field isn't populated.
    */
  var containerTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Finding container version, if available ("generation" for Cloud Storage).
    */
  var containerVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location data for document files.
    */
  var documentLocation: js.UndefOr[SchemaGooglePrivacyDlpV2DocumentLocation] = js.undefined
  
  /**
    * Location within an image's pixels.
    */
  var imageLocation: js.UndefOr[SchemaGooglePrivacyDlpV2ImageLocation] = js.undefined
  
  /**
    * Location within the metadata for inspected content.
    */
  var metadataLocation: js.UndefOr[SchemaGooglePrivacyDlpV2MetadataLocation] = js.undefined
  
  /**
    * Location within a row or record of a database table.
    */
  var recordLocation: js.UndefOr[SchemaGooglePrivacyDlpV2RecordLocation] = js.undefined
}
object SchemaGooglePrivacyDlpV2ContentLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ContentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ContentLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ContentLocation](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameNull: Self = StObject.set(x, "containerName", null)
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setContainerTimestamp(value: String): Self = StObject.set(x, "containerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContainerTimestampNull: Self = StObject.set(x, "containerTimestamp", null)
    
    inline def setContainerTimestampUndefined: Self = StObject.set(x, "containerTimestamp", js.undefined)
    
    inline def setContainerVersion(value: String): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionNull: Self = StObject.set(x, "containerVersion", null)
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    inline def setDocumentLocation(value: SchemaGooglePrivacyDlpV2DocumentLocation): Self = StObject.set(x, "documentLocation", value.asInstanceOf[js.Any])
    
    inline def setDocumentLocationUndefined: Self = StObject.set(x, "documentLocation", js.undefined)
    
    inline def setImageLocation(value: SchemaGooglePrivacyDlpV2ImageLocation): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    inline def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
    
    inline def setMetadataLocation(value: SchemaGooglePrivacyDlpV2MetadataLocation): Self = StObject.set(x, "metadataLocation", value.asInstanceOf[js.Any])
    
    inline def setMetadataLocationUndefined: Self = StObject.set(x, "metadataLocation", js.undefined)
    
    inline def setRecordLocation(value: SchemaGooglePrivacyDlpV2RecordLocation): Self = StObject.set(x, "recordLocation", value.asInstanceOf[js.Any])
    
    inline def setRecordLocationUndefined: Self = StObject.set(x, "recordLocation", js.undefined)
  }
}
