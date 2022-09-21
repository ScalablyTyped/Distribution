package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsCertificate extends StObject {
  
  /**
    * PEM representation.
    */
  var cert: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serial number, as extracted from the certificate.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sha1 Fingerprint of the certificate.
    */
  var sha1Fingerprint: js.UndefOr[String | Null] = js.undefined
}
object SchemaTlsCertificate {
  
  inline def apply(): SchemaTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsCertificate]
  }
  
  extension [Self <: SchemaTlsCertificate](x: Self) {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertNull: Self = StObject.set(x, "cert", null)
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSha1Fingerprint(value: String): Self = StObject.set(x, "sha1Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSha1FingerprintNull: Self = StObject.set(x, "sha1Fingerprint", null)
    
    inline def setSha1FingerprintUndefined: Self = StObject.set(x, "sha1Fingerprint", js.undefined)
  }
}
