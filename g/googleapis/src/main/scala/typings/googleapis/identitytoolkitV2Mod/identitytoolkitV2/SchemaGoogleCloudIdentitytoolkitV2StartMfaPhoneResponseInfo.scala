package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo extends StObject {
  
  /**
    * An opaque string that represents the enrollment session.
    */
  var sessionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo](x: Self) {
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoNull: Self = StObject.set(x, "sessionInfo", null)
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
