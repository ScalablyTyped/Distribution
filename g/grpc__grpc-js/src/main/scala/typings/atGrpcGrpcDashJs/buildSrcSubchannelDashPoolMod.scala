package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials
import typings.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
import typings.atGrpcGrpcDashJs.buildSrcSubchannelDashPoolMod.SubchannelPool
import typings.atGrpcGrpcDashJs.buildSrcSubchannelMod.Subchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/subchannel-pool", JSImport.Namespace)
@js.native
object buildSrcSubchannelDashPoolMod extends js.Object {
  @js.native
  class SubchannelPool protected () extends js.Object {
    /**
      * A pool of subchannels use for making connections. Subchannels with the
      * exact same parameters will be reused.
      * @param global If true, this is the global subchannel pool. Otherwise, it
      * is the pool for a single channel.
      */
    def this(global: Boolean) = this()
    var global: js.Any = js.native
    var pool: js.Any = js.native
    /**
      * Get a subchannel if one already exists with exactly matching parameters.
      * Otherwise, create and save a subchannel with those parameters.
      * @param channelTarget
      * @param subchannelTarget
      * @param channelArguments
      * @param channelCredentials
      */
    def getOrCreateSubchannel(
      channelTarget: String,
      subchannelTarget: String,
      channelArguments: ChannelOptions,
      channelCredentials: ChannelCredentials
    ): Subchannel = js.native
  }
  
  def getSubchannelPool(global: Boolean): SubchannelPool = js.native
}

