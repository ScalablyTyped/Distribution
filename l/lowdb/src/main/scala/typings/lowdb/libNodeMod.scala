package typings.lowdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  @JSImport("lowdb/lib/node", "JSONFile")
  @js.native
  open class JSONFile[T] protected ()
    extends typings.lowdb.libAdaptersNodeJsonfileMod.JSONFile[T] {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb/lib/node", "JSONFileSync")
  @js.native
  open class JSONFileSync[T] protected ()
    extends typings.lowdb.libAdaptersNodeJsonfileMod.JSONFileSync[T] {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb/lib/node", "TextFile")
  @js.native
  open class TextFile protected ()
    extends typings.lowdb.libAdaptersNodeTextFileMod.TextFile {
    def this(filename: String) = this()
  }
  
  @JSImport("lowdb/lib/node", "TextFileSync")
  @js.native
  open class TextFileSync protected ()
    extends typings.lowdb.libAdaptersNodeTextFileMod.TextFileSync {
    def this(filename: String) = this()
  }
}
