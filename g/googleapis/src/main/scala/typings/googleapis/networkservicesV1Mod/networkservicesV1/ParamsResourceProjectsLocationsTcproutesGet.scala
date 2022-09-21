package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTcproutesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the TcpRoute to get. Must be in the format `projects/x/locations/global/tcpRoutes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTcproutesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsTcproutesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTcproutesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTcproutesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
