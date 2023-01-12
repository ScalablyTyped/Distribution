package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsListRequest
  extends StObject
     with BaseRequest {
  
  /** an optional prefix to filter the subaccounts' ids and names */
  var q: js.UndefOr[String] = js.undefined
}
object SubaccountsListRequest {
  
  inline def apply(): SubaccountsListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubaccountsListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountsListRequest] (val x: Self) extends AnyVal {
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
