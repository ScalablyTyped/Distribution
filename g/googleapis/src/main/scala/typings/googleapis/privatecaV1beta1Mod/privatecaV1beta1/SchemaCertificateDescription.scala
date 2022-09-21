package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateDescription extends StObject {
  
  /**
    * Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate.
    */
  var aiaIssuingCertificateUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
    */
  var authorityKeyId: js.UndefOr[SchemaKeyId] = js.undefined
  
  /**
    * The hash of the x.509 certificate.
    */
  var certFingerprint: js.UndefOr[SchemaCertificateFingerprint] = js.undefined
  
  /**
    * Describes some of the technical fields in a certificate.
    */
  var configValues: js.UndefOr[SchemaReusableConfigValues] = js.undefined
  
  /**
    * Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
    */
  var crlDistributionPoints: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The public key that corresponds to an issued certificate.
    */
  var publicKey: js.UndefOr[SchemaPublicKey] = js.undefined
  
  /**
    * Describes some of the values in a certificate that are related to the subject and lifetime.
    */
  var subjectDescription: js.UndefOr[SchemaSubjectDescription] = js.undefined
  
  /**
    * Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
    */
  var subjectKeyId: js.UndefOr[SchemaKeyId] = js.undefined
}
object SchemaCertificateDescription {
  
  inline def apply(): SchemaCertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateDescription]
  }
  
  extension [Self <: SchemaCertificateDescription](x: Self) {
    
    inline def setAiaIssuingCertificateUrls(value: js.Array[String]): Self = StObject.set(x, "aiaIssuingCertificateUrls", value.asInstanceOf[js.Any])
    
    inline def setAiaIssuingCertificateUrlsNull: Self = StObject.set(x, "aiaIssuingCertificateUrls", null)
    
    inline def setAiaIssuingCertificateUrlsUndefined: Self = StObject.set(x, "aiaIssuingCertificateUrls", js.undefined)
    
    inline def setAiaIssuingCertificateUrlsVarargs(value: String*): Self = StObject.set(x, "aiaIssuingCertificateUrls", js.Array(value*))
    
    inline def setAuthorityKeyId(value: SchemaKeyId): Self = StObject.set(x, "authorityKeyId", value.asInstanceOf[js.Any])
    
    inline def setAuthorityKeyIdUndefined: Self = StObject.set(x, "authorityKeyId", js.undefined)
    
    inline def setCertFingerprint(value: SchemaCertificateFingerprint): Self = StObject.set(x, "certFingerprint", value.asInstanceOf[js.Any])
    
    inline def setCertFingerprintUndefined: Self = StObject.set(x, "certFingerprint", js.undefined)
    
    inline def setConfigValues(value: SchemaReusableConfigValues): Self = StObject.set(x, "configValues", value.asInstanceOf[js.Any])
    
    inline def setConfigValuesUndefined: Self = StObject.set(x, "configValues", js.undefined)
    
    inline def setCrlDistributionPoints(value: js.Array[String]): Self = StObject.set(x, "crlDistributionPoints", value.asInstanceOf[js.Any])
    
    inline def setCrlDistributionPointsNull: Self = StObject.set(x, "crlDistributionPoints", null)
    
    inline def setCrlDistributionPointsUndefined: Self = StObject.set(x, "crlDistributionPoints", js.undefined)
    
    inline def setCrlDistributionPointsVarargs(value: String*): Self = StObject.set(x, "crlDistributionPoints", js.Array(value*))
    
    inline def setPublicKey(value: SchemaPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSubjectDescription(value: SchemaSubjectDescription): Self = StObject.set(x, "subjectDescription", value.asInstanceOf[js.Any])
    
    inline def setSubjectDescriptionUndefined: Self = StObject.set(x, "subjectDescription", js.undefined)
    
    inline def setSubjectKeyId(value: SchemaKeyId): Self = StObject.set(x, "subjectKeyId", value.asInstanceOf[js.Any])
    
    inline def setSubjectKeyIdUndefined: Self = StObject.set(x, "subjectKeyId", js.undefined)
  }
}
