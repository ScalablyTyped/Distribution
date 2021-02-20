package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for exporting cluster resource usages.
  */
@js.native
trait SchemaResourceUsageExportConfig extends StObject {
  
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
  def apply(): SchemaResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUsageExportConfig]
  }
  
  @scala.inline
  implicit class SchemaResourceUsageExportConfigMutableBuilder[Self <: SchemaResourceUsageExportConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestination(value: SchemaBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    @scala.inline
    def setEnableNetworkEgressMetering(value: Boolean): Self = StObject.set(x, "enableNetworkEgressMetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkEgressMeteringUndefined: Self = StObject.set(x, "enableNetworkEgressMetering", js.undefined)
  }
}
