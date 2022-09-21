package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountsResumeRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of the subaccount to resume */
  var id: String
}
object SubaccountsResumeRequest {
  
  inline def apply(id: String): SubaccountsResumeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountsResumeRequest]
  }
  
  extension [Self <: SubaccountsResumeRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
