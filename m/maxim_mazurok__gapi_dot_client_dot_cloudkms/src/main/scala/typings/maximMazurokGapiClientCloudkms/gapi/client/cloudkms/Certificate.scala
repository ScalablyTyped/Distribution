package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /** Output only. The issuer distinguished name in RFC 2253 format. Only present if parsed is true. */
  var issuer: js.UndefOr[String] = js.undefined
  
  /** Output only. The certificate is not valid after this time. Only present if parsed is true. */
  var notAfterTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The certificate is not valid before this time. Only present if parsed is true. */
  var notBeforeTime: js.UndefOr[String] = js.undefined
  
  /** Output only. True if the certificate was parsed successfully. */
  var parsed: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The raw certificate bytes in DER format. */
  var rawDer: js.UndefOr[String] = js.undefined
  
  /** Output only. The certificate serial number as a hex string. Only present if parsed is true. */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /** Output only. The SHA-256 certificate fingerprint as a hex string. Only present if parsed is true. */
  var sha256Fingerprint: js.UndefOr[String] = js.undefined
  
  /** Output only. The subject distinguished name in RFC 2253 format. Only present if parsed is true. */
  var subject: js.UndefOr[String] = js.undefined
  
  /** Output only. The subject Alternative DNS names. Only present if parsed is true. */
  var subjectAlternativeDnsNames: js.UndefOr[js.Array[String]] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  extension [Self <: Certificate](x: Self) {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setNotAfterTime(value: String): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotAfterTimeUndefined: Self = StObject.set(x, "notAfterTime", js.undefined)
    
    inline def setNotBeforeTime(value: String): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTimeUndefined: Self = StObject.set(x, "notBeforeTime", js.undefined)
    
    inline def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    inline def setRawDer(value: String): Self = StObject.set(x, "rawDer", value.asInstanceOf[js.Any])
    
    inline def setRawDerUndefined: Self = StObject.set(x, "rawDer", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSha256Fingerprint(value: String): Self = StObject.set(x, "sha256Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSha256FingerprintUndefined: Self = StObject.set(x, "sha256Fingerprint", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeDnsNames(value: js.Array[String]): Self = StObject.set(x, "subjectAlternativeDnsNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeDnsNamesUndefined: Self = StObject.set(x, "subjectAlternativeDnsNames", js.undefined)
    
    inline def setSubjectAlternativeDnsNamesVarargs(value: String*): Self = StObject.set(x, "subjectAlternativeDnsNames", js.Array(value*))
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
