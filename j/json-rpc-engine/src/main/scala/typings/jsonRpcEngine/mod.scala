package typings.jsonRpcEngine

import org.scalablytyped.runtime.StringDictionary
import typings.jsonRpcEngine.createAsyncMiddlewareMod.AsyncJsonrpcMiddleware
import typings.jsonRpcEngine.createScaffoldMiddlewareMod.ScaffoldMiddlewareHandler
import typings.jsonRpcEngine.jsonRpcEngineMod.JsonRpcMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-rpc-engine/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json-rpc-engine/dist", "JsonRpcEngine")
  @js.native
  open class JsonRpcEngine ()
    extends typings.jsonRpcEngine.jsonRpcEngineMod.JsonRpcEngine
  /* static members */
  object JsonRpcEngine {
    
    @JSImport("json-rpc-engine/dist", "JsonRpcEngine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Throws an error if the response has neither a result nor an error, or if
      * the "isComplete" flag is falsy.
      */
    @JSImport("json-rpc-engine/dist", "JsonRpcEngine._checkForCompletion")
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
    @JSImport("json-rpc-engine/dist", "JsonRpcEngine._runAllMiddleware")
    @js.native
    def _runAllMiddleware: Any = js.native
    inline def _runAllMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_runAllMiddleware")(x.asInstanceOf[js.Any])
    
    /**
      * Runs an individual middleware.
      *
      * @returns An array of any error encountered during middleware exection,
      * and a boolean indicating whether the request should end.
      */
    @JSImport("json-rpc-engine/dist", "JsonRpcEngine._runMiddleware")
    @js.native
    def _runMiddleware: Any = js.native
    inline def _runMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_runMiddleware")(x.asInstanceOf[js.Any])
    
    /**
      * Serially executes array of return handlers. The request and response are
      * assumed to be in their scope.
      */
    @JSImport("json-rpc-engine/dist", "JsonRpcEngine._runReturnHandlers")
    @js.native
    def _runReturnHandlers: Any = js.native
    inline def _runReturnHandlers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_runReturnHandlers")(x.asInstanceOf[js.Any])
  }
  
  inline def createAsyncMiddleware[T, U](asyncMiddleware: AsyncJsonrpcMiddleware[T, U]): JsonRpcMiddleware[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncMiddleware")(asyncMiddleware.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[T, U]]
  
  inline def createIdRemapMiddleware(): JsonRpcMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIdRemapMiddleware")().asInstanceOf[JsonRpcMiddleware[Any, Any]]
  
  inline def createScaffoldMiddleware(handlers: StringDictionary[ScaffoldMiddlewareHandler[Any, Any]]): JsonRpcMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createScaffoldMiddleware")(handlers.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[Any, Any]]
  
  inline def getUniqueId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueId")().asInstanceOf[Double]
  
  inline def mergeMiddleware(middlewareStack: js.Array[JsonRpcMiddleware[Any, Any]]): JsonRpcMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMiddleware")(middlewareStack.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[Any, Any]]
}
