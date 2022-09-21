package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEntitytypesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entity type to delete. Format: `projects//agent/entityTypes/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentEntitytypesDelete {
  
  inline def apply(): ParamsResourceProjectsAgentEntitytypesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEntitytypesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEntitytypesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
