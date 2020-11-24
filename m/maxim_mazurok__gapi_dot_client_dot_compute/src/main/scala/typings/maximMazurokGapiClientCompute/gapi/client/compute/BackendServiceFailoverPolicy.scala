package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServiceFailoverPolicy extends js.Object {
  
  /**
    * This can be set to true only if the protocol is TCP.
    *
    * The default is false.
    */
  var disableConnectionDrainOnFailover: js.UndefOr[Boolean] = js.native
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing. If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are
    * unhealthy. If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy.
    *
    * The default is false.
    */
  var dropTrafficIfUnhealthy: js.UndefOr[Boolean] = js.native
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when
    * the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
}
object BackendServiceFailoverPolicy {
  
  @scala.inline
  def apply(): BackendServiceFailoverPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceFailoverPolicy]
  }
  
  @scala.inline
  implicit class BackendServiceFailoverPolicyOps[Self <: BackendServiceFailoverPolicy] (val x: Self) extends AnyVal {
    
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
    def setDisableConnectionDrainOnFailover(value: Boolean): Self = this.set("disableConnectionDrainOnFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableConnectionDrainOnFailover: Self = this.set("disableConnectionDrainOnFailover", js.undefined)
    
    @scala.inline
    def setDropTrafficIfUnhealthy(value: Boolean): Self = this.set("dropTrafficIfUnhealthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropTrafficIfUnhealthy: Self = this.set("dropTrafficIfUnhealthy", js.undefined)
    
    @scala.inline
    def setFailoverRatio(value: Double): Self = this.set("failoverRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverRatio: Self = this.set("failoverRatio", js.undefined)
  }
}
