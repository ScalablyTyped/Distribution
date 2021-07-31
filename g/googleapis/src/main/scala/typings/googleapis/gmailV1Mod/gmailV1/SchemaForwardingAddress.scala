package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for a forwarding address.
  */
trait SchemaForwardingAddress extends StObject {
  
  /**
    * An email address to which messages can be forwarded.
    */
  var forwardingEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this address has been verified and is usable for
    * forwarding. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.undefined
}
object SchemaForwardingAddress {
  
  @scala.inline
  def apply(): SchemaForwardingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingAddress]
  }
  
  @scala.inline
  implicit class SchemaForwardingAddressMutableBuilder[Self <: SchemaForwardingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingEmail(value: String): Self = StObject.set(x, "forwardingEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingEmailUndefined: Self = StObject.set(x, "forwardingEmail", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
