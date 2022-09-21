package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProvisioningCreateaccounttree
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccountTreeRequest] = js.undefined
}
object ParamsResourceProvisioningCreateaccounttree {
  
  inline def apply(): ParamsResourceProvisioningCreateaccounttree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProvisioningCreateaccounttree]
  }
  
  extension [Self <: ParamsResourceProvisioningCreateaccounttree](x: Self) {
    
    inline def setRequestBody(value: SchemaAccountTreeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
