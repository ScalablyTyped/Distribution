package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxCreateResponse extends StObject {
  
  var created: Boolean
  
  var mailboxId: js.UndefOr[String] = js.undefined
  
  var path: String
}
object MailboxCreateResponse {
  
  inline def apply(created: Boolean, path: String): MailboxCreateResponse = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxCreateResponse]
  }
  
  extension [Self <: MailboxCreateResponse](x: Self) {
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setMailboxId(value: String): Self = StObject.set(x, "mailboxId", value.asInstanceOf[js.Any])
    
    inline def setMailboxIdUndefined: Self = StObject.set(x, "mailboxId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
