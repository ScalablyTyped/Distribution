package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardSchedulerSettings extends js.Object {
  
  /** Maximum number of instances to run for this version. Set to zero to disable max_instances configuration. */
  var maxInstances: js.UndefOr[Double] = js.native
  
  /** Minimum number of instances to run for this version. Set to zero to disable min_instances configuration. */
  var minInstances: js.UndefOr[Double] = js.native
  
  /** Target CPU utilization ratio to maintain when scaling. */
  var targetCpuUtilization: js.UndefOr[Double] = js.native
  
  /** Target throughput utilization ratio to maintain when scaling */
  var targetThroughputUtilization: js.UndefOr[Double] = js.native
}
object StandardSchedulerSettings {
  
  @scala.inline
  def apply(): StandardSchedulerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSchedulerSettings]
  }
  
  @scala.inline
  implicit class StandardSchedulerSettingsOps[Self <: StandardSchedulerSettings] (val x: Self) extends AnyVal {
    
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
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    
    @scala.inline
    def setMinInstances(value: Double): Self = this.set("minInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinInstances: Self = this.set("minInstances", js.undefined)
    
    @scala.inline
    def setTargetCpuUtilization(value: Double): Self = this.set("targetCpuUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCpuUtilization: Self = this.set("targetCpuUtilization", js.undefined)
    
    @scala.inline
    def setTargetThroughputUtilization(value: Double): Self = this.set("targetThroughputUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetThroughputUtilization: Self = this.set("targetThroughputUtilization", js.undefined)
  }
}
