package typings.googleapis.networkconnectivityV1alpha1Mod.networkconnectivityV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalHubsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Hub resource to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalHubsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalHubsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalHubsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalHubsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
