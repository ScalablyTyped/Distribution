package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUsageExportConfig]
  }
  
  @scala.inline
  implicit class SchemaResourceUsageExportConfigOps[Self <: SchemaResourceUsageExportConfig] (val x: Self) extends AnyVal {
    
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
    def setBigqueryDestination(value: SchemaBigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    
    @scala.inline
    def setEnableNetworkEgressMetering(value: Boolean): Self = this.set("enableNetworkEgressMetering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNetworkEgressMetering: Self = this.set("enableNetworkEgressMetering", js.undefined)
  }
}
