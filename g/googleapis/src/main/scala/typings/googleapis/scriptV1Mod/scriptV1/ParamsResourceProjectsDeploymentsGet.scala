package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDeploymentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The deployment ID.
    */
  var deploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDeploymentsGet {
  
  inline def apply(): ParamsResourceProjectsDeploymentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDeploymentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsDeploymentsGet](x: Self) {
    
    inline def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
