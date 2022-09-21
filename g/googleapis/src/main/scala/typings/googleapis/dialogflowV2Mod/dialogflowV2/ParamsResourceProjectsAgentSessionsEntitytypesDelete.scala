package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentSessionsEntitytypesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entity type to delete. Format: `projects//agent/sessions//entityTypes/` or `projects//agent/environments//users//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentSessionsEntitytypesDelete {
  
  inline def apply(): ParamsResourceProjectsAgentSessionsEntitytypesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentSessionsEntitytypesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsAgentSessionsEntitytypesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
