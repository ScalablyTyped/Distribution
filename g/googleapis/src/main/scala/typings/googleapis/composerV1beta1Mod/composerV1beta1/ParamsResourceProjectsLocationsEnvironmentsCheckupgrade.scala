package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsCheckupgrade
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the environment to check upgrade for, in the form: "projects/{projectId\}/locations/{locationId\}/environments/{environmentId\}"
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCheckUpgradeRequest] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsCheckupgrade {
  
  inline def apply(): ParamsResourceProjectsLocationsEnvironmentsCheckupgrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsCheckupgrade]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEnvironmentsCheckupgrade](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setRequestBody(value: SchemaCheckUpgradeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
