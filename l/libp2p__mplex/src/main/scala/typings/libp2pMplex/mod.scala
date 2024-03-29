package typings.libp2pMplex

import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/mplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mplex(): js.Function0[StreamMuxerFactory] = ^.asInstanceOf[js.Dynamic].applyDynamic("mplex")().asInstanceOf[js.Function0[StreamMuxerFactory]]
  inline def mplex(init: MplexInit): js.Function0[StreamMuxerFactory] = ^.asInstanceOf[js.Dynamic].applyDynamic("mplex")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function0[StreamMuxerFactory]]
  
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
      * messages. If we receive a message larger than this an error will
      * be thrown and the connection closed. (default: 1MB)
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
    
    /**
      * Constrains the size of the unprocessed message queue buffer.
      * Before messages are deserialized, the raw bytes are buffered to ensure
      * we have the complete message to deserialized. If the queue gets longer
      * than this value an error will be thrown and the connection closed.
      * (default: 4MB)
      */
    var maxUnprocessedMessageQueueSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Each byte array written into a multiplexed stream is converted to one or
      * more messages which are sent as byte arrays to the remote node. Sending
      * lots of small messages can be expensive - use this setting to batch up
      * the serialized bytes of all messages sent during the current tick up to
      * this limit to send in one go similar to Nagle's algorithm. N.b. you
      * should benchmark your application carefully when using this setting as it
      * may cause the opposite of the desired effect. Omit this setting to send
      * all messages as they become available. (default: undefined)
      */
    var minSendBytes: js.UndefOr[Double] = js.undefined
  }
  object MplexInit {
    
    inline def apply(): MplexInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MplexInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MplexInit] (val x: Self) extends AnyVal {
      
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
      
      inline def setMaxUnprocessedMessageQueueSize(value: Double): Self = StObject.set(x, "maxUnprocessedMessageQueueSize", value.asInstanceOf[js.Any])
      
      inline def setMaxUnprocessedMessageQueueSizeUndefined: Self = StObject.set(x, "maxUnprocessedMessageQueueSize", js.undefined)
      
      inline def setMinSendBytes(value: Double): Self = StObject.set(x, "minSendBytes", value.asInstanceOf[js.Any])
      
      inline def setMinSendBytesUndefined: Self = StObject.set(x, "minSendBytes", js.undefined)
    }
  }
}
