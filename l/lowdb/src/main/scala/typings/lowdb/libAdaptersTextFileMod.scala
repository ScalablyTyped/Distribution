package typings.lowdb

import typings.lowdb.libLowMod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersTextFileMod {
  
  @JSImport("lowdb/lib/adapters/TextFile", "TextFile")
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
}
