package typings.koaRedisCache

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: CacheOptions): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-redis-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CacheOptions extends StObject {
    
    /**
      * the routes to exclude, default is [].
      * example: ['/api/(.*)', '/view/:id']
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * redis expire time (second), default is 30 * 60 (30 min)
      */
    var expire: js.UndefOr[Double] = js.undefined
    
    /**
      * max length of body size (in bytes) to cache.
      * if the size of the body exceeds maxLength, the body will not be cached.
      * default is: Infinity
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * callback function for error, default is function() {}
      */
    var onerror: js.UndefOr[onErrorCallback] = js.undefined
    
    /**
      * if the passParam exists in the query string, skip the cache
      */
    var passParam: js.UndefOr[String] = js.undefined
    
    /**
      * redis key prefix, default is koa-redis-cache:
      * If a function is supplied, its signature should be function(ctx) {} and it should return a string to use as the redis key prefix
      */
    var prefix: js.UndefOr[String | getPrefixCallback] = js.undefined
    
    /**
      * redis options
      */
    var redis: js.UndefOr[RedisOptions] = js.undefined
    
    /**
      * the routes to cache, default is ['(.*)'].
      * can be set to an array of routes (string), or an array of RouteOptions
      */
    var routes: js.UndefOr[js.Array[RouteOptions | String]] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    extension [Self <: CacheOptions](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnerror(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setPassParam(value: String): Self = StObject.set(x, "passParam", value.asInstanceOf[js.Any])
      
      inline def setPassParamUndefined: Self = StObject.set(x, "passParam", js.undefined)
      
      inline def setPrefix(value: String | getPrefixCallback): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction1(value: /* ctx */ Context => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRedis(value: RedisOptions): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
      
      inline def setRoutes(value: js.Array[RouteOptions | String]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: (RouteOptions | String)*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  trait RedisOptions extends StObject {
    
    /**
      * host name of the redis server, default: 'localhost'
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * node_redis options
      */
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Redis.ClientOpts */ Any
      ] = js.undefined
    
    /**
      * port number of the redis server, default: 6379
      */
    var port: js.UndefOr[Double] = js.undefined
  }
  object RedisOptions {
    
    inline def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    extension [Self <: RedisOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Redis.ClientOpts */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  trait RouteOptions extends StObject {
    
    /**
      * expiration time in seconds for cached responses for the route
      */
    var expire: js.UndefOr[Double] = js.undefined
    
    /**
      * the route to cache, example: '/api/(.*)'
      */
    var route: String
  }
  object RouteOptions {
    
    inline def apply(route: String): RouteOptions = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    extension [Self <: RouteOptions](x: Self) {
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type getPrefixCallback = js.Function1[/* ctx */ Context, String]
  
  type onErrorCallback = js.Function1[/* error */ js.Error, Unit]
}
