package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForwardingAddress extends StObject {
  
  /**
    * An email address to which messages can be forwarded.
    */
  var forwardingEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether this address has been verified and is usable for forwarding. Read-only.
    */
  var verificationStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaForwardingAddress {
  
  inline def apply(): SchemaForwardingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingAddress]
  }
  
  extension [Self <: SchemaForwardingAddress](x: Self) {
    
    inline def setForwardingEmail(value: String): Self = StObject.set(x, "forwardingEmail", value.asInstanceOf[js.Any])
    
    inline def setForwardingEmailNull: Self = StObject.set(x, "forwardingEmail", null)
    
    inline def setForwardingEmailUndefined: Self = StObject.set(x, "forwardingEmail", js.undefined)
    
    inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusNull: Self = StObject.set(x, "verificationStatus", null)
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
