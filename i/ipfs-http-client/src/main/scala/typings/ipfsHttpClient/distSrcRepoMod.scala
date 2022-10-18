package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Gc
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRepoMod {
  
  @JSImport("ipfs-http-client/dist/src/repo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRepo(config: Options): Gc = ^.asInstanceOf[js.Dynamic].applyDynamic("createRepo")(config.asInstanceOf[js.Any]).asInstanceOf[Gc]
}
