package typings.jsonRpcEngine

import typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMergeMiddlewareMod {
  
  @JSImport("json-rpc-engine/dist/mergeMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeMiddleware(middlewareStack: js.Array[JsonRpcMiddleware[Any, Any]]): JsonRpcMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMiddleware")(middlewareStack.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[Any, Any]]
}
