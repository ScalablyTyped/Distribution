package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSendAs extends StObject {
  
  /**
    * A name that appears in the "From:" header for mail sent using this alias. For custom "from" addresses, when this is empty, Gmail will populate the "From:" header with the name that is used for the primary address associated with the account. If the admin has disabled the ability for users to update their name format, requests to update this field for the primary login will silently fail.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this address is selected as the default "From:" address in situations such as composing a new message or sending a vacation auto-reply. Every Gmail account has exactly one default send-as address, so the only legal value that clients may write to this field is `true`. Changing this from `false` to `true` for an address will result in this field becoming `false` for the other previous default address.
    */
  var isDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this address is the primary address used to login to the account. Every Gmail account has exactly one primary address, and it cannot be deleted from the collection of send-as aliases. This field is read-only.
    */
  var isPrimary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An optional email address that is included in a "Reply-To:" header for mail sent using this alias. If this is empty, Gmail will not generate a "Reply-To:" header.
    */
  var replyToAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address that appears in the "From:" header for mail sent using this alias. This is read-only for all operations except create.
    */
  var sendAsEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional HTML signature that is included in messages composed with this alias in the Gmail web UI. This signature is added to new emails only.
    */
  var signature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional SMTP service that will be used as an outbound relay for mail sent using this alias. If this is empty, outbound mail will be sent directly from Gmail's servers to the destination SMTP service. This setting only applies to custom "from" aliases.
    */
  var smtpMsa: js.UndefOr[SchemaSmtpMsa] = js.undefined
  
  /**
    * Whether Gmail should treat this address as an alias for the user's primary email address. This setting only applies to custom "from" aliases.
    */
  var treatAsAlias: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether this address has been verified for use as a send-as alias. Read-only. This setting only applies to custom "from" aliases.
    */
  var verificationStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaSendAs {
  
  inline def apply(): SchemaSendAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendAs]
  }
  
  extension [Self <: SchemaSendAs](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryNull: Self = StObject.set(x, "isPrimary", null)
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setReplyToAddress(value: String): Self = StObject.set(x, "replyToAddress", value.asInstanceOf[js.Any])
    
    inline def setReplyToAddressNull: Self = StObject.set(x, "replyToAddress", null)
    
    inline def setReplyToAddressUndefined: Self = StObject.set(x, "replyToAddress", js.undefined)
    
    inline def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    inline def setSendAsEmailNull: Self = StObject.set(x, "sendAsEmail", null)
    
    inline def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSmtpMsa(value: SchemaSmtpMsa): Self = StObject.set(x, "smtpMsa", value.asInstanceOf[js.Any])
    
    inline def setSmtpMsaUndefined: Self = StObject.set(x, "smtpMsa", js.undefined)
    
    inline def setTreatAsAlias(value: Boolean): Self = StObject.set(x, "treatAsAlias", value.asInstanceOf[js.Any])
    
    inline def setTreatAsAliasNull: Self = StObject.set(x, "treatAsAlias", null)
    
    inline def setTreatAsAliasUndefined: Self = StObject.set(x, "treatAsAlias", js.undefined)
    
    inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusNull: Self = StObject.set(x, "verificationStatus", null)
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
