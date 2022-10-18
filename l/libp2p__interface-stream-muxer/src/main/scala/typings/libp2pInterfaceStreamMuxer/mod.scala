package typings.libp2pInterfaceStreamMuxer

import typings.itStreamTypes.mod.Duplex
import typings.libp2pInterfaceConnection.mod.Direction
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait StreamMuxer
    extends StObject
       with Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]] {
    
    /**
      * Close or abort all tracked streams and stop the muxer
      */
    def close(): Unit = js.native
    def close(err: js.Error): Unit = js.native
    
    /**
      * Initiate a new stream with the given name. If no name is
      * provided, the id of the stream will be used.
      */
    def newStream(): Stream = js.native
    def newStream(name: String): Stream = js.native
    
    var protocol: String = js.native
    
    val streams: js.Array[Stream] = js.native
  }
  
  @js.native
  trait StreamMuxerFactory extends StObject {
    
    def createStreamMuxer(): StreamMuxer = js.native
    def createStreamMuxer(init: StreamMuxerInit): StreamMuxer = js.native
    
    var protocol: String = js.native
  }
  
  trait StreamMuxerInit
    extends StObject
       with AbortOptions {
    
    /**
      * Outbound stream muxers are opened by the local node, inbound stream muxers are opened by the remote
      */
    var direction: js.UndefOr[Direction] = js.undefined
    
    var onIncomingStream: js.UndefOr[js.Function1[/* stream */ Stream, Unit]] = js.undefined
    
    var onStreamEnd: js.UndefOr[js.Function1[/* stream */ Stream, Unit]] = js.undefined
  }
  object StreamMuxerInit {
    
    inline def apply(): StreamMuxerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamMuxerInit]
    }
    
    extension [Self <: StreamMuxerInit](x: Self) {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnIncomingStream(value: /* stream */ Stream => Unit): Self = StObject.set(x, "onIncomingStream", js.Any.fromFunction1(value))
      
      inline def setOnIncomingStreamUndefined: Self = StObject.set(x, "onIncomingStream", js.undefined)
      
      inline def setOnStreamEnd(value: /* stream */ Stream => Unit): Self = StObject.set(x, "onStreamEnd", js.Any.fromFunction1(value))
      
      inline def setOnStreamEndUndefined: Self = StObject.set(x, "onStreamEnd", js.undefined)
    }
  }
}
