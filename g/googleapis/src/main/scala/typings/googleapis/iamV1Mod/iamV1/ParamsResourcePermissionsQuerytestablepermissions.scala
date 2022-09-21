package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePermissionsQuerytestablepermissions
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQueryTestablePermissionsRequest] = js.undefined
}
object ParamsResourcePermissionsQuerytestablepermissions {
  
  inline def apply(): ParamsResourcePermissionsQuerytestablepermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsQuerytestablepermissions]
  }
  
  extension [Self <: ParamsResourcePermissionsQuerytestablepermissions](x: Self) {
    
    inline def setRequestBody(value: SchemaQueryTestablePermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
