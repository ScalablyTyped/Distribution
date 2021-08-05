package typings.libp2pGossipsub

import typings.itPushable.mod.Pushable
import typings.libp2pGossipsub.messageMod.Message
import typings.libp2pGossipsub.messageMod.SubOpts
import typings.peerId.mod.^
import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerMod {
  
  trait Connection extends StObject
  
  trait Peer extends StObject {
    
    def attachConnection(conn: Connection): Unit
    
    def close(): Unit
    
    var conn: Connection
    
    var id: ^
    
    val isConnected: Boolean
    
    val isWritable: Boolean
    
    var protocols: js.Array[String]
    
    def sendMessages(msgs: js.Array[Message]): Unit
    
    def sendSubscriptions(topics: js.Array[String]): Unit
    
    def sendUnsubscriptions(topics: js.Array[String]): Unit
    
    var stream: Pushable[Uint8Array]
    
    var topics: Set[String]
    
    def updateSubscriptions(subOpts: js.Array[SubOpts]): Unit
    
    def write(buf: Uint8Array): Unit
  }
  object Peer {
    
    inline def apply(
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
    
    extension [Self <: Peer](x: Self) {
      
      inline def setAttachConnection(value: Connection => Unit): Self = StObject.set(x, "attachConnection", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setConn(value: Connection): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
      
      inline def setId(value: ^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
      
      inline def setIsWritable(value: Boolean): Self = StObject.set(x, "isWritable", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      inline def setSendMessages(value: js.Array[Message] => Unit): Self = StObject.set(x, "sendMessages", js.Any.fromFunction1(value))
      
      inline def setSendSubscriptions(value: js.Array[String] => Unit): Self = StObject.set(x, "sendSubscriptions", js.Any.fromFunction1(value))
      
      inline def setSendUnsubscriptions(value: js.Array[String] => Unit): Self = StObject.set(x, "sendUnsubscriptions", js.Any.fromFunction1(value))
      
      inline def setStream(value: Pushable[Uint8Array]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: Set[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setUpdateSubscriptions(value: js.Array[SubOpts] => Unit): Self = StObject.set(x, "updateSubscriptions", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Uint8Array => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait Registrar extends StObject {
    
    def handle(): Unit
    
    def register(): Unit
    
    def unregister(): Unit
  }
  object Registrar {
    
    inline def apply(handle: () => Unit, register: () => Unit, unregister: () => Unit): Registrar = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction0(handle), register = js.Any.fromFunction0(register), unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[Registrar]
    }
    
    extension [Self <: Registrar](x: Self) {
      
      inline def setHandle(value: () => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction0(value))
      
      inline def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      inline def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
}
