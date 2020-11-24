package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  /** Output only. App Engine release this instance is running on. */
  var appEngineRelease: js.UndefOr[String] = js.native
  
  /** Output only. Availability of the instance. */
  var availability: js.UndefOr[String] = js.native
  
  /** Output only. Average latency (ms) over the last minute. */
  var averageLatency: js.UndefOr[Double] = js.native
  
  /** Output only. Number of errors since this instance was started. */
  var errors: js.UndefOr[Double] = js.native
  
  /** Output only. Relative name of the instance within the version. Example: instance-1. */
  var id: js.UndefOr[String] = js.native
  
  /** Output only. Total memory in use (bytes). */
  var memoryUsage: js.UndefOr[String] = js.native
  
  /** Output only. Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Average queries per second (QPS) over the last minute. */
  var qps: js.UndefOr[Double] = js.native
  
  /** Output only. Number of requests since this instance was started. */
  var requests: js.UndefOr[Double] = js.native
  
  /** Output only. Time that this instance was started.@OutputOnly */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment. */
  var vmDebugEnabled: js.UndefOr[Boolean] = js.native
  
  /** Output only. Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment. */
  var vmId: js.UndefOr[String] = js.native
  
  /** Output only. The IP address of this instance. Only applicable for instances in App Engine flexible environment. */
  var vmIp: js.UndefOr[String] = js.native
  
  /** Output only. Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment. */
  var vmName: js.UndefOr[String] = js.native
  
  /** Output only. Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment. */
  var vmStatus: js.UndefOr[String] = js.native
  
  /** Output only. Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment. */
  var vmZoneName: js.UndefOr[String] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
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
    def setAppEngineRelease(value: String): Self = this.set("appEngineRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineRelease: Self = this.set("appEngineRelease", js.undefined)
    
    @scala.inline
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setAverageLatency(value: Double): Self = this.set("averageLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageLatency: Self = this.set("averageLatency", js.undefined)
    
    @scala.inline
    def setErrors(value: Double): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMemoryUsage(value: String): Self = this.set("memoryUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryUsage: Self = this.set("memoryUsage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQps(value: Double): Self = this.set("qps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQps: Self = this.set("qps", js.undefined)
    
    @scala.inline
    def setRequests(value: Double): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setVmDebugEnabled(value: Boolean): Self = this.set("vmDebugEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmDebugEnabled: Self = this.set("vmDebugEnabled", js.undefined)
    
    @scala.inline
    def setVmId(value: String): Self = this.set("vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmId: Self = this.set("vmId", js.undefined)
    
    @scala.inline
    def setVmIp(value: String): Self = this.set("vmIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmIp: Self = this.set("vmIp", js.undefined)
    
    @scala.inline
    def setVmName(value: String): Self = this.set("vmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmName: Self = this.set("vmName", js.undefined)
    
    @scala.inline
    def setVmStatus(value: String): Self = this.set("vmStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmStatus: Self = this.set("vmStatus", js.undefined)
    
    @scala.inline
    def setVmZoneName(value: String): Self = this.set("vmZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmZoneName: Self = this.set("vmZoneName", js.undefined)
  }
}
