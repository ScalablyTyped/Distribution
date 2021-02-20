package typings.libp2pGossipsub

import typings.itPushable.mod.Pushable
import typings.libp2pGossipsub.interfacesMod.DuplexIterableStream
import typings.peerId.mod.^
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerStreamsMod {
  
  @js.native
  trait PeerStreams extends StObject {
    
    def attachInboundConnection(stream: DuplexIterableStream[_, _, _]): Unit = js.native
    
    def attachOutboundConnection(stream: DuplexIterableStream[_, _, _]): js.Promise[Unit] = js.native
    
    def close(): Unit = js.native
    
    var id: ^ = js.native
    
    var inboundStream: DuplexIterableStream[_, _, _] = js.native
    
    val isReadable: Boolean = js.native
    
    val isWritable: Boolean = js.native
    
    var outboundStream: Pushable[Uint8Array] = js.native
    
    var protocol: String = js.native
    
    def write(buf: Uint8Array): Unit = js.native
  }
  object PeerStreams {
    
    @scala.inline
    def apply(
      attachInboundConnection: DuplexIterableStream[_, _, _] => Unit,
      attachOutboundConnection: DuplexIterableStream[_, _, _] => js.Promise[Unit],
      close: () => Unit,
      id: ^,
      inboundStream: DuplexIterableStream[_, _, _],
      isReadable: Boolean,
      isWritable: Boolean,
      outboundStream: Pushable[Uint8Array],
      protocol: String,
      write: Uint8Array => Unit
    ): PeerStreams = {
      val __obj = js.Dynamic.literal(attachInboundConnection = js.Any.fromFunction1(attachInboundConnection), attachOutboundConnection = js.Any.fromFunction1(attachOutboundConnection), close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], inboundStream = inboundStream.asInstanceOf[js.Any], isReadable = isReadable.asInstanceOf[js.Any], isWritable = isWritable.asInstanceOf[js.Any], outboundStream = outboundStream.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[PeerStreams]
    }
    
    @scala.inline
    implicit class PeerStreamsMutableBuilder[Self <: PeerStreams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachInboundConnection(value: DuplexIterableStream[_, _, _] => Unit): Self = StObject.set(x, "attachInboundConnection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachOutboundConnection(value: DuplexIterableStream[_, _, _] => js.Promise[Unit]): Self = StObject.set(x, "attachOutboundConnection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: ^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundStream(value: DuplexIterableStream[_, _, _]): Self = StObject.set(x, "inboundStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReadable(value: Boolean): Self = StObject.set(x, "isReadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWritable(value: Boolean): Self = StObject.set(x, "isWritable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutboundStream(value: Pushable[Uint8Array]): Self = StObject.set(x, "outboundStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: Uint8Array => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
