package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the device requested. For example: "enterprises/XYZ/devices/123"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesDevicesGet {
  
  inline def apply(): ParamsResourceEnterprisesDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesDevicesGet]
  }
  
  extension [Self <: ParamsResourceEnterprisesDevicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
