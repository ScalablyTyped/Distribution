package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRolesQuerygrantableroles
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQueryGrantableRolesRequest] = js.undefined
}
object ParamsResourceRolesQuerygrantableroles {
  
  inline def apply(): ParamsResourceRolesQuerygrantableroles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRolesQuerygrantableroles]
  }
  
  extension [Self <: ParamsResourceRolesQuerygrantableroles](x: Self) {
    
    inline def setRequestBody(value: SchemaQueryGrantableRolesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
