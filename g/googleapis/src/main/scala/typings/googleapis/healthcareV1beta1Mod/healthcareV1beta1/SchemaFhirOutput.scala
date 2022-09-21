package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFhirOutput extends StObject {
  
  /**
    * Name of the output FHIR store, which must already exist. You must grant the healthcare.fhirResources.update permission on the destination store to your project's **Cloud Healthcare Service Agent** [service account](https://cloud.google.com/healthcare/docs/how-tos/permissions-healthcare-api-gcp-products#the_cloud_healthcare_service_agent). The destination store must set `enable_update_create` to true. The destination store must use FHIR version R4. Writing these resources will consume FHIR operations quota from the project containing the source data. De-identify operation metadata is only generated for DICOM de-identification operations.
    */
  var fhirStore: js.UndefOr[String | Null] = js.undefined
}
object SchemaFhirOutput {
  
  inline def apply(): SchemaFhirOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFhirOutput]
  }
  
  extension [Self <: SchemaFhirOutput](x: Self) {
    
    inline def setFhirStore(value: String): Self = StObject.set(x, "fhirStore", value.asInstanceOf[js.Any])
    
    inline def setFhirStoreNull: Self = StObject.set(x, "fhirStore", null)
    
    inline def setFhirStoreUndefined: Self = StObject.set(x, "fhirStore", js.undefined)
  }
}
