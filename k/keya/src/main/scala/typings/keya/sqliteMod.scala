package typings.keya

import typings.sqlite.sqlite3Mod.Database
import typings.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/sqlite", JSImport.Namespace)
@js.native
object sqliteMod extends js.Object {
  @js.native
  trait SQLiteStore[T]
    extends typings.keya.storeMod.default[T] {
    var db: typings.sqlite.mod.Database[Database, Statement] = js.native
    var file: String = js.native
    var statements: js.Any = js.native
  }
  
  @js.native
  class default[T] () extends SQLiteStore[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
}

