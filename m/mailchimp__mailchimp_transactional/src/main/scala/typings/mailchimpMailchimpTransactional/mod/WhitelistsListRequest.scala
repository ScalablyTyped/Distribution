package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitelistsListRequest
  extends StObject
     with BaseRequest {
  
  /** an optional email address or prefix to search by */
  var email: js.UndefOr[String] = js.undefined
}
object WhitelistsListRequest {
  
  inline def apply(): WhitelistsListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhitelistsListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhitelistsListRequest] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
