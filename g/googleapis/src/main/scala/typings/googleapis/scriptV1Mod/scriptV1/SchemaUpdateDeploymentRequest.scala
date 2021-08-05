package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request with deployment information to update an existing deployment.
  */
trait SchemaUpdateDeploymentRequest extends StObject {
  
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.undefined
}
object SchemaUpdateDeploymentRequest {
  
  inline def apply(): SchemaUpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeploymentRequest]
  }
  
  extension [Self <: SchemaUpdateDeploymentRequest](x: Self) {
    
    inline def setDeploymentConfig(value: SchemaDeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
  }
}
