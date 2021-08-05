package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCancelTestOrderByCustomerRequest extends StObject {
  
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaOrdersCancelTestOrderByCustomerRequest {
  
  inline def apply(): SchemaOrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCancelTestOrderByCustomerRequest]
  }
  
  extension [Self <: SchemaOrdersCancelTestOrderByCustomerRequest](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
