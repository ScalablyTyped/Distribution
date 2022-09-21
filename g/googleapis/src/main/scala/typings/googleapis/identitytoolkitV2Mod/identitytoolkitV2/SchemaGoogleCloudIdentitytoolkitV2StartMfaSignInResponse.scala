package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse extends StObject {
  
  /**
    * MultiFactor sign-in session information specific to SMS-type second factors. Along with the one-time code retrieved from the sent SMS, the contents of this session information should be passed to FinalizeMfaSignIn to complete the sign in.
    */
  var phoneResponseInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInResponse](x: Self) {
    
    inline def setPhoneResponseInfo(value: SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo): Self = StObject.set(x, "phoneResponseInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneResponseInfoUndefined: Self = StObject.set(x, "phoneResponseInfo", js.undefined)
  }
}
