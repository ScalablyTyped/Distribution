package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalPeeringsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Peering resource name using the form: `projects/{project_id\}/locations/global/peerings/{peering_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalPeeringsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalPeeringsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalPeeringsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalPeeringsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
