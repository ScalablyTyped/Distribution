package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.srcSubchannelMod.Subchannel
import typings.grpcGrpcJs.subchannelAddressMod.SubchannelAddress
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
  /**
    * A pool of subchannels use for making connections. Subchannels with the
    * exact same parameters will be reused.
    */
  open class SubchannelPool () extends StObject {
    
    /**
      * A timer of a task performing a periodic subchannel cleanup.
      */
    /* private */ var cleanupTimer: Any = js.native
    
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
    
    /* private */ var pool: Any = js.native
    
    /**
      * Unrefs all unused subchannels and cancels the cleanup task if all
      * subchannels have been unrefed.
      */
    def unrefUnusedSubchannels(): Unit = js.native
  }
  
  inline def getSubchannelPool(global: Boolean): SubchannelPool = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubchannelPool")(global.asInstanceOf[js.Any]).asInstanceOf[SubchannelPool]
}
