package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for exporting cluster resource usages.
  */
@js.native
trait SchemaResourceUsageExportConfig extends js.Object {
  /**
    * Configuration to use BigQuery as usage export destination.
    */
  var bigqueryDestination: js.UndefOr[SchemaBigQueryDestination] = js.native
  /**
    * Whether to enable network egress metering for this cluster. If enabled, a
    * daemonset will be created in the cluster to meter network egress traffic.
    */
  var enableNetworkEgressMetering: js.UndefOr[Boolean] = js.native
}

object SchemaResourceUsageExportConfig {
  @scala.inline
  def apply(
    bigqueryDestination: SchemaBigQueryDestination = null,
    enableNetworkEgressMetering: js.UndefOr[Boolean] = js.undefined
  ): SchemaResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestination != null) __obj.updateDynamic("bigqueryDestination")(bigqueryDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNetworkEgressMetering)) __obj.updateDynamic("enableNetworkEgressMetering")(enableNetworkEgressMetering.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceUsageExportConfig]
  }
}

