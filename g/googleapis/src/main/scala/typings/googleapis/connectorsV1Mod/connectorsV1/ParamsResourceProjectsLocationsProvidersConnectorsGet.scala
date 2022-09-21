package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProvidersConnectorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the form: `projects/x/locations/x/providers/x/connectors/x` Only global location is supported for Connector resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProvidersConnectorsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsProvidersConnectorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProvidersConnectorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProvidersConnectorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
