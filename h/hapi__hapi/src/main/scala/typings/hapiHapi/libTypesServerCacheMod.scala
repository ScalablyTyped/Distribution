package typings.hapiHapi

import org.scalablytyped.runtime.StringDictionary
import typings.hapiCatbox.mod.ClientApi
import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatbox.mod.EnginePrototype
import typings.hapiCatbox.mod.Policy
import typings.hapiCatbox.mod.PolicyOptionVariants
import typings.hapiCatbox.mod.PolicyOptions
import typings.hapiHapi.anon.Cache
import typings.hapiHapi.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesServerCacheMod {
  
  type CachePolicyOptions[T] = PolicyOptionVariants[T] & Cache
  
  type CacheProvider[T /* <: ClientOptions */] = EnginePrototype[Any] | Constructor[T]
  
  @js.native
  trait ServerCache extends StObject {
    
    /**
      * Provisions a cache segment within the server cache facility where:
      * @param options - [catbox policy](https://github.com/hapijs/catbox#policy) configuration where:
      * * expiresIn - relative expiration expressed in the number of milliseconds since the item was saved in the cache. Cannot be used together with expiresAt.
      * * expiresAt - time of day expressed in 24h notation using the 'HH:MM' format, at which point all cache records expire. Uses local time. Cannot be used together with expiresIn.
      * * generateFunc - a function used to generate a new cache item if one is not found in the cache when calling get(). The method's signature is async function(id, flags) where:
      * - `id` - the `id` string or object provided to the `get()` method.
      * - `flags` - an object used to pass back additional flags to the cache where:
      * - `ttl` - the cache ttl value in milliseconds. Set to `0` to skip storing in the cache. Defaults to the cache global policy.
      * * staleIn - number of milliseconds to mark an item stored in cache as stale and attempt to regenerate it when generateFunc is provided. Must be less than expiresIn.
      * * staleTimeout - number of milliseconds to wait before checking if an item is stale.
      * * generateTimeout - number of milliseconds to wait before returning a timeout error when the generateFunc function takes too long to return a value. When the value is eventually returned, it
      *     is stored in the cache for future requests. Required if generateFunc is present. Set to false to disable timeouts which may cause all get() requests to get stuck forever.
      * * generateOnReadError - if false, an upstream cache read error will stop the cache.get() method from calling the generate function and will instead pass back the cache error. Defaults to true.
      * * generateIgnoreWriteError - if false, an upstream cache write error when calling cache.get() will be passed back with the generated value when calling. Defaults to true.
      * * dropOnError - if true, an error or timeout in the generateFunc causes the stale value to be evicted from the cache. Defaults to true.
      * * pendingGenerateTimeout - number of milliseconds while generateFunc call is in progress for a given id, before a subsequent generateFunc call is allowed. Defaults to 0 (no blocking of
      *     concurrent generateFunc calls beyond staleTimeout).
      * * cache - the cache name configured in server.cache. Defaults to the default cache.
      * * segment - string segment name, used to isolate cached items within the cache partition. When called within a plugin, defaults to '!name' where 'name' is the plugin name. When called within a
      *     server method, defaults to '#name' where 'name' is the server method name. Required when called outside of a plugin.
      * * shared - if true, allows multiple cache provisions to share the same segment. Default to false.
      * @return Catbox Policy.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-servercacheoptions)
      */
    def apply[T, O /* <: CachePolicyOptions[T] */](options: O): Policy[T, O] = js.native
    
    /**
      * Provisions a server cache as described in server.cache where:
      * @param options - same as the server cache configuration options.
      * @return Return value: none.
      * Note that if the server has been initialized or started, the cache will be automatically started to match the state of any other provisioned server cache.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-await-servercacheprovisionoptions)
      */
    def provision(options: ServerOptionsCache): js.Promise[Unit] = js.native
  }
  
  trait ServerOptionsCache
    extends StObject
       with PolicyOptions[Any]
       with /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
  /* s */ StringDictionary[Any] {
    
    /** catbox engine object. */
    var engine: js.UndefOr[ClientApi[Any]] = js.undefined
    
    /**
      * an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
      * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** (optional) string used to isolate cached data. Defaults to 'hapi-cache'. */
    var partition: js.UndefOr[String] = js.undefined
    
    /**
      * a class or a prototype function
      */
    var provider: js.UndefOr[CacheProvider[ClientOptions]] = js.undefined
    
    /** if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false. */
    var shared: js.UndefOr[Boolean] = js.undefined
  }
  object ServerOptionsCache {
    
    inline def apply(): ServerOptionsCache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptionsCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerOptionsCache] (val x: Self) extends AnyVal {
      
      inline def setEngine(value: ClientApi[Any]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
      
      inline def setProvider(value: CacheProvider[ClientOptions]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    }
  }
}
