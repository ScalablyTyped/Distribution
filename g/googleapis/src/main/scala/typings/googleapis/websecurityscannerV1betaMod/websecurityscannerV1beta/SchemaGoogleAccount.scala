package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes authentication configuration that uses a Google account.
  */
trait SchemaGoogleAccount extends StObject {
  
  /**
    * Input only. Required. The password of the Google account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The user name of the Google account.
    */
  var username: js.UndefOr[String] = js.undefined
}
object SchemaGoogleAccount {
  
  inline def apply(): SchemaGoogleAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAccount]
  }
  
  extension [Self <: SchemaGoogleAccount](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
