package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPatchdeploymentsResume
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the patch deployment in the form `projects/x/patchDeployments/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResumePatchDeploymentRequest] = js.undefined
}
object ParamsResourceProjectsPatchdeploymentsResume {
  
  inline def apply(): ParamsResourceProjectsPatchdeploymentsResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPatchdeploymentsResume]
  }
  
  extension [Self <: ParamsResourceProjectsPatchdeploymentsResume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResumePatchDeploymentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
