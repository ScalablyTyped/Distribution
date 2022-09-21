package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination extends StObject {
  
  /**
    * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
    */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the schema format to export.
    */
  var schemaType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * BigQuery URI to a table, up to 2000 characters long, must be of the form bq://projectId.bqDatasetId.tableId.
    */
  var tableUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
    */
  var writeDisposition: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setSchemaType(value: String): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    inline def setSchemaTypeNull: Self = StObject.set(x, "schemaType", null)
    
    inline def setSchemaTypeUndefined: Self = StObject.set(x, "schemaType", js.undefined)
    
    inline def setTableUri(value: String): Self = StObject.set(x, "tableUri", value.asInstanceOf[js.Any])
    
    inline def setTableUriNull: Self = StObject.set(x, "tableUri", null)
    
    inline def setTableUriUndefined: Self = StObject.set(x, "tableUri", js.undefined)
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionNull: Self = StObject.set(x, "writeDisposition", null)
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
