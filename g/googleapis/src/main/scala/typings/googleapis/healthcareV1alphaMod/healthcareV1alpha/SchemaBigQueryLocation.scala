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
  
  @scala.inline
  def apply(): SchemaBigQueryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryLocation]
  }
  
  @scala.inline
  implicit class SchemaBigQueryLocationMutableBuilder[Self <: SchemaBigQueryLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSchemaConfig(value: SchemaSchemaConfig): Self = StObject.set(x, "schemaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaConfigUndefined: Self = StObject.set(x, "schemaConfig", js.undefined)
  }
}
