package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCert extends StObject {
  
  /**
    * PEM representation.
    */
  var cert: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serial number, as extracted from the certificate.
    */
  var certSerialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User supplied name. Constrained to [a-zA-Z.-_ ]+.
    */
  var commonName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
    */
  var expirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the database instance.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#sslCert`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sha1 Fingerprint.
    */
  var sha1Fingerprint: js.UndefOr[String | Null] = js.undefined
}
object SchemaSslCert {
  
  inline def apply(): SchemaSslCert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCert]
  }
  
  extension [Self <: SchemaSslCert](x: Self) {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertNull: Self = StObject.set(x, "cert", null)
    
    inline def setCertSerialNumber(value: String): Self = StObject.set(x, "certSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setCertSerialNumberNull: Self = StObject.set(x, "certSerialNumber", null)
    
    inline def setCertSerialNumberUndefined: Self = StObject.set(x, "certSerialNumber", js.undefined)
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameNull: Self = StObject.set(x, "commonName", null)
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSha1Fingerprint(value: String): Self = StObject.set(x, "sha1Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSha1FingerprintNull: Self = StObject.set(x, "sha1Fingerprint", null)
    
    inline def setSha1FingerprintUndefined: Self = StObject.set(x, "sha1Fingerprint", js.undefined)
  }
}
