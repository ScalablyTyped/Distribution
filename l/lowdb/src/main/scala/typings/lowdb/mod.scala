package typings.lowdb

import typings.lowdb.libCoreLowMod.Adapter
import typings.lowdb.libCoreLowMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lowdb", "Low")
  @js.native
  open class Low[T] protected ()
    extends typings.lowdb.libCoreLowMod.Low[T] {
    def this(adapter: Adapter[T], defaultData: T) = this()
  }
  
  @JSImport("lowdb", "LowSync")
  @js.native
  open class LowSync[T] protected ()
    extends typings.lowdb.libCoreLowMod.LowSync[T] {
    def this(adapter: SyncAdapter[T], defaultData: T) = this()
  }
  
  @JSImport("lowdb", "Memory")
  @js.native
  open class Memory[T] ()
    extends typings.lowdb.libAdaptersMemoryMod.Memory[T]
  
  @JSImport("lowdb", "MemorySync")
  @js.native
  open class MemorySync[T] ()
    extends typings.lowdb.libAdaptersMemoryMod.MemorySync[T]
}
