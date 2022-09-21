package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeidentifyFhirStoreRequest extends StObject {
  
  /**
    * Deidentify configuration. Only one of `config` and `gcs_config_uri` can be specified.
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.undefined
  
  /**
    * The name of the FHIR store to create and write the redacted data to. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/fhirStores/{fhir_store_id\}`. * The destination dataset must exist. * The source dataset and destination dataset must both reside in the same location. De-identifying data across multiple locations is not supported. * The destination FHIR store must exist. * The caller must have the healthcare.fhirResources.update permission to write to the destination FHIR store.
    */
  var destinationStore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Storage location to read the JSON cloud.healthcare.deidentify.DeidentifyConfig from, overriding the default config. Must be of the form `gs://{bucket_id\}/path/to/object`. The Cloud Storage location must grant the Cloud IAM role `roles/storage.objectViewer` to the project's Cloud Healthcare Service Agent service account. Only one of `config` and `gcs_config_uri` can be specified.
    */
  var gcsConfigUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A filter specifying the resources to include in the output. If not specified, all resources are included in the output.
    */
  var resourceFilter: js.UndefOr[SchemaFhirFilter] = js.undefined
  
  /**
    * If true, skips resources that are created or modified after the de-identify operation is created.
    */
  var skipModifiedResources: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDeidentifyFhirStoreRequest {
  
  inline def apply(): SchemaDeidentifyFhirStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyFhirStoreRequest]
  }
  
  extension [Self <: SchemaDeidentifyFhirStoreRequest](x: Self) {
    
    inline def setConfig(value: SchemaDeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDestinationStore(value: String): Self = StObject.set(x, "destinationStore", value.asInstanceOf[js.Any])
    
    inline def setDestinationStoreNull: Self = StObject.set(x, "destinationStore", null)
    
    inline def setDestinationStoreUndefined: Self = StObject.set(x, "destinationStore", js.undefined)
    
    inline def setGcsConfigUri(value: String): Self = StObject.set(x, "gcsConfigUri", value.asInstanceOf[js.Any])
    
    inline def setGcsConfigUriNull: Self = StObject.set(x, "gcsConfigUri", null)
    
    inline def setGcsConfigUriUndefined: Self = StObject.set(x, "gcsConfigUri", js.undefined)
    
    inline def setResourceFilter(value: SchemaFhirFilter): Self = StObject.set(x, "resourceFilter", value.asInstanceOf[js.Any])
    
    inline def setResourceFilterUndefined: Self = StObject.set(x, "resourceFilter", js.undefined)
    
    inline def setSkipModifiedResources(value: Boolean): Self = StObject.set(x, "skipModifiedResources", value.asInstanceOf[js.Any])
    
    inline def setSkipModifiedResourcesNull: Self = StObject.set(x, "skipModifiedResources", null)
    
    inline def setSkipModifiedResourcesUndefined: Self = StObject.set(x, "skipModifiedResources", js.undefined)
  }
}
