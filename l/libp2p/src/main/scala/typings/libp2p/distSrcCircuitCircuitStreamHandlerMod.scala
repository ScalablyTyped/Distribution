package typings.libp2p

import typings.itStreamTypes.mod.Duplex
import typings.libp2p.distSrcCircuitPbMod.CircuitRelay
import typings.libp2pInterfaceConnection.mod.Stream
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitCircuitStreamHandlerMod {
  
  @JSImport("libp2p/dist/src/circuit/circuit/stream-handler", "StreamHandler")
  @js.native
  open class StreamHandler protected () extends StObject {
    def this(options: StreamHandlerOptions) = this()
    
    /**
      * Close the stream
      */
    def close(): Unit = js.native
    
    /* private */ val decoder: Any = js.native
    
    /**
      * @param {CircuitRelay} msg - An unencoded CircuitRelay protobuf message
      */
    def end(msg: CircuitRelay): Unit = js.native
    
    /**
      * Read and decode message
      */
    def read(): js.Promise[js.UndefOr[CircuitRelay]] = js.native
    
    /**
      * Return the handshake rest stream and invalidate handler
      */
    def rest(): Duplex[Uint8ArrayList, js.typedarray.Uint8Array | Uint8ArrayList, js.Promise[Unit]] = js.native
    
    /* private */ val shake: Any = js.native
    
    /* private */ val stream: Any = js.native
    
    /**
      * Encode and write array of buffers
      */
    def write(msg: CircuitRelay): Unit = js.native
  }
  
  trait StreamHandlerOptions extends StObject {
    
    /**
      * max bytes length of message
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * A duplex iterable
      */
    var stream: Stream
  }
  object StreamHandlerOptions {
    
    inline def apply(stream: Stream): StreamHandlerOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamHandlerOptions]
    }
    
    extension [Self <: StreamHandlerOptions](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
