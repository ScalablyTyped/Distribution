package typings.lowdb

import typings.lowdb.libLowMod.Adapter
import typings.lowdb.libLowSyncMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lowdb", "JSONFile")
  @js.native
  open class JSONFile[T] protected ()
    extends typings.lowdb.libAdaptersJsonfileMod.JSONFile[T] {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb", "JSONFileSync")
  @js.native
  open class JSONFileSync[T] protected ()
    extends typings.lowdb.libAdaptersJsonfilesyncMod.JSONFileSync[T] {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb", "LocalStorage")
  @js.native
  open class LocalStorage[T] protected ()
    extends typings.lowdb.libAdaptersLocalStorageMod.LocalStorage[T] {
    def this(key: String) = this()
  }
  
  @JSImport("lowdb", "Low")
  @js.native
  open class Low[T] protected ()
    extends typings.lowdb.libLowMod.Low[T] {
    def this(adapter: Adapter[T]) = this()
  }
  
  @JSImport("lowdb", "LowSync")
  @js.native
  open class LowSync[T] protected ()
    extends typings.lowdb.libLowSyncMod.LowSync[T] {
    def this(adapter: SyncAdapter[T]) = this()
  }
  
  @JSImport("lowdb", "Memory")
  @js.native
  open class Memory[T] ()
    extends typings.lowdb.libAdaptersMemoryMod.Memory[T]
  
  @JSImport("lowdb", "MemorySync")
  @js.native
  open class MemorySync[T] ()
    extends typings.lowdb.libAdaptersMemorySyncMod.MemorySync[T]
  
  @JSImport("lowdb", "TextFile")
  @js.native
  open class TextFile protected ()
    extends typings.lowdb.libAdaptersTextFileMod.TextFile {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb", "TextFileSync")
  @js.native
  open class TextFileSync protected ()
    extends typings.lowdb.libAdaptersTextFileSyncMod.TextFileSync {
    def this(filename: String) = this()
  }
}
