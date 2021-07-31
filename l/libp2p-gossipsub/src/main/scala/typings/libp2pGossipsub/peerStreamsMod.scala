package typings.libp2pGossipsub

import typings.itPushable.mod.Pushable
import typings.libp2pGossipsub.interfacesMod.DuplexIterableStream
import typings.peerId.mod.^
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerStreamsMod {
  
  trait PeerStreams extends StObject {
    
    def attachInboundConnection(stream: DuplexIterableStream[js.Any, js.Any, js.Any]): Unit
    
    def attachOutboundConnection(stream: DuplexIterableStream[js.Any, js.Any, js.Any]): js.Promise[Unit]
    
    def close(): Unit
    
    var id: ^
    
    var inboundStream: DuplexIterableStream[js.Any, js.Any, js.Any]
    
    val isReadable: Boolean
    
    val isWritable: Boolean
    
    var outboundStream: Pushable[Uint8Array]
    
    var protocol: String
    
    def write(buf: Uint8Array): Unit
  }
  object PeerStreams {
    
    @scala.inline
    def apply(
      attachInboundConnection: DuplexIterableStream[js.Any, js.Any, js.Any] => Unit,
      attachOutboundConnection: DuplexIterableStream[js.Any, js.Any, js.Any] => js.Promise[Unit],
      close: () => Unit,
      id: ^,
      inboundStream: DuplexIterableStream[js.Any, js.Any, js.Any],
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
      def setAttachInboundConnection(value: DuplexIterableStream[js.Any, js.Any, js.Any] => Unit): Self = StObject.set(x, "attachInboundConnection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachOutboundConnection(value: DuplexIterableStream[js.Any, js.Any, js.Any] => js.Promise[Unit]): Self = StObject.set(x, "attachOutboundConnection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: ^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundStream(value: DuplexIterableStream[js.Any, js.Any, js.Any]): Self = StObject.set(x, "inboundStream", value.asInstanceOf[js.Any])
      
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
