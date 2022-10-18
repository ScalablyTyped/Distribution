package typings.jsonRpcEngine

import typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcMiddleware
import typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcRequest
import typings.jsonRpcEngine.distJsonRpcEngineMod.PendingJsonRpcResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateAsyncMiddlewareMod {
  
  @JSImport("json-rpc-engine/dist/createAsyncMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAsyncMiddleware[T, U](asyncMiddleware: AsyncJsonrpcMiddleware[T, U]): JsonRpcMiddleware[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncMiddleware")(asyncMiddleware.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[T, U]]
  
  type AsyncJsonRpcEngineNextCallback = js.Function0[js.Promise[Unit]]
  
  type AsyncJsonrpcMiddleware[T, U] = js.Function3[
    /* req */ JsonRpcRequest[T], 
    /* res */ PendingJsonRpcResponse[U], 
    /* next */ AsyncJsonRpcEngineNextCallback, 
    js.Promise[Unit]
  ]
}
