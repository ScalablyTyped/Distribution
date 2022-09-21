package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Id of the customer to be updated
    */
  var customerKey: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomer] = js.undefined
}
object ParamsResourceCustomersUpdate {
  
  inline def apply(): ParamsResourceCustomersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersUpdate]
  }
  
  extension [Self <: ParamsResourceCustomersUpdate](x: Self) {
    
    inline def setCustomerKey(value: String): Self = StObject.set(x, "customerKey", value.asInstanceOf[js.Any])
    
    inline def setCustomerKeyUndefined: Self = StObject.set(x, "customerKey", js.undefined)
    
    inline def setRequestBody(value: SchemaCustomer): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
