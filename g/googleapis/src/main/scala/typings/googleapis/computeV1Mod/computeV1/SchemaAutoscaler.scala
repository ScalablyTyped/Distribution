package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Autoscaler resource. Autoscalers allow you to automatically
  * scale virtual machine instances in managed instance groups according to an
  * autoscaling policy that you define. For more information, read Autoscaling
  * Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for
  * v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (==
  * resource_for v1.regionAutoscalers ==)
  */
@js.native
trait SchemaAutoscaler extends js.Object {
  
  /**
    * The configuration parameters for the autoscaling algorithm. You can
    * define one or more of the policies for an autoscaler: cpuUtilization,
    * customMetricUtilizations, and loadBalancingUtilization.  If none of these
    * are specified, the default will be to autoscale based on cpuUtilization
    * to 0.6 or 60%.
    */
  var autoscalingPolicy: js.UndefOr[SchemaAutoscalingPolicy] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#autoscaler for
    * autoscalers.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL of the region where the instance group resides (for
    * autoscalers living in regional scope).
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The status of the autoscaler configuration.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Human-readable details about the current state of the
    * autoscaler. Read the documentation for Commonly returned status messages
    * for examples of status messages you might encounter.
    */
  var statusDetails: js.UndefOr[js.Array[SchemaAutoscalerStatusDetails]] = js.native
  
  /**
    * URL of the managed instance group that this autoscaler will scale.
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] URL of the zone where the instance group resides (for
    * autoscalers living in zonal scope).
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaAutoscaler {
  
  @scala.inline
  def apply(): SchemaAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscaler]
  }
  
  @scala.inline
  implicit class SchemaAutoscalerOps[Self <: SchemaAutoscaler] (val x: Self) extends AnyVal {
    
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
    def setAutoscalingPolicy(value: SchemaAutoscalingPolicy): Self = this.set("autoscalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingPolicy: Self = this.set("autoscalingPolicy", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusDetailsVarargs(value: SchemaAutoscalerStatusDetails*): Self = this.set("statusDetails", js.Array(value :_*))
    
    @scala.inline
    def setStatusDetails(value: js.Array[SchemaAutoscalerStatusDetails]): Self = this.set("statusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetails: Self = this.set("statusDetails", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
