package typings.jsonRpcEngine

import typings.jsonRpcEngine.jsonRpcEngineMod.JsonRpcMiddleware
import typings.jsonRpcEngine.mod.JsonRpcEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asMiddlewareMod {
  
  inline def apply(engine: JsonRpcEngine): JsonRpcMiddleware[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for U */ Any
  ] = ^.asInstanceOf[js.Dynamic].apply(engine.asInstanceOf[js.Any]).asInstanceOf[JsonRpcMiddleware[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for U */ Any
  ]]
  
  @JSImport("json-rpc-engine/dist/asMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
