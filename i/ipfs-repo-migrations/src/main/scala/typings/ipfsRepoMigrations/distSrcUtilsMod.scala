package typings.ipfsRepoMigrations

import typings.interfaceDatastore.keyMod.Key
import typings.ipfsRepoMigrations.anon.Blocks
import typings.ipfsRepoMigrations.distSrcTypesMod.Backends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("ipfs-repo-migrations/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-repo-migrations/dist/src/utils", "CONFIG_KEY")
  @js.native
  val CONFIG_KEY: Key = js.native
  
  @JSImport("ipfs-repo-migrations/dist/src/utils", "VERSION_KEY")
  @js.native
  val VERSION_KEY: Key = js.native
  
  inline def findLevelJs(store: Datastore): js.UndefOr[Datastore] = ^.asInstanceOf[js.Dynamic].applyDynamic("findLevelJs")(store.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Datastore]]
  
  inline def hasWithFallback(key: Key, has: js.Function1[/* arg0 */ Key, js.Promise[Boolean]], store: Datastore): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWithFallback")(key.asInstanceOf[js.Any], has.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def wrapBackends(backends: Backends): Blocks = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapBackends")(backends.asInstanceOf[js.Any]).asInstanceOf[Blocks]
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
}
