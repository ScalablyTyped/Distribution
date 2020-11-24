package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for a forwarding address.
  */
@js.native
trait SchemaForwardingAddress extends js.Object {
  
  /**
    * An email address to which messages can be forwarded.
    */
  var forwardingEmail: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this address has been verified and is usable for
    * forwarding. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}
object SchemaForwardingAddress {
  
  @scala.inline
  def apply(): SchemaForwardingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForwardingAddress]
  }
  
  @scala.inline
  implicit class SchemaForwardingAddressOps[Self <: SchemaForwardingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForwardingEmail(value: String): Self = this.set("forwardingEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingEmail: Self = this.set("forwardingEmail", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: String): Self = this.set("verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationStatus: Self = this.set("verificationStatus", js.undefined)
  }
}
