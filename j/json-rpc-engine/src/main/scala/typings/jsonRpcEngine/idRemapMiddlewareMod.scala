package typings.jsonRpcEngine

import typings.jsonRpcEngine.jsonRpcEngineMod.JsonRpcMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idRemapMiddlewareMod {
  
  @JSImport("json-rpc-engine/dist/idRemapMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIdRemapMiddleware(): JsonRpcMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIdRemapMiddleware")().asInstanceOf[JsonRpcMiddleware[Any, Any]]
}
