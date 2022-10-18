package typings.lowdb

import typings.lowdb.libLowSyncMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersMemorySyncMod {
  
  @JSImport("lowdb/lib/adapters/MemorySync", "MemorySync")
  @js.native
  open class MemorySync[T] ()
    extends StObject
       with SyncAdapter[T] {
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): T | Null = js.native
    
    /* CompleteClass */
    override def write(data: T): Unit = js.native
  }
}
