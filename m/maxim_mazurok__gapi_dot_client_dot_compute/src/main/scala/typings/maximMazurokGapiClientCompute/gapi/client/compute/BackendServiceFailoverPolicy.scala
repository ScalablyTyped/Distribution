package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServiceFailoverPolicy extends StObject {
  
  /** This can be set to true only if the protocol is TCP. The default is false. */
  var disableConnectionDrainOnFailover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all
    * backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
    */
  var dropTrafficIfUnhealthy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer
    * performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is
    * less than this ratio.
    */
  var failoverRatio: js.UndefOr[Double] = js.undefined
}
object BackendServiceFailoverPolicy {
  
  inline def apply(): BackendServiceFailoverPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceFailoverPolicy]
  }
  
  extension [Self <: BackendServiceFailoverPolicy](x: Self) {
    
    inline def setDisableConnectionDrainOnFailover(value: Boolean): Self = StObject.set(x, "disableConnectionDrainOnFailover", value.asInstanceOf[js.Any])
    
    inline def setDisableConnectionDrainOnFailoverUndefined: Self = StObject.set(x, "disableConnectionDrainOnFailover", js.undefined)
    
    inline def setDropTrafficIfUnhealthy(value: Boolean): Self = StObject.set(x, "dropTrafficIfUnhealthy", value.asInstanceOf[js.Any])
    
    inline def setDropTrafficIfUnhealthyUndefined: Self = StObject.set(x, "dropTrafficIfUnhealthy", js.undefined)
    
    inline def setFailoverRatio(value: Double): Self = StObject.set(x, "failoverRatio", value.asInstanceOf[js.Any])
    
    inline def setFailoverRatioUndefined: Self = StObject.set(x, "failoverRatio", js.undefined)
  }
}
