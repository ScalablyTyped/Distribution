package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodesDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the device.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceNodesDevicesGet {
  
  inline def apply(): ParamsResourceNodesDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodesDevicesGet]
  }
  
  extension [Self <: ParamsResourceNodesDevicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
