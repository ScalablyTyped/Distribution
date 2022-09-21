package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the form: `projects/x/locations/x/providers/x/connectors/x/versions/x` Only global location is supported for ConnectorVersion resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which fields of the ConnectorVersion are returned in the response. Defaults to `CUSTOMER` view.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProvidersConnectorsVersionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
