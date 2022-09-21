package typings.keya

import typings.sqlite.sqlite3Mod.Database
import typings.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteMod {
  
  @JSImport("keya/out/node/sqlite", JSImport.Default)
  @js.native
  open class default[T] () extends SQLiteStore[T]
  /* static members */
  object default {
    
    @JSImport("keya/out/node/sqlite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def stores(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stores")().asInstanceOf[js.Promise[js.Array[String]]]
  }
  
  @js.native
  trait SQLiteStore[T]
    extends typings.keya.storeMod.default[T] {
    
    var db: typings.sqlite.mod.Database[Database, Statement] = js.native
    
    var file: String = js.native
    
    /* private */ var statements: Any = js.native
  }
}
