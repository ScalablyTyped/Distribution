package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for a delegate. Delegates can read, send, and delete messages, as
  * well as view and add contacts, for the delegator&#39;s account. See
  * &quot;Set up mail delegation&quot; for more information about delegates.
  */
trait SchemaDelegate extends StObject {
  
  /**
    * The email address of the delegate.
    */
  var delegateEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this address has been verified and can act as a
    * delegate for the account. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.undefined
}
object SchemaDelegate {
  
  @scala.inline
  def apply(): SchemaDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelegate]
  }
  
  @scala.inline
  implicit class SchemaDelegateMutableBuilder[Self <: SchemaDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegateEmail(value: String): Self = StObject.set(x, "delegateEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateEmailUndefined: Self = StObject.set(x, "delegateEmail", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
