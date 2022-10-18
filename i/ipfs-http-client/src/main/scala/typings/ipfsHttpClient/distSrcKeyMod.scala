package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Gen
import typings.ipfsHttpClient.distSrcTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyMod {
  
  @JSImport("ipfs-http-client/dist/src/key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createKey(config: Options): Gen = ^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(config.asInstanceOf[js.Any]).asInstanceOf[Gen]
}
