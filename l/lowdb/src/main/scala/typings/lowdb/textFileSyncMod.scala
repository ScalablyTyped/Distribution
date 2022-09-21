package typings.lowdb

import typings.lowdb.lowSyncMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFileSyncMod {
  
  @JSImport("lowdb/lib/adapters/TextFileSync", "TextFileSync")
  @js.native
  open class TextFileSync protected ()
    extends StObject
       with SyncAdapter[String] {
    def this(filename: String) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): String | Null = js.native
    
    /* CompleteClass */
    override def write(data: String): Unit = js.native
  }
}
