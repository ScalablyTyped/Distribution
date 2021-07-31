package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to import resources.
  */
trait SchemaImportResourcesRequest extends StObject {
  
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.undefined
  
  /**
    * The Cloud Storage destination to write the error report to.  The Cloud
    * Storage location requires the `roles/storage.objectAdmin` Cloud IAM role.
    * Note that writing a file to the same destination multiple times will
    * result in the previous version of the file being overwritten.
    */
  var gcsErrorDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination] = js.undefined
  
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
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsSource] = js.undefined
}
object SchemaImportResourcesRequest {
  
  @scala.inline
  def apply(): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaImportResourcesRequestMutableBuilder[Self <: SchemaImportResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentStructure(value: String): Self = StObject.set(x, "contentStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStructureUndefined: Self = StObject.set(x, "contentStructure", js.undefined)
    
    @scala.inline
    def setGcsErrorDestination(value: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination): Self = StObject.set(x, "gcsErrorDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsErrorDestinationUndefined: Self = StObject.set(x, "gcsErrorDestination", js.undefined)
    
    @scala.inline
    def setGcsSource(value: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
