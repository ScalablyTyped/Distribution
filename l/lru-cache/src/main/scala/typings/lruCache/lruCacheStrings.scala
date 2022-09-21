package typings.lruCache

import typings.lruCache.mod.DisposeReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lruCacheStrings {
  
  @js.native
  sealed trait delete
    extends StObject
       with DisposeReason
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait evict
    extends StObject
       with DisposeReason
  inline def evict: evict = "evict".asInstanceOf[evict]
  
  @js.native
  sealed trait set
    extends StObject
       with DisposeReason
  inline def set: set = "set".asInstanceOf[set]
}
