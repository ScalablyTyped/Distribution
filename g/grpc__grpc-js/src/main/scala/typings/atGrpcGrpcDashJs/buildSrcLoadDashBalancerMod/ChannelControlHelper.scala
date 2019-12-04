package typings.atGrpcGrpcDashJs.buildSrcLoadDashBalancerMod

import typings.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
import typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState
import typings.atGrpcGrpcDashJs.buildSrcPickerMod.Picker
import typings.atGrpcGrpcDashJs.buildSrcSubchannelMod.Subchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelControlHelper extends js.Object {
  /**
    * Returns a subchannel connected to the specified address.
    * @param subchannelAddress The address to connect to
    * @param subchannelArgs Extra channel arguments specified by the load balancer
    */
  def createSubchannel(subchannelAddress: String, subchannelArgs: ChannelOptions): Subchannel
  /**
    * Request new data from the resolver.
    */
  def requestReresolution(): Unit
  /**
    * Passes a new subchannel picker up to the channel. This is called if either
    * the connectivity state changes or if a different picker is needed for any
    * other reason.
    * @param connectivityState New connectivity state
    * @param picker New picker
    */
  def updateState(connectivityState: ConnectivityState, picker: Picker): Unit
}

object ChannelControlHelper {
  @scala.inline
  def apply(
    createSubchannel: (String, ChannelOptions) => Subchannel,
    requestReresolution: () => Unit,
    updateState: (ConnectivityState, Picker) => Unit
  ): ChannelControlHelper = {
    val __obj = js.Dynamic.literal(createSubchannel = js.Any.fromFunction2(createSubchannel), requestReresolution = js.Any.fromFunction0(requestReresolution), updateState = js.Any.fromFunction2(updateState))
  
    __obj.asInstanceOf[ChannelControlHelper]
  }
}

