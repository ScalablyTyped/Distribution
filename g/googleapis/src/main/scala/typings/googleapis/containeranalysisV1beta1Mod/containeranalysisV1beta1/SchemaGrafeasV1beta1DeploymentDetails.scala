package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a deployment occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1DeploymentDetails extends js.Object {
  /**
    * Required. Deployment history for the resource.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
}

object SchemaGrafeasV1beta1DeploymentDetails {
  @scala.inline
  def apply(deployment: SchemaDeployment = null): SchemaGrafeasV1beta1DeploymentDetails = {
    val __obj = js.Dynamic.literal()
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGrafeasV1beta1DeploymentDetails]
  }
}

