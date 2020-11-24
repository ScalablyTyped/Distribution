package typings.grpcGrpcJs.loadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancer extends js.Object {
  
  /**
    * The load balancer unrefs all of its subchannels and stops calling methods
    * of its channel control helper.
    */
  def destroy(): Unit = js.native
  
  /**
    * If the load balancer is currently in the IDLE state, start connecting.
    */
  def exitIdle(): Unit = js.native
  
  /**
    * Get the type name for this load balancer type. Must be constant across an
    * entire load balancer implementation class and must match the name that the
    * balancer implementation class was registered with.
    */
  def getTypeName(): String = js.native
  
  /**
    * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
    * state, reset the current connection backoff timeout to its base value and
    * transition to CONNECTING if in TRANSIENT_FAILURE.
    */
  def resetBackoff(): Unit = js.native
  
  /**
    * Gives the load balancer a new list of addresses to start connecting to.
    * The load balancer will start establishing connections with the new list,
    * but will continue using any existing connections until the new connections
    * are established
    * @param addressList The new list of addresses to connect to
    * @param lbConfig The load balancing config object from the service config,
    *     if one was provided
    */
  def updateAddressList(
    addressList: js.Array[SubchannelAddress],
    lbConfig: LoadBalancingConfig,
    attributes: StringDictionary[js.Any]
  ): Unit = js.native
}
object LoadBalancer {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    exitIdle: () => Unit,
    getTypeName: () => String,
    resetBackoff: () => Unit,
    updateAddressList: (js.Array[SubchannelAddress], LoadBalancingConfig, StringDictionary[js.Any]) => Unit
  ): LoadBalancer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exitIdle = js.Any.fromFunction0(exitIdle), getTypeName = js.Any.fromFunction0(getTypeName), resetBackoff = js.Any.fromFunction0(resetBackoff), updateAddressList = js.Any.fromFunction3(updateAddressList))
    __obj.asInstanceOf[LoadBalancer]
  }
  
  @scala.inline
  implicit class LoadBalancerOps[Self <: LoadBalancer] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExitIdle(value: () => Unit): Self = this.set("exitIdle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeName(value: () => String): Self = this.set("getTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetBackoff(value: () => Unit): Self = this.set("resetBackoff", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateAddressList(value: (js.Array[SubchannelAddress], LoadBalancingConfig, StringDictionary[js.Any]) => Unit): Self = this.set("updateAddressList", js.Any.fromFunction3(value))
  }
}
