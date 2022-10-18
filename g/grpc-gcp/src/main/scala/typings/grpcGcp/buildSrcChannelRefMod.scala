package typings.grpcGcp

import typings.grpcGrpcJs.buildSrcChannelMod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcChannelRefMod {
  
  @JSImport("grpc-gcp/build/src/channel_ref", "ChannelRef")
  @js.native
  open class ChannelRef protected () extends StObject {
    /**
      * @param channel The underlying grpc channel.
      * @param channelId Id for creating unique channel.
      * @param affinityCount Initial affinity count.
      * @param activeStreamsCount Initial streams count.
      */
    def this(channel: Channel, channelId: Double) = this()
    def this(channel: Channel, channelId: Double, affinityCount: Double) = this()
    def this(channel: Channel, channelId: Double, affinityCount: Double, activeStreamsCount: Double) = this()
    def this(channel: Channel, channelId: Double, affinityCount: Unit, activeStreamsCount: Double) = this()
    
    /* private */ var activeStreamsCount: Any = js.native
    
    def activeStreamsCountDecr(): Unit = js.native
    
    def activeStreamsCountIncr(): Unit = js.native
    
    /* private */ var affinityCount: Any = js.native
    
    def affinityCountDecr(): Unit = js.native
    
    def affinityCountIncr(): Unit = js.native
    
    /* private */ val channel: Any = js.native
    
    /* private */ val channelId: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ var closed: Any = js.native
    
    /* private */ var debugHeadersRequestedAt: Any = js.native
    
    def forceDebugHeadersOnNextRequest(): Unit = js.native
    
    def getActiveStreamsCount(): Double = js.native
    
    def getAffinityCount(): Double = js.native
    
    def getChannel(): Channel = js.native
    
    def getDebugHeadersRequestedAt(): js.Date | Null = js.native
    
    def isClosed(): Boolean = js.native
    
    def notifyDebugHeadersRequested(): Unit = js.native
    
    /* private */ var shouldForceDebugHeadersOnNextRequest: Any = js.native
  }
}
