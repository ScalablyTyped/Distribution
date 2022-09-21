package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApnsCertificateExpirationInfo extends StObject {
  
  /** The Apple ID used for the certificate, may be blank if admins did not enter it. */
  var appleId: js.UndefOr[String] = js.undefined
  
  /** The expiration date of the APNS Certificate. */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /** The UID for the certificate. */
  var uid: js.UndefOr[String] = js.undefined
}
object ApnsCertificateExpirationInfo {
  
  inline def apply(): ApnsCertificateExpirationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsCertificateExpirationInfo]
  }
  
  extension [Self <: ApnsCertificateExpirationInfo](x: Self) {
    
    inline def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    inline def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
