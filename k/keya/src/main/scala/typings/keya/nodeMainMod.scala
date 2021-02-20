package typings.keya

import typings.keya.sqliteMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMainMod {
  
  @JSImport("keya/out/node/main", "store")
  @js.native
  def store[T](name: String): js.Promise[default[T]] = js.native
  
  @JSImport("keya/out/node/main", "stores")
  @js.native
  val stores: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SQLiteStore.stores */ js.Any = js.native
}
