package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.subchannelMod.Subchannel
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subchannelPoolMod {
  
  @JSImport("@grpc/grpc-js/build/src/subchannel-pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/subchannel-pool", "SubchannelPool")
  @js.native
  class SubchannelPool protected () extends StObject {
    /**
      * A pool of subchannels use for making connections. Subchannels with the
      * exact same parameters will be reused.
      * @param global If true, this is the global subchannel pool. Otherwise, it
      * is the pool for a single channel.
      */
    def this(global: Boolean) = this()
    
    /**
      * A timer of a task performing a periodic subchannel cleanup.
      */
    var cleanupTimer: js.Any = js.native
    
    /**
      * Ensures that the cleanup task is spawned.
      */
    def ensureCleanupTask(): Unit = js.native
    
    /**
      * Get a subchannel if one already exists with exactly matching parameters.
      * Otherwise, create and save a subchannel with those parameters.
      * @param channelTarget
      * @param subchannelTarget
      * @param channelArguments
      * @param channelCredentials
      */
    def getOrCreateSubchannel(
      channelTargetUri: GrpcUri,
      subchannelTarget: SubchannelAddress,
      channelArguments: ChannelOptions,
      channelCredentials: ChannelCredentials
    ): Subchannel = js.native
    
    var global: js.Any = js.native
    
    var pool: js.Any = js.native
    
    /**
      * Unrefs all unused subchannels and cancels the cleanup task if all
      * subchannels have been unrefed.
      */
    def unrefUnusedSubchannels(): Unit = js.native
  }
  
  @scala.inline
  def getSubchannelPool(global: Boolean): SubchannelPool = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubchannelPool")(global.asInstanceOf[js.Any]).asInstanceOf[SubchannelPool]
}
