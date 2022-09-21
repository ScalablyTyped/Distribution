package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceUsageExportConfig extends StObject {
  
  /**
    * Configuration to use BigQuery as usage export destination.
    */
  var bigqueryDestination: js.UndefOr[SchemaBigQueryDestination] = js.undefined
  
  /**
    * Configuration to enable resource consumption metering.
    */
  var consumptionMeteringConfig: js.UndefOr[SchemaConsumptionMeteringConfig] = js.undefined
  
  /**
    * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
    */
  var enableNetworkEgressMetering: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaResourceUsageExportConfig {
  
  inline def apply(): SchemaResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUsageExportConfig]
  }
  
  extension [Self <: SchemaResourceUsageExportConfig](x: Self) {
    
    inline def setBigqueryDestination(value: SchemaBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setConsumptionMeteringConfig(value: SchemaConsumptionMeteringConfig): Self = StObject.set(x, "consumptionMeteringConfig", value.asInstanceOf[js.Any])
    
    inline def setConsumptionMeteringConfigUndefined: Self = StObject.set(x, "consumptionMeteringConfig", js.undefined)
    
    inline def setEnableNetworkEgressMetering(value: Boolean): Self = StObject.set(x, "enableNetworkEgressMetering", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkEgressMeteringNull: Self = StObject.set(x, "enableNetworkEgressMetering", null)
    
    inline def setEnableNetworkEgressMeteringUndefined: Self = StObject.set(x, "enableNetworkEgressMetering", js.undefined)
  }
}
