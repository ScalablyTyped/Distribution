package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for exporting to BigQuery.
  */
trait SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination extends StObject {
  
  /**
    * BigQuery URI to a dataset, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId`
    */
  var datasetUri: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.undefined
}
object SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination](x: Self) {
    
    inline def setDatasetUri(value: String): Self = StObject.set(x, "datasetUri", value.asInstanceOf[js.Any])
    
    inline def setDatasetUriUndefined: Self = StObject.set(x, "datasetUri", js.undefined)
    
    inline def setSchemaConfig(value: SchemaSchemaConfig): Self = StObject.set(x, "schemaConfig", value.asInstanceOf[js.Any])
    
    inline def setSchemaConfigUndefined: Self = StObject.set(x, "schemaConfig", js.undefined)
  }
}
