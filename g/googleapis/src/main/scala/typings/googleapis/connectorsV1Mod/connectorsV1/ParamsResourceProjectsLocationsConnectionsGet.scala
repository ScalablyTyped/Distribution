package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the form: `projects/x/locations/x/connections/x`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which fields of the Connection are returned in the response. Defaults to `BASIC` view.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
