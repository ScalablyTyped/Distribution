package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Network describes the GCP network used to create workers in.
  */
@js.native
trait SchemaNetwork extends js.Object {
  /**
    * Network on which the workers are created. &quot;default&quot; network is
    * used if empty.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Project id containing the defined network and subnetwork. For a peered
    * VPC, this will be the same as the project_id in which the workers are
    * created. For a shared VPC, this will be the project sharing the network
    * with the project_id project in which workers will be created. For custom
    * workers with no VPC, this will be the same as project_id.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Subnetwork on which the workers are created. &quot;default&quot;
    * subnetwork is used if empty.
    */
  var subnetwork: js.UndefOr[String] = js.native
}

object SchemaNetwork {
  @scala.inline
  def apply(network: String = null, projectId: String = null, subnetwork: String = null): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetwork]
  }
}

