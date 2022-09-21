package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsPatchdeploymentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project to apply this patch deployment to in the form `projects/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A name for the patch deployment in the project. When creating a name the following rules apply: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
    */
  var patchDeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPatchDeployment] = js.undefined
}
object ParamsResourceProjectsPatchdeploymentsCreate {
  
  inline def apply(): ParamsResourceProjectsPatchdeploymentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsPatchdeploymentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsPatchdeploymentsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPatchDeploymentId(value: String): Self = StObject.set(x, "patchDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setPatchDeploymentIdUndefined: Self = StObject.set(x, "patchDeploymentId", js.undefined)
    
    inline def setRequestBody(value: SchemaPatchDeployment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
