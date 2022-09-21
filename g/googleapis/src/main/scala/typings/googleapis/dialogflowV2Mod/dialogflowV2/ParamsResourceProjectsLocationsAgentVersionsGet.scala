package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentVersionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentVersionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentVersionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentVersionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
