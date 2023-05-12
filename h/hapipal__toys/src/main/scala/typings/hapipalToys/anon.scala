package typings.hapipalToys

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRouteMod.HandlerDecorations
import typings.hapiHapi.libTypesRouteMod.RouteOptions
import typings.hapiHapi.libTypesRouteMod.RouteRules
import typings.hapiHapi.libTypesServerMod.Server_
import typings.hapiHapi.libTypesServerServerMod.ServerApplicationState
import typings.hapiHapi.libTypesUtilsMod.HTTP_METHODS_PARTIAL
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@hapi/hapi.@hapi/hapi.ServerRoute<@hapi/hapi.@hapi/hapi/lib/types/request.ReqRefDefaults>> */
  trait PartialServerRouteReqRefD extends StObject {
    
    var handler: js.UndefOr[(Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | HandlerDecorations] = js.undefined
    
    var method: js.UndefOr[HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String] = js.undefined
    
    var options: js.UndefOr[
        RouteOptions[ReqRefDefaults] | (js.Function1[/* server */ Server_[ServerApplicationState], RouteOptions[ReqRefDefaults]])
      ] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[RouteRules] = js.undefined
    
    var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PartialServerRouteReqRefD {
    
    inline def apply(): PartialServerRouteReqRefD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerRouteReqRefD]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialServerRouteReqRefD] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | HandlerDecorations): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setMethod(value: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: (HTTP_METHODS_PARTIAL | String)*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setOptions(
        value: RouteOptions[ReqRefDefaults] | (js.Function1[/* server */ Server_[ServerApplicationState], RouteOptions[ReqRefDefaults]])
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction1(value: /* server */ Server_[ServerApplicationState] => RouteOptions[ReqRefDefaults]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRules(value: RouteRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
      
      inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
    }
  }
  
  trait TypeofAsyncLocalStorage extends StObject {
    
    /**
      * Binds the given function to the current execution context.
      * @since v19.8.0
      * @experimental
      * @param fn The function to bind to the current execution context.
      * @return A new function that calls `fn` within the captured execution context.
      */
    /* static member */
    def bind[Func /* <: js.Function1[/* repeated */ Any, Any] */](fn: Func): Func
    
    /**
      * Captures the current execution context and returns a function that accepts a
      * function as an argument. Whenever the returned function is called, it
      * calls the function passed to it within the captured context.
      *
      * ```js
      * const asyncLocalStorage = new AsyncLocalStorage();
      * const runInAsyncScope = asyncLocalStorage.run(123, () => AsyncLocalStorage.snapshot());
      * const result = asyncLocalStorage.run(321, () => runInAsyncScope(() => asyncLocalStorage.getStore()));
      * console.log(result);  // returns 123
      * ```
      *
      * AsyncLocalStorage.snapshot() can replace the use of AsyncResource for simple
      * async context tracking purposes, for example:
      *
      * ```js
      * class Foo {
      *   #runInAsyncScope = AsyncLocalStorage.snapshot();
      *
      *   get() { return this.#runInAsyncScope(() => asyncLocalStorage.getStore()); }
      * }
      *
      * const foo = asyncLocalStorage.run(123, () => new Foo());
      * console.log(asyncLocalStorage.run(321, () => foo.get())); // returns 123
      * ```
      * @since v19.8.0
      * @experimental
      * @return A new function with the signature `(fn: (...args) : R, ...args) : R`.
      */
    /* static member */
    def snapshot(): js.Function2[/* fn */ js.Function1[/* args */ js.Array[Any], Any], /* args */ js.Array[Any], Any]
  }
  object TypeofAsyncLocalStorage {
    
    inline def apply(
      bind: Any => Any,
      snapshot: () => js.Function2[/* fn */ js.Function1[/* args */ js.Array[Any], Any], /* args */ js.Array[Any], Any]
    ): TypeofAsyncLocalStorage = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), snapshot = js.Any.fromFunction0(snapshot))
      __obj.asInstanceOf[TypeofAsyncLocalStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofAsyncLocalStorage] (val x: Self) extends AnyVal {
      
      inline def setBind(value: Any => Any): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      inline def setSnapshot(
        value: () => js.Function2[/* fn */ js.Function1[/* args */ js.Array[Any], Any], /* args */ js.Array[Any], Any]
      ): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
    }
  }
}
