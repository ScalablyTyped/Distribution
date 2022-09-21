package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsActionsExecute
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the Action. Format: projects/{project\}/locations/{location\}/connections/{connection\}/actions/{action\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExecuteActionRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsActionsExecute {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsActionsExecute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsActionsExecute]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsActionsExecute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaExecuteActionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
