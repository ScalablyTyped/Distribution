package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentVersionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the version to delete. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentVersionsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentVersionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentVersionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentVersionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
