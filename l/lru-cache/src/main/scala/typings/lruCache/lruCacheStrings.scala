package typings.lruCache

import typings.lruCache.distMjsMod.LRUCache.DisposeReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lruCacheStrings {
  
  @js.native
  sealed trait add extends StObject
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait delete
    extends StObject
       with DisposeReason
       with typings.lruCache.distCjsMod.LRUCache.DisposeReason
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait evict
    extends StObject
       with DisposeReason
       with typings.lruCache.distCjsMod.LRUCache.DisposeReason
  inline def evict: evict = "evict".asInstanceOf[evict]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait hit extends StObject
  inline def hit: hit = "hit".asInstanceOf[hit]
  
  @js.native
  sealed trait inflight extends StObject
  inline def inflight: inflight = "inflight".asInstanceOf[inflight]
  
  @js.native
  sealed trait miss extends StObject
  inline def miss: miss = "miss".asInstanceOf[miss]
  
  @js.native
  sealed trait refresh extends StObject
  inline def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait set
    extends StObject
       with DisposeReason
       with typings.lruCache.distCjsMod.LRUCache.DisposeReason
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait stale extends StObject
  inline def stale: stale = "stale".asInstanceOf[stale]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
}
