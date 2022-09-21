package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubordinateConfig extends StObject {
  
  /**
    * Required. This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    */
  var certificateAuthority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
    */
  var pemIssuerChain: js.UndefOr[SchemaSubordinateConfigChain] = js.undefined
}
object SchemaSubordinateConfig {
  
  inline def apply(): SchemaSubordinateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubordinateConfig]
  }
  
  extension [Self <: SchemaSubordinateConfig](x: Self) {
    
    inline def setCertificateAuthority(value: String): Self = StObject.set(x, "certificateAuthority", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityNull: Self = StObject.set(x, "certificateAuthority", null)
    
    inline def setCertificateAuthorityUndefined: Self = StObject.set(x, "certificateAuthority", js.undefined)
    
    inline def setPemIssuerChain(value: SchemaSubordinateConfigChain): Self = StObject.set(x, "pemIssuerChain", value.asInstanceOf[js.Any])
    
    inline def setPemIssuerChainUndefined: Self = StObject.set(x, "pemIssuerChain", js.undefined)
  }
}
