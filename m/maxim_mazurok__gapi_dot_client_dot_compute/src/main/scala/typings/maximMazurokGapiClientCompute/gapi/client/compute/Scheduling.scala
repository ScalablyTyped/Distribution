package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduling extends js.Object {
  
  /**
    * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for
    * standard instances. Preemptible instances cannot be automatically restarted.
    *
    * By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
    */
  var automaticRestart: js.UndefOr[Boolean] = js.native
  
  /** The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. */
  var minNodeCpus: js.UndefOr[Double] = js.native
  
  /** A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity. */
  var nodeAffinities: js.UndefOr[js.Array[SchedulingNodeAffinity]] = js.native
  
  /**
    * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
    * TERMINATE. For more information, see Setting Instance Scheduling Options.
    */
  var onHostMaintenance: js.UndefOr[String] = js.native
  
  /**
    * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life
    * Cycle for more information on the possible instance states.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
}
object Scheduling {
  
  @scala.inline
  def apply(): Scheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheduling]
  }
  
  @scala.inline
  implicit class SchedulingOps[Self <: Scheduling] (val x: Self) extends AnyVal {
    
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
    def setAutomaticRestart(value: Boolean): Self = this.set("automaticRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticRestart: Self = this.set("automaticRestart", js.undefined)
    
    @scala.inline
    def setMinNodeCpus(value: Double): Self = this.set("minNodeCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNodeCpus: Self = this.set("minNodeCpus", js.undefined)
    
    @scala.inline
    def setNodeAffinitiesVarargs(value: SchedulingNodeAffinity*): Self = this.set("nodeAffinities", js.Array(value :_*))
    
    @scala.inline
    def setNodeAffinities(value: js.Array[SchedulingNodeAffinity]): Self = this.set("nodeAffinities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeAffinities: Self = this.set("nodeAffinities", js.undefined)
    
    @scala.inline
    def setOnHostMaintenance(value: String): Self = this.set("onHostMaintenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHostMaintenance: Self = this.set("onHostMaintenance", js.undefined)
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = this.set("preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreemptible: Self = this.set("preemptible", js.undefined)
  }
}
