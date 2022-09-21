package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the experiment to start. Format: `projects//locations//agents//environments//experiments/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1StartExperimentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsStart](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3beta1StartExperimentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
