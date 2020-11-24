package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to import resources.
  */
@js.native
trait SchemaImportResourcesRequest extends js.Object {
  
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.native
  
  /**
    * The Cloud Storage destination to write the error report to.  The Cloud
    * Storage location requires the `roles/storage.objectAdmin` Cloud IAM role.
    * Note that writing a file to the same destination multiple times will
    * result in the previous version of the file being overwritten.
    */
  var gcsErrorDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination] = js.native
  
  /**
    * Cloud Storage source data location and import configuration.  The Cloud
    * Storage location requires the `roles/storage.objectViewer` Cloud IAM
    * role.  Each Cloud Storage object should be a text file that contains
    * newline delimited JSON structures conforming to FHIR standard.  To
    * improve performance, use multiple Cloud Storage objects where each object
    * contains a subset of all of the newline-delimited JSON structures. You
    * can select all of the objects using the uri as the prefix. The maximum
    * number of objects is 1,000.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsSource] = js.native
}
object SchemaImportResourcesRequest {
  
  @scala.inline
  def apply(): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaImportResourcesRequestOps[Self <: SchemaImportResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setContentStructure(value: String): Self = this.set("contentStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStructure: Self = this.set("contentStructure", js.undefined)
    
    @scala.inline
    def setGcsErrorDestination(value: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination): Self = this.set("gcsErrorDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsErrorDestination: Self = this.set("gcsErrorDestination", js.undefined)
    
    @scala.inline
    def setGcsSource(value: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
}
