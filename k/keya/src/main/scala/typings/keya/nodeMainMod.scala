package typings.keya

import typings.keya.sqliteMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keya/out/node/main", JSImport.Namespace)
@js.native
object nodeMainMod extends js.Object {
  
  def store[T](name: String): js.Promise[default[T]] = js.native
  
  val stores: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SQLiteStore.stores */ js.Any = js.native
}
