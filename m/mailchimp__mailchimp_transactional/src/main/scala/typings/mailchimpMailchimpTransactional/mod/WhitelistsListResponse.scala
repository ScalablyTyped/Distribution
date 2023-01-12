package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitelistsListResponse extends StObject {
  
  /** when the email was added to the allowlist */
  var created_at: String
  
  /** a description of why the email was allowlisted */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /** the email that is allowlisted */
  var email: String
}
object WhitelistsListResponse {
  
  inline def apply(created_at: String, email: String): WhitelistsListResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhitelistsListResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
