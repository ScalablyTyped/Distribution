package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Smtp extends StObject {
  
  /**
    * SMTP relay host
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SMTP relay password
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SMTP relay port
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * SMTP security mode.
    */
  var securityMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sender email for the SMTP relay
    */
  var senderEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SMTP relay username
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Smtp {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Smtp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Smtp]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Smtp](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSecurityMode(value: String): Self = StObject.set(x, "securityMode", value.asInstanceOf[js.Any])
    
    inline def setSecurityModeNull: Self = StObject.set(x, "securityMode", null)
    
    inline def setSecurityModeUndefined: Self = StObject.set(x, "securityMode", js.undefined)
    
    inline def setSenderEmail(value: String): Self = StObject.set(x, "senderEmail", value.asInstanceOf[js.Any])
    
    inline def setSenderEmailNull: Self = StObject.set(x, "senderEmail", null)
    
    inline def setSenderEmailUndefined: Self = StObject.set(x, "senderEmail", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
