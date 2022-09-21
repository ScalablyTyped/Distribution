package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesDevicesExecutecommand
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the device requested. For example: "enterprises/XYZ/devices/123"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest] = js.undefined
}
object ParamsResourceEnterprisesDevicesExecutecommand {
  
  inline def apply(): ParamsResourceEnterprisesDevicesExecutecommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesDevicesExecutecommand]
  }
  
  extension [Self <: ParamsResourceEnterprisesDevicesExecutecommand](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
