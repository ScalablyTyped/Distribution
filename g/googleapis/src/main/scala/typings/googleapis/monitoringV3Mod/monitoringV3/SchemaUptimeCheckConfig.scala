package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message configures which resources and services to monitor for
  * availability.
  */
@js.native
trait SchemaUptimeCheckConfig extends js.Object {
  
  /**
    * The expected content on the page the check is run against. Currently,
    * only the first entry in the list is supported, and other entries will be
    * ignored. The server will look for an exact match of the string in the
    * page response&#39;s content. This field is optional and should only be
    * specified if a content match is required.
    */
  var contentMatchers: js.UndefOr[js.Array[SchemaContentMatcher]] = js.native
  
  /**
    * A human-friendly name for the uptime check configuration. The display
    * name should be unique within a Stackdriver Workspace in order to make it
    * easier to identify; however, uniqueness is not enforced. Required.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Contains information needed to make an HTTP or HTTPS check.
    */
  var httpCheck: js.UndefOr[SchemaHttpCheck] = js.native
  
  /**
    * The internal checkers that this check will egress from. If is_internal is
    * true and this list is empty, the check will egress from all the
    * InternalCheckers configured for the project that owns this CheckConfig.
    */
  var internalCheckers: js.UndefOr[js.Array[SchemaInternalChecker]] = js.native
  
  /**
    * The monitored resource
    * (https://cloud.google.com/monitoring/api/resources) associated with the
    * configuration. The following monitored resource types are supported for
    * uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance
    * aws_elb_load_balancer
    */
  var monitoredResource: js.UndefOr[SchemaMonitoredResource] = js.native
  
  /**
    * A unique resource name for this UptimeCheckConfig. The format
    * is:projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].This field
    * should be omitted when creating the uptime check configuration; on
    * create, the resource name is assigned by the server and included in the
    * response.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * How often, in seconds, the uptime check is performed. Currently, the only
    * supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes),
    * and 900s (15 minutes). Optional, defaults to 60s.
    */
  var period: js.UndefOr[String] = js.native
  
  /**
    * The group resource associated with the configuration.
    */
  var resourceGroup: js.UndefOr[SchemaResourceGroup] = js.native
  
  /**
    * The list of regions from which the check will be run. Some regions
    * contain one location, and others contain more than one. If this field is
    * specified, enough regions to include a minimum of 3 locations must be
    * provided, or an error message is returned. Not specifying this field will
    * result in uptime checks running from all regions.
    */
  var selectedRegions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Contains information needed to make a TCP check.
    */
  var tcpCheck: js.UndefOr[SchemaTcpCheck] = js.native
  
  /**
    * The maximum amount of time to wait for the request to complete (must be
    * between 1 and 60 seconds). Required.
    */
  var timeout: js.UndefOr[String] = js.native
}
object SchemaUptimeCheckConfig {
  
  @scala.inline
  def apply(): SchemaUptimeCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUptimeCheckConfig]
  }
  
  @scala.inline
  implicit class SchemaUptimeCheckConfigOps[Self <: SchemaUptimeCheckConfig] (val x: Self) extends AnyVal {
    
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
    def setContentMatchersVarargs(value: SchemaContentMatcher*): Self = this.set("contentMatchers", js.Array(value :_*))
    
    @scala.inline
    def setContentMatchers(value: js.Array[SchemaContentMatcher]): Self = this.set("contentMatchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMatchers: Self = this.set("contentMatchers", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setHttpCheck(value: SchemaHttpCheck): Self = this.set("httpCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCheck: Self = this.set("httpCheck", js.undefined)
    
    @scala.inline
    def setInternalCheckersVarargs(value: SchemaInternalChecker*): Self = this.set("internalCheckers", js.Array(value :_*))
    
    @scala.inline
    def setInternalCheckers(value: js.Array[SchemaInternalChecker]): Self = this.set("internalCheckers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalCheckers: Self = this.set("internalCheckers", js.undefined)
    
    @scala.inline
    def setMonitoredResource(value: SchemaMonitoredResource): Self = this.set("monitoredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoredResource: Self = this.set("monitoredResource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setResourceGroup(value: SchemaResourceGroup): Self = this.set("resourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceGroup: Self = this.set("resourceGroup", js.undefined)
    
    @scala.inline
    def setSelectedRegionsVarargs(value: String*): Self = this.set("selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRegions(value: js.Array[String]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
    
    @scala.inline
    def setTcpCheck(value: SchemaTcpCheck): Self = this.set("tcpCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpCheck: Self = this.set("tcpCheck", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
