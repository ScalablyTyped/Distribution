package typings.ipfsGrpcServer

import typings.ipfsGrpcServer.anon.Deserialize
import typings.ipfsGrpcServer.anon.Errorcodestringundefined
import typings.itPushable.mod.Pushable_
import typings.std.Record
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsWebSocketMessageChannelMod {
  
  @JSImport("ipfs-grpc-server/dist/src/utils/web-socket-message-channel", "WebSocketMessageChannel")
  @js.native
  open class WebSocketMessageChannel protected () extends StObject {
    /**
      * @param {import('ws')} ws
      */
    def this(ws: WebSocket) = this()
    
    var _ws: WebSocket = js.native
    
    /**
      * @param {Error} [err]
      */
    def end(): Unit = js.native
    def end(err: js.Error): Unit = js.native
    
    var handler: Deserialize = js.native
    
    /**
      * @param {object} message - A message object to send to the client
      */
    def sendMessage(message: js.Object): Unit = js.native
    
    /**
      * @param {Record<string, any>} metadata
      */
    def sendMetadata(metadata: Record[String, Any]): Unit = js.native
    
    /**
      * @param {Error & { code?: string }} [err]
      */
    def sendTrailer(): Unit = js.native
    def sendTrailer(err: Errorcodestringundefined): Unit = js.native
    
    var sink: Pushable_[Any] = js.native
    
    var source: Pushable_[Any] = js.native
  }
}
