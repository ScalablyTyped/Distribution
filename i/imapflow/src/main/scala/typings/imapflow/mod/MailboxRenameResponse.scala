package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxRenameResponse extends StObject {
  
  var newPath: String
  
  var path: String
}
object MailboxRenameResponse {
  
  inline def apply(newPath: String, path: String): MailboxRenameResponse = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxRenameResponse]
  }
  
  extension [Self <: MailboxRenameResponse](x: Self) {
    
    inline def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
