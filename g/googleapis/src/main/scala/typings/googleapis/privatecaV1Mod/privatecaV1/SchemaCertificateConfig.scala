package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateConfig extends StObject {
  
  /**
    * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
    */
  var publicKey: js.UndefOr[SchemaPublicKey] = js.undefined
  
  /**
    * Required. Specifies some of the values in a certificate that are related to the subject.
    */
  var subjectConfig: js.UndefOr[SchemaSubjectConfig] = js.undefined
  
  /**
    * Required. Describes how some of the technical X.509 fields in a certificate should be populated.
    */
  var x509Config: js.UndefOr[SchemaX509Parameters] = js.undefined
}
object SchemaCertificateConfig {
  
  inline def apply(): SchemaCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateConfig]
  }
  
  extension [Self <: SchemaCertificateConfig](x: Self) {
    
    inline def setPublicKey(value: SchemaPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSubjectConfig(value: SchemaSubjectConfig): Self = StObject.set(x, "subjectConfig", value.asInstanceOf[js.Any])
    
    inline def setSubjectConfigUndefined: Self = StObject.set(x, "subjectConfig", js.undefined)
    
    inline def setX509Config(value: SchemaX509Parameters): Self = StObject.set(x, "x509Config", value.asInstanceOf[js.Any])
    
    inline def setX509ConfigUndefined: Self = StObject.set(x, "x509Config", js.undefined)
  }
}
