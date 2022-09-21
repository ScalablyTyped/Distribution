package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDicomStore extends StObject {
  
  /**
    * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll\}\p{Lo\}{0,62\} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll\}\p{Lo\}\p{N\}_-]{0,63\} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource name of the DICOM store, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notification destination for new DICOM instances. Supplied by the client.
    */
  var notificationConfig: js.UndefOr[SchemaNotificationConfig] = js.undefined
  
  /**
    * A list of streaming configs used to configure the destination of streaming exports for every DICOM instance insertion in this DICOM store. After a new config is added to `stream_configs`, DICOM instance insertions are streamed to the new destination. When a config is removed from `stream_configs`, the server stops streaming to that destination. Each config must contain a unique destination.
    */
  var streamConfigs: js.UndefOr[js.Array[SchemaGoogleCloudHealthcareV1beta1DicomStreamConfig]] = js.undefined
}
object SchemaDicomStore {
  
  inline def apply(): SchemaDicomStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDicomStore]
  }
  
  extension [Self <: SchemaDicomStore](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationConfig(value: SchemaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setStreamConfigs(value: js.Array[SchemaGoogleCloudHealthcareV1beta1DicomStreamConfig]): Self = StObject.set(x, "streamConfigs", value.asInstanceOf[js.Any])
    
    inline def setStreamConfigsUndefined: Self = StObject.set(x, "streamConfigs", js.undefined)
    
    inline def setStreamConfigsVarargs(value: SchemaGoogleCloudHealthcareV1beta1DicomStreamConfig*): Self = StObject.set(x, "streamConfigs", js.Array(value*))
  }
}
