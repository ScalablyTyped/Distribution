package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectsDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** an email address */
  var email: String
  
  /** an optional unique identifier for the subaccount to limit the denylist deletion */
  var subaccount: js.UndefOr[String] = js.undefined
}
object RejectsDeleteRequest {
  
  inline def apply(email: String): RejectsDeleteRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectsDeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectsDeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
    
    inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
  }
}
