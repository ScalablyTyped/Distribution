package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPatchdeploymentsPause
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPausePatchDeploymentRequest] = js.undefined
}
object ParamsResourceProjectsPatchdeploymentsPause {
  
  inline def apply(): ParamsResourceProjectsPatchdeploymentsPause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPatchdeploymentsPause]
  }
  
  extension [Self <: ParamsResourceProjectsPatchdeploymentsPause](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPausePatchDeploymentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
