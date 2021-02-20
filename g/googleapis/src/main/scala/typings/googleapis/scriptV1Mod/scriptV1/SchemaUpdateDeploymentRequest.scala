package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request with deployment information to update an existing deployment.
  */
@js.native
trait SchemaUpdateDeploymentRequest extends StObject {
  
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.native
}
object SchemaUpdateDeploymentRequest {
  
  @scala.inline
  def apply(): SchemaUpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeploymentRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateDeploymentRequestMutableBuilder[Self <: SchemaUpdateDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfig(value: SchemaDeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
  }
}
