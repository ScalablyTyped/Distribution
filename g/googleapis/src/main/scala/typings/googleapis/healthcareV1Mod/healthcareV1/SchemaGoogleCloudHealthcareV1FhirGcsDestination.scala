package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudHealthcareV1FhirGcsDestination extends StObject {
  
  /**
    * URI for a Cloud Storage directory where result files should be written, in the format of `gs://{bucket-id\}/{path/to/destination/dir\}`. If there is no trailing slash, the service appends one when composing the object path. The user is responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudHealthcareV1FhirGcsDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1FhirGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1FhirGcsDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1FhirGcsDestination](x: Self) {
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixNull: Self = StObject.set(x, "uriPrefix", null)
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
