package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistsListRequest
  extends StObject
     with BaseRequest {
  
  /** an optional email address or prefix to search by */
  var email: js.UndefOr[String] = js.undefined
}
object AllowlistsListRequest {
  
  inline def apply(): AllowlistsListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowlistsListRequest]
  }
  
  extension [Self <: AllowlistsListRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
