package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentProviderEndpoint extends StObject {
  
  /** This feature is not generally available. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Required. This feature is not generally available. */
  var signingCertsSha256: js.UndefOr[js.Array[String]] = js.undefined
  
  /** This feature is not generally available. */
  var uri: js.UndefOr[String] = js.undefined
}
object ContentProviderEndpoint {
  
  inline def apply(): ContentProviderEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentProviderEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentProviderEndpoint] (val x: Self) extends AnyVal {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSigningCertsSha256(value: js.Array[String]): Self = StObject.set(x, "signingCertsSha256", value.asInstanceOf[js.Any])
    
    inline def setSigningCertsSha256Undefined: Self = StObject.set(x, "signingCertsSha256", js.undefined)
    
    inline def setSigningCertsSha256Varargs(value: String*): Self = StObject.set(x, "signingCertsSha256", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
