package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublishingOptions extends StObject {
  
  /**
    * Optional. When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access" X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding X.509 extension will not be written in issued certificates.
    */
  var publishCaCert: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
    */
  var publishCrl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPublishingOptions {
  
  inline def apply(): SchemaPublishingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishingOptions]
  }
  
  extension [Self <: SchemaPublishingOptions](x: Self) {
    
    inline def setPublishCaCert(value: Boolean): Self = StObject.set(x, "publishCaCert", value.asInstanceOf[js.Any])
    
    inline def setPublishCaCertNull: Self = StObject.set(x, "publishCaCert", null)
    
    inline def setPublishCaCertUndefined: Self = StObject.set(x, "publishCaCert", js.undefined)
    
    inline def setPublishCrl(value: Boolean): Self = StObject.set(x, "publishCrl", value.asInstanceOf[js.Any])
    
    inline def setPublishCrlNull: Self = StObject.set(x, "publishCrl", null)
    
    inline def setPublishCrlUndefined: Self = StObject.set(x, "publishCrl", js.undefined)
  }
}
