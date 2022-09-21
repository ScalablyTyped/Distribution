package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessUrls extends StObject {
  
  /**
    * The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated.
    */
  var caCertificateAccessUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URLs where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated.
    */
  var crlAccessUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
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
    
    inline def setCrlAccessUrls(value: js.Array[String]): Self = StObject.set(x, "crlAccessUrls", value.asInstanceOf[js.Any])
    
    inline def setCrlAccessUrlsNull: Self = StObject.set(x, "crlAccessUrls", null)
    
    inline def setCrlAccessUrlsUndefined: Self = StObject.set(x, "crlAccessUrls", js.undefined)
    
    inline def setCrlAccessUrlsVarargs(value: String*): Self = StObject.set(x, "crlAccessUrls", js.Array(value*))
  }
}
