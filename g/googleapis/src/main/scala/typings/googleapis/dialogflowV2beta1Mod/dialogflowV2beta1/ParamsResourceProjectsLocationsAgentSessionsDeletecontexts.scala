package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentSessionsDeletecontexts
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the session to delete all contexts from. Supported formats: - `projects//agent/sessions/, - `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`, If `Location ID` is not specified we assume default 'us' location. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentSessionsDeletecontexts {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentSessionsDeletecontexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentSessionsDeletecontexts]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentSessionsDeletecontexts](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
