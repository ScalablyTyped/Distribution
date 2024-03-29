package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowListsAddResponse extends StObject {
  
  /** whether the operation succeeded */
  var added: Boolean
  
  /** the email address you provided */
  var email: String
}
object AllowListsAddResponse {
  
  inline def apply(added: Boolean, email: String): AllowListsAddResponse = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowListsAddResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowListsAddResponse] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
