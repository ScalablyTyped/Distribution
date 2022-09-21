package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeidentifyDicomStoreRequest extends StObject {
  
  /**
    * Deidentify configuration. Only one of `config` and `gcs_config_uri` can be specified.
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.undefined
  
  /**
    * The name of the DICOM store to create and write the redacted data to. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`. * The destination dataset must exist. * The source dataset and destination dataset must both reside in the same location. De-identifying data across multiple locations is not supported. * The destination DICOM store must not exist. * The caller must have the necessary permissions to create the destination DICOM store.
    */
  var destinationStore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filter configuration.
    */
  var filterConfig: js.UndefOr[SchemaDicomFilterConfig] = js.undefined
  
  /**
    * Cloud Storage location to read the JSON cloud.healthcare.deidentify.DeidentifyConfig from, overriding the default config. Must be of the form `gs://{bucket_id\}/path/to/object`. The Cloud Storage location must grant the Cloud IAM role `roles/storage.objectViewer` to the project's Cloud Healthcare Service Agent service account. Only one of `config` and `gcs_config_uri` can be specified.
    */
  var gcsConfigUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeidentifyDicomStoreRequest {
  
  inline def apply(): SchemaDeidentifyDicomStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeidentifyDicomStoreRequest]
  }
  
  extension [Self <: SchemaDeidentifyDicomStoreRequest](x: Self) {
    
    inline def setConfig(value: SchemaDeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDestinationStore(value: String): Self = StObject.set(x, "destinationStore", value.asInstanceOf[js.Any])
    
    inline def setDestinationStoreNull: Self = StObject.set(x, "destinationStore", null)
    
    inline def setDestinationStoreUndefined: Self = StObject.set(x, "destinationStore", js.undefined)
    
    inline def setFilterConfig(value: SchemaDicomFilterConfig): Self = StObject.set(x, "filterConfig", value.asInstanceOf[js.Any])
    
    inline def setFilterConfigUndefined: Self = StObject.set(x, "filterConfig", js.undefined)
    
    inline def setGcsConfigUri(value: String): Self = StObject.set(x, "gcsConfigUri", value.asInstanceOf[js.Any])
    
    inline def setGcsConfigUriNull: Self = StObject.set(x, "gcsConfigUri", null)
    
    inline def setGcsConfigUriUndefined: Self = StObject.set(x, "gcsConfigUri", js.undefined)
  }
}
