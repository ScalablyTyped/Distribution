package typings.jsonRpcWs

import org.scalablytyped.runtime.StringDictionary
import typings.jsonRpcWs.jsonRpcWsStrings.`2Dot0`
import typings.ws.mod.ServerOptions
import typings.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-rpc-ws", "Base")
  @js.native
  class Base[TConnection /* <: Connection */] () extends StObject {
    
    /**
      * Connected event handler
      */
    def connected(socket: ^): Unit = js.native
    
    /**
      * Disconnected event handler
      */
    def disconnected(connection: TConnection): Unit = js.native
    
    /**
      * Add a handler function for a given method
      */
    def expose[ParamType, ParamCallbackType](eventName: String, handler: Handler[TConnection, ParamType, ParamCallbackType]): Unit = js.native
    
    /**
      * Get a connection by id
      */
    def getConnection(id: String): Connection = js.native
    
    /**
      * Get handler for a given method
      */
    def getHandler[ParamType, ParamCallbackType](method: String): Handler[TConnection, ParamType, ParamCallbackType] = js.native
    
    /**
      * Shut down all existing connections
      */
    def hangup(): Unit = js.native
    
    /**
      * Test if a handler exists for a given method
      */
    def hasHandler(method: String): Boolean = js.native
    
    def send[ParamType](eventName: String, params: ParamType): Unit = js.native
    /**
      * Send a method request through a specific connection
      */
    def send[ParamType, ParamCallbackType](eventName: String): Unit = js.native
    def send[ParamType, ParamCallbackType](eventName: String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): Unit = js.native
    def send[ParamType, ParamCallbackType](eventName: String, params: js.UndefOr[scala.Nothing], callback: ReplyCallback[ParamCallbackType]): Unit = js.native
    @JSName("send")
    def send_ParamTypeParamCallbackType[ParamType, ParamCallbackType](eventName: String, params: ParamType): Unit = js.native
  }
  
  @JSImport("json-rpc-ws", "Client")
  @js.native
  class Client[TConnection /* <: Connection */] protected () extends Base[TConnection] {
    def this(WebSocket: ^) = this()
    def this(WebSocket: ^, browser: Boolean) = this()
    
    /**
      * Connect to a json-rpc-ws server
      */
    def connect(url: String, connected: js.Function0[Unit]): Unit = js.native
    
    /**
      * Close the current connection
      */
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Return the current connection (there can be only one)
      */
    def getConnection(): TConnection = js.native
    
    /**
      * Test whether we have a connection or not
      */
    def isConnected(): Boolean = js.native
  }
  
  @JSImport("json-rpc-ws", "Errors")
  @js.native
  def Errors(`type`: String, id: String, data: js.Any): js.Any | Null = js.native
  @JSImport("json-rpc-ws", "Errors")
  @js.native
  def Errors(`type`: String, id: Double, data: js.Any): js.Any | Null = js.native
  @JSImport("json-rpc-ws", "Errors")
  @js.native
  def Errors(`type`: String, id: Null, data: js.Any): js.Any | Null = js.native
  
  @JSImport("json-rpc-ws", "Server")
  @js.native
  class Server[TConnection /* <: Connection */] () extends Base[TConnection] {
    
    var server: typings.ws.mod.Server = js.native
    
    /**
      * Start the server
      */
    def start(): Unit = js.native
    def start(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def start(options: ServerOptions): Unit = js.native
    def start(options: ServerOptions, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Stop the server
      */
    def stop(): Unit = js.native
  }
  
  @JSImport("json-rpc-ws", "createClient")
  @js.native
  def createClient[TConnection /* <: Connection */](): Client[TConnection] = js.native
  
  @JSImport("json-rpc-ws", "createServer")
  @js.native
  def createServer[TConnection /* <: Connection */](): Server[TConnection] = js.native
  
  @js.native
  trait Connection extends StObject {
    
    def close(): Unit = js.native
    def close(error: js.Any): Unit = js.native
    
    def hangup(): Unit = js.native
    def hangup(callback: js.Function0[Unit]): Unit = js.native
    
    var id: String = js.native
    
    def message(data: js.Any): Unit = js.native
    
    var parent: Base[_] = js.native
    
    def processPayload[ParamType](payload: Payload[ParamType]): Unit = js.native
    
    var responseHandlers: StringDictionary[ReplyCallback[_]] = js.native
    
    def sendError(error: js.Any): Unit = js.native
    def sendError(error: js.Any, id: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    def sendError(error: js.Any, id: String): Unit = js.native
    def sendError(error: js.Any, id: String, data: js.Any): Unit = js.native
    
    def sendMethod[ParamType, ParamCallbackType](method: String, params: ParamType): Unit = js.native
    def sendMethod[ParamType, ParamCallbackType](method: String, params: ParamType, callback: ReplyCallback[ParamCallbackType]): Unit = js.native
    
    def sendRaw[ParamType](payload: Payload[ParamType]): Unit = js.native
    
    def sendResult(id: String): Unit = js.native
    def sendResult(id: String, error: js.UndefOr[scala.Nothing], result: js.Any): Unit = js.native
    def sendResult(id: String, error: js.Any): Unit = js.native
    def sendResult(id: String, error: js.Any, result: js.Any): Unit = js.native
    
    var socket: ^ = js.native
  }
  
  type Handler[TConnection /* <: Connection */, ParamType, ParamCallbackType] = js.ThisFunction2[
    /* this */ TConnection, 
    /* params */ ParamType, 
    /* reply */ ReplyCallback[ParamCallbackType], 
    Unit
  ]
  
  @js.native
  trait Payload[ParamType] extends StObject {
    
    var error: js.UndefOr[js.Any] = js.native
    
    var id: String = js.native
    
    var jsonrpc: js.UndefOr[`2Dot0`] = js.native
    
    var method: String = js.native
    
    var params: js.UndefOr[ParamType] = js.native
    
    var result: js.UndefOr[js.Any] = js.native
  }
  object Payload {
    
    @scala.inline
    def apply[ParamType](id: String, method: String): Payload[ParamType] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload[ParamType]]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload[_], ParamType] (val x: Self with Payload[ParamType]) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonrpcUndefined: Self = StObject.set(x, "jsonrpc", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: ParamType): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  type ReplyCallback[ParamType] = js.Function2[/* error */ js.Any, /* params */ js.UndefOr[ParamType], Unit]
}
