package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentEntitytypesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entity type to delete. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentEntitytypesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentEntitytypesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentEntitytypesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentEntitytypesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
