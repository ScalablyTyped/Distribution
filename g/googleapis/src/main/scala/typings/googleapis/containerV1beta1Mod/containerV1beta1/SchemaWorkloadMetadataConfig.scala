package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkloadMetadataConfig defines the metadata configuration to expose to
  * workloads on the node pool.
  */
@js.native
trait SchemaWorkloadMetadataConfig extends js.Object {
  /**
    * NodeMetadata is the configuration for how to expose the node metadata to
    * the workload running on the node.
    */
  var nodeMetadata: js.UndefOr[String] = js.native
}

object SchemaWorkloadMetadataConfig {
  @scala.inline
  def apply(nodeMetadata: String = null): SchemaWorkloadMetadataConfig = {
    val __obj = js.Dynamic.literal()
    if (nodeMetadata != null) __obj.updateDynamic("nodeMetadata")(nodeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkloadMetadataConfig]
  }
}

