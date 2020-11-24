package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetworkLogConfig extends js.Object {
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the
    * amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
    */
  var aggregationInterval: js.UndefOr[String] = js.native
  
  /**
    * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is to disable flow
    * logging.
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged. */
  var filterExpr: js.UndefOr[String] = js.native
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork
    * where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5, which means half of all collected logs are reported.
    */
  var flowSampling: js.UndefOr[Double] = js.native
  
  /**
    * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs.
    * Default is INCLUDE_ALL_METADATA.
    */
  var metadata: js.UndefOr[String] = js.native
  
  /** Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA. */
  var metadataFields: js.UndefOr[js.Array[String]] = js.native
}
object SubnetworkLogConfig {
  
  @scala.inline
  def apply(): SubnetworkLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworkLogConfig]
  }
  
  @scala.inline
  implicit class SubnetworkLogConfigOps[Self <: SubnetworkLogConfig] (val x: Self) extends AnyVal {
    
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
    def setAggregationInterval(value: String): Self = this.set("aggregationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationInterval: Self = this.set("aggregationInterval", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setFilterExpr(value: String): Self = this.set("filterExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterExpr: Self = this.set("filterExpr", js.undefined)
    
    @scala.inline
    def setFlowSampling(value: Double): Self = this.set("flowSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowSampling: Self = this.set("flowSampling", js.undefined)
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMetadataFieldsVarargs(value: String*): Self = this.set("metadataFields", js.Array(value :_*))
    
    @scala.inline
    def setMetadataFields(value: js.Array[String]): Self = this.set("metadataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataFields: Self = this.set("metadataFields", js.undefined)
  }
}
