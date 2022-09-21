package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEnvironmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentEnvironmentsGet {
  
  inline def apply(): ParamsResourceProjectsAgentEnvironmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEnvironmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
