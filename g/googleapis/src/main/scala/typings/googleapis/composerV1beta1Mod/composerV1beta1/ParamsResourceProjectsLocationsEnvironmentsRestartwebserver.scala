package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsRestartwebserver
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the environment to restart the web server for, in the form: "projects/{projectId\}/locations/{locationId\}/environments/{environmentId\}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRestartWebServerRequest] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsRestartwebserver {
  
  inline def apply(): ParamsResourceProjectsLocationsEnvironmentsRestartwebserver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsRestartwebserver]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEnvironmentsRestartwebserver](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRestartWebServerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
