package typings.koaRedisCache

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.redis.mod.ClientOpts
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-redis-cache", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-redis-cache", JSImport.Namespace)
  @js.native
  def apply(opts: CacheOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait CacheOptions extends StObject {
    
    /**
      * the routes to exclude, default is [].
      * example: ['/api/(.*)', '/view/:id']
      */
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * redis expire time (second), default is 30 * 60 (30 min)
      */
    var expire: js.UndefOr[Double] = js.native
    
    /**
      * max length of body size (in bytes) to cache.
      * if the size of the body exceeds maxLength, the body will not be cached.
      * default is: Infinity
      */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**
      * callback function for error, default is function() {}
      */
    var onerror: js.UndefOr[onErrorCallback] = js.native
    
    /**
      * if the passParam exists in the query string, skip the cache
      */
    var passParam: js.UndefOr[String] = js.native
    
    /**
      * redis key prefix, default is koa-redis-cache:
      * If a function is supplied, its signature should be function(ctx) {} and it should return a string to use as the redis key prefix
      */
    var prefix: js.UndefOr[String | getPrefixCallback] = js.native
    
    /**
      * redis options
      */
    var redis: js.UndefOr[RedisOptions] = js.native
    
    /**
      * the routes to cache, default is ['(.*)'].
      * can be set to an array of routes (string), or an array of RouteOptions
      */
    var routes: js.UndefOr[js.Array[RouteOptions | String]] = js.native
  }
  object CacheOptions {
    
    @scala.inline
    def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setOnerror(value: /* error */ Error => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setPassParam(value: String): Self = StObject.set(x, "passParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassParamUndefined: Self = StObject.set(x, "passParam", js.undefined)
      
      @scala.inline
      def setPrefix(value: String | getPrefixCallback): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction1(value: /* ctx */ Context => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRedis(value: RedisOptions): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[RouteOptions | String]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: (RouteOptions | String)*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RedisOptions extends StObject {
    
    /**
      * host name of the redis server, default: 'localhost'
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * node_redis options
      */
    var options: js.UndefOr[ClientOpts] = js.native
    
    /**
      * port number of the redis server, default: 6379
      */
    var port: js.UndefOr[Double] = js.native
  }
  object RedisOptions {
    
    @scala.inline
    def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    @scala.inline
    implicit class RedisOptionsMutableBuilder[Self <: RedisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setOptions(value: ClientOpts): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait RouteOptions extends StObject {
    
    /**
      * expiration time in seconds for cached responses for the route
      */
    var expire: js.UndefOr[Double] = js.native
    
    /**
      * the route to cache, example: '/api/(.*)'
      */
    var route: String = js.native
  }
  object RouteOptions {
    
    @scala.inline
    def apply(route: String): RouteOptions = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type getPrefixCallback = js.Function1[/* ctx */ Context, String]
  
  type onErrorCallback = js.Function1[/* error */ Error, Unit]
}
