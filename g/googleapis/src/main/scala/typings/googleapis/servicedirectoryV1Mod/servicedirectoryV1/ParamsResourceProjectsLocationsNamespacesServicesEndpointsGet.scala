package typings.googleapis.servicedirectoryV1Mod.servicedirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the endpoint to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNamespacesServicesEndpointsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
