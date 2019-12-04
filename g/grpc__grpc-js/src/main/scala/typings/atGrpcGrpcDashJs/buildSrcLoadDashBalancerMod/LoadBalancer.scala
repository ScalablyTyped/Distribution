package typings.atGrpcGrpcDashJs.buildSrcLoadDashBalancerMod

import typings.atGrpcGrpcDashJs.buildSrcLoadDashBalancingDashConfigMod.LoadBalancingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Replace the existing ChannelControlHelper with a new one
    * @param channelControlHelper The new ChannelControlHelper to use from now on
    */
  def replaceChannelControlHelper(channelControlHelper: ChannelControlHelper): Unit = js.native
  /**
    * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
    * state, reset the current connection backoff timeout to its base value and
    * transition to CONNECTING if in TRANSIENT_FAILURE.
    */
  def resetBackoff(): Unit = js.native
  def updateAddressList(addressList: js.Array[String]): Unit = js.native
  /**
    * Gives the load balancer a new list of addresses to start connecting to.
    * The load balancer will start establishing connections with the new list,
    * but will continue using any existing connections until the new connections
    * are established
    * @param addressList The new list of addresses to connect to
    * @param lbConfig The load balancing config object from the service config,
    *     if one was provided
    */
  def updateAddressList(addressList: js.Array[String], lbConfig: LoadBalancingConfig): Unit = js.native
}

