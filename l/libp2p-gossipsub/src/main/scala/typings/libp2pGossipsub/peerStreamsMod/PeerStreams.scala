package typings.libp2pGossipsub.peerStreamsMod

import typings.itPushable.mod.Pushable
import typings.libp2pGossipsub.interfacesMod.DuplexIterableStream
import typings.peerId.mod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerStreams extends js.Object {
  
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
  implicit class PeerStreamsOps[Self <: PeerStreams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachInboundConnection(value: DuplexIterableStream[_, _, _] => Unit): Self = this.set("attachInboundConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachOutboundConnection(value: DuplexIterableStream[_, _, _] => js.Promise[Unit]): Self = this.set("attachOutboundConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: ^): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundStream(value: DuplexIterableStream[_, _, _]): Self = this.set("inboundStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadable(value: Boolean): Self = this.set("isReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWritable(value: Boolean): Self = this.set("isWritable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundStream(value: Pushable[Uint8Array]): Self = this.set("outboundStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Uint8Array => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
