package typings.lowdb

import typings.lowdb.libLowSyncMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersJsonfilesyncMod {
  
  @JSImport("lowdb/lib/adapters/JSONFileSync", "JSONFileSync")
  @js.native
  open class JSONFileSync[T] protected ()
    extends StObject
       with SyncAdapter[T] {
    def this(filename: String) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): T | Null = js.native
    
    /* CompleteClass */
    override def write(data: T): Unit = js.native
  }
}
