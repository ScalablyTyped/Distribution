package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUsageExportConfig extends StObject {
  
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
  implicit class ResourceUsageExportConfigMutableBuilder[Self <: ResourceUsageExportConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestination(value: BigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    @scala.inline
    def setConsumptionMeteringConfig(value: ConsumptionMeteringConfig): Self = StObject.set(x, "consumptionMeteringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumptionMeteringConfigUndefined: Self = StObject.set(x, "consumptionMeteringConfig", js.undefined)
    
    @scala.inline
    def setEnableNetworkEgressMetering(value: Boolean): Self = StObject.set(x, "enableNetworkEgressMetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkEgressMeteringUndefined: Self = StObject.set(x, "enableNetworkEgressMetering", js.undefined)
  }
}
