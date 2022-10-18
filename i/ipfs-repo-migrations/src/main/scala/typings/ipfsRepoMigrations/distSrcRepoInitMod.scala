package typings.ipfsRepoMigrations

import typings.ipfsRepoMigrations.distSrcTypesMod.Backends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRepoInitMod {
  
  @JSImport("ipfs-repo-migrations/dist/src/repo/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRepoInitialized(backends: Backends): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepoInitialized")(backends.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
