package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of the subaccount to delete */
  var id: String
}
object SubaccountsDeleteRequest {
  
  inline def apply(id: String): SubaccountsDeleteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsDeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountsDeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
