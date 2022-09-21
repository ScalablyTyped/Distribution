package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Resource name of the Entity. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}/entities/{id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntity] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaEntity): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
