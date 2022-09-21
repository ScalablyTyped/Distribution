package typings.koaCash

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: Options): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-cash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * If a truthy value is passed, then compression will be enabled.
      * @default false
      */
    var compression: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Get a value from a store. Must return a Promise, which returns the cache's value, if any.
      * @param key Cache key
      * @param maxAge Max age (in milliseconds) for the cache
      */
    def get(key: String, maxAge: Double): js.Promise[js.UndefOr[Any]]
    
    /**
      * A hashing function. By default, it caches based on the URL.
      * @default
      * ```
      * function hash(ctx) {
      *   return ctx.response.url; // same as ctx.url
      * }
      * ```
      */
    var hash: js.UndefOr[js.Function1[/* ctx */ Context, String]] = js.undefined
    
    /**
      * Default max age (in milliseconds) for the cache if not set via `await ctx.cashed(maxAge)`.
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Set a value to a store. Must return a Promise.\
      * Note: `maxAge` is set by `.cash = { maxAge }`. If it's not set, then `maxAge` will be `0`,
      * which you should then ignore.
      * @param key Cache key
      * @param value Cached value
      * @param maxAge Max age (in milliseconds) for the cache
      */
    def set(key: String, value: Any, maxAge: Double): js.Promise[Unit]
    
    /**
      * If a truthy value is passed, then X-Cached-Response header will be set as HIT when response
      * is served from the cache.
      * @default false
      */
    var setCachedHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum byte size to compress response bodies. Default 1kb.
      * @default 1000
      */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(
      get: (String, Double) => js.Promise[js.UndefOr[Any]],
      set: (String, Any, Double) => js.Promise[Unit]
    ): Options = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setGet(value: (String, Double) => js.Promise[js.UndefOr[Any]]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setHash(value: /* ctx */ Context => String): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setSet(value: (String, Any, Double) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setSetCachedHeader(value: Boolean): Self = StObject.set(x, "setCachedHeader", value.asInstanceOf[js.Any])
      
      inline def setSetCachedHeaderUndefined: Self = StObject.set(x, "setCachedHeader", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait BaseContext extends StObject {
      
      /**
        * This is how you enable a route to be cached. If you don't call await ctx.cashed(),
        * then this route will not be cached nor will it attempt to serve the request from the cache.
        *
        * Notes:
        * * Only `GET` and `HEAD` requests are cached.
        * * Only 200 responses are cached. Don't set 304 status codes on these routes - this
        *   middleware will handle it for you.
        * * The underlying store should be able to handle Date objects as well as Buffer objects.
        *   Otherwise, you may have to serialize/deserialize yourself.
        * @param maxAge The max age passed to `get()`.
        */
      def cashed(): js.Promise[Boolean] = js.native
      def cashed(maxAge: Double): js.Promise[Boolean] = js.native
    }
  }
}
