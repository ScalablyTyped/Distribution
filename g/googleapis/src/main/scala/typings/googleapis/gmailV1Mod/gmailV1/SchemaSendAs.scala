package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings associated with a send-as alias, which can be either the primary
  * login address associated with the account or a custom &quot;from&quot;
  * address. Send-as aliases correspond to the &quot;Send Mail As&quot; feature
  * in the web interface.
  */
@js.native
trait SchemaSendAs extends StObject {
  
  /**
    * A name that appears in the &quot;From:&quot; header for mail sent using
    * this alias. For custom &quot;from&quot; addresses, when this is empty,
    * Gmail will populate the &quot;From:&quot; header with the name that is
    * used for the primary address associated with the account. If the admin
    * has disabled the ability for users to update their name format, requests
    * to update this field for the primary login will silently fail.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Whether this address is selected as the default &quot;From:&quot; address
    * in situations such as composing a new message or sending a vacation
    * auto-reply. Every Gmail account has exactly one default send-as address,
    * so the only legal value that clients may write to this field is true.
    * Changing this from false to true for an address will result in this field
    * becoming false for the other previous default address.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this address is the primary address used to login to the account.
    * Every Gmail account has exactly one primary address, and it cannot be
    * deleted from the collection of send-as aliases. This field is read-only.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional email address that is included in a &quot;Reply-To:&quot;
    * header for mail sent using this alias. If this is empty, Gmail will not
    * generate a &quot;Reply-To:&quot; header.
    */
  var replyToAddress: js.UndefOr[String] = js.native
  
  /**
    * The email address that appears in the &quot;From:&quot; header for mail
    * sent using this alias. This is read-only for all operations except
    * create.
    */
  var sendAsEmail: js.UndefOr[String] = js.native
  
  /**
    * An optional HTML signature that is included in messages composed with
    * this alias in the Gmail web UI.
    */
  var signature: js.UndefOr[String] = js.native
  
  /**
    * An optional SMTP service that will be used as an outbound relay for mail
    * sent using this alias. If this is empty, outbound mail will be sent
    * directly from Gmail&#39;s servers to the destination SMTP service. This
    * setting only applies to custom &quot;from&quot; aliases.
    */
  var smtpMsa: js.UndefOr[SchemaSmtpMsa] = js.native
  
  /**
    * Whether Gmail should  treat this address as an alias for the user&#39;s
    * primary email address. This setting only applies to custom
    * &quot;from&quot; aliases.
    */
  var treatAsAlias: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether this address has been verified for use as a send-as
    * alias. Read-only. This setting only applies to custom &quot;from&quot;
    * aliases.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}
object SchemaSendAs {
  
  @scala.inline
  def apply(): SchemaSendAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendAs]
  }
  
  @scala.inline
  implicit class SchemaSendAsMutableBuilder[Self <: SchemaSendAs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    @scala.inline
    def setReplyToAddress(value: String): Self = StObject.set(x, "replyToAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddressUndefined: Self = StObject.set(x, "replyToAddress", js.undefined)
    
    @scala.inline
    def setSendAsEmail(value: String): Self = StObject.set(x, "sendAsEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsEmailUndefined: Self = StObject.set(x, "sendAsEmail", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSmtpMsa(value: SchemaSmtpMsa): Self = StObject.set(x, "smtpMsa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmtpMsaUndefined: Self = StObject.set(x, "smtpMsa", js.undefined)
    
    @scala.inline
    def setTreatAsAlias(value: Boolean): Self = StObject.set(x, "treatAsAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatAsAliasUndefined: Self = StObject.set(x, "treatAsAlias", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
