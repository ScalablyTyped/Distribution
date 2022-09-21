package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProvisioningCreateaccountticket
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountTicket] = js.undefined
}
object ParamsResourceProvisioningCreateaccountticket {
  
  inline def apply(): ParamsResourceProvisioningCreateaccountticket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProvisioningCreateaccountticket]
  }
  
  extension [Self <: ParamsResourceProvisioningCreateaccountticket](x: Self) {
    
    inline def setRequestBody(value: SchemaAccountTicket): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
