package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Deployment. Format: `projects//locations//agents//environments//deployments/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsDeploymentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
