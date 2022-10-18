package typings.keya

import typings.keya.outNodeSqliteMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNodeMainMod {
  
  @JSImport("keya/out/node/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def store[T](name: String): js.Promise[default[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("store")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default[T]]]
  
  @JSImport("keya/out/node/main", "stores")
  @js.native
  val stores: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SQLiteStore.stores */ Any = js.native
}
