package typings.googleapis.servicedirectoryV1beta1Mod.servicedirectoryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNamespacesServicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the service to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsNamespacesServicesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsNamespacesServicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNamespacesServicesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNamespacesServicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
