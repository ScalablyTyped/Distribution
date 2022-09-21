package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectsListRequest
  extends StObject
     with BaseRequest {
  
  /** an optional email address to search by */
  var email: js.UndefOr[String] = js.undefined
  
  /** whether to include rejections that have already expired. */
  var include_expired: js.UndefOr[Boolean] = js.undefined
  
  /** an optional unique identifier for the subaccount to limit the denylist */
  var subaccount: js.UndefOr[String] = js.undefined
}
object RejectsListRequest {
  
  inline def apply(): RejectsListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectsListRequest]
  }
  
  extension [Self <: RejectsListRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInclude_expired(value: Boolean): Self = StObject.set(x, "include_expired", value.asInstanceOf[js.Any])
    
    inline def setInclude_expiredUndefined: Self = StObject.set(x, "include_expired", js.undefined)
    
    inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
    
    inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
  }
}
