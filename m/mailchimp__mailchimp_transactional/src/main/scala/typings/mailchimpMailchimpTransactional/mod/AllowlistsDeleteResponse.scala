package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistsDeleteResponse extends StObject {
  
  /** whether the address was deleted successfully */
  var deleted: Boolean
  
  /** the email address that was removed from the denylist */
  var email: String
}
object AllowlistsDeleteResponse {
  
  inline def apply(deleted: Boolean, email: String): AllowlistsDeleteResponse = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowlistsDeleteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowlistsDeleteResponse] (val x: Self) extends AnyVal {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
