package typings.koaCors

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * CORS middleware factory.
    * @param options - Configuration options.
    * @returns cors middleware
    */
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(options: Options): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("@koa/cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Middleware configration options.
    */
  trait Options extends StObject {
    
    /**
      * `Access-Control-Allow-Headers`
      */
    var allowHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * `Access-Control-Allow-Methods`, default is
      * 'GET,HEAD,PUT,POST,DELETE,PATCH'
      */
    var allowMethods: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * `Access-Control-Allow-Credentials`
      *
      * @remarks
      * If a function is provided, it will be called for each request with
      * the koa context object. It may return a boolean or a promise that
      * will resolve with a boolean.
      */
    var credentials: js.UndefOr[(js.Function1[/* ctx */ Context, Boolean | PromiseLike[Boolean]]) | Boolean] = js.undefined
    
    /**
      * `Access-Control-Expose-Headers`
      */
    var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * Add set headers to `err.header` if an error is thrown
      */
    var keepHeadersOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `Access-Control-Max-Age` in seconds
      */
    var maxAge: js.UndefOr[Double | String] = js.undefined
    
    /**
      * `Access-Control-Allow-Origin`, default is request Origin header.
      *
      * @remarks
      * If a function is provided, it will be called for each request with
      * the koa context object. It may return a string or a promise that
      * will resolve with a string.
      */
    var origin: js.UndefOr[(js.Function1[/* ctx */ Context, PromiseLike[String] | String]) | String] = js.undefined
    
    /**
      * Handle `Access-Control-Request-Private-Network` request by return `Access-Control-Allow-Private-Network`
      *
      * @see https://wicg.github.io/private-network-access/
      */
    var privateNetworkAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add `Cross-Origin-Opener-Policy` & `Cross-Origin-Embedder-Policy` to response headers
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer/Planned_changes
      */
    var secureContext: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowHeaders(value: js.Array[String] | String): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      inline def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value*))
      
      inline def setAllowMethods(value: js.Array[String] | String): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      inline def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      inline def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value*))
      
      inline def setCredentials(value: (js.Function1[/* ctx */ Context, Boolean | PromiseLike[Boolean]]) | Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction1(value: /* ctx */ Context => Boolean | PromiseLike[Boolean]): Self = StObject.set(x, "credentials", js.Any.fromFunction1(value))
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setExposeHeaders(value: js.Array[String] | String): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value*))
      
      inline def setKeepHeadersOnError(value: Boolean): Self = StObject.set(x, "keepHeadersOnError", value.asInstanceOf[js.Any])
      
      inline def setKeepHeadersOnErrorUndefined: Self = StObject.set(x, "keepHeadersOnError", js.undefined)
      
      inline def setMaxAge(value: Double | String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOrigin(value: (js.Function1[/* ctx */ Context, PromiseLike[String] | String]) | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginFunction1(value: /* ctx */ Context => PromiseLike[String] | String): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPrivateNetworkAccess(value: Boolean): Self = StObject.set(x, "privateNetworkAccess", value.asInstanceOf[js.Any])
      
      inline def setPrivateNetworkAccessUndefined: Self = StObject.set(x, "privateNetworkAccess", js.undefined)
      
      inline def setSecureContext(value: Boolean): Self = StObject.set(x, "secureContext", value.asInstanceOf[js.Any])
      
      inline def setSecureContextUndefined: Self = StObject.set(x, "secureContext", js.undefined)
    }
  }
}
