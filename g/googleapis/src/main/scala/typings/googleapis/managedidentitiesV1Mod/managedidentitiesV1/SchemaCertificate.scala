package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificate extends StObject {
  
  /**
    * The certificate expire time.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The issuer of this certificate.
    */
  var issuingCertificate: js.UndefOr[SchemaCertificate] = js.undefined
  
  /**
    * The certificate subject.
    */
  var subject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The additional hostnames for the domain.
    */
  var subjectAlternativeName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The certificate thumbprint which uniquely identifies the certificate.
    */
  var thumbprint: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificate {
  
  inline def apply(): SchemaCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificate]
  }
  
  extension [Self <: SchemaCertificate](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setIssuingCertificate(value: SchemaCertificate): Self = StObject.set(x, "issuingCertificate", value.asInstanceOf[js.Any])
    
    inline def setIssuingCertificateUndefined: Self = StObject.set(x, "issuingCertificate", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeName(value: js.Array[String]): Self = StObject.set(x, "subjectAlternativeName", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNameNull: Self = StObject.set(x, "subjectAlternativeName", null)
    
    inline def setSubjectAlternativeNameUndefined: Self = StObject.set(x, "subjectAlternativeName", js.undefined)
    
    inline def setSubjectAlternativeNameVarargs(value: String*): Self = StObject.set(x, "subjectAlternativeName", js.Array(value*))
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintNull: Self = StObject.set(x, "thumbprint", null)
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
  }
}
