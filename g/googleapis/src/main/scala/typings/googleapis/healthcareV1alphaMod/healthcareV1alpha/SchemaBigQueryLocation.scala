package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BigQuery dataset location.
  */
trait SchemaBigQueryLocation extends StObject {
  
  /**
    * ID of the dataset that houses the BigQuery tables.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the project that owns the BigQuery datasets.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.undefined
}
object SchemaBigQueryLocation {
  
  inline def apply(): SchemaBigQueryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryLocation]
  }
  
  extension [Self <: SchemaBigQueryLocation](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSchemaConfig(value: SchemaSchemaConfig): Self = StObject.set(x, "schemaConfig", value.asInstanceOf[js.Any])
    
    inline def setSchemaConfigUndefined: Self = StObject.set(x, "schemaConfig", js.undefined)
  }
}
