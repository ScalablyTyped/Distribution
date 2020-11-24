package typings.iitc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iitc/core/data_cache", JSImport.Namespace)
@js.native
object dataCacheMod extends js.Object {
  
  @js.native
  class DataCache () extends js.Object {
    
    /**
      * if younger than this, use data in the cache rather than fetching from the server
      * @default 180
      */
    var REQUEST_CACHE_FRESH_AGE: Double = js.native
    
    /**
      * maximum cache age. entries are deleted from the cache after this time
      * @default 300
      */
    var REQUEST_CACHE_MAX_AGE: Double = js.native
    
    /** or more than this total size */
    var REQUEST_CACHE_MAX_CHARS: Double = js.native
    
    /** if more than this many entries, expire early */
    var REQUEST_CACHE_MAX_ITEMS: Double = js.native
    
    def debug(): String = js.native
    
    def get(key: String): js.Any = js.native
    
    def getFresh(key: String): js.UndefOr[Boolean] = js.native
    
    def getTime(key: String): Double = js.native
    
    def remove(key: String): Unit = js.native
    
    /* private */ def runExpire(): Unit = js.native
    
    def startExpireInterval(periodInSecond: Double): Unit = js.native
    
    def stopExpireInterval(): Unit = js.native
    
    def store(key: String, data: js.Any): Unit = js.native
    def store(key: String, data: js.Any, freshTime: Double): Unit = js.native
  }
}
