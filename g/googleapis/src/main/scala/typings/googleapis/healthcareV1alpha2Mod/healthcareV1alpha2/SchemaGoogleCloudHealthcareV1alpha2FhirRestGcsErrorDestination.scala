package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the Cloud Storage destination where errors will be recorded.
  */
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination extends StObject {
  
  /**
    * URI for a Cloud Storage directory to which error report files should be
    * written (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If
    * there is no trailing slash, the service will append one when composing
    * the object path. The user is responsible for creating the Cloud Storage
    * bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestinationMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
