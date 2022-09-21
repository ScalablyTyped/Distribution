package typings.lowdb

import typings.lowdb.lowMod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonfileMod {
  
  @JSImport("lowdb/lib/adapters/JSONFile", "JSONFile")
  @js.native
  open class JSONFile[T] protected ()
    extends StObject
       with Adapter[T] {
    def this(filename: String) = this()
    
    /* private */ var `private`: Any = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def write(data: T): js.Promise[Unit] = js.native
  }
}
