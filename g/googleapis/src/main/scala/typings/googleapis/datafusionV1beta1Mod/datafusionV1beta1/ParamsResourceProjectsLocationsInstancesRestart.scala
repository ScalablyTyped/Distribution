package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesRestart
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Data Fusion instance which need to be restarted in the form of projects/{project\}/locations/{location\}/instances/{instance\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRestartInstanceRequest] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesRestart {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesRestart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesRestart]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesRestart](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRestartInstanceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
