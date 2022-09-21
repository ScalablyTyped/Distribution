package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateConfig extends StObject {
  
  /**
    * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
    */
  var publicKey: js.UndefOr[SchemaPublicKey] = js.undefined
  
  /**
    * Required. Describes how some of the technical fields in a certificate should be populated.
    */
  var reusableConfig: js.UndefOr[SchemaReusableConfigWrapper] = js.undefined
  
  /**
    * Required. Specifies some of the values in a certificate that are related to the subject.
    */
  var subjectConfig: js.UndefOr[SchemaSubjectConfig] = js.undefined
}
object SchemaCertificateConfig {
  
  inline def apply(): SchemaCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateConfig]
  }
  
  extension [Self <: SchemaCertificateConfig](x: Self) {
    
    inline def setPublicKey(value: SchemaPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setReusableConfig(value: SchemaReusableConfigWrapper): Self = StObject.set(x, "reusableConfig", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigUndefined: Self = StObject.set(x, "reusableConfig", js.undefined)
    
    inline def setSubjectConfig(value: SchemaSubjectConfig): Self = StObject.set(x, "subjectConfig", value.asInstanceOf[js.Any])
    
    inline def setSubjectConfigUndefined: Self = StObject.set(x, "subjectConfig", js.undefined)
  }
}
