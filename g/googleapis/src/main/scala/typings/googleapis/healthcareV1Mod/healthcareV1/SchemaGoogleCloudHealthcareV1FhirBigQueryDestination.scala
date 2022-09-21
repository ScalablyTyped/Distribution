package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudHealthcareV1FhirBigQueryDestination extends StObject {
  
  /**
    * BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`.
    */
  var datasetUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this flag is `TRUE`, all tables are deleted from the dataset before the new exported tables are written. If the flag is not set and the destination dataset contains tables, the export call returns an error. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
    */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.undefined
  
  /**
    * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
    */
  var writeDisposition: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudHealthcareV1FhirBigQueryDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1FhirBigQueryDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1FhirBigQueryDestination](x: Self) {
    
    inline def setDatasetUri(value: String): Self = StObject.set(x, "datasetUri", value.asInstanceOf[js.Any])
    
    inline def setDatasetUriNull: Self = StObject.set(x, "datasetUri", null)
    
    inline def setDatasetUriUndefined: Self = StObject.set(x, "datasetUri", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setSchemaConfig(value: SchemaSchemaConfig): Self = StObject.set(x, "schemaConfig", value.asInstanceOf[js.Any])
    
    inline def setSchemaConfigUndefined: Self = StObject.set(x, "schemaConfig", js.undefined)
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionNull: Self = StObject.set(x, "writeDisposition", null)
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
