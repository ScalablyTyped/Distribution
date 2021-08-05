package typings.hapiCatboxMemory

import typings.hapiCatbox.mod.CacheKey
import typings.hapiCatbox.mod.CachedObject
import typings.hapiCatbox.mod.ClientApi
import typings.hapiCatbox.mod.ClientOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("@hapi/catbox-memory", JSImport.Namespace)
  @js.native
  class ^[T] ()
    extends StObject
       with ClientApi[T] {
    def this(options: Options) = this()
    
    /**
      * drop(key) - remove an item from cache where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    /* CompleteClass */
    override def drop(key: CacheKey): js.Promise[Unit] = js.native
    
    /**
      * get(key, callback) - retrieve an item from the cache engine if found where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    /* CompleteClass */
    override def get(key: CacheKey): js.Promise[Null | CachedObject[T]] = js.native
    
    /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
    /* CompleteClass */
    override def isReady(): Boolean = js.native
    
    /**
      * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
      *  * key - a cache key object (see [ICacheKey]).
      *  * value - the string or object value to be stored.
      *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
      */
    /* CompleteClass */
    override def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit] = js.native
    
    /** start() - creates a connection to the cache server. Must be called before any other method is available. */
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /** stop() - terminates the connection to the cache server. */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
    /* CompleteClass */
    override def validateSegmentName(segment: String): Null | Error = js.native
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  type CatboxMemory[T] = ClientApi[T]
  
  trait Options
    extends StObject
       with ClientOptions {
    
    /**
      * by default, all data is cached as JSON strings, and converted to an object using JSON.parse() on retrieval.
      * By setting this option to true, Buffer data can be stored alongside the stringified data.
      * Buffers are not stringified, and are copied before storage to prevent the value from changing while in the cache.
      * @default false
      */
    var allowMixedContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * by default, buffers stored in the cache with allowMixedContent set to true are copied when they are set but not when they are retrieved.
      * This means a change to the buffer returned by a get() will change the value in the cache. To prevent this,
      * set cloneBuffersOnGet to true to always return a copy of the cached buffer.
      * @default false
      */
    var cloneBuffersOnGet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets an upper limit on the number of bytes that can be stored in the cache.
      * Once this limit is reached no additional items will be added to the cache until some expire.
      * The utilized memory calculation is a rough approximation and must not be relied on.
      * @default 104857600 (100MB).
      */
    var maxByteSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of milliseconds in between each cache cleanup.
      * @default 1000 (1 second)
      */
    var minCleanupIntervalMsec: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowMixedContent(value: Boolean): Self = StObject.set(x, "allowMixedContent", value.asInstanceOf[js.Any])
      
      inline def setAllowMixedContentUndefined: Self = StObject.set(x, "allowMixedContent", js.undefined)
      
      inline def setCloneBuffersOnGet(value: Boolean): Self = StObject.set(x, "cloneBuffersOnGet", value.asInstanceOf[js.Any])
      
      inline def setCloneBuffersOnGetUndefined: Self = StObject.set(x, "cloneBuffersOnGet", js.undefined)
      
      inline def setMaxByteSize(value: Double): Self = StObject.set(x, "maxByteSize", value.asInstanceOf[js.Any])
      
      inline def setMaxByteSizeUndefined: Self = StObject.set(x, "maxByteSize", js.undefined)
      
      inline def setMinCleanupIntervalMsec(value: Double): Self = StObject.set(x, "minCleanupIntervalMsec", value.asInstanceOf[js.Any])
      
      inline def setMinCleanupIntervalMsecUndefined: Self = StObject.set(x, "minCleanupIntervalMsec", js.undefined)
    }
  }
}
