package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentEnvironmentsUsersSessionsDeletecontexts
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the session to delete all contexts from. Format: `projects//agent/sessions/` or `projects//agent/environments//users//sessions/`. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentEnvironmentsUsersSessionsDeletecontexts {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentEnvironmentsUsersSessionsDeletecontexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentEnvironmentsUsersSessionsDeletecontexts]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentEnvironmentsUsersSessionsDeletecontexts](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
