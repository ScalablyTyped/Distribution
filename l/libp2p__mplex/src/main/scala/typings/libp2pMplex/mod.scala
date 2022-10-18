package typings.libp2pMplex

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/mplex", "Mplex")
  @js.native
  open class Mplex ()
    extends StObject
       with StreamMuxerFactory
       with Initializable {
    def this(init: MplexInit) = this()
    
    /* private */ val _init: Any = js.native
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
  }
  
  trait MplexInit extends StObject {
    
    /**
      * When `maxInboundStreams` is hit, if the remote continues try to open
      * more than this many new multiplexed streams per second the connection
      * will be closed (default: 5)
      */
    var disconnectThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of multiplexed streams that can be open at any
      * one time. A request to open more than this will have a stream
      * reset message sent immediately as a response for the newly opened
      * stream id (default: 1024)
      */
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size of message that can be sent in one go in bytes.
      * Messages larger than this will be split into multiple smaller
      * messages (default: 1MB)
      */
    var maxMsgSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of multiplexed streams that can be open at any
      * one time. An attempt to open more than this will throw (default: 1024)
      */
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * Incoming stream messages are buffered until processed by the stream
      * handler. If the buffer reaches this size in bytes the stream will
      * be reset (default: 4MB)
      */
    var maxStreamBufferSize: js.UndefOr[Double] = js.undefined
  }
  object MplexInit {
    
    inline def apply(): MplexInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MplexInit]
    }
    
    extension [Self <: MplexInit](x: Self) {
      
      inline def setDisconnectThreshold(value: Double): Self = StObject.set(x, "disconnectThreshold", value.asInstanceOf[js.Any])
      
      inline def setDisconnectThresholdUndefined: Self = StObject.set(x, "disconnectThreshold", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxMsgSize(value: Double): Self = StObject.set(x, "maxMsgSize", value.asInstanceOf[js.Any])
      
      inline def setMaxMsgSizeUndefined: Self = StObject.set(x, "maxMsgSize", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setMaxStreamBufferSize(value: Double): Self = StObject.set(x, "maxStreamBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxStreamBufferSizeUndefined: Self = StObject.set(x, "maxStreamBufferSize", js.undefined)
    }
  }
}
