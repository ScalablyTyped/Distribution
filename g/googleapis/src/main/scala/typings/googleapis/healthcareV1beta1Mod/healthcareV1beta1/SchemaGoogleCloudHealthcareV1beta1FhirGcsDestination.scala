package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudHealthcareV1beta1FhirGcsDestination extends StObject {
  
  /**
    * URI for a Cloud Storage directory where result files should be written (in the format `gs://{bucket-id\}/{path/to/destination/dir\}`). If there is no trailing slash, the service appends one when composing the object path. The Cloud Storage bucket referenced in `uri_prefix` must exist or an error occurs.
    */
  var uriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudHealthcareV1beta1FhirGcsDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1beta1FhirGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirGcsDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1beta1FhirGcsDestination](x: Self) {
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixNull: Self = StObject.set(x, "uriPrefix", null)
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
