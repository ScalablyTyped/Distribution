package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}/entities/{id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
