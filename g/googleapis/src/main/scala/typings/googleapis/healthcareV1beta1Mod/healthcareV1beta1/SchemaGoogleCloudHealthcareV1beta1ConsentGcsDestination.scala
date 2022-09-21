package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudHealthcareV1beta1ConsentGcsDestination extends StObject {
  
  /**
    * URI for a Cloud Storage directory where the server writes result files, in the format `gs://{bucket-id\}/{path/to/destination/dir\}`. If there is no trailing slash, the service appends one when composing the object path. The user is responsible for creating the Cloud Storage bucket and directory referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudHealthcareV1beta1ConsentGcsDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1beta1ConsentGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1ConsentGcsDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1beta1ConsentGcsDestination](x: Self) {
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixNull: Self = StObject.set(x, "uriPrefix", null)
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
