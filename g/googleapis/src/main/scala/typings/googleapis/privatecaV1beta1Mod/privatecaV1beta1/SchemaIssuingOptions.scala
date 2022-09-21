package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIssuingOptions extends StObject {
  
  /**
    * Required. When true, includes a URL to the issuing CA certificate in the "authority information access" X.509 extension.
    */
  var includeCaCertUrl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
    */
  var includeCrlAccessUrl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIssuingOptions {
  
  inline def apply(): SchemaIssuingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssuingOptions]
  }
  
  extension [Self <: SchemaIssuingOptions](x: Self) {
    
    inline def setIncludeCaCertUrl(value: Boolean): Self = StObject.set(x, "includeCaCertUrl", value.asInstanceOf[js.Any])
    
    inline def setIncludeCaCertUrlNull: Self = StObject.set(x, "includeCaCertUrl", null)
    
    inline def setIncludeCaCertUrlUndefined: Self = StObject.set(x, "includeCaCertUrl", js.undefined)
    
    inline def setIncludeCrlAccessUrl(value: Boolean): Self = StObject.set(x, "includeCrlAccessUrl", value.asInstanceOf[js.Any])
    
    inline def setIncludeCrlAccessUrlNull: Self = StObject.set(x, "includeCrlAccessUrl", null)
    
    inline def setIncludeCrlAccessUrlUndefined: Self = StObject.set(x, "includeCrlAccessUrl", js.undefined)
  }
}
