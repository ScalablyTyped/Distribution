package typings.jsforce

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("jsforce/cache", "Cache")
  @js.native
  class Cache () extends StObject {
    
    /**
      * Clear cache entries prefix matching given key
      * @param key Key prefix of cache entry to clear
      */
    def clear(): Unit = js.native
    def clear(key: String): Unit = js.native
    
    /**
      * Retrieve cache entry, or create if not exists
      * @param key Key of cache entry
      */
    def get[T](): CacheEntry[T] = js.native
    def get[T](key: String): CacheEntry[T] = js.native
  }
  
  @JSImport("jsforce/cache", "CacheEntry")
  @js.native
  class CacheEntry[T] () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def clear(): Unit = js.native
    
    def get(): js.UndefOr[T] = js.native
    def get(callback: js.Function2[/* err */ Error, /* result */ T, Unit]): js.UndefOr[T] = js.native
    
    def set(value: T): Unit = js.native
  }
}
