package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalPeeringsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Peering resource name using the form: `projects/{project_id\}/locations/global/peerings/{peering_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalPeeringsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalPeeringsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalPeeringsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalPeeringsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
