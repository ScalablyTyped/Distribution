package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountTwoFactorLoginOptionsMod {
  
  trait AccountTwoFactorLoginOptions extends StObject {
    
    var trustThisDevice: js.UndefOr[`1` | `0`] = js.undefined
    
    var twoFactorIdentifier: String
    
    var username: String
    
    var verificationCode: String
    
    var verificationMethod: js.UndefOr[String] = js.undefined
  }
  object AccountTwoFactorLoginOptions {
    
    inline def apply(twoFactorIdentifier: String, username: String, verificationCode: String): AccountTwoFactorLoginOptions = {
      val __obj = js.Dynamic.literal(twoFactorIdentifier = twoFactorIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountTwoFactorLoginOptions]
    }
    
    extension [Self <: AccountTwoFactorLoginOptions](x: Self) {
      
      inline def setTrustThisDevice(value: `1` | `0`): Self = StObject.set(x, "trustThisDevice", value.asInstanceOf[js.Any])
      
      inline def setTrustThisDeviceUndefined: Self = StObject.set(x, "trustThisDevice", js.undefined)
      
      inline def setTwoFactorIdentifier(value: String): Self = StObject.set(x, "twoFactorIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
      
      inline def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
      
      inline def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
    }
  }
}
