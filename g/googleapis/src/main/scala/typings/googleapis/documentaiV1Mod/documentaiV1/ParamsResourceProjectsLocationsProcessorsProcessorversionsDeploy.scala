package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The processor version resource name to be deployed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDocumentaiV1DeployProcessorVersionRequest] = js.undefined
}
object ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy {
  
  inline def apply(): ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDocumentaiV1DeployProcessorVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
