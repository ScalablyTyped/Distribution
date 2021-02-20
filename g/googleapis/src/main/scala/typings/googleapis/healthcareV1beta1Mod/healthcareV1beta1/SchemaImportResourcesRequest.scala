package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to import resources.
  */
@js.native
trait SchemaImportResourcesRequest extends StObject {
  
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.native
  
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
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource] = js.native
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
    def setGcsSource(value: SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
