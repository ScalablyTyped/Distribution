package typings.libp2pInterfaceConnection

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.CLOSED
import typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.CLOSING
import typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.OPEN
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AsyncGenerator
import typings.std.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isConnection(other: Any): /* is @libp2p/interface-connection.@libp2p/interface-connection.Connection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnection")(other.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interface-connection.@libp2p/interface-connection.Connection */ Boolean]
  
  @JSImport("@libp2p/interface-connection", "symbol")
  @js.native
  val symbol: js.Symbol = js.native
  
  @js.native
  trait Connection extends StObject {
    
    def addStream(stream: Stream): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var id: String = js.native
    
    def newStream(multicodecs: String): js.Promise[Stream] = js.native
    def newStream(multicodecs: String, options: AbortOptions): js.Promise[Stream] = js.native
    def newStream(multicodecs: js.Array[String]): js.Promise[Stream] = js.native
    def newStream(multicodecs: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
    
    var remoteAddr: Multiaddr_ = js.native
    
    var remotePeer: PeerId = js.native
    
    def removeStream(id: String): Unit = js.native
    
    var stat: ConnectionStat = js.native
    
    var streams: js.Array[Stream] = js.native
    
    var tags: js.Array[String] = js.native
  }
  
  trait ConnectionProtector extends StObject {
    
    /**
      * Takes a given Connection and creates a private encryption stream
      * between its two peers from the PSK the Protector instance was
      * created with.
      */
    def protect(connection: MultiaddrConnection): js.Promise[MultiaddrConnection]
  }
  object ConnectionProtector {
    
    inline def apply(protect: MultiaddrConnection => js.Promise[MultiaddrConnection]): ConnectionProtector = {
      val __obj = js.Dynamic.literal(protect = js.Any.fromFunction1(protect))
      __obj.asInstanceOf[ConnectionProtector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionProtector] (val x: Self) extends AnyVal {
      
      inline def setProtect(value: MultiaddrConnection => js.Promise[MultiaddrConnection]): Self = StObject.set(x, "protect", js.Any.fromFunction1(value))
    }
  }
  
  trait ConnectionStat extends StObject {
    
    /**
      * Outbound conections are opened by the local node, inbound streams are opened by the remote
      */
    var direction: Direction
    
    /**
      * Once a connection encrypter has been negotiated for this stream, it will be set on the stat object
      */
    var encryption: js.UndefOr[String] = js.undefined
    
    /**
      * Once a multiplexer has been negotiated for this stream, it will be set on the stat object
      */
    var multiplexer: js.UndefOr[String] = js.undefined
    
    /**
      * The current status of the connection
      */
    var status: /* keyof @libp2p/interface-connection.anon.TypeofStatus */ OPEN | CLOSING | CLOSED
    
    /**
      * Lifecycle times for the connection
      */
    var timeline: ConnectionTimeline
  }
  object ConnectionStat {
    
    inline def apply(
      direction: Direction,
      status: /* keyof @libp2p/interface-connection.anon.TypeofStatus */ OPEN | CLOSING | CLOSED,
      timeline: ConnectionTimeline
    ): ConnectionStat = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionStat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionStat] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setMultiplexer(value: String): Self = StObject.set(x, "multiplexer", value.asInstanceOf[js.Any])
      
      inline def setMultiplexerUndefined: Self = StObject.set(x, "multiplexer", js.undefined)
      
      inline def setStatus(value: /* keyof @libp2p/interface-connection.anon.TypeofStatus */ OPEN | CLOSING | CLOSED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: ConnectionTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionTimeline extends StObject {
    
    var close: js.UndefOr[Double] = js.undefined
    
    var open: Double
    
    var upgraded: js.UndefOr[Double] = js.undefined
  }
  object ConnectionTimeline {
    
    inline def apply(open: Double): ConnectionTimeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionTimeline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionTimeline] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setUpgraded(value: Double): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
      
      inline def setUpgradedUndefined: Self = StObject.set(x, "upgraded", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.inbound
    - typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.outbound
  */
  trait Direction extends StObject
  object Direction {
    
    inline def inbound: typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.inbound = "inbound".asInstanceOf[typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.inbound]
    
    inline def outbound: typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.outbound = "outbound".asInstanceOf[typings.libp2pInterfaceConnection.libp2pInterfaceConnectionStrings.outbound]
  }
  
  @js.native
  trait MultiaddrConnection
    extends StObject
       with Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ] {
    
    def close(): js.Promise[Unit] = js.native
    def close(err: js.Error): js.Promise[Unit] = js.native
    
    var remoteAddr: Multiaddr_ = js.native
    
    var timeline: MultiaddrConnectionTimeline = js.native
  }
  
  trait MultiaddrConnectionTimeline extends StObject {
    
    var close: js.UndefOr[Double] = js.undefined
    
    var open: Double
    
    var upgraded: js.UndefOr[Double] = js.undefined
  }
  object MultiaddrConnectionTimeline {
    
    inline def apply(open: Double): MultiaddrConnectionTimeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiaddrConnectionTimeline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiaddrConnectionTimeline] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setUpgraded(value: Double): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
      
      inline def setUpgradedUndefined: Self = StObject.set(x, "upgraded", js.undefined)
    }
  }
  
  trait Stream
    extends StObject
       with Duplex[
          AsyncGenerator[Uint8ArrayList, Any, Any], 
          Source[Uint8ArrayList | js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ] {
    
    /**
      * Closes the stream for **reading** *and* **writing**. This should be called when a *local error* has occurred.
      *
      * Note, if called without an error any buffered data in the source can still be consumed and the stream will end normally.
      *
      * This will cause a `RESET` message to be sent to the remote, *unless* the sink has already ended.
      *
      * The sink will return and the source will throw if an error is passed or return normally if not.
      */
    def abort(err: js.Error): Unit
    
    /**
      * Closes the stream for **reading** *and* **writing**.
      *
      * Any buffered data in the source can still be consumed and the stream will end normally.
      *
      * This will cause a `CLOSE` message to be sent to the remote, *unless* the sink has already ended.
      *
      * The sink and the source will return normally.
      */
    def close(): Unit
    
    /**
      * Closes the stream for **reading**. If iterating over the source of this stream in a `for await of` loop, it will return (exit the loop) after any buffered data has been consumed.
      *
      * This function is called automatically by the muxer when it receives a `CLOSE` message from the remote.
      *
      * The source will return normally, the sink will continue to consume.
      */
    def closeRead(): Unit
    
    /**
      * Closes the stream for **writing**. If iterating over the source of this stream in a `for await of` loop, it will return (exit the loop) after any buffered data has been consumed.
      *
      * The source will return normally, the sink will continue to consume.
      */
    def closeWrite(): Unit
    
    /**
      * Unique identifier for a stream. Identifiers are not unique across muxers.
      */
    var id: String
    
    /**
      * User defined stream metadata
      */
    var metadata: Record[String, Any]
    
    /**
      * Closes the stream *immediately* for **reading** *and* **writing**. This should be called when a *remote error* has occurred.
      *
      * This function is called automatically by the muxer when it receives a `RESET` message from the remote.
      *
      * The sink will return and the source will throw.
      */
    def reset(): Unit
    
    /**
      * Stats about this stream
      */
    var stat: StreamStat
  }
  object Stream {
    
    inline def apply(
      abort: js.Error => Unit,
      close: () => Unit,
      closeRead: () => Unit,
      closeWrite: () => Unit,
      id: String,
      metadata: Record[String, Any],
      reset: () => Unit,
      sink: Source[Uint8ArrayList | js.typedarray.Uint8Array] => js.Promise[Unit],
      source: AsyncGenerator[Uint8ArrayList, Any, Any],
      stat: StreamStat
    ): Stream = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), close = js.Any.fromFunction0(close), closeRead = js.Any.fromFunction0(closeRead), closeWrite = js.Any.fromFunction0(closeWrite), id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: js.Error => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseRead(value: () => Unit): Self = StObject.set(x, "closeRead", js.Any.fromFunction0(value))
      
      inline def setCloseWrite(value: () => Unit): Self = StObject.set(x, "closeWrite", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStat(value: StreamStat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamStat extends StObject {
    
    /**
      * Outbound streams are opened by the local node, inbound streams are opened by the remote
      */
    var direction: Direction
    
    /**
      * Once a protocol has been negotiated for this stream, it will be set on the stat object
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * Lifecycle times for the stream
      */
    var timeline: StreamTimeline
  }
  object StreamStat {
    
    inline def apply(direction: Direction, timeline: StreamTimeline): StreamStat = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamStat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamStat] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setTimeline(value: StreamTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamTimeline extends StObject {
    
    var close: js.UndefOr[Double] = js.undefined
    
    var open: Double
  }
  object StreamTimeline {
    
    inline def apply(open: Double): StreamTimeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamTimeline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamTimeline] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
