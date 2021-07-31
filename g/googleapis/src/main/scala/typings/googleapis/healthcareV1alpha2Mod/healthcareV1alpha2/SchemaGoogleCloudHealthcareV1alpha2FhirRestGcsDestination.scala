package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for exporting to Cloud Storage.
  */
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination extends StObject {
  
  /**
    * URI for a Cloud Storage directory where result files should be written
    * (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If there is
    * no trailing slash, the service will append one when composing the object
    * path. The user is responsible for creating the Cloud Storage bucket
    * referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestinationMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
