package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OncCertificateProvider extends StObject {
  
  /** This feature is not generally available. */
  var certificateReferences: js.UndefOr[js.Array[String]] = js.undefined
  
  /** This feature is not generally available. */
  var contentProviderEndpoint: js.UndefOr[ContentProviderEndpoint] = js.undefined
}
object OncCertificateProvider {
  
  inline def apply(): OncCertificateProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OncCertificateProvider]
  }
  
  extension [Self <: OncCertificateProvider](x: Self) {
    
    inline def setCertificateReferences(value: js.Array[String]): Self = StObject.set(x, "certificateReferences", value.asInstanceOf[js.Any])
    
    inline def setCertificateReferencesUndefined: Self = StObject.set(x, "certificateReferences", js.undefined)
    
    inline def setCertificateReferencesVarargs(value: String*): Self = StObject.set(x, "certificateReferences", js.Array(value*))
    
    inline def setContentProviderEndpoint(value: ContentProviderEndpoint): Self = StObject.set(x, "contentProviderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setContentProviderEndpointUndefined: Self = StObject.set(x, "contentProviderEndpoint", js.undefined)
  }
}
