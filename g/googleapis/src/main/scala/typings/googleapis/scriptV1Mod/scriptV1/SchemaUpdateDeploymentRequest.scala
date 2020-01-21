package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request with deployment information to update an existing deployment.
  */
@js.native
trait SchemaUpdateDeploymentRequest extends js.Object {
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.native
}

object SchemaUpdateDeploymentRequest {
  @scala.inline
  def apply(deploymentConfig: SchemaDeploymentConfig = null): SchemaUpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDeploymentRequest]
  }
}

