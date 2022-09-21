package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSmtpMsa extends StObject {
  
  /**
    * The hostname of the SMTP service. Required.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The password that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or update SendAs settings; it is never populated in responses.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The port of the SMTP service. Required.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The protocol that will be used to secure communication with the SMTP service. Required.
    */
  var securityMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or update SendAs settings; it is never populated in responses.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaSmtpMsa {
  
  inline def apply(): SchemaSmtpMsa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSmtpMsa]
  }
  
  extension [Self <: SchemaSmtpMsa](x: Self) {
    
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
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
