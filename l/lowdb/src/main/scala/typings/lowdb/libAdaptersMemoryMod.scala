package typings.lowdb

import typings.lowdb.libCoreLowMod.Adapter
import typings.lowdb.libCoreLowMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersMemoryMod {
  
  @JSImport("lowdb/lib/adapters/Memory", "Memory")
  @js.native
  open class Memory[T] ()
    extends StObject
       with Adapter[T] {
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def write(data: T): js.Promise[Unit] = js.native
  }
  
  @JSImport("lowdb/lib/adapters/Memory", "MemorySync")
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
