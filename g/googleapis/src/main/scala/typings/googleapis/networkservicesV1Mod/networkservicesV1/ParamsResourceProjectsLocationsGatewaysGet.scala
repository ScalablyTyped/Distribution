package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGatewaysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the Gateway to get. Must be in the format `projects/x/locations/x/gateways/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGatewaysGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGatewaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGatewaysGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGatewaysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
