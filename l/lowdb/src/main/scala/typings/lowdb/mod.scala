package typings.lowdb

import typings.lowdb.lowMod.Adapter
import typings.lowdb.lowSyncMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lowdb", "JSONFile")
  @js.native
  open class JSONFile[T] protected ()
    extends typings.lowdb.jsonfileMod.JSONFile[T] {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb", "JSONFileSync")
  @js.native
  open class JSONFileSync[T] protected ()
    extends typings.lowdb.jsonfilesyncMod.JSONFileSync[T] {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb", "LocalStorage")
  @js.native
  open class LocalStorage[T] protected ()
    extends typings.lowdb.localStorageMod.LocalStorage[T] {
    def this(key: String) = this()
  }
  
  @JSImport("lowdb", "Low")
  @js.native
  open class Low[T] protected ()
    extends typings.lowdb.lowMod.Low[T] {
    def this(adapter: Adapter[T]) = this()
  }
  
  @JSImport("lowdb", "LowSync")
  @js.native
  open class LowSync[T] protected ()
    extends typings.lowdb.lowSyncMod.LowSync[T] {
    def this(adapter: SyncAdapter[T]) = this()
  }
  
  @JSImport("lowdb", "Memory")
  @js.native
  open class Memory[T] ()
    extends typings.lowdb.memoryMod.Memory[T]
  
  @JSImport("lowdb", "MemorySync")
  @js.native
  open class MemorySync[T] ()
    extends typings.lowdb.memorySyncMod.MemorySync[T]
  
  @JSImport("lowdb", "TextFile")
  @js.native
  open class TextFile protected ()
    extends typings.lowdb.textFileMod.TextFile {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb", "TextFileSync")
  @js.native
  open class TextFileSync protected ()
    extends typings.lowdb.textFileSyncMod.TextFileSync {
    def this(filename: String) = this()
  }
}
