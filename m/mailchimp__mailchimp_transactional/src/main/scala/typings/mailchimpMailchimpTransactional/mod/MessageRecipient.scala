package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRecipient extends StObject {
  
  /** The email address of the recipient. */
  var email: String
  
  /** The optional display name to use for the recipient. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The header type to use for the recipient.
    * @default 'to'
    */
  var `type`: js.UndefOr[MessageRecipientType] = js.undefined
}
object MessageRecipient {
  
  inline def apply(email: String): MessageRecipient = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipient]
  }
  
  extension [Self <: MessageRecipient](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: MessageRecipientType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
