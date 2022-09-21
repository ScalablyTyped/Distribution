package typings.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetListMemberBody
  extends StObject
     with Body {
  
  var email_address: String
  
  var status_if_new: Status
}
object SetListMemberBody {
  
  inline def apply(email_address: String, status_if_new: Status): SetListMemberBody = {
    val __obj = js.Dynamic.literal(email_address = email_address.asInstanceOf[js.Any], status_if_new = status_if_new.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetListMemberBody]
  }
  
  extension [Self <: SetListMemberBody](x: Self) {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setStatus_if_new(value: Status): Self = StObject.set(x, "status_if_new", value.asInstanceOf[js.Any])
  }
}
