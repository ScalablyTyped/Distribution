package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsSessionsEntitytypesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsSessionsEntitytypesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsSessionsEntitytypesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsSessionsEntitytypesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsSessionsEntitytypesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
