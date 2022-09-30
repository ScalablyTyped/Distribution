package typings.isomorphicWs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.isomorphicWs.isomorphicWsInts.`0`
import typings.isomorphicWs.isomorphicWsInts.`1`
import typings.isomorphicWs.isomorphicWsInts.`2`
import typings.isomorphicWs.isomorphicWsInts.`3`
import typings.node.httpMod.ClientRequestArgs
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.urlMod.URL_
import typings.ws.mod.ClientOptions
import typings.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  // WebSocket socket.
  @JSImport("isomorphic-ws", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typings.ws.mod.WebSocket {
    def this(address: String) = this()
    def this(address: Null) = this()
    def this(address: URL_) = this()
    def this(address: String, options: ClientRequestArgs) = this()
    def this(address: String, options: ClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: URL_, options: ClientRequestArgs) = this()
    def this(address: URL_, options: ClientOptions) = this()
    def this(address: URL_, protocols: String) = this()
    def this(address: URL_, protocols: js.Array[String]) = this()
    def this(address: String, protocols: String, options: ClientRequestArgs) = this()
    def this(address: String, protocols: String, options: ClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: String, protocols: Unit, options: ClientRequestArgs) = this()
    def this(address: String, protocols: Unit, options: ClientOptions) = this()
    def this(address: URL_, protocols: String, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: String, options: ClientOptions) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: URL_, protocols: Unit, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: Unit, options: ClientOptions) = this()
  }
  @JSImport("isomorphic-ws", JSImport.Namespace)
  @js.native
  val ^ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = js.native
  
  /** The connection is closed. */
  /* static member */
  @JSImport("isomorphic-ws", "CLOSED")
  @js.native
  val CLOSED: `3` = js.native
  
  /** The connection is in the process of closing. */
  /* static member */
  @JSImport("isomorphic-ws", "CLOSING")
  @js.native
  val CLOSING: `2` = js.native
  
  /** The connection is not yet open. */
  /* static member */
  @JSImport("isomorphic-ws", "CONNECTING")
  @js.native
  val CONNECTING: `0` = js.native
  
  /** The connection is open and ready to communicate. */
  /* static member */
  @JSImport("isomorphic-ws", "OPEN")
  @js.native
  val OPEN: `1` = js.native
  
  // WebSocket Server
  @JSImport("isomorphic-ws", "Server")
  @js.native
  open class Server[T /* <: typings.ws.mod.WebSocket */] ()
    extends typings.ws.mod.Server[T] {
    def this(options: ServerOptions) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
  }
  
  // tslint:disable-line no-empty-interface
  @JSImport("isomorphic-ws", "WebSocket")
  @js.native
  val WebSocket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = js.native
  
  @JSImport("isomorphic-ws", "WebSocketServer")
  @js.native
  val WebSocketServer: Instantiable2[
    /* options */ js.UndefOr[ServerOptions], 
    /* callback */ js.UndefOr[js.Function0[Unit]], 
    typings.ws.mod.Server[typings.ws.mod.WebSocket]
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("isomorphic-ws", "WebSocketServer")
  @js.native
  open class WebSocketServerCls[T /* <: typings.ws.mod.WebSocket */] ()
    extends typings.ws.mod.Server[T] {
    def this(options: ServerOptions) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
  }
  
  // tslint:disable-line no-empty-interface
  // WebSocket stream
  inline def createWebSocketStream(websocket: typings.ws.mod.WebSocket): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketStream")(websocket.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  inline def createWebSocketStream(websocket: typings.ws.mod.WebSocket, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketStream")(websocket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  type _To = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = ^
}
