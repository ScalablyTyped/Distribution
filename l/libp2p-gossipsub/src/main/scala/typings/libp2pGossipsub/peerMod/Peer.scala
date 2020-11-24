package typings.libp2pGossipsub.peerMod

import typings.itPushable.mod.Pushable
import typings.libp2pGossipsub.messageMod.Message
import typings.libp2pGossipsub.messageMod.SubOpts
import typings.peerId.mod.^
import typings.std.Set
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peer extends js.Object {
  
  def attachConnection(conn: Connection): Unit = js.native
  
  def close(): Unit = js.native
  
  var conn: Connection = js.native
  
  var id: ^ = js.native
  
  val isConnected: Boolean = js.native
  
  val isWritable: Boolean = js.native
  
  var protocols: js.Array[String] = js.native
  
  def sendMessages(msgs: js.Array[Message]): Unit = js.native
  
  def sendSubscriptions(topics: js.Array[String]): Unit = js.native
  
  def sendUnsubscriptions(topics: js.Array[String]): Unit = js.native
  
  var stream: Pushable[Uint8Array] = js.native
  
  var topics: Set[String] = js.native
  
  def updateSubscriptions(subOpts: js.Array[SubOpts]): Unit = js.native
  
  def write(buf: Uint8Array): Unit = js.native
}
object Peer {
  
  @scala.inline
  def apply(
    attachConnection: Connection => Unit,
    close: () => Unit,
    conn: Connection,
    id: ^,
    isConnected: Boolean,
    isWritable: Boolean,
    protocols: js.Array[String],
    sendMessages: js.Array[Message] => Unit,
    sendSubscriptions: js.Array[String] => Unit,
    sendUnsubscriptions: js.Array[String] => Unit,
    stream: Pushable[Uint8Array],
    topics: Set[String],
    updateSubscriptions: js.Array[SubOpts] => Unit,
    write: Uint8Array => Unit
  ): Peer = {
    val __obj = js.Dynamic.literal(attachConnection = js.Any.fromFunction1(attachConnection), close = js.Any.fromFunction0(close), conn = conn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isWritable = isWritable.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], sendMessages = js.Any.fromFunction1(sendMessages), sendSubscriptions = js.Any.fromFunction1(sendSubscriptions), sendUnsubscriptions = js.Any.fromFunction1(sendUnsubscriptions), stream = stream.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], updateSubscriptions = js.Any.fromFunction1(updateSubscriptions), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Peer]
  }
  
  @scala.inline
  implicit class PeerOps[Self <: Peer] (val x: Self) extends AnyVal {
    
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
    def setAttachConnection(value: Connection => Unit): Self = this.set("attachConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConn(value: Connection): Self = this.set("conn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ^): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWritable(value: Boolean): Self = this.set("isWritable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessages(value: js.Array[Message] => Unit): Self = this.set("sendMessages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendSubscriptions(value: js.Array[String] => Unit): Self = this.set("sendSubscriptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendUnsubscriptions(value: js.Array[String] => Unit): Self = this.set("sendUnsubscriptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStream(value: Pushable[Uint8Array]): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: Set[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSubscriptions(value: js.Array[SubOpts] => Unit): Self = this.set("updateSubscriptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: Uint8Array => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
