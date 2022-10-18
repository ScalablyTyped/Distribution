package typings.ipfsRepoMigrations

import typings.ipfsRepoMigrations.distSrcTypesMod.Backends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRepoVersionMod {
  
  @JSImport("ipfs-repo-migrations/dist/src/repo/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVersion(backends: Backends): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")(backends.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def setVersion(version: Double, backends: Backends): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setVersion")(version.asInstanceOf[js.Any], backends.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
