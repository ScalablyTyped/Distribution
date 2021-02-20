package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error response of importing resources. This structure will be included in
  * the error details to describe the detailed error. It will only be included
  * when the operation finishes with some failure.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1FhirRestImportResourcesErrorDetails extends StObject {
  
  /**
    * The number of resources that had errors.
    */
  var errorCount: js.UndefOr[String] = js.native
  
  /**
    * The name of the FHIR store where resources have been imported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  
  /**
    * The total number of resources included in the source data. This is the
    * sum of the success and error counts.
    */
  var inputSize: js.UndefOr[String] = js.native
  
  /**
    * The number of resources that have been imported.
    */
  var successCount: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudHealthcareV1beta1FhirRestImportResourcesErrorDetails {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirRestImportResourcesErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirRestImportResourcesErrorDetails]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirRestImportResourcesErrorDetailsMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1beta1FhirRestImportResourcesErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    @scala.inline
    def setFhirStore(value: String): Self = StObject.set(x, "fhirStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhirStoreUndefined: Self = StObject.set(x, "fhirStore", js.undefined)
    
    @scala.inline
    def setInputSize(value: String): Self = StObject.set(x, "inputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSizeUndefined: Self = StObject.set(x, "inputSize", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: String): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
