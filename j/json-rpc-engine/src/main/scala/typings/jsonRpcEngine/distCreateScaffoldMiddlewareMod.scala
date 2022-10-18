package typings.jsonRpcEngine

import org.scalablytyped.runtime.StringDictionary
import typings.jsonRpcEngine.distJsonRpcEngineMod.JsonRpcMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateScaffoldMiddlewareMod {
  
  @JSImport("json-rpc-engine/dist/createScaffoldMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createScaffoldMiddleware(handlers: StringDictionary[ScaffoldMiddlewareHandler[Any, Any]]): JsonRpcMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createScaffoldMiddleware")(handlers.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[Any, Any]]
  
  type ScaffoldMiddlewareHandler[T, U] = (JsonRpcMiddleware[T, U]) | Any
}
