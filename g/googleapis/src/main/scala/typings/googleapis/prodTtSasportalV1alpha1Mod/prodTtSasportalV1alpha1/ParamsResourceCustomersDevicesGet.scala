package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the device.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersDevicesGet {
  
  inline def apply(): ParamsResourceCustomersDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersDevicesGet]
  }
  
  extension [Self <: ParamsResourceCustomersDevicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
