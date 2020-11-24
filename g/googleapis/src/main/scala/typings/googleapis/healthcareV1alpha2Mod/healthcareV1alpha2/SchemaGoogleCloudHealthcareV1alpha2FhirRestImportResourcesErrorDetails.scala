package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error response of importing resources. This structure will be included in
  * the error details to describe the detailed error. It will only be included
  * when the operation finishes with some failure.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails extends js.Object {
  
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
object SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetailsOps[Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorCount(value: String): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCount: Self = this.set("errorCount", js.undefined)
    
    @scala.inline
    def setFhirStore(value: String): Self = this.set("fhirStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFhirStore: Self = this.set("fhirStore", js.undefined)
    
    @scala.inline
    def setInputSize(value: String): Self = this.set("inputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSize: Self = this.set("inputSize", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: String): Self = this.set("successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessCount: Self = this.set("successCount", js.undefined)
  }
}
