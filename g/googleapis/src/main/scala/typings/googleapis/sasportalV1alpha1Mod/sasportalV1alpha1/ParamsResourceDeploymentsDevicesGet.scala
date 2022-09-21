package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDeploymentsDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the device.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceDeploymentsDevicesGet {
  
  inline def apply(): ParamsResourceDeploymentsDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDeploymentsDevicesGet]
  }
  
  extension [Self <: ParamsResourceDeploymentsDevicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
