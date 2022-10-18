package typings.ipfsGrpcServer

import typings.ipfsGrpcServer.ipfsGrpcServerStrings.data
import typings.ipfsGrpcServer.ipfsGrpcServerStrings.error
import typings.itPushable.mod.Pushable_
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.eventsMod.EventEmitter
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type BidirectionalStreamingEndpoint[InputMessage, OutputMessage, Metadata] = js.Function3[
    /* source */ AsyncIterable[InputMessage], 
    /* sink */ Pushable_[OutputMessage], 
    /* metadata */ Metadata, 
    js.Promise[Unit]
  ]
  
  type ClientStreamingEndpoint[InputMessage, OutputMessage, Metadata] = js.Function2[
    /* source */ AsyncIterable[InputMessage], 
    /* metadata */ Metadata, 
    js.Promise[OutputMessage]
  ]
  
  trait Options extends StObject {
    
    var socket: js.UndefOr[WebsocketServer] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSocket(value: WebsocketServer): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  type ServerStreamingEndpoint[InputMessage, OutputMessage, Metadata] = js.Function3[
    /* input */ InputMessage, 
    /* sink */ Pushable_[OutputMessage], 
    /* metadata */ Metadata, 
    js.Promise[Unit]
  ]
  
  type UnaryEndpoint[InputMessage, OutputMessage, Metadata] = js.Function2[/* input */ InputMessage, /* metadata */ Metadata, js.Promise[OutputMessage]]
  
  trait WebsocketMessage extends StObject {
    
    var channel: Any
    
    var metadata: Any
    
    var path: String
  }
  object WebsocketMessage {
    
    inline def apply(channel: Any, metadata: Any, path: String): WebsocketMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebsocketMessage]
    }
    
    extension [Self <: WebsocketMessage](x: Self) {
      
      inline def setChannel(value: Any): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebsocketServer extends EventEmitter {
    
    var info: WebsocketServerInfo = js.native
    
    @JSName("on")
    var on_Original: (js.Function2[error, /* listener */ js.Function1[/* err */ js.Error, Unit], this.type]) & (js.Function2[data, /* listener */ js.Function1[/* message */ WebsocketMessage, Unit], this.type]) = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* message */ WebsocketMessage, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  trait WebsocketServerInfo extends StObject {
    
    var ma: Multiaddr_
    
    var uri: String
  }
  object WebsocketServerInfo {
    
    inline def apply(ma: Multiaddr_, uri: String): WebsocketServerInfo = {
      val __obj = js.Dynamic.literal(ma = ma.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebsocketServerInfo]
    }
    
    extension [Self <: WebsocketServerInfo](x: Self) {
      
      inline def setMa(value: Multiaddr_): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
