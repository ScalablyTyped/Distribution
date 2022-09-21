package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersAddpermissions
  extends StObject
     with StandardParameters {
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddMatterPermissionsRequest] = js.undefined
}
object ParamsResourceMattersAddpermissions {
  
  inline def apply(): ParamsResourceMattersAddpermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersAddpermissions]
  }
  
  extension [Self <: ParamsResourceMattersAddpermissions](x: Self) {
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setRequestBody(value: SchemaAddMatterPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
