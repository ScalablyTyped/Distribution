package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessUrls extends StObject {
  
  /**
    * The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated.
    */
  var caCertificateAccessUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated.
    */
  var crlAccessUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessUrls {
  
  inline def apply(): SchemaAccessUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessUrls]
  }
  
  extension [Self <: SchemaAccessUrls](x: Self) {
    
    inline def setCaCertificateAccessUrl(value: String): Self = StObject.set(x, "caCertificateAccessUrl", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateAccessUrlNull: Self = StObject.set(x, "caCertificateAccessUrl", null)
    
    inline def setCaCertificateAccessUrlUndefined: Self = StObject.set(x, "caCertificateAccessUrl", js.undefined)
    
    inline def setCrlAccessUrl(value: String): Self = StObject.set(x, "crlAccessUrl", value.asInstanceOf[js.Any])
    
    inline def setCrlAccessUrlNull: Self = StObject.set(x, "crlAccessUrl", null)
    
    inline def setCrlAccessUrlUndefined: Self = StObject.set(x, "crlAccessUrl", js.undefined)
  }
}
