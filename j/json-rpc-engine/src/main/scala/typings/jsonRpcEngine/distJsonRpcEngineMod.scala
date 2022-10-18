package typings.jsonRpcEngine

import org.scalablytyped.runtime.StringDictionary
import typings.jsonRpcEngine.jsonRpcEngineStrings.`2Dot0`
import typings.metamaskSafeEventEmitter.mod.default
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsonRpcEngineMod {
  
  @JSImport("json-rpc-engine/dist/JsonRpcEngine", "JsonRpcEngine")
  @js.native
  open class JsonRpcEngine () extends default {
    
    /**
      * Ensures that the request object is valid, processes it, and passes any
      * error and the response object to the given callback.
      *
      * Does not reject.
      */
    /* private */ var _handle: Any = js.native
    
    /**
      * Like _handle, but for batch requests.
      */
    /* private */ var _handleBatch: Any = js.native
    
    /* private */ var _middleware: Any = js.native
    
    /**
      * For the given request and response, runs all middleware and their return
      * handlers, if any, and ensures that internal request processing semantics
      * are satisfied.
      */
    /* private */ var _processRequest: Any = js.native
    
    /**
      * A promise-wrapped _handle.
      */
    /* private */ var _promiseHandle: Any = js.native
    
    /**
      * Returns this engine as a middleware function that can be pushed to other
      * engines.
      *
      * @returns This engine as a middleware function.
      */
    def asMiddleware(): JsonRpcMiddleware[Any, Any] = js.native
    
    /**
      * Handle an array of JSON-RPC requests, and return an array of responses.
      *
      * @param request - The requests to handle.
      * @returns A promise that resolves with the array of responses, or rejects
      * with an error.
      */
    def handle[T, U](requests: js.Array[JsonRpcRequest[T]]): js.Promise[js.Array[JsonRpcResponse[U]]] = js.native
    /**
      * Handle an array of JSON-RPC requests, and return an array of responses.
      *
      * @param request - The requests to handle.
      * @param callback - An error-first callback that will receive the array of
      * responses.
      */
    def handle[T, U](
      requests: js.Array[JsonRpcRequest[T]],
      callback: js.Function2[/* error */ Any, /* responses */ js.Array[JsonRpcResponse[U]], Unit]
    ): Unit = js.native
    /**
      * Handle a JSON-RPC request, and return a response.
      *
      * @param request - The request to handle.
      * @returns A promise that resolves with the response, or rejects with an
      * error.
      */
    def handle[T, U](request: JsonRpcRequest[T]): js.Promise[JsonRpcResponse[U]] = js.native
    /**
      * Handle a JSON-RPC request, and return a response.
      *
      * @param request - The request to handle.
      * @param callback - An error-first callback that will receive the response.
      */
    def handle[T, U](
      request: JsonRpcRequest[T],
      callback: js.Function2[/* error */ Any, /* response */ JsonRpcResponse[U], Unit]
    ): Unit = js.native
    
    /**
      * Add a middleware function to the engine's middleware stack.
      *
      * @param middleware - The middleware function to add.
      */
    def push[T, U](middleware: JsonRpcMiddleware[T, U]): Unit = js.native
  }
  /* static members */
  object JsonRpcEngine {
    
    @JSImport("json-rpc-engine/dist/JsonRpcEngine", "JsonRpcEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Throws an error if the response has neither a result nor an error, or if
      * the "isComplete" flag is falsy.
      */
    @JSImport("json-rpc-engine/dist/JsonRpcEngine", "JsonRpcEngine._checkForCompletion")
    @js.native
    def _checkForCompletion: Any = js.native
    inline def _checkForCompletion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_checkForCompletion")(x.asInstanceOf[js.Any])
    
    /**
      * Serially executes the given stack of middleware.
      *
      * @returns An array of any error encountered during middleware execution,
      * a boolean indicating whether the request was completed, and an array of
      * middleware-defined return handlers.
      */
    @JSImport("json-rpc-engine/dist/JsonRpcEngine", "JsonRpcEngine._runAllMiddleware")
    @js.native
    def _runAllMiddleware: Any = js.native
    inline def _runAllMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_runAllMiddleware")(x.asInstanceOf[js.Any])
    
    /**
      * Runs an individual middleware.
      *
      * @returns An array of any error encountered during middleware exection,
      * and a boolean indicating whether the request should end.
      */
    @JSImport("json-rpc-engine/dist/JsonRpcEngine", "JsonRpcEngine._runMiddleware")
    @js.native
    def _runMiddleware: Any = js.native
    inline def _runMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_runMiddleware")(x.asInstanceOf[js.Any])
    
    /**
      * Serially executes array of return handlers. The request and response are
      * assumed to be in their scope.
      */
    @JSImport("json-rpc-engine/dist/JsonRpcEngine", "JsonRpcEngine._runReturnHandlers")
    @js.native
    def _runReturnHandlers: Any = js.native
    inline def _runReturnHandlers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_runReturnHandlers")(x.asInstanceOf[js.Any])
  }
  
  type Json = Boolean | Double | String | Null | StringDictionary[Any] | js.Array[Any]
  
  type JsonRpcEngineCallbackError = js.Error | JsonRpcError | Null
  
  type JsonRpcEngineEndCallback = js.Function1[/* error */ js.UndefOr[JsonRpcEngineCallbackError], Unit]
  
  type JsonRpcEngineNextCallback = js.Function1[/* returnHandlerCallback */ js.UndefOr[JsonRpcEngineReturnHandler], Unit]
  
  type JsonRpcEngineReturnHandler = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[JsonRpcEngineCallbackError], Unit], 
    Unit
  ]
  
  trait JsonRpcError extends StObject {
    
    var code: Double
    
    var data: js.UndefOr[Any] = js.undefined
    
    var message: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object JsonRpcError {
    
    inline def apply(code: Double, message: String): JsonRpcError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcError]
    }
    
    extension [Self <: JsonRpcError](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait JsonRpcFailure
    extends StObject
       with JsonRpcResponseBase
       with JsonRpcResponse[Any] {
    
    var error: JsonRpcError
  }
  object JsonRpcFailure {
    
    inline def apply(error: JsonRpcError, id: JsonRpcId, jsonrpc: JsonRpcVersion): JsonRpcFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcFailure]
    }
    
    extension [Self <: JsonRpcFailure](x: Self) {
      
      inline def setError(value: JsonRpcError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type JsonRpcId = Double | String | Unit
  
  type JsonRpcMiddleware[T, U] = js.Function4[
    /* req */ JsonRpcRequest[T], 
    /* res */ PendingJsonRpcResponse[U], 
    /* next */ JsonRpcEngineNextCallback, 
    /* end */ JsonRpcEngineEndCallback, 
    Unit
  ]
  
  trait JsonRpcNotification[T] extends StObject {
    
    var jsonrpc: JsonRpcVersion
    
    var method: String
    
    var params: js.UndefOr[T] = js.undefined
  }
  object JsonRpcNotification {
    
    inline def apply[T](jsonrpc: JsonRpcVersion, method: String): JsonRpcNotification[T] = {
      val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcNotification[T]]
    }
    
    extension [Self <: JsonRpcNotification[?], T](x: Self & JsonRpcNotification[T]) {
      
      inline def setJsonrpc(value: JsonRpcVersion): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait JsonRpcRequest[T] extends StObject {
    
    var id: JsonRpcId
    
    var jsonrpc: JsonRpcVersion
    
    var method: String
    
    var params: js.UndefOr[T] = js.undefined
  }
  object JsonRpcRequest {
    
    inline def apply[T](id: JsonRpcId, jsonrpc: JsonRpcVersion, method: String): JsonRpcRequest[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcRequest[T]]
    }
    
    extension [Self <: JsonRpcRequest[?], T](x: Self & JsonRpcRequest[T]) {
      
      inline def setId(value: JsonRpcId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJsonrpc(value: JsonRpcVersion): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcSuccess[T]
    - typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcFailure
  */
  trait JsonRpcResponse[T] extends StObject
  object JsonRpcResponse {
    
    inline def JsonRpcFailure(error: JsonRpcError, id: JsonRpcId, jsonrpc: JsonRpcVersion): typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcFailure]
    }
    
    inline def JsonRpcSuccess[T](id: JsonRpcId, jsonrpc: JsonRpcVersion): typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcSuccess[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcSuccess[T]]
    }
  }
  
  trait JsonRpcResponseBase extends StObject {
    
    var id: JsonRpcId
    
    var jsonrpc: JsonRpcVersion
  }
  object JsonRpcResponseBase {
    
    inline def apply(id: JsonRpcId, jsonrpc: JsonRpcVersion): JsonRpcResponseBase = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcResponseBase]
    }
    
    extension [Self <: JsonRpcResponseBase](x: Self) {
      
      inline def setId(value: JsonRpcId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJsonrpc(value: JsonRpcVersion): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonRpcSuccess[T]
    extends StObject
       with JsonRpcResponseBase
       with JsonRpcResponse[T] {
    
    var result: Maybe[T]
  }
  object JsonRpcSuccess {
    
    inline def apply[T](id: JsonRpcId, jsonrpc: JsonRpcVersion): JsonRpcSuccess[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcSuccess[T]]
    }
    
    extension [Self <: JsonRpcSuccess[?], T](x: Self & JsonRpcSuccess[T]) {
      
      inline def setResult(value: Maybe[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultNull: Self = StObject.set(x, "result", null)
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  type JsonRpcVersion = `2Dot0`
  
  type Maybe[T] = js.UndefOr[Partial[T] | Null]
  
  trait PendingJsonRpcResponse[T]
    extends StObject
       with JsonRpcResponseBase {
    
    var error: js.UndefOr[js.Error | JsonRpcError] = js.undefined
    
    var result: js.UndefOr[T] = js.undefined
  }
  object PendingJsonRpcResponse {
    
    inline def apply[T](id: JsonRpcId, jsonrpc: JsonRpcVersion): PendingJsonRpcResponse[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingJsonRpcResponse[T]]
    }
    
    extension [Self <: PendingJsonRpcResponse[?], T](x: Self & PendingJsonRpcResponse[T]) {
      
      inline def setError(value: js.Error | JsonRpcError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
