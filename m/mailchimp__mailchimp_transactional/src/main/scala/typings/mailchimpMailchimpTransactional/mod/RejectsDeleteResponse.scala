package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectsDeleteResponse extends StObject {
  
  /** whether the address was deleted successfully. */
  var deleted: Boolean
  
  /** the email address that was removed from the denylist */
  var email: String
  
  /** the subaccount denylist that the address was removed from, if any */
  var subaccount: String
}
object RejectsDeleteResponse {
  
  inline def apply(deleted: Boolean, email: String, subaccount: String): RejectsDeleteResponse = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], subaccount = subaccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectsDeleteResponse]
  }
  
  extension [Self <: RejectsDeleteResponse](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
  }
}
