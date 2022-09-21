package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Id of the customer to be retrieved
    */
  var customerKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersGet {
  
  inline def apply(): ParamsResourceCustomersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersGet]
  }
  
  extension [Self <: ParamsResourceCustomersGet](x: Self) {
    
    inline def setCustomerKey(value: String): Self = StObject.set(x, "customerKey", value.asInstanceOf[js.Any])
    
    inline def setCustomerKeyUndefined: Self = StObject.set(x, "customerKey", js.undefined)
  }
}
