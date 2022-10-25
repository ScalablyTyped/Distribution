package typings.libp2pMplex

import typings.itStreamTypes.mod.Sink
import typings.itStreamTypes.mod.Source
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceConnection.mod.StreamStat
import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxer
import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxerInit
import typings.libp2pMplex.anon.AsyncGeneratorUint8Arrayv
import typings.libp2pMplex.anon.Id
import typings.libp2pMplex.anon.Name
import typings.libp2pMplex.distSrcMessageTypesMod.Message
import typings.libp2pMplex.mod.MplexInit
import typings.std.AsyncIterable
import typings.std.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMplexMod {
  
  @JSImport("@libp2p/mplex/dist/src/mplex", "MplexStreamMuxer")
  @js.native
  open class MplexStreamMuxer ()
    extends StObject
       with StreamMuxer {
    def this(init: MplexStreamMuxerInit) = this()
    
    /**
      * Creates a sink with an abortable source. Incoming messages will
      * also have their size restricted. All messages will be varint decoded.
      */
    def _createSink(): Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    /**
      * Creates a source that restricts outgoing message sizes
      * and varint encodes them
      */
    def _createSource(): AsyncGeneratorUint8Arrayv = js.native
    
    def _handleIncoming(message: Message): js.Promise[Unit] = js.native
    
    /* private */ val _init: Any = js.native
    
    /**
      * Called whenever an inbound stream is created
      */
    def _newReceiverStream(options: Id): MplexStream = js.native
    
    def _newStream(options: Name): MplexStream = js.native
    
    /* private */ val _source: Any = js.native
    
    /* private */ var _streamId: Any = js.native
    
    /* private */ val _streams: Any = js.native
    
    /* private */ val closeController: Any = js.native
    
    /* private */ val rateLimiter: Any = js.native
    
    /* CompleteClass */
    override def sink(source: Source[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("sink")
    var sink_Original: Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    /* CompleteClass */
    var source: Source[js.typedarray.Uint8Array] = js.native
    @JSName("source")
    var source_MplexStreamMuxer: AsyncIterable[js.typedarray.Uint8Array] = js.native
    
    /**
      * Returns a Map of streams and their ids
      */
    @JSName("streams")
    def streams_MMplexStreamMuxer: js.Array[Stream] = js.native
  }
  
  trait MplexStream
    extends StObject
       with Stream {
    
    def sourcePush(data: Uint8ArrayList): Unit
    
    def sourceReadableLength(): Double
  }
  object MplexStream {
    
    inline def apply(
      abort: js.Error => Unit,
      close: () => Unit,
      closeRead: () => Unit,
      closeWrite: () => Unit,
      id: String,
      metadata: Record[String, Any],
      reset: () => Unit,
      sink: /* source */ Source[Uint8ArrayList | js.typedarray.Uint8Array] => js.Promise[Unit],
      source: Source[Uint8ArrayList],
      sourcePush: Uint8ArrayList => Unit,
      sourceReadableLength: () => Double,
      stat: StreamStat
    ): MplexStream = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), close = js.Any.fromFunction0(close), closeRead = js.Any.fromFunction0(closeRead), closeWrite = js.Any.fromFunction0(closeWrite), id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any], sourcePush = js.Any.fromFunction1(sourcePush), sourceReadableLength = js.Any.fromFunction0(sourceReadableLength), stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[MplexStream]
    }
    
    extension [Self <: MplexStream](x: Self) {
      
      inline def setSourcePush(value: Uint8ArrayList => Unit): Self = StObject.set(x, "sourcePush", js.Any.fromFunction1(value))
      
      inline def setSourceReadableLength(value: () => Double): Self = StObject.set(x, "sourceReadableLength", js.Any.fromFunction0(value))
    }
  }
  
  trait MplexStreamMuxerInit
    extends StObject
       with MplexInit
       with StreamMuxerInit
  object MplexStreamMuxerInit {
    
    inline def apply(): MplexStreamMuxerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MplexStreamMuxerInit]
    }
  }
}
