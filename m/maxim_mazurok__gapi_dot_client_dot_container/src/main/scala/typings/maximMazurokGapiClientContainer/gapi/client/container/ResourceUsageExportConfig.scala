package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUsageExportConfig extends js.Object {
  
  /** Configuration to use BigQuery as usage export destination. */
  var bigqueryDestination: js.UndefOr[BigQueryDestination] = js.native
  
  /** Configuration to enable resource consumption metering. */
  var consumptionMeteringConfig: js.UndefOr[ConsumptionMeteringConfig] = js.native
  
  /** Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic. */
  var enableNetworkEgressMetering: js.UndefOr[Boolean] = js.native
}
object ResourceUsageExportConfig {
  
  @scala.inline
  def apply(): ResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUsageExportConfig]
  }
  
  @scala.inline
  implicit class ResourceUsageExportConfigOps[Self <: ResourceUsageExportConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBigqueryDestination(value: BigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    
    @scala.inline
    def setConsumptionMeteringConfig(value: ConsumptionMeteringConfig): Self = this.set("consumptionMeteringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumptionMeteringConfig: Self = this.set("consumptionMeteringConfig", js.undefined)
    
    @scala.inline
    def setEnableNetworkEgressMetering(value: Boolean): Self = this.set("enableNetworkEgressMetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNetworkEgressMetering: Self = this.set("enableNetworkEgressMetering", js.undefined)
  }
}
