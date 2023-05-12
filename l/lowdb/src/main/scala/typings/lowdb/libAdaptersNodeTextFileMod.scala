package typings.lowdb

import typings.lowdb.libCoreLowMod.Adapter
import typings.lowdb.libCoreLowMod.SyncAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersNodeTextFileMod {
  
  @JSImport("lowdb/lib/adapters/node/TextFile", "TextFile")
  @js.native
  open class TextFile protected ()
    extends StObject
       with Adapter[String] {
    def this(filename: String) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[String | Null] = js.native
    
    /* CompleteClass */
    override def write(data: String): js.Promise[Unit] = js.native
  }
  
  @JSImport("lowdb/lib/adapters/node/TextFile", "TextFileSync")
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
